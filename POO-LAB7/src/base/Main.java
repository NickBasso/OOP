package base;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<>();

        figures.add(new Square(5.3));
        figures.add(new Rectangle(5, 7.5));
        figures.add(new Triangle(5, 7.5, 3.08));

        System.out.println(FigureController.getFigureWithBiggestArea(figures));
        System.out.println(FigureController.getFigureWithBiggestArea(figures));
        System.out.println();

        Figure circle = new Figure() {
            double radius = 5;
            double pi = 3.14159265359;

            @Override
            public double getArea() {
                return pi * radius * radius;
            }

            @Override
            public double getPerimeter() {
                return 2 * pi * radius;
            }

            @Override
            public String toString() {
                return new StringJoiner(", ", "Circle [", "]")
                        .add("radius=" + radius)
                        .add("pi=" + pi)
                        .add("perimeter=" + getPerimeter())
                        .add("area=" + getArea())
                        .toString();
            }
        };

        System.out.println("Area of the anonymous Circle class instance = " + circle.getArea());
        System.out.println("Perimeter of the anonymous Circle class instance = " + circle.getPerimeter());

        figures.add(circle);

        System.out.println(FigureController.getFigureWithBiggestArea(figures));
        System.out.println(FigureController.getFigureWithBiggestArea(figures));

        // print all figure' stats
        System.out.println();
        for(Figure fig: figures)
            System.out.println(fig);
    }
}
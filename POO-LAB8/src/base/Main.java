package base;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Main {
    public final static double pi = 3.14159265359;

    public static void main(String[] args) {
        ArrayList<GeometricBody> geometricBodies = new ArrayList<>();

        geometricBodies.add(new Cube(5.3));
        geometricBodies.add(new Parallelepiped(5, 7.5, 9));
        geometricBodies.add(new Sphere(3.08));

        System.out.println("\nFigure with the biggest surface and volume respectively before adding anonymous GeometricBody object:");
        System.out.println(GeometricBodyController.getFigureWithBiggestSurface(geometricBodies));
        System.out.println(GeometricBodyController.getFigureWithBiggestVolume(geometricBodies));
        System.out.println();

        GeometricBody regularTetrahedron = new GeometricBody() {
            double edge = 23;

            @Override
            public double getSurface() {
                return Math.sqrt(3) * edge * edge;
            }

            @Override
            public double getVolume() {
                return edge * edge * edge / (6 * Math.sqrt(2));
            }

            @Override
            public String toString() {
                return new StringJoiner(", ", "RegularTetrahedron [", "]")
                        .add("edge=" + edge)
                        .add("surface=" + getSurface())
                        .add("volume=" + getVolume())
                        .toString();
            }
        };

        System.out.println("Surface of the anonymous GeometricBody instance = " + regularTetrahedron.getSurface());
        System.out.println("Volume of the anonymous GeometricBody instance = " + regularTetrahedron.getVolume());

        geometricBodies.add(regularTetrahedron);

        System.out.println("\nFigure with the biggest surface and volume respectively after adding anonymous GeometricBody object:");
        System.out.println(GeometricBodyController.getFigureWithBiggestSurface(geometricBodies));
        System.out.println(GeometricBodyController.getFigureWithBiggestVolume(geometricBodies));

        // print all figure' stats
        System.out.println();
        for(GeometricBody fig: geometricBodies)
            System.out.println(fig);
    }
}
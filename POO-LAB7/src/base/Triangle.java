package base;

import java.util.StringJoiner;

import static java.lang.StrictMath.sqrt;

class Triangle implements Figure {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double halfPerimeter = getPerimeter() / 2;

        return sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Triangle.class.getSimpleName() + "[", "]")
                .add("a=" + a)
                .add("b=" + b)
                .add("c=" + c)
                .add("perimeter=" + getPerimeter())
                .add("area=" + getArea())
                .toString();
    }
}

package base;

import java.util.StringJoiner;

class Rectangle implements Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }


    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Rectangle.class.getSimpleName() + "[", "]")
                .add("length=" + length)
                .add("width=" + width)
                .add("perimeter=" + getPerimeter())
                .add("area=" + getArea())
                .toString();
    }
}

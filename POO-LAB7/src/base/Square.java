package base;

import java.util.StringJoiner;

class Square implements Figure{
    private double length;

    Square(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Square.class.getSimpleName() + "[", "]")
                .add("length=" + length)
                .add("perimeter=" + getPerimeter())
                .add("area=" + getArea())
                .toString();
    }
}

package base;

import java.util.StringJoiner;

class Parallelepiped implements GeometricBody {
    private double length;
    private double width;
    private double height;

    public Parallelepiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getSurface() {
        return length * width;
    }

    @Override
    public double getVolume() {
        return getSurface() * height;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Parallelepiped.class.getSimpleName() + "[", "]")
                .add("length=" + length)
                .add("width=" + width)
                .add("height=" + height)
                .add("surface=" + getSurface())
                .add(("volume=") + getVolume())
                .toString();
    }
}

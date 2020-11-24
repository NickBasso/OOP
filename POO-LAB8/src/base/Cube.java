package base;

import java.util.StringJoiner;

class Cube implements GeometricBody {
    private double length;

    Cube(double length) {
        this.length = length;
    }

    @Override
    public double getSurface() {
        return length * length;
    }

    public double getVolume() {
        return getSurface() * length;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Cube.class.getSimpleName() + "[", "]")
                .add("length=" + length)
                .add("surface=" + getSurface())
                .add("volume=" + getVolume())
                .toString();
    }
}

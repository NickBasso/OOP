package base;

public class Box {
    private double length, width, height;

    public Box(double length, double width, double height){
        length = length;
        width = width;
        height = height;
    }

    // calculate properties
    public double calculateSurface(){
        return 2 * length * width + 2 * width * height + 2 * length * height;
    }

    public double calculateVolume(){
        return length * width * height;
    }

    // print properties
    public void printSurface(){
        System.out.println(calculateSurface());
    }

    public void printVolume(){
        System.out.println(calculateVolume());
    }

    // setters
    public void setLength(double length){
        length = length;
    }

    public void setWidth(double width){
        width = width;
    }

    public void setHeight(double height){
        height = height;
    }

    // getters
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString(){
        return super.toString() + " | length: " + length + " | width: " + width + " | height: " + height
                + " | surface: " + calculateSurface() + " | volume: " + calculateVolume();
    }
}

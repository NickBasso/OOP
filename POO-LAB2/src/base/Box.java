package base;

public class Box {
    private double length, width, height;

    public Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // calculate properties
    public double calculateSurface(){
        return 2 * this.length * this.width + 2 * this.width * this.height + 2 * this.length * this.height;
    }

    public double calculateVolume(){
        return this.length * this.width * this.height;
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
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
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

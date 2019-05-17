package OOP.OOPBasics.Encapsulation.Exercises.Task1and2;

public class Box {
    private double length;
    private double width;
    private double height;

    Box(double length, double width, double height){
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private double getLength() {
        return length;
    }

    private void setLength(double length) {
        if(length < 1) {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    private double getWidth() {
        return width;
    }

    private void setWidth(double width) {
        if(width < 1){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        if(height < 1){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    double volume(){
        return this.getLength() * this.getWidth() * this.getHeight();
    }

    double lateralSurfaceArea(){
        return (2 * length * height) + (2 * width * height);
    }

    double surfaceArea(){
        return (2 * length * width) + (2 * length * height) + (2 * width * height);
    }


}

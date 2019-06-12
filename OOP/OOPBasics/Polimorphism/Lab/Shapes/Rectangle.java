package OOP.OOPBasics.Polimorphism.Lab.Shapes;

public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(double height, double width){
        this.setHeight(height);
        this.setWidth(width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void calculatePerimeter() {
        super.setPerimeter(this.getHeight() * this.getWidth());
    }

    @Override
    public void calculateArea() {
        super.setArea(2 * (this.getWidth() * this.getHeight()));
    }
}

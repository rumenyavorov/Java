package OOP.OOPBasics.Polimorphism.Lab.Shapes;

public class Circle extends Shape{
    private double radius;

    @Override
    public void calculatePerimeter() {
        super.setPerimeter(this.getRadius() * this.getRadius() * Math.PI);
    }

    @Override
    public void calculateArea() {
        super.setArea(this.getRadius() * 2 * Math.PI);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

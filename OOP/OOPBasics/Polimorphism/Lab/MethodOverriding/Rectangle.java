package OOP.OOPBasics.Polimorphism.Lab.MethodOverriding;

public class Rectangle {
    private Double height;
    private Double width;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
        area();
    }

    public Double area(){
        return height * width;
    }


    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }
}

public class Circle {
    private double radius = 1.0;
    private String color = "blue";
    public Circle(){
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
     public double getArea(){
        return radius*radius*Math.PI;
     }

     public String toString(){
        return "a Circle with radius = "
                + getRadius() + "  color is : " + getColor() +
                " and area is : " + getArea();
     }
}

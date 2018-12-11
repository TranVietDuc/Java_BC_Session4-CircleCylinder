public class Cylinder extends Circle {
    private double height =1.0;
    public Cylinder(){

    }
    public Cylinder(double height ){
        this.height = height;
    }
    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeigth(double heigth) {

        this.height = heigth;
    }

    @Override
    public double getArea() {
        return super.getArea()*2 + 2 * Math.PI * super.getRadius() *height;
    }


    public double getVolume(){
        return getArea()* height;
    }

    @Override
    public String toString(){
        return "a Cylinder with height: " + getHeight() +
                " Volume is " + getVolume() + " test Area " + getArea() + " and bottom is "+ super.toString();


    }
}

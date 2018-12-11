public class Test {
    public static void main(String[] args) {
    Circle myCircle = new Circle();
        System.out.println(myCircle);

     myCircle = new Circle( 2.0 , "red" );
        System.out.println(myCircle);

    Cylinder myCylinder = new Cylinder();
        System.out.println(myCylinder);

        myCylinder = new Cylinder(5.0);
        System.out.println(myCylinder);

        myCylinder = new Cylinder(6.0,2.0,"green");
        System.out.println(myCylinder);

    }
}

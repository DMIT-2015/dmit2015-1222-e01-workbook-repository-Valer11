package dmit2015.model; //same as namaspace in C#

//public class Circle {
//    private double radius; //defining data field
//
//    //definition of Radius to encapsulate access to data field
//    //generated by right click -> Generate
//    public double getRadius() {
//        return radius;
//    }
//
//    public void setRadius(double radius) throws Exception { //the THROWS part is added for exception to become HANDLED
//        this.radius = radius;
//        //exeptions
//        //Validation
//        if(radius<=0){
//        //    throw new Exception("Radius must be a positive value");//unhandled
//            throw new Exception("HA HA... exception here fucker. Radius must be a positive value");
//        }
//        this.radius = radius;
//    }
//    //RunTime exception
//    /*
//     public void setRadius(double radius) {
//        this.radius = radius;
//        if(radius<=0){
//            throw new RuntimeException("Radius must be a positive value");
//        }
//        this.radius = radius;
//    }
//     */
//
//    //constructor can also be generated
//
//    //no argument constructor. Generated by clicking on Generate NONE button
//    public Circle() {
//        this.radius = 1;
//    }
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    //methods are the same as in C# ( are not generated)
//
//    public double area(){
//        return Math.PI * radius * radius;
//    }
//    public double perimeter(){
//        return 2 * Math.PI * radius;
//    }
//
//
//
//    public static void main(String[] args) { //type m or word main and press TAB key will generate main void method
//        Circle circle1 = new Circle(); //creating method is te same as in C#
//        //printing
//        System.out.printf("The radius of a circle1 is %s\n", circle1.getRadius()); //!!!we need to call getter to get access!!! The %s is a placeholder for STRING... STRING is the safest way if you are not sure what will be the value. E - whole number, F - floating point etc.
//        // read more about formatting https://www.baeldung.com/java-printstream-printf
//        System.out.printf("The area of a circle1 is %.5f\n", circle1.area()); // decimal point floating value
//        System.out.printf("The radius of a circle1 is %.2f\n", circle1.perimeter());
//
//        //mutator example
//        //change property value circle1.Radius = 5;
////        circle1.setRadius(5);
////
////        //printing again
////        System.out.printf("The radius of a circle1 is %s\n", circle1.getRadius());
////        System.out.printf("The area of a circle1 is %.5f\n", circle1.Area()); //five decimal places
////        System.out.printf("The radius of a circle1 is %.2f", circle1.Perimeter());
//
//        //try and catch is the same
//        try
//        {
//            circle1.setRadius(5);
//
//
//            System.out.printf("The radius of a circle1 is %s\n", circle1.getRadius());
//            System.out.printf("The area of a circle1 is %.5f\n", circle1.area());
//            System.out.printf("The radius of a circle1 is %.2f\n", circle1.perimeter());
//
//            circle1.setRadius(-25);
//            System.out.println("A exception should have been thrown");
//        }
//        catch (Exception ex)
//        {
//            System.out.println(ex.getMessage());
//        }
//
//    }
//
//}

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new RuntimeException("Radius value must be greater than 0");
        }
    }

    public Circle(double newRadius) {
        radius = newRadius;
    }

    public Circle() {
        radius = 1;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double diameter() {
        return radius * 2;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}
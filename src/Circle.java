public class Circle {
    private static double pi=3.14159;
    private double radius;

    public Circle() {
    }


    public Circle(double radius) {

        this.radius = radius;
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public static void area( double radius) {
        double area = pi * (radius * radius);
        System.out.println("Area: "+area);
    }

    public static void circumference( double radius) {
        double circumference = pi * 2 * radius;
        System.out.println("Circumference: "+circumference);
    }

    @Override
    public String toString() {
        return "   Circle" +
                "\npi=" + pi +
                "\nradius=" + radius;
    }
}

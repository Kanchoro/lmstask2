public class Circle {
    private double PI;
    private double radius ;

    public Circle() {
    }

    public Circle(double PI, double radius) {
        this.PI = PI;
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void area (Circle circle , double PI , double radius){
        circle.PI= PI;
        circle.radius = radius;
        double area = circle.PI*(circle.radius*circle.radius);
        System.out.println("Area: "+area);
    }
    public static void circumference(Circle circle, double PI , double radius){
        circle.PI=PI;
        circle.radius=radius;
        double circumference = (PI*(2*radius));
        System.out.println("Circumference: "+circumference);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "PI=" + PI +
                ", radius=" + radius +
                '}';
    }
}

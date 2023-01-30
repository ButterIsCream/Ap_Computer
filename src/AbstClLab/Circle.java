package AbstClLab;

public class Circle implements Shape {
    private double radius;

    public Circle(double rad) {
        radius = rad;
    }

    public void setRadius(double rad) {radius = rad;}
    public double getRadius() {return radius;}

    public void calculateArea() {
        double area = 0;

        area = Math.PI * radius * radius;
        System.out.printf("Area : %.2f",area);
    }

    public void calcCircumfrence() {
        double circ = 2 * Math.PI * radius;
        System.out.printf("Circumfrence : %.2f",circ);
    }

    public void printClass() {
        System.out.println(this.getClass().getSimpleName());
    }
}

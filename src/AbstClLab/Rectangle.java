package AbstClLab;

public class Rectangle extends NotCircle {
    private double width;
    private double height;

    public Rectangle(double rheight, double rwidth) {
        width = rheight;
        width = rwidth;
    }

    public void setHeight(double h) {height = h;}

    public void setWidth(double w) {width = w;}

    public double getHeight() { return height; }

    public double getWidth() { return width; }

    public void calculateArea() {
        System.out.println("Area : " + (width * height));
    }


    public void calcCircumfrence() {
        double circ = 2 * width + 2 * height;
        System.out.println("Perimeter : " + circ);
    }

}

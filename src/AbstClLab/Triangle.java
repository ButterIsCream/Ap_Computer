package AbstClLab;

public class Triangle extends NotCircle {
    private double base;
    private double height;

    public Triangle(double theight, double tbase) {
        base = tbase;
        height = theight;
    }

    public void setHeight(double h) {height = h;}
    public void setBase(double b) {base = b;}
    public double getHeight() {return height;}
    public double getBase() {return base;}


    public void calculateArea() {
       System.out.println("Area : " + (0.5 * base * height));
    }

    public void calcCircumfrence() {
        double hyp = Math.sqrt(Math.pow(base,2) + Math.pow(height,2));

        System.out.println("Perimeter : " + hyp);
    }
}

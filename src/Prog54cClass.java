public class Prog54cClass {
    private double area,cir;
    private static double pi = Math.PI;
    private void calc(double radius) {
        area = pi * (Math.pow(radius,2));
        cir = 2 * pi * radius;
        print();
    }

    private void print() {
        System.out.printf("The area is %s\nThe circumference is &s",area,cir);
    }

    public Prog54cClass(double raidus) {
        calc(raidus);
    }
}

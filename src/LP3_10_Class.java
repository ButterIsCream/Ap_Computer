public class LP3_10_Class {
    private double tax,total;

    public LP3_10_Class(int burgers,int fries,int sodas) {
        total = (burgers * 1.69) + (fries * 1.09) + (sodas * 0.99);
        tax = total * 0.065;
    }

    public double grabTax() {return tax;}
    public double grabTotal() {return total;}

}

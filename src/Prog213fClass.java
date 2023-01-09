public class Prog213fClass {
    private double cost = 0;
    public Prog213fClass(int kilowats) {
        if (kilowats <= 2000) {
            cost += kilowats * 0.07;
        }

        if (kilowats >= 2000 && kilowats < 10000) {
            cost += 2000 * 0.07;
            cost += ((kilowats - 2000) * 0.05);
        }

        if (kilowats >= 10000) {
            cost += 2000 * 0.07;
            cost += ((8000) * 0.05);
            cost += ((kilowats - 10000) * 0.04);
        }
    }

    public double grabCost() {return cost;}
}

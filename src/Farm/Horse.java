package Farm;

public class Horse extends Animal {
    private int numRides;
    private double cost;

    public Horse(String name,int w,int c,int h,int r,double co) {
        super(name,w,c,h);
        numRides = r;
        cost = co;
    }

    public double value(double cornCost, double hayCast) {
        return numRides * cost - getFeedCost(cornCost,hayCast);
    }
}

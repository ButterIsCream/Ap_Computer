package Farm;

public class Horse extends Animal {
<<<<<<< HEAD
    private int myNumRides;
    private double myRideCost;

    public Horse(String name, int weight, int corn, int hay, int rides, double cost) {
        super(name, weight, corn, hay);
        myNumRides = rides;
        myRideCost = cost;
    }

    public double value(double cornCost, double hayCost) {
        return myNumRides * myRideCost - getFeedCost(cornCost, hayCost);
    }

    @Override
    public String getName() { return super.getName() + super.getName(); }
    public int getRides() { return myNumRides; }
    public double getRideCost() { return myRideCost; }
}
=======
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
>>>>>>> origin/master

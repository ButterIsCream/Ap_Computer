package Farm;

<<<<<<< HEAD

public abstract class Animal {
    private String myName;
    private int myWeight;
    private int myNumCorn;
    private int myNumHayBales;

    public Animal(String name, int weight, int corn, int hay) {
        myName = name;
        myWeight = weight;
        myNumCorn = corn;
        myNumHayBales = hay;
    }

    public abstract double value(double cornCost, double hayCost);

    public String getName() { return myName; }
    public int getWeight() { return myWeight; }
    public int getNumCorn() { return myNumCorn; }
    public int getNumHayBales() { return myNumHayBales; }

    public double getFeedCost(double cornCost, double hayCost) {
        return myNumCorn * cornCost + myNumHayBales * hayCost;
    }
}
=======
public abstract class Animal {
    private String name;
    private int weight;
    private int numCorn;
    private int hayBales;

    public Animal(String name,int weight,int corn,int hay) {
        this.name = name;
        this.weight = weight;
        this.numCorn = corn;
        this.hayBales = hay;
    }


    public abstract double value(double cornCost, double hayCost);
    public String getName() {return name;}
    public int getWeight() {return weight;}
    public int getCorn() {return numCorn;}
    public int getHay() {return hayBales;}
    public double getFeedCost(double cornCost, double hayCost) {
        return (numCorn * cornCost)+ + (hayBales * hayCost);
    }
}
>>>>>>> origin/master

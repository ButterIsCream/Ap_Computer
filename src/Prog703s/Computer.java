package Prog703s;

public class Computer implements Names {
    private String name;
    private int number;
    private double value;
    private  int type;

    public Computer(String name,int number,double value, int type) {
        this.name = name;
        this.number = number;
        this.value = value;
        this.type = type;
    }
    public String getName() {return name;};
    public int getNumber() {return number;};
    public double getValue() {return value;};
    public int getType() {return type;}
}

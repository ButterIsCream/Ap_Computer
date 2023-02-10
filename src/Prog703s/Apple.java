package Prog703s;

public class Apple extends Computer {
    private String color;
    public Apple(String name,int number,double value,int type,String color) {
        super(name,number,value,type);
        this.color = color;
    }

    public String getColor() {return color;}
}

package Prog703s;

public class Windows extends Computer {
    private double versionNum;
    public Windows(String name,int number,double value,double versionNum) {
        super(name,number,value);
        this.versionNum = versionNum;
    }

    public double getVersion() {return versionNum;}
}

package Prog703s;

public class Linux extends Computer {
    private int code;
    public Linux(String name,int number,double value,int type,int code) {
        super(name,number,value,type);
        this.code = code;
    }

    public int getCode() {return code;}
}

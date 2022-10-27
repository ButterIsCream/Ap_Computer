import java.util.Scanner;

public class Prog82aClassMain {
    public void main(String[] args) {
        Prog82aClass util = new Prog82aClass();

        util.setup();
        util.calc();

        System.out.println("The fine is : " + util.fine);
    }
}

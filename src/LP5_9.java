import java.util.*;

public class LP5_9 {
    public static void main(String[] args) {
        System.out.println("x^1\tx^2\tx^3\tx^4\tx^5");

        for(int i = 1; i <= 6;i++) {
            for (int i2 = 0; i2 < 5;i2++) {
                System.out.printf("%s\t",(int)Math.pow(i,i2));
            }

            System.out.print("\n");
        }
    }
}

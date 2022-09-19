import java.util.*;

public class Prog58b {
    public static void main(String[] args) {
        Scanner listner = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;

        double root1 = 0;
        double root2 = 0;

        System.out.println("Put in A : ");
        a = listner.nextInt();
        System.out.println("Put in B : ");
        b = listner.nextInt();
        System.out.println("Put in C : ");
        c = listner.nextInt();

        root1 = (-b + Math.sqrt(Math.pow(b,2) - (4 * a * c))) / (2 * a);
        root2 = (-b - Math.sqrt(Math.pow(b,2) - (4 * a * c))) / (2 * a);

        System.out.println("The roots are :" + root1 + " ," + root2);
    }
}

import java.util.*;

public class Prog58i {
    public static void main(String[] strs) {
        Scanner listner = new Scanner(System.in);

        System.out.println("The amount I wish to borrow is ");
        double p = listner.nextDouble();

        System.out.println("The loan rate is ");
        double r = listner.nextDouble();

        System.out.println("The number of months it will take me to off the loan");
        double m = listner.nextDouble();

        double rover1200 = r/1200;
        double mp = p * (rover1200 *(Math.pow(m,(1+rover1200))) / (Math.pow(m,1+rover1200) - 1));

        System.out.printf("My monthly payments will be $%.2f\n",mp);
        System.out.printf("My total intrest paid is $%.2f\n",mp * m);
        System.out.printf("My total amount paid is $%.2f\n",((mp * m) + p));
    }
}

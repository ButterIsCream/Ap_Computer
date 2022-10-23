import java.util.Scanner;

public class LP_5_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer : ");
        String positiveInt = input.next();
        int sum = 0;

        for(int i = 0; i < positiveInt.length(); i++) {
            String character = positiveInt.substring(i,i + 1);
            int num = Integer.parseInt(character);
            sum += num;
        }

        System.out.print("Sum of the integers is : " + sum);
    }
}

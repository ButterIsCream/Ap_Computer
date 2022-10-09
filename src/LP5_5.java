import java.util.Scanner;

public class LP5_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer : ");
        String number = input.next();
        int total = 0;

        for(int i = 0; i < number.length(); i++) {
            int num = Integer.parseInt(number.substring(i,i + 1));
            total += num;
        }

        System.out.print("The total is : " + total);
    }
}

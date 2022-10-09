import java.util.*;

public class LP4_6 {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10) + 1;
        int number2 = (int)(Math.random() * 10) + 1;
        int operator = (int)(Math.random() * 3) + 1;
        int total = 0;
        int answer = 0;

        if (operator == 1) {
            System.out.print("What is " + number1 + " + " + number2);
            total = number1 + number2;
        } else if (operator == 2) {
            System.out.print("What is " + number1 + " - " + number2);
            total = number1 - number2;
        } else if (operator == 3) {
            System.out.print("What is " + number1 + " * " + number2);
            total = number1 * number2;
        } else {
            System.out.print("What is " + number1 + " / " + number2);
            total = number1/number2;
        }

        Scanner input = new Scanner(System.in);

        answer = input.nextInt();

        if (answer == total) {
            System.out.print("Correct!");
        } else {
            System.out.print("Incorrect :(");
        }
    }
}

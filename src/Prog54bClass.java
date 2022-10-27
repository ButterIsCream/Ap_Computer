import java.util.Scanner;

public class Prog54bClass {
    private int num1,num2,num3,num4,sum;
    private double average;

    public Prog54bClass() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        num1 = input.nextInt();
        System.out.print("Enter number 2 : ");
        num2 = input.nextInt();
        System.out.print("Enter number 3 : ");
        num3 = input.nextInt();
        System.out.print("Enter number 4 : ");
        num4 = input.nextInt();
    }

    public void calc() {
        sum = num1 + num2 + num3 + num4;
        average = sum / 4;
    }

    public void print() {
        System.out.printf("\nThe sum of the numbers is : %s\nThe average of the four numbers is : %s",sum,average);
    }
}

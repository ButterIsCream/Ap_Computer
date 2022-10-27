import java.util.Scanner;

public class Prog76aClassMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number you dislike : ");
        int disliked = input.nextInt();

        Prog76aClass util = new Prog76aClass(disliked);
    }
}

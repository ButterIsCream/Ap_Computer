import java.util.Scanner;

public class Prog54cClassMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter in radius : ");
        int rad = input.nextInt();

        Prog54cClass util = new Prog54cClass(rad);
    }
}

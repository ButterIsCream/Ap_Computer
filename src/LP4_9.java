import java.util.*;

public class LP4_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int randNum = (int)(Math.random() * 20) + 1;
        int playerNum = 0;

        System.out.print("Enter a number between 1 and 20 : ");
        playerNum = input.nextInt();

        System.out.println("Computer's number is : " + randNum);
        System.out.println("Player number is : " + playerNum);

        if (playerNum == randNum) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect :(");
        }
    }
}

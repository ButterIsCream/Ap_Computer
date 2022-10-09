import java.util.*;

public class LP5_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String password = "Welcome";

        for(int i = 0;i < 3;i++) {
            System.out.print("Enter the password : ");
            String attempt = input.next();

            if (attempt.matches(password)) {
                System.out.println("Correct!");
                break;
            } else {
                System.out.println("Incorrect :( ");
            }
        }
    }
}

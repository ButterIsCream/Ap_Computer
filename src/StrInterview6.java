import java.util.Scanner;

public class StrInterview6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String myText = input.nextLine();

        for (int i = 0; i < myText.length(); i++) {
            char c = myText.charAt(i);
        }
    }
}

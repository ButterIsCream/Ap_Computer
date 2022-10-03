import java.util.Scanner;

public class StrInterview7 {
    public static void main(String[] args) {
        int vowel = 0;
        int conscount = 0;

        String vowelStr = "aeiou";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String myText = input.nextLine();


        for(int i = 0; i < myText.length(); i++) {
            char c = myText.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel++;
            }
        }

        conscount = myText.length() - vowel;
        System.out.printf("# Voewels: %d\t\t# Consoants: %d\n",vowel,conscount);
    }
}

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog505a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("./src/data/prog505a.dat"));
            String winner = "";
            int winnerScore = 0;


            while(input.hasNext()) {
                String name = input.next();
                String last = input.next();
                int books = input.nextInt();
                int score = 0;

                if (books <= 3) {
                    score = 10 * books;
                } else if (books >= 3) {
                    score = 10 * 3;
                    score = 15 * (books - 3);
                } else if (books > 6) {
                    score = 10 * 3;
                    score = 15 * (books - 3);
                    score = 20 * (books - 6);
                }

                if(score > winnerScore) {
                    winnerScore = score;
                    winner = name + " " +last;
                }

                System.out.printf("%s\t%s\n",name + " " + last,winnerScore);

            }

            System.out.println("The winner is " + winner + " " + winnerScore);
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}

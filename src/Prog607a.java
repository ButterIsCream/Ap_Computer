import java.util.Scanner;

public class Prog607a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String date;
        String code;

        int option = 0;

        boolean running = true;

        while(running) {
            System.out.println("-----Menu-----\n0)Quit\n1)Encode Data\n2)Decode Data");
            System.out.print("Select Option : ");
            option = input.nextInt();

            if (option == 0) {
                break;
            } else if(option == 1) {
                System.out.print("Enter date : ");
                date = input.next();
            } else if(option == 2) {

            }
        }
    }
}

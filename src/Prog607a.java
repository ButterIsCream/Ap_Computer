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
                String[] split = date.split("/");
                String d1 = split[2].substring(0,1);
                String d2 = split[2].substring(1,2);

                char day = (char)(64 + Integer.parseInt(split[0]));
                char month = (char)(67 + Integer.parseInt(split[1]));
                char ed1 = (char)(76 + Integer.parseInt(d1));
                char ed2 = (char)(75 + Integer.parseInt(d2));

                System.out.println(day + "" + month + "" + "" + ed1 + "" + ed2);
            } else if(option == 2) {

            }
        }
    }
}

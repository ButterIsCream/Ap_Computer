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
                System.out.print("Enter Code : ");
                code = input.next();

                int l1,l2,l3,l4;
                char[] array = code.toCharArray();

                for(int i = 0; i < args.length; i++) {
                    char l = array[i];
                    int placment = (int)l;


                    if(i == 1) {
                        l1 = placment - 64;
                        System.out.println(l1);
                    }
                }
            }
        }
    }
}

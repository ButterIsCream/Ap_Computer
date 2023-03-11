import java.util.Scanner;

public class Prog901aRec {
    public static String convert(int num,String b) {
        b += num % 2;
        num = num / 2;

        if(!(num / 2 == 0)) {
            return convert(num,b);
        }

        return b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numConv = 0;

        System.out.print("Enter the number to be converted : ");
        numConv = input.nextInt();

        String b = convert(numConv,"");
        System.out.println(b);
    }
}
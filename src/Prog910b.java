import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog910b {
    public static String convert(int num,int base,String b) {
        b += num % base;
        num = num / base;

        if(!(num / base == 0)) {
            return convert(num,base,b);
        }

        return b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int base10 = 0;
        int newBase = 0;

        System.out.print("Enter Number[Base 10] : ");
        base10 = input.nextInt();
        System.out.print("Enter New Base : ");
        newBase = input.nextInt();
        String e = convert(base10,newBase,"");

        System.out.println(e);
    }
}
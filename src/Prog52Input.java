import java.util.*;

public class Prog52Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the length: ");
        int len = input.nextInt();
        System.out.println();
        System.out.print("Please enter the width : ");
        int width = input.nextInt();
        System.out.println();

        int area = len * width;
        int perim = 2 * (len + width);

        System.out.println("The area is : " + area);
        System.out.println("The perimeter is : " + perim);
    }
}

/*
Please enter the length: 20

Please enter the width : 30

The area is : 600
The perimeter is : 100
 */
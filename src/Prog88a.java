public class Prog88a {
    public static void main(String[] strings) {
        int num1 = (int)(Math.random() * (13 - 1) + 1);
        int num2 = (int)(Math.random() * (20 - 2) + 2);

        int max;
        int min;
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int absolute = Math.abs(difference);
        double average = (sum) / 2;

        if (num1 > num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }

        if (max == num1) {
            min = num2;
        }
        else {
            min = num1;
        }

        System.out.println("Original numbers are " + num1 + " and " + num2);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.println("Abs = " + absolute);
    }
}
/*
Original numbers are 1 and 19
Maximum = 19
Minimum = 1
Sum = 20
Difference = -18
Product = 19
Abs = 18
 */
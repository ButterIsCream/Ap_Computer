public class Prog166f {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            int sum = 0;

            for (int i2 = 0; i2 <= i + 100; i2++) {
                sum += i2;
            }

            System.out.println("The sum of the numbers from 1 to " + (i + 100) + " is " + sum);
        }
    }
}

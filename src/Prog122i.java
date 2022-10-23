import java.util.Scanner;

public class Prog122i {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Number\tCube Root\tCube");

        for(int i = -25; i <= 25; i++) {
            double cubeRoot = Math.cbrt(i);
            int cubed = (int)Math.pow(i,3);

            System.out.printf("%s\t\t%.2f\t\t%s\n",i,cubeRoot,cubed);
        }
    }
}

import java.util.*;

public class LP4_16 {
    public static void main(String[] args) {
        int angle = 0;
        double sin = 0;
        double cos = 0;
        double tan = 0;
        double rad = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an angle in degrees : ");
        angle = input.nextInt();

        rad = Math.toRadians(angle);
        sin = Math.sin(rad);
        cos = Math.cos(rad);
        tan = Math.tan(rad);

        System.out.printf("Sin : %.1f\n",sin);
        System.out.printf("Cosine : %.3f\n",cos);
        System.out.printf("Tangent : %.3f",tan);
    }
}

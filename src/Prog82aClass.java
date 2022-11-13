import java.util.Scanner;

public class  Prog82aClass {
    private int speedLim,vSpeed;
    public double fine;


    public void calc() {
        int diff = (vSpeed - speedLim);
        fine = 20 + (diff * 5);
    }

    public void setup() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed limit : ");
        speedLim = input.nextInt();
        System.out.print("Enter car speed : ");
        vSpeed = input.nextInt();
    }
}

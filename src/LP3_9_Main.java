import java.util.Scanner;

public class LP3_9_Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Year born : ");
        int yearBorn = input.nextInt();
        System.out.print("Month born : ");
        int monthBorn = input.nextInt();
        System.out.print("Day born : ");
        int dayBorn = input.nextInt();

        System.out.print("Current year : ");
        int currentYear = input.nextInt();
        System.out.print("Current month : ");
        int currentMonth = input.nextInt();
        System.out.print("Current day : ");
        int currentDay = input.nextInt();

        LP3_9_Class date = new LP3_9_Class(yearBorn,monthBorn,dayBorn,currentYear,currentMonth,currentDay);

        System.out.printf("You have been alive for %s days.\nYou slept %s hours.",date.daysAlive,date.hoursSlept);

    }
}

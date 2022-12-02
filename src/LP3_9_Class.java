public class LP3_9_Class {
    public int daysSlept = 0;
    public int daysAlive = 0;

    public LP3_9_Class(int yearBorn,int monthBorn,int dayBorn,int currentYear,int currentMonth,int currentDay) {
        int yearDiff = currentYear - yearBorn;
        int monthDiff = Math.abs(monthBorn - currentMonth);
        int dayDiff = Math.abs(dayBorn - currentDay);

        yearDiff = yearDiff;

        daysAlive = (yearDiff * 365) + (dayDiff) + (monthDiff * 30);

        System.out.println(daysAlive);
    }
}

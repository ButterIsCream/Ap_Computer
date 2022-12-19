public class LP3_9_Class {
    public int hoursSlept = 0;
    public int daysAlive = 0;

    public LP3_9_Class(int yearBorn,int monthBorn,int dayBorn,int currentYear,int currentMonth,int currentDay) {
        double yearDiff = currentYear - yearBorn;
        double monthDiff = Math.abs(monthBorn - currentMonth);
        double dayDiff = Math.abs(dayBorn - currentDay);


        if (monthBorn < currentMonth) {
            yearDiff += (monthDiff / 12);
        } else {
            yearDiff -= (monthDiff / 12);
        }

        if (dayBorn < currentDay) {
            yearDiff += (dayDiff / 30) / 12;
        } else {
            yearDiff -= (dayDiff / 30) / 12;
        }


        daysAlive = (int)(yearDiff * 365) - 2;
        hoursSlept = (daysAlive * 8);
    }
}

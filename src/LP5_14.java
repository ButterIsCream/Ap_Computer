public class LP5_14 {
    public static void main(String[] args) {
        System.out.println("Dice1\tDice2\tTotal");

        for (int i = 0; i<5;i++) {
            int rand1 = (int)(Math.random() * 6) + 1;
            int rand2 = (int)(Math.random() * 6) + 1;

            int total = rand1 + rand2;

            System.out.printf("%s\t\t%s\t\t%s\n",rand1,rand2,total);
        }
    }
}

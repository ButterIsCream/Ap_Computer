public class Prog122h {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            int cube = (int)Math.pow(i,3);
            double sqrt = Math.sqrt(i);
            double sqrt4 = Math.pow(i, 0.25);

            System.out.printf("%s\t\t%.4f\t\t%s\t\t%.4f\n",i,sqrt,cube,sqrt4);
        }
    }
}

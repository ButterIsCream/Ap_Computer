public class Prog122a {
    public static double round(double number,double decimals) {
        double rounded = 0;

        rounded = Math.round(number / decimals) * decimals;

        return rounded;
    }

    public static void main(String[] args) {
        for (int i = 1;i <= 50; i++) {
            int num = i * i;
            double root = Math.sqrt(Math.sqrt(num));

            System.out.println(i + "\t" + num + "\t" + round(root,100));
        }
    }
}

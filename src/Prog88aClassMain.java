public class Prog88aClassMain {
    public static void main(String[] args) {
        Prog88aClass num = new Prog88aClass();

        num.setRandom();
        num.setValues();

        System.out.println("Original numbers are " + num.number1 + " and " + num.number2);
        System.out.println("Maximum = " + num.max);
        System.out.println("Minimum = " + num.min);
        System.out.println("Sum = " + num.sum);
        System.out.println("Difference = " + num.difference);
        System.out.println("Product = " + num.product);
        System.out.println("Abs = " + num.absolute);
    }
}

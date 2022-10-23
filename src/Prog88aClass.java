public class Prog88aClass {
    public int number1;
    public int number2;

    public int max;
    public int min;
    public int sum = 0;
    public int difference = 0;
    public int product = 0;
    public int absolute = 0;

    public void setRandom() {
        number1 = (int)(Math.random() * (13 - 1) + 1);
        number2 = (int)(Math.random() * (20 - 2) + 2);
    }

    public void setValues() {
        max = Math.max(number1,number2);
        min = Math.min(number1,number2);
        sum = number1 + number2;
        difference = number1 - number2;
        product = number1 * number2;
        absolute = Math.abs(number1 - number2);
    }
}

package two.part4.basic;

public class Main {
    public static void main(String[] args) {
        Calculator add = new Addition();
        Calculator sub = new Subtraction();
        Calculator mul = new Multiplication();

        System.out.println("10 + 5 = " + add.calculate(10, 5));
        System.out.println("10 - 5 = " + sub.calculate(10, 5));
        System.out.println("10 * 5 = " + mul.calculate(10, 5));
    }
}

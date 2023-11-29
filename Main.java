import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);
    double a = input.nextDouble();
    double b = input.nextDouble();
    public double add(double a, double b) {
        return a + b;
    }
    public double sub(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double div(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN;
        }
    }
    public double abs(double a) {
        return Math.round(a);
    }
    public double pow(double a) {
        return a * a;
    }
    public static void main(String[] args) {

        Main main = new Main();
        System.out.println("Example add: " + main.add(main.a, main.b));
        System.out.println("Example sub: " + main.sub(main.a, main.b));
        System.out.println("Example multiply: " + main.multiply(main.a, main.b));
        System.out.println("Example div: " + main.div(main.a, main.b));
        System.out.println("Example abs: " + main.abs(main.a));
        System.out.println("Example pow: " + main.pow(main.a));

    }
}
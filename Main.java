import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);
    public double add(double a, double b) {
        return a + b;
    }
    public int add(int a, int b) {
        return a + b;
    }
    public long add(long a, long b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public long sub(long a, long b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public long multiply(long a, long b) {
        return a * b;
    }
    public int multiply(int a, int b) {
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
    public int div(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }
    public long div(long a, long b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }
    public double abs(double a) {
        return Math.round(a);
    }
    public int abs(int a) {
        return Math.round(a);
    }
    public long abs(long a) {
        return Math.round(a);
    }
    public double pow(double a) {
        return a * a;
    }
    public int pow(int a) {
        return a * a;
    }
    public long pow(long a) {
        return a * a;
    }
    public static void main(String[] args) {

        Main main = new Main();
        System.out.println("Example add: " + main.add(5.5, 3.5));
        System.out.println("Example sub: " + main.sub(5.5, 3.4));
        System.out.println("Example multiply: " + main.multiply(50, 2.4));
        System.out.println("Example div: " + main.div(5, 3));
        System.out.println("Example abs: " + main.abs(5));
        System.out.println("Example pow: " + main.pow(5));

    }
}
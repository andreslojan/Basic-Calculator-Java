// create a public class
public class Calculator {

    // create a constructor
    public Calculator() {

    }

    // create the add method
    public int add(int a, int b) {
        return a + b;
    }

    // create the subtract method
    public int subtract(int a, int b) {
        return a - b;
    }

    // create the multiply method
    public int multiply(int a, int b) {
        return a * b;
    }

    // create the divide method
    public int divide(int a, int b) {
        return a / b;
    }

    // create the modulo method
    public int modulo(int a, int b) {
        return a % b;
    }

    // create the main method
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator.subtract(45, 11));
        System.out.println(myCalculator.multiply(3, 8));
        System.out.println(myCalculator.divide(28, 4));
        System.out.println(myCalculator.modulo(10, 5));
    }
}
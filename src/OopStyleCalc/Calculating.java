package OopStyleCalc;

public class Calculating {
    private double in1;
    private double in2;

    public static void main(String[] Args) {

    }

    public int addition(int in1, int in2) {
        int res = in1 + in2;
        return res;
    }

    public int subtraction(int in1, int in2) {
        int res = in1 - in2;
        return res;
    }

    public int multiplication(int in1, int in2) {
        int res = in1 * in2;
        return res;
    }

    public Double division(double in1, double in2) {
        this.in1 = in1;
        this.in2 = in2;
        double res = 0;
        try {
            res = in1 / in2;

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        return res;

    }
}





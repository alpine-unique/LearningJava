package OopStyleCalc;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    public static int in1;
    public static int in2;
    public static String input;
    public static Calculating calc = new Calculating();
    public static void main(String[] Args) {
        GetInputPrintOutput();
    }

    public static void GetInputPrintOutput()  {
        DecimalFormat df = new DecimalFormat("");
        System.out.println("Please input two ints you want to calculate.");
        System.out.print("First variable: ");
        while(true) {
            try {
                Scanner sc = new Scanner(System.in);
                in1 = sc.nextInt();
                System.out.print("Second variable: ");
                in2 = sc.nextInt();
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input type, please enter two integers");
                continue;
            }
        }
        while(true) {
                System.out.print("Select an operation to proceed: type \" + \" for addition, \" - \" for subtraction, \" / \" for division and \" * \" for multiplication\" ");
                Scanner sc = new Scanner(System.in);
                input = sc.nextLine();
                if (!input.equals("+") && !input.equals("-") && !input.equals("/") && !input.equals("*")) {
                    System.out.println("Invalid operation selected. Select \" + \" for addition, \" - \" for subtraction, \" / \" for division and \" * \" for multiplication");
                }
                else {
                    break;
            }
        }
        switch (input) {
            case "+":
                String OutputAdd = new DecimalFormat("#0.00").format(calc.addition(in1, in2));
                System.out.println(OutputAdd);
                break;
            case "-":
                String OutputSub = new DecimalFormat("#0.00").format(calc.subtraction(in1, in2));
                System.out.println(OutputSub);
                break;
            case "/":
                String OutputDiv = new DecimalFormat("#0.00").format(calc.division(in1, in2));
                System.out.println(OutputDiv);
                break;
            case "*":
                String OutputMulti = new DecimalFormat("#0.00").format(calc.multiplication(in1, in2));
                System.out.println(OutputMulti);
                break;
        }
    }





}

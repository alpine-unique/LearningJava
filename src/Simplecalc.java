import java.util.Scanner;


public class Simplecalc {
    public static double in1;
    public static double in2;
    public static String op;

    public static void main(String args[]) {
        asker();
        double res = 0;
        switch (op) {
            case ("-"):
                res = in1 - in2;
                break;
            case ("+"):
                res = in1 + in2;
                break;
            case ("/"):
                res = in1 / in2;
                break;
            case ("*"):
                res = in1 * in2;
                break;
            default:
                System.out.println("Не выбрана верная операция");
                asker();
        }
        System.out.println(res);
    }

    public static void asker() {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Какую операцию хотим провести? Введите '-' '+' '/' '*' для вычитания, сложения, деления и умножения соответственно");


        while(true){
            try{
                op = sc.next();
                break;
            }
            catch (Exception e){
                System.out.println("Ты долбаеб");
            }
        }

        switch (op) {
            case ("-"):
            case ("+"):
            case ("/"):
            case ("*"):
                System.out.println("Введите первое число:");
                in1 = sc.nextDouble();
                System.out.println("Введите второе число:");
                in2 = sc.nextDouble();
                break;
            default:
                System.out.println("Не выбрана верная операция");
                asker();
        }


    }

}


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
                System.out.println("�� ������� ������ ��������");
                asker();
        }
        System.out.println(res);
    }

    public static void asker() {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("����� �������� ����� ��������? ������� '-' '+' '/' '*' ��� ���������, ��������, ������� � ��������� ��������������");


        while(true){
            try{
                op = sc.next();
                break;
            }
            catch (Exception e){
                System.out.println("�� �������");
            }
        }

        switch (op) {
            case ("-"):
            case ("+"):
            case ("/"):
            case ("*"):
                System.out.println("������� ������ �����:");
                in1 = sc.nextDouble();
                System.out.println("������� ������ �����:");
                in2 = sc.nextDouble();
                break;
            default:
                System.out.println("�� ������� ������ ��������");
                asker();
        }


    }

}


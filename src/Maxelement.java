import java.util.Scanner;

public class Maxelement {
    public static void main(String[] Args){
        Scanner sc;
        System.out.println("������� ������ ���� ����� ������: \n");
        sc = new Scanner(System.in);
        String elem = sc.nextLine();
        String[] Array = elem.split(" ");
        System.out.println("������������ �������: " +  Array[maxelementfinder(Array)]);
    }

    public static int maxelementfinder(String[] Array){
        int maxlen = Array[0].length();
        int index = 0;

        for (int i=0; i < Array.length; i++) {
            if (Array[i].length() > maxlen) {
                maxlen = Array[i].length();
                index = i;
            }
        }
        return index;
    }
}

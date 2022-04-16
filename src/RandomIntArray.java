import java.util.*;

public class RandomIntArray {

    public static void main(String[] Args){
        filler();
    }

    public static void filler() {
        Random randomarray = new Random();
        int[] array = randomarray.ints(20, -10, 20).toArray();
        toListAndSwap(array, minPositive(array), maxNegative(array));
    }
    public static int maxNegative(int[] array) {
        int maxnegative = -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0 && (maxnegative == -1 || array[i] > array[maxnegative])) {
                maxnegative = i;
            }
        }
       return maxnegative;
    }
    public static int minPositive(int[] array) {
        int minpositive = 1;
        for (int i = 0; i <array.length; i++) {
            if(array[i] > 0 && (minpositive == 1 || array[i] < array[minpositive])) {
                minpositive = i;
            }
        }
        return minpositive;
    }
    public static void toListAndSwap (int[] array, int minpositive, int maxnegative) {
        List<Integer> list = new ArrayList<Integer>(array.length);
        for (int i: array) {
            list.add(i);
        }
        System.out.println("Список элементов до свапа: \n " + list);
        Collections.swap(list, maxnegative, minpositive);
        System.out.println("Список элементотв после свапа: \n " + list);
    }

}

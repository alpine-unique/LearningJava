import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.*;

public class RandomIntArray {

    public static void main(String Args[]){
        filler();
            }

    public static void filler() {
        Random randomarray = new Random();
        int[] array = randomarray.ints(20, -10, 50).toArray();
        maxNegative(array);
        minPositive(array);
    }
    public static void maxNegative( int[] array) {


        int maxNegative = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0 && ( maxNegative == 0 || array[i] > maxNegative)) {
                maxNegative = array[i];
            }
        }
        int maxNegIndx = (Arrays.asList((int[])array)).indexOf(maxNegative); //
        System.out.println(Arrays.toString(array));
        System.out.println(maxNegative);
        System.out.println("Индекс максимального отриц. элемента: " + maxNegIndx);
    }
    public static void minPositive(int[] array) {
        int minPositive = 0;
        for (int i = 0; i <array.length; i++) {
            if(array[i] > 0 && (minPositive == 0 || array[i] < minPositive)) {
                minPositive = array[i];
            }
        }
        int minPosIndx = (Arrays.asList(array)).indexOf(minPositive);
        System.out.println(minPositive);
        System.out.println("Индекс минимального положит. элемента: " + minPosIndx);
    }

}

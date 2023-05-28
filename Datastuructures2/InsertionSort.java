package Datastuructures2;

import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int current=array[i];
            int j=i-1;
            while (j>=0 && array[j]>current){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=current;
        }
        return array;
    }

    public static void main(String[] args) {
        int [] array= {30,2,41,56,12,11,22,41};
        int[ ] result = insertionSort(array);
        Arrays.stream(result).forEach(System.out::println);
    }
}

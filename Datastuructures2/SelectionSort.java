package Datastuructures2;

import java.util.Arrays;

public class SelectionSort {
    public static int[] selectionSort(int[ ] array){
        int n= array.length;
        for (int i = 0; i < n-1 ; i++) {
            int min=i;
            for (int j = i+1; j < n ; j++) {
                if(array[j]<array[min])
                    min=j;

            }
            int temp=array[min];
            array[min]=array[i];
            array[i]=temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int [] array= {30,2,41,56,12,11,22,41};
        int[ ] result = selectionSort(array);
        Arrays.stream(result).forEach(System.out::println);
    }
}

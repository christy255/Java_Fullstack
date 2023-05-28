package Datastuructures2;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[ ] array){
        int n= array.length;
        for (int i = 0; i <n-1 ; i++) {
            for (int j = 0; j <n-i-1 ; j++) {
                if (array[j]>array[j+1]) {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int [] array= {30,2,41,56,12,11,22,41};
        int[ ] result = bubbleSort(array);
        Arrays.stream(result).forEach(System.out::println);
    }
}

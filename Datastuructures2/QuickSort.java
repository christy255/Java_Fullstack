package Datastuructures2;

import java.util.Arrays;

public class QuickSort {
    public static void swap(int[] array,int i, int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    public static int partition(int [] array,int low,int high){
        int pivot=array[high];
        int i=low-1;
        for (int j = low; j <=high-1 ; j++) {
            if(array[j]<pivot){
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i+1, high);
        return i+1;
    }
    public static int[] quickSort(int[] array,int low,int high){
        if (low<high){
            int pi=partition(array, low, high);
            quickSort(array, low, pi-1);
            quickSort(array, pi+1, high);
        }
        return array;
    }
    public static void main(String[] args) {
        int [] array= {30,2,41,56,12,11,22,41};
        int[ ] result = quickSort(array,0, array.length-1);
        Arrays.stream(result).forEach(System.out::println);
    }
}

package dataStructures;

public class Reverse {
    public static  int arrayReverse(int[ ] array){
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.print(array[i]+" ");
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6};
        arrayReverse(array);
    }
}

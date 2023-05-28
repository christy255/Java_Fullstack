package dataStructures;
 public class dynamicArray {
     private int arr[];
     private int count;

     public dynamicArray(int length) {
          arr = new int[length];
     }

     public void printArray() {
         for (int i = 0; i < count; i++) {
             System.out.print(arr[i] + " ");
         }
     }

     public void insert(int element) {
         if (count == arr.length) {
             int[] newarr = new int[count * 2];
             for (int i = 0; i < count; i++) {
                 newarr[i] = arr[i];
             }
             arr = newarr;

         }
         arr[count++] = element;
     }
     }

     class Dynamic {
         public static void main(String[] args) {

             dynamicArray numbers = new dynamicArray(1);


             numbers.insert(10);
             numbers.insert(30);
             numbers.insert(40);
             numbers.insert(50);
             numbers.insert(50);
             numbers.printArray();
         }
     }

package dataStructures;

public class binarysearch {

    public static int binaryIter(int[] array,int target){
        int start =0;
        int end= array.length-1;
        while (start <= end){
            int middle =start+(end-start)/2;
            if (array[middle]==target){
                return middle;
            }
            else if(array[middle] >target){
                end=middle-1;
            } else if (array[middle] < target) {
                start=middle+1;
            }
        }
        return-1;
    }
    public static int binaryRec(int[ ] array,int target){
    return binaryHelper(array,target,0,array.length-1);
    }
    public static int binaryHelper(int[ ] array,int target,int start,int end){
        if (start > end){
            return -1;
        }
        int middle =start+(end-start)/2;
        if (array[middle]==target){
            return middle;
        }
        else if(array[middle] >target){
          return  binaryHelper(array, target, start, middle-1);
        }
        else{
            return binaryHelper(array, target, middle+1, end);
        }
    }

    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9};
        binarysearch bs=new binarysearch();
        int result=bs.binaryRec(array,5);
        System.out.println(result);
    }
}

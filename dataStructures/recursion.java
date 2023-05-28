package dataStructures;

public class recursion
{

        static int fun (int n){
            if (n <=1 ){
                return 1;
            }
         fun(n-1);
            System.out.println(n);
            fun(n-1);
            return 1;
        }
    public static void main(String[] args) {
        fun(5);
    }
}

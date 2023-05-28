package dataStructures;

public class RECURSION2
{
    public static int show(int n){
        if(n>=100){
            return 1;
        }
        System.out.println(show(n+1));
        return 0;
    }

    public static void main(String[] args) {
        show(1);
    }
}

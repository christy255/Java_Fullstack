package dataStructures;
public class Encryptor
{
    public static String change(String str) {
        int count = 1;
        String newString = "";
        for(int i=1;i<str.length();i++) {
            if(str.charAt(i) == str.charAt(i-1) || i==str.length()) {
                count++;
            } else {
                newString = newString + Integer.toString(count) + str.charAt(i-1);
                count = 1;
            }
        }
        newString = newString + Integer.toString(count) + str.charAt(str.length()-1);
        return newString;
    }

    public static void main(String[] args) {
        String s = "AAAABBCCC";
        System.out.println(change(s));
    }
}
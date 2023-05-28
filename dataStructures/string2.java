package dataStructures;

public class string2 {
    public static String replaceAlphabets(String str, int n) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isLetter(c)) {
                int con=(c - 'a' + n) % 26 + 'a';
                char newChar = (char) con; // Replace with alphabet n positions ahead
                chars[i] = newChar;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {


        // Example usage:
        String original = "hello";
        int n = 3;
        String replaced = replaceAlphabets(original, n);
        System.out.println("Original: " + original); // Output: hello
        System.out.println("Replaced: " + replaced); // Output: khoor
    }
}
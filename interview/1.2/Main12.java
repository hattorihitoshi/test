import java.util.Arrays;

public class Main12 {
    public static boolean permutation(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }

        str1 = sort(str1);
        str2 = sort(str2);

        return str1.equals(str2);
    }

    private static String sort(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(permutation(args[0], args[1]));
    }
}
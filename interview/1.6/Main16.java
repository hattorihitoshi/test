public class Main16 {

    public static String compress(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            count++;
            if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(count);
                count = 0;
            }
        }
        return str.length() < compressed.length() ? str : compressed.toString();
    }

    public static void main(String[] args) {
        System.out.println(compress(args[0]));
    }
}
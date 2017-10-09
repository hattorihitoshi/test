public class Main11 {
    // ASCII文字範囲での判定メソッド
    public static boolean isUniqueChar(String str) {
        if(str.length() > 128) return false;
        
        boolean[] char_set = new boolean[128];

        for(int i = 0; i < str.length(); i++) {
            int char_int = str.charAt(i) - 'A';
            if(char_set[char_int] == false) {
                char_set[char_int] = true;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUniqueChar(args[0]));
    }
}
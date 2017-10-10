public class Main13 {
    public static String replaceSpace(String str) {

        int newLength = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                newLength += 3;
            } else {
                newLength += 1;
            }
        }

        char[] newString = new char[newLength];
        int j = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                newString[j++] = '%';
                newString[j++] = '2';
                newString[j++] = '0';
            } else {
                newString[j++] = str.charAt(i);
            }
        }

        return new String(newString);
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace(args[0]));
    }
}
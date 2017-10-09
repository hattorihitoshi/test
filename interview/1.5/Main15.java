public class Main15 {

    public static boolean noEdit(String str1, String str2) {
        if(str1 == null) {
            if(str2 == null) {
                return true;
            } else {
                return false;
            }
        } else if(str1.endsWith(str2)){
            return true;
        } else {
            return false;
        }
    }
    public static boolean oneEditInsert(String str1, String str2) {
        int diff = str1.length() - str2.length();

        String str_s = null;
        String str_l = null;
        if(diff < -1 || 1 < diff || diff == 0) {
            return false;
        } else if(diff == -1) {
            str_s = str1;
            str_l = str2;
        } else if(diff == 1) {
            str_s = str2;
            str_l = str1;
        }
        
        for(int i = 0; i < str_l.length(); i++) {
            if(str_s.equals(str_l.substring(0, i) + str_l.substring(i + 1, str_l.length()))) {
                return true;
            }
        }
        return false;
    }

    public static boolean oneEditReplace(String str1, String str2) {
        if(str1.length() == str2.length()) {
            boolean able = true;
            char[] chrs1 = str1.toCharArray();
            char[] chrs2 = str2.toCharArray();
            for(int i = 0; i < chrs1.length; i++) {
                if(chrs1[i] != chrs2[i]) {
                    if(able) {
                        able = false;
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        // System.out.println(noEdit(args[0], args[1]));
        // System.out.println(oneEditReplace(args[0], args[1]));
        // System.out.println(oneEditInsert(args[0], args[1]));

        if(noEdit(args[0], args[1]) || oneEditReplace(args[0], args[1]) || oneEditInsert(args[0], args[1])) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
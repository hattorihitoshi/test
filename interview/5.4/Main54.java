public class Main54 {

    public static int getNext(int n) {
        int c = n;
        int c0 = 0;
        int c1 = 0;
        while(((c & 1) == 0) & (c != 0)) {
            c0++;
            c >>= 1;
        }
        while((c & 1) == 1) {
            c1++;
            c >>= 1;
        }
        if(c0 + c1 == 31 || c0 + c1 ==0) {
            return -1;
        }

        int p = c0 + c1;
        n |= (1 << p);
        n &= ~((1 << p) -1);
        n |= (1 << (c1 - 1)) -1;

        return n;
    }

    public static int getPrev(int n) {
        int c = n;
        int c0 = 0;
        int c1 = 0;

        while((c & 1) == 1) {
            c0++;
            c >>= 1;
        }
        if(c == 0) {
            return -1;
        }
        while((c & 1) == 0) {
            c1++;
            c >>=1;
        }
        

    }

    public static void main(String[] args) {
        int n = new Integer(args[0]).intValue();
        System.out.println(Integer.toBinaryString(n));
        int next = getNext(n);
        System.out.println(next + ", " + Integer.toBinaryString(next));;
    }
}
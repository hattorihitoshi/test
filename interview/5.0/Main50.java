public class Main50 {

    public static boolean getBit(int num, int i) {
        return ((num & (1 << i)) != 0);
    }

    public static int setBit(int num, int i) {
        return num | (1 << i);
    }

    public static int clearBit(int num, int i) {
        int mask = ~(1 << i);
        return num & mask;
    }

    public static int clearBitsMSBthroughI(int num, int i) {
        int mask = (1 << i) - 1;
        return num & mask;
    }

    public static int clearBitsIthrough0(int num, int i) {
        int mask = (-1 << (i + 1));
        return num & mask;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(-2));
        System.out.println(Integer.toBinaryString(setBit(0, 5)));
        System.out.println(Integer.toBinaryString(clearBit(63, 2)));
        System.out.println(Integer.toBinaryString(clearBitsIthrough0(-1, 5)));
    }
}
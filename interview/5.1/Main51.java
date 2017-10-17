public class Main51 {
    public static int updateBits(int n, int m, int i, int j) {
        int left = -1 << (j + 1); System.out.println(Integer.toBinaryString(left));
        int right = (1 << i) -1; System.out.println(Integer.toBinaryString(right));
        int mask = left | right; System.out.println(Integer.toBinaryString(mask));

        int n_cleared = n & mask; System.out.println(Integer.toBinaryString(n_cleared));
        int m_shifted = m << i; System.out.println(Integer.toBinaryString(m_shifted));

        return n_cleared | m_shifted;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(updateBits(0, 31, 3, 7)));

    }
}
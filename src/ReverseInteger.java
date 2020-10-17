public class ReverseInteger {
    public static void main(String[] args) {
        int input = -123;
        int output = reverse(input);
        System.out.println(output);
    }

    private static int reverse(int x) {
        long output = 0;
        int currentDigit;
        while (x != 0) {
            currentDigit = x % 10;
            x = x / 10;
            output = output * 10 + currentDigit;
            if (output > Integer.MAX_VALUE || output < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) output;
    }
}

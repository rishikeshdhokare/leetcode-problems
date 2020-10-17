package reverse_number;

public class ReverseInteger {
    public int reverse(int x) {
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

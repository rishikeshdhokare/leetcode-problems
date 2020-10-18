public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reversed = reverse(x);
        return x == reversed;
    }

    private int reverse(int x) {
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

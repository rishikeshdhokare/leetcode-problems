import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeNumberTest {

    @Test
    void test() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        assertTrue(palindromeNumber.isPalindrome(121));
        assertTrue(palindromeNumber.isPalindrome(0));
        assertFalse(palindromeNumber.isPalindrome(123));
    }
}
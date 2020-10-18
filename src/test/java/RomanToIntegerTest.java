import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerTest {

    @Test
    void test() {
        RomanToInteger romanToInteger = new RomanToInteger();
        assertEquals(3, romanToInteger.romanToInt("III"));
        assertEquals(9, romanToInteger.romanToInt("IX"));
        assertEquals(58, romanToInteger.romanToInt("LVIII"));
        assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }
}
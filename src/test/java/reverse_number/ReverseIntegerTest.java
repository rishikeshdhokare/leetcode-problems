package reverse_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    @Test
    void test() {
        ReverseInteger reverseInteger = new ReverseInteger();
        int input = -123;
        int output = reverseInteger.reverse(input);
        assertEquals(-321, output);
    }
}
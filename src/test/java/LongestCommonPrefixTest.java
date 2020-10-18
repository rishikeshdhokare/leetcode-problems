import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void test() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        assertEquals("fl", longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{}));
    }
}
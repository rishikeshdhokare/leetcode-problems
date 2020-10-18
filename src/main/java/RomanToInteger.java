import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    private static final Map<Character, Integer> romanToIntMap = new HashMap<>();

    static {
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);
    }

    public int romanToInt(String s) {
        int output = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && isCurrentDigitSmallerThanNext(s.charAt(i), s.charAt(i + 1))) {
                output -= romanToIntMap.get(s.charAt(i));
            } else {
                output += romanToIntMap.get(s.charAt(i));
            }
        }
        return output;
    }

    private boolean isCurrentDigitSmallerThanNext(char currentDigit, char nextDigit) {
        return romanToIntMap.get(currentDigit) < romanToIntMap.get(nextDigit);
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    private static final Map<Character, Character> charMap = new HashMap<>();

    static {
        charMap.put('(', ')');
        charMap.put('[', ']');
        charMap.put('{', '}');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (charMap.containsKey(ch)) {
                stack.push(ch);
            } else {
                if (stack.empty() || ch != charMap.get(stack.pop())) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}

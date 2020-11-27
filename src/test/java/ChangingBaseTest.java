import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangingBaseTest {

    @Test
    void solution() {
        ChangingBase cb = new ChangingBase();
        assertEquals("1000", cb.solution("8", 10, 2));
        assertEquals("8", cb.solution("1000", 2, 10));
        assertEquals("1000", cb.solution("1000", 10, 10));
        assertEquals("27", cb.solution("123", 4, 10));
        assertEquals("1B", cb.solution("123", 4, 16));
    }
}
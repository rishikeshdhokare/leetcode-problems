package array

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class RomanToIntegerTest {
    @Test
    fun `convert Roman to Integer`() {
        Assertions.assertThat(RomanToInteger().solution("III")).isEqualTo(3)
        Assertions.assertThat(RomanToInteger().solution("IV")).isEqualTo(4)
        Assertions.assertThat(RomanToInteger().solution("IX")).isEqualTo(9)
        Assertions.assertThat(RomanToInteger().solution("LVIII")).isEqualTo(58)
        Assertions.assertThat(RomanToInteger().solution("MCMXCIV")).isEqualTo(1994)
        Assertions.assertThat(RomanToInteger().solution("MMMXLV")).isEqualTo(3045)
    }
}
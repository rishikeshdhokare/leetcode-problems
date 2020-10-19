package array


import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class ValidParenthesisTest {
    @Test
    fun `valid paranthesis`() {
        Assertions.assertThat(ValidParenthesis().isValid("{{}[]()}")).isTrue
        Assertions.assertThat(ValidParenthesis().isValid("{}[]()")).isTrue
        Assertions.assertThat(ValidParenthesis().isValid("{}")).isTrue
        Assertions.assertThat(ValidParenthesis().isValid("{")).isFalse
        Assertions.assertThat(ValidParenthesis().isValid("){")).isFalse
        Assertions.assertThat(ValidParenthesis().isValid(")(){}")).isFalse
    }
}
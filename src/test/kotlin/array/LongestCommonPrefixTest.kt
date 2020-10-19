package array

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class LongestCommonPrefixTest {
    @Test
    fun `find longest common prefix`() {
        Assertions.assertThat(LongestCommonPrefix().longestCommonPrefix(arrayOf("flower", "flow", "flight"))).isEqualTo("fl")
        Assertions.assertThat(LongestCommonPrefix().longestCommonPrefix(arrayOf("dog","racecar","car"))).isEqualTo("")
        Assertions.assertThat(LongestCommonPrefix().longestCommonPrefix(arrayOf())).isEqualTo("")
        Assertions.assertThat(LongestCommonPrefix().longestCommonPrefix(arrayOf("flower", "", "flight"))).isEqualTo("")
    }
}
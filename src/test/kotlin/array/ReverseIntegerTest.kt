package array

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class ReverseIntegerTest {
    @Test
    fun `reverse Integer`() {
        Assertions.assertThat(ReverseInteger().reverse(123)).isEqualTo(321)
        Assertions.assertThat(ReverseInteger().reverse(12)).isEqualTo(21)
        Assertions.assertThat(ReverseInteger().reverse(120)).isEqualTo(21)
        Assertions.assertThat(ReverseInteger().reverse(1)).isEqualTo(1)

        Assertions.assertThat(ReverseInteger().reverse(-123)).isEqualTo(-321)
        Assertions.assertThat(ReverseInteger().reverse(-12)).isEqualTo(-21)
        Assertions.assertThat(ReverseInteger().reverse(-120)).isEqualTo(-21)
        Assertions.assertThat(ReverseInteger().reverse(-1)).isEqualTo(-1)

        Assertions.assertThat(ReverseInteger().reverse(1534236469)).isEqualTo(0)
        Assertions.assertThat(ReverseInteger().reverse(-2147483648)).isEqualTo(0)

    }
}
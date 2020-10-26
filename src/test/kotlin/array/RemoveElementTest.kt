package array

import array.RemoveElement
import org.junit.jupiter.api.Test

class RemoveElementTest {
    @Test
    fun `should remove duplicates from Sorted Array`() {
        val o = RemoveElement()
        assert(o.removeElement(intArrayOf(1, 1, 1, 2), 1) == 1)
        assert(o.removeElement(intArrayOf(1, 2, 3, 3), 3) == 2)
        assert(o.removeElement(intArrayOf(1, 2, 2, 3), 3) == 3)
        assert(o.removeElement(intArrayOf(1, 1, 1, 1), 1) == 0)
        assert(o.removeElement(intArrayOf(1), 2) == 1)
        assert(o.removeElement(intArrayOf(1, 2, 3), 2) == 2)
        assert(o.removeElement(intArrayOf(), 0) == 0)
    }

}
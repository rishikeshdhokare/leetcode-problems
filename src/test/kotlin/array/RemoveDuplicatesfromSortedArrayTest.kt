package array

import array.RemoveDuplicatesfromSortedArray
import org.junit.jupiter.api.Test

class RemoveDuplicatesfromSortedArrayTest {
    @Test
    fun `should remove duplicates from Sorted Array`() {
        val o = RemoveDuplicatesfromSortedArray()
        assert(o.removeDuplicates(intArrayOf(1, 1, 1, 2)) == 2)
        assert(o.removeDuplicates(intArrayOf(1, 2, 3, 3)) == 3)
        assert(o.removeDuplicates(intArrayOf(1, 2, 2, 3)) == 3)
        assert(o.removeDuplicates(intArrayOf(1, 1, 1, 1)) == 1)
        assert(o.removeDuplicates(intArrayOf(1)) == 1)
        assert(o.removeDuplicates(intArrayOf(1, 2, 3)) == 3)
        assert(o.removeDuplicates(intArrayOf()) == 0)
    }
}
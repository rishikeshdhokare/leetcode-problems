package array

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class MergeTwoSortedList {
    /**
     * Example:
     * var li = ListNode(5)
     * var v = li.`val`
     * Definition for singly-linked list.
     * class ListNode(var `val`: Int) {
     *     var next: ListNode? = null
     * }
     */
    /*
     l1 1 2 3
     l2 4 5
     l3 1 2 3 4 5 0
     */
    /*
    Things we forgot to ask:
    Special Constraints?
    what if l1 and l2 are both null, then what should we return?
     */
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null && l2 == null) return null
        val l3First = ListNode(0)
        var l1Curr = l1
        var l2Curr = l2
        var l3Curr: ListNode? = l3First
        var l3Prev: ListNode? = null
        while (l1Curr != null && l2Curr != null) {
            if (l1Curr.`val` < l2Curr.`val`) {
                l3Curr?.`val` = l1Curr.`val`
                l1Curr = l1Curr.next
            } else {
                l3Curr?.`val` = l2Curr.`val`
                l2Curr = l2Curr.next
            }
            l3Curr?.next = ListNode(0)
            l3Prev = l3Curr
            l3Curr = l3Curr?.next!!
        }
        while (l1Curr != null) {
            l3Curr?.`val` = l1Curr.`val`
            l1Curr = l1Curr.next
            l3Curr?.next = ListNode(0)
            l3Prev = l3Curr
            l3Curr = l3Curr?.next!!
        }
        while (l2Curr != null) {
            l3Curr?.`val` = l2Curr.`val`
            l2Curr = l2Curr.next
            l3Curr?.next = ListNode(0)
            l3Prev = l3Curr
            l3Curr = l3Curr?.next!!
        }
        l3Prev?.next = null
        return l3First
    }

    fun mergeTwoListOptimal(l1: ListNode?, l2: ListNode?): ListNode? {
        if(l1 == null) return l2
        if(l2 == null) return l1
        var head = ListNode(-1)
        var first = l1
        var second = l2
        var tail = head
        while (first != null && second != null) {
            if (first.`val` < second.`val`) {
                tail.next = first
                first = first.next
            } else {
                tail.next = second
                second = second.next
            }
            tail = tail.next!!
        }
        if(first != null){
            tail.next = first
        }
        if(second != null){
            tail.next = second
        }
        return head.next
    }
}
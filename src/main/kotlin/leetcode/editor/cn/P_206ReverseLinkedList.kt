import leetcode.editor.cn.ListNode
import leetcode.editor.cn.buildListNode

//给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
//
// 
// 
// 
// 
// 
//
// 示例 1： 
// 
// 
//输入：head = [1,2,3,4,5]
//输出：[5,4,3,2,1]
// 
//
// 示例 2： 
// 
// 
//输入：head = [1,2]
//输出：[2,1]
// 
//
// 示例 3： 
//
// 
//输入：head = []
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点的数目范围是 [0, 5000] 
// -5000 <= Node.val <= 5000 
// 
//
// 
//
// 进阶：链表可以选用迭代或递归方式完成反转。你能否用两种方法解决这道题？ 
//
// Related Topics 递归 链表 👍 3470 👎 0


class P_206ReverseLinkedList {
    
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        if (head == null) return null

        var p = head
        var pn = head.next

        while (pn != null) {
            val tmp = pn.next
            pn.next = p
            if (p == head) p.next = null
            p = pn
            pn = tmp
        }

        return p
    }

    fun digui(head: ListNode?) :ListNode? {
        if (head == null) return null
        if (head.next == null) {
            return head
        }
        val newHead = digui(head.next)
        head.next?.next = head
        head.next = null
        return newHead
    }
}
//leetcode submit region end(Prohibit modification and deletion)


}

fun main() {
    val a = P_206ReverseLinkedList.Solution().digui("[1,2,3,4,5]".buildListNode())
    println(a)
}
import leetcode.editor.cn.*


//给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。 
//
// 
//
// 示例 1： 
// 
// 
//输入：head = [1,2,3,4]
//输出：[2,1,4,3]
// 
//
// 示例 2： 
//
// 
//输入：head = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [1]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点的数目在范围 [0, 100] 内 
// 0 <= Node.val <= 100 
// 
//
// Related Topics 递归 链表 👍 2131 👎 0


class P_24SwapNodesInPairs {

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
    fun swapPairs(head: ListNode?): ListNode? {
        var pre: ListNode? = null
        var p = head

        val result = if (head?.next == null) head else head.next
        while (p != null && p.next != null) {
            val next = p.next

            val nn = next!!.next
            next.next = p
            pre?.next = next
            p.next = nn

            pre = p
            p = nn

        }

        return result
    }
}
//leetcode submit region end(Prohibit modification and deletion)


}

fun main() {
    P_24SwapNodesInPairs.Solution().swapPairs("[1,2,3,4,5]".buildListNode())
}
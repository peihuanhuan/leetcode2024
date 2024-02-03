import leetcode.editor.cn.*


//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 
//
// 示例 1： 
// 
// 
//输入：l1 = [1,2,4], l2 = [1,3,4]
//输出：[1,1,2,3,4,4]
// 
//
// 示例 2： 
//
// 
//输入：l1 = [], l2 = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [], l2 = [0]
//输出：[0]
// 
//
// 
//
// 提示： 
//
// 
// 两个链表的节点数目范围是 [0, 50] 
// -100 <= Node.val <= 100 
// l1 和 l2 均按 非递减顺序 排列 
// 
//
// Related Topics 递归 链表 👍 3411 👎 0


class P_21MergeTwoSortedLists {

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
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val head = ListNode(1)
        var p = head
        var p1 = list1
        var p2 = list2

        while (p1 != null && p2 != null) {
            if (p1.`val` < p2.`val`) {
                p.next = ListNode(p1.`val`)
                p1 = p1.next

            } else {
                p.next = ListNode(p2.`val`)
                p2 = p2.next

            }
            p = p.next!!
        }

        if (p1 != null) {
            p.next = p1
        }
        if (p2 != null) {
            p.next = p2
        }
        return head.next


    }
}
//leetcode submit region end(Prohibit modification and deletion)


}

fun main() {
    P_21MergeTwoSortedLists.Solution().mergeTwoLists(
        "[1,2,4]".buildListNode(),
        "[1,3,4]".buildListNode()
    )
}
import leetcode.editor.cn.*


//给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。 
//
// 请你将两个数相加，并以相同形式返回一个表示和的链表。 
//
// 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 
//
// 示例 1： 
// 
// 
//输入：l1 = [2,4,3], l2 = [5,6,4]
//输出：[7,0,8]
//解释：342 + 465 = 807.
// 
//
// 示例 2： 
//
// 
//输入：l1 = [0], l2 = [0]
//输出：[0]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//输出：[8,9,9,9,0,0,0,1]
// 
//
// 
//
// 提示： 
//
// 
// 每个链表中的节点数在范围 [1, 100] 内 
// 0 <= Node.val <= 9 
// 题目数据保证列表表示的数字不含前导零 
// 
//
// Related Topics 递归 链表 数学 👍 10319 👎 0


class P_2AddTwoNumbers {

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
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val head = ListNode(0)
        var p1 = l1
        var p2 = l2
        var sum = 0
        var p = head
        while (p1 != null && p2 != null) {
            val s = (p1.`val` + p2.`val` + sum ) % 10
            sum = (p1.`val` + p2.`val` + sum ) / 10
            p.next = ListNode(s)
            p = p.next!!
            p1 = p1.next
            p2 = p2.next
        }
        while (p1 != null) {
            val s = (p1.`val` + sum ) % 10
            sum = (p1.`val` + sum ) / 10
            p.next = ListNode(s)
            p = p.next!!
            p1 = p1.next
        }
        while (p2 != null) {
            val s = (p2.`val` + sum ) % 10
            sum = (p2.`val` + sum ) / 10
            p.next = ListNode(s)
            p = p.next!!
            p2 = p2.next
        }

        if (sum == 1) {
            p.next = ListNode(1)
        }

        return head.next

    }
}
//leetcode submit region end(Prohibit modification and deletion)


}

fun main() {
    Solution()
}
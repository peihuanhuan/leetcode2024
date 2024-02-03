import leetcode.editor.cn.*


//给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。 
//
// 
//
// 示例 1： 
// 
// 
//输入：head = [1,2,2,1]
//输出：true
// 
//
// 示例 2： 
// 
// 
//输入：head = [1,2]
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点数目在范围[1, 10⁵] 内 
// 0 <= Node.val <= 9 
// 
//
// 
//
// 进阶：你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 
//
// Related Topics 栈 递归 链表 双指针 👍 1847 👎 0


class P_234PalindromeLinkedList {

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
    var frontNode: ListNode? = null

    fun check(end: ListNode?): Boolean {
        if (end == null) {
            return true
        }

        val ans = check(end.next) && frontNode?.`val` == end.`val`

        frontNode = frontNode?.next

        return ans
    }

    fun isPalindrome(head: ListNode?): Boolean {
        frontNode = head
        return check(head?.next)
    }
}
//leetcode submit region end(Prohibit modification and deletion)


}

fun main() {
    Solution()
}
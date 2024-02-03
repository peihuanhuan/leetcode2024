import leetcode.editor.cn.*


//给你一棵二叉树的根节点，返回该树的 直径 。 
//
// 二叉树的 直径 是指树中任意两个节点之间最长路径的 长度 。这条路径可能经过也可能不经过根节点 root 。 
//
// 两节点之间路径的 长度 由它们之间边数表示。 
//
// 
//
// 示例 1： 
// 
// 
//输入：root = [1,2,3,4,5]
//输出：3
//解释：3 ，取路径 [4,2,1,3] 或 [5,2,1,3] 的长度。
// 
//
// 示例 2： 
//
// 
//输入：root = [1,2]
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目在范围 [1, 10⁴] 内 
// -100 <= Node.val <= 100 
// 
//
// Related Topics 树 深度优先搜索 二叉树 👍 1473 👎 0


class P_543DiameterOfBinaryTree {

//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        val x = core(root)
        return x[1] - 1// 长度为 节点数 - 1
    }

    /**
     * 第一个返回值，是 root 节点左右孩子中最长的一个 的长度
     * 第二个返回值是， root 节点的 最大孩子数
     */
    fun core(root: TreeNode?): List<Int> {
        if (root == null) {
            return listOf(0, 0)
        }
        val left = core(root.left)
        val right = core(root.right)
        val single =  Math.max(left[0], right[0]) +1
        val rooo = Math.max(left[1], Math.max(right[1], left[0] +right[0] + 1))
        return listOf(single, rooo)
    }
}
//leetcode submit region end(Prohibit modification and deletion)


}

fun main() {
    P_543DiameterOfBinaryTree.Solution().diameterOfBinaryTree("[1,2,3,4,5]".createTree())
}
import com.sun.source.tree.Tree
import leetcode.editor.cn.*
import java.util.Queue


//给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。 
//
// 
//
// 示例 1： 
// 
// 
//输入：root = [3,9,20,null,null,15,7]
//输出：[[3],[9,20],[15,7]]
// 
//
// 示例 2： 
//
// 
//输入：root = [1]
//输出：[[1]]
// 
//
// 示例 3： 
//
// 
//输入：root = []
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目在范围 [0, 2000] 内 
// -1000 <= Node.val <= 1000 
// 
//
// Related Topics 树 广度优先搜索 二叉树 👍 1872 👎 0


class P_102BinaryTreeLevelOrderTraversal {

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
    fun levelOrder(root: TreeNode?): List<List<Int>> {

        if (root == null) return emptyList()

        val ans = mutableListOf<MutableList<Int>>()

        val queue = ArrayDeque<TreeNode>()

        queue.add(root)

        while (queue.isNotEmpty()) {
            var size = queue.size
            val a = mutableListOf<Int>()
            while (size-- > 0 ) {
                val node = queue.removeFirst()
                a.add(node.`val`)
                if (node.left != null) queue.add(node.left!!)
                if (node.right != null) queue.add(node.right!!)
            }
            ans.add(a)
        }
        return ans
    }
}
//leetcode submit region end(Prohibit modification and deletion)


}

fun main() {
    Solution()
}
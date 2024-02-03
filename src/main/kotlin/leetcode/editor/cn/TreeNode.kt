package leetcode.editor.cn

import java.util.*


data class TreeNode(
var `val`: Int
)
{
       var left: TreeNode? = null
       var right: TreeNode? = null



    }


fun String.createTree(): TreeNode? {
    // [1,2,3,4,null,null,5,6,null,8]
    var tree = this
    tree = tree.substring(1, tree.length - 1)
    val ss = tree.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
    val integers = arrayOfNulls<Int>(ss.size)
    for (i in ss.indices) {
        if (ss[i] == "null") {
            integers[i] = null
        } else integers[i] = Integer.valueOf(ss[i])
    }
    return createTree(integers)
}

private fun createTree(tree: Array<Int?>): TreeNode? {
    val q: Queue<TreeNode?> = LinkedList()
    // 1st one should not be #
    val root = constructOne(tree[0])
    q.add(root)
    var idx = 1
    while (!q.isEmpty()) {
        val tn = q.poll() ?: continue
        // construct tn's left&right node
        // when to stop
        if (idx == tree.size) {
            break
        }
        val left_ = constructOne(tree[idx])
        tn.left = left_
        q.add(left_)
        idx++
        if (idx == tree.size) {
            break
        }
        val right_ = constructOne(tree[idx])
        idx++
        tn.right = right_
        // add to queue
        q.add(right_)
    }
    return root
}

private fun constructOne(s: Int?): TreeNode? {
    return if (s == null) {
        null
    } else {
        TreeNode(s)
    }
}
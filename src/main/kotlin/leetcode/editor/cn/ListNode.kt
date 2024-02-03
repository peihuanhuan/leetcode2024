package leetcode.editor.cn

data class ListNode(var `val` : Int, var next: ListNode? = null) {
    override fun toString():String {
        return `val`.toString() + " -> " + next?.toString()
    }
}

fun String.buildListNode(): ListNode {
    val str = this.replace("[", "").replace("]", "")
    val splits = str.split(",")
    val virtualHead = ListNode(0, null)
    var p: ListNode? = virtualHead
    for (split in splits) {
        p!!.next = ListNode(split.toInt(), null)
        p = p.next
    }
    return virtualHead.next!!
}
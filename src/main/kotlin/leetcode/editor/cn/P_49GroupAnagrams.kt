import leetcode.editor.cn.*


//给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。 
//
// 字母异位词 是由重新排列源单词的所有字母得到的一个新单词。 
//
// 
//
// 示例 1: 
//
// 
//输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
//输出: [["bat"],["nat","tan"],["ate","eat","tea"]] 
//
// 示例 2: 
//
// 
//输入: strs = [""]
//输出: [[""]]
// 
//
// 示例 3: 
//
// 
//输入: strs = ["a"]
//输出: [["a"]] 
//
// 
//
// 提示： 
//
// 
// 1 <= strs.length <= 10⁴ 
// 0 <= strs[i].length <= 100 
// strs[i] 仅包含小写字母 
// 
//
// Related Topics 数组 哈希表 字符串 排序 👍 1802 👎 0


class P_49GroupAnagrams {

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val ans = mutableListOf<MutableList<String>>()

        strs.forEach {str ->
            val sorted = String(str.toList().sorted().toCharArray())
            var contains = false
            ans.forEach {
                if (it.first() == sorted) {
                    it.add(str)
                    contains = true
                }
            }
            if (!contains) {
                ans.add(mutableListOf(sorted, str))
            }
        }

        for (an in ans) {
            an.removeAt(0)
        }
        return ans
    }
}
//leetcode submit region end(Prohibit modification and deletion)


}

fun main() {
    P_49GroupAnagrams.Solution().groupAnagrams(listOf("ddddddddddg","dgggggggggg").toTypedArray())
}
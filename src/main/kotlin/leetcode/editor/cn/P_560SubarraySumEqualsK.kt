//给你一个整数数组 nums 和一个整数 k ，请你统计并返回 该数组中和为 k 的子数组的个数 。 
//
// 子数组是数组中元素的连续非空序列。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,1,1], k = 2
//输出：2
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,2,3], k = 3
//输出：2
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 2 * 10⁴ 
// -1000 <= nums[i] <= 1000 
// -10⁷ <= k <= 10⁷ 
// 
//
// Related Topics 数组 哈希表 前缀和 👍 2212 👎 0


class P_560SubarraySumEqualsK {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        val map = mutableMapOf<Int, Int>()

        var sum = 0
        var ans = 0

        map[0] = 1
        for (i in nums.indices) {
            sum += nums[i]
            ans += map[sum - k] ?: 0
            map[sum] = (map[sum] ?: 0) + 1
        }
        return ans
    }
}
//leetcode submit region end(Prohibit modification and deletion)



}
fun main() {
    val ans = P_560SubarraySumEqualsK.Solution().subarraySum(listOf(2, 1,1,1).toIntArray(), 2)
    println(ans)
}
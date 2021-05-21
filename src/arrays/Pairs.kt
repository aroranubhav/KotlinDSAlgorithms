/**
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 */

package arrays

import java.util.HashMap

class Pairs {
    fun pairs(nums: Array<Int>, target: Int): IntArray {
        val map: MutableMap<Int, Int> = HashMap()
        val result = IntArray(2)
        for (i in nums.indices) {
            val diff = target - nums[i]
            if (map.containsKey(diff)) {
                result[1] = i
                result[0] = map[diff]!!
                return result
            }
            map[nums[i]] = i
        }
        return result
    }
}

fun main() {
    val pairs = Pairs()
    val array = arrayOf(2, 7, 11, 15, -1)
    val target = 10
    val result = pairs.pairs(array, target)
    for (i in result) {
        println(i)
    }
}

/**
 Complexity : Time : O(n) | Space : O(n)
 */
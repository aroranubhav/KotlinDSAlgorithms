/**
Given an array of integers nums and an integer target,
return all the triplets the sum to the given target. The numbers in each triplet should be ordered in ascending order,
and triplets should be ordered too.
 */
package arrays

import java.util.*

class Triplets {
    fun triples(nums: Array<Int>, target: Int): List<List<Int>> {
        val result: MutableList<List<Int>> = ArrayList()
        Arrays.sort(nums)
        for (i in 0..nums.size - 3) {
            var start = i + 1
            var end = nums.size - 1
            while (start < end) {
                val currentSum = nums[start] + nums[end] + nums[i]
                when {
                    currentSum == target -> {
                        result.add(listOf(nums[i], nums[start], nums[end]))
                        start += 1
                        end -= 1
                    }
                    currentSum < target -> {
                        start += 1
                    }
                    currentSum > target -> {
                        end -= 1
                    }
                }
            }
        }
        return result
    }
}

fun main() {
    val triplets = Triplets()
    val input = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 15)
    val targetSum = 18
    val result = triplets.triples(input, targetSum)
    for (arr in result) {
        for (num in arr) {
            print("$num , ")
        }
        println()
    }
}

/**
 Complexity: Time: O(n^2)
 */
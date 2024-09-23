package problems;

import java.util.HashMap;
import java.util.Map;

public class Nr_00169_MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> numberAndCount = new HashMap<>();

        for (int num : nums){
            if (numberAndCount.containsKey(num)){
                int counter = numberAndCount.get(num);
                counter++;
                numberAndCount.put(num, counter);

            } else {
                numberAndCount.put (num, 1);
            }
        }

        int majoriyElementBaseline = nums.length / 2;

        for (Map.Entry<Integer, Integer> entry : numberAndCount.entrySet()) {
            if (entry.getValue() > majoriyElementBaseline) {
                return entry.getKey(); // Return the key (the majority element)
            }
        }

        throw new IllegalArgumentException("No majority element found");
    }
}

// Description

// 169. Majority Element

//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times.
// You may assume that the majority element always exists in the array.
//
//Example 1:
//
//Input: nums = [3,2,3]
//Output: 3
//Example 2:
//
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2
//
//Constraints:
//
//n == nums.length
//1 <= n <= 5 * 104
//-109 <= nums[i] <= 109
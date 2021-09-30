package com.likou.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * @program: likou
 * @description: 两数之和等于目标值
 * @author: Mr.Wang
 * @create: 2021-09-24 10:58
 **/
public class Solution3 {

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        // int[] ints = solution3.twoSum2(new int[]{-3, 0, 3, 4}, 3);
        int[] ints = solution3.twoSum3(new int[]{-3, 0, 3, 4}, 3);
        System.out.println(Arrays.toString(ints));
    }

    private int[] twoSum3(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < target && nums[j] < target) {
                    if ((nums[i] + nums[j]) == target) {
                        list.add(i);
                        list.add(j);
                    }
                }
            }
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i).intValue();
        }
        return array;
    }

    public int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}

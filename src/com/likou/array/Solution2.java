package com.likou.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Solution2
 * @Description TODO
 * 给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
 * @Author wbq
 * @Date 2021/1/6 22:58
 * @Version 1.0
 */
public class Solution2 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        int item = thirdMax(arr);
        System.out.println(item);
    }

    public static int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        Integer[] array = set.toArray(new Integer[0]);
        Arrays.sort(array);
        int len = array.length;
        return len > 2 ? array[len - 3] : array[len - 1];
    }

}

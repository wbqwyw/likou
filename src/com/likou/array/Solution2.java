package com.likou.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Solution2
 * @Description TODO
 * ����һ���ǿ����飬���ش������е������������������ڣ��򷵻���������������Ҫ���㷨ʱ�临�Ӷȱ�����O(n)��
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

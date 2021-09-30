package com.likou.array;

import java.util.*;

/**
 * @program: likou
 * @description: 删除有序数组中的重复项
 * @author: Mr.Wang
 * @create: 2021-09-24 13:36
 **/
public class Solution4 {

    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        // int[] arr = new int[]{0, 1, 2, 3, 4};
        int len = removeDuplicates3(arr);
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int removeDuplicates(int[] nums) {
        int len = nums.length;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            j = i + 1;
            if (j < nums.length && nums[i] != nums[j]) {
                continue;
            } else {
                while (j < nums.length && nums[i] == nums[j]) {
                    if ((j + 1) < nums.length) {
                        ++j;
                    } else {
                        break;
                    }
                    len--;
                }
                for (int k = i + 1; k < j; k++) {
                    nums[k] = nums[j];
                }
            }
        }
        return len;
    }

    private static int removeDuplicates3(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                if (nums[i + 1] != nums[j]) {
                    nums[++i] = nums[j];
                } else {
                    i++;
                }
            }
        }
        return ++i;
    }

    private static int removeDuplicates2(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], nums[i]);
                list.add(nums[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        return list.size();
    }

}

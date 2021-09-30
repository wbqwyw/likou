package com.likou.array;

/**
 * @program: likou
 * @description: 移除元素
 * @author: Mr.Wang
 * @create: 2021-09-25 11:02
 **/
public class Solution5 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int var = 2;
        // int[] arr = new int[]{2, 2, 3};
        // int var = 2;
        // int len = removeElement(arr, var);
        int len = removeElement2(arr, var);
        System.out.println("长度:" + len);
        for (int i = 0; i < len; i++) {
            System.out.printf("," + arr[i]);
        }
    }

    private static int removeElement2(int[] nums, int val) {
        int index = 0 , n = nums.length;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] != val){
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    private static int removeElement(int[] nums, int val) {

        int len = nums.length;
        int temp = 0;
        for (int j = 0; j < len; j++) {
            if (nums[j] == val) {
                if (len < 2) {
                    len--;
                } else {
                    while (j < len - 1) {
                        if (nums[len - 1] == val) {
                            len--;
                        } else {
                            break;
                        }
                    }
                    if (j < len - 1) {
                        temp = nums[j];
                        nums[j] = nums[len - 1];
                        nums[len - 1] = temp;
                    } else {
                        len--;
                    }

                }
            }
        }
        return len < 1 ? 0 : len;
    }


}

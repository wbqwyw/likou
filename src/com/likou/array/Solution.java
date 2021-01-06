package com.likou.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Solution
 * @Description ��һ����Сд��ĸ���ɵ��ַ��� s �У�������һЩ��������ͬ�ַ������ɵķ��顣
 * ���磬���ַ��� s = "abbxxxxzyy"?�У��ͺ��� "a", "bb", "xxxx", "z" �� "yy" ������һЩ���顣
 * ������������� [start, end] ��ʾ������ start �� end �ֱ��ʾ�÷������ʼ����ֹλ�õ��±ꡣ�����е� "xxxx" �����������ʾΪ [3,6] ��
 * ���ǳ����а������ڻ�������������ַ��ķ���Ϊ �ϴ���� ��
 * �ҵ�ÿһ�� �ϴ���� �����䣬����ʼλ���±����˳������󣬷��ؽ����
 * <p>
 * ���룺s = "abcdddeeeeaabbbcd"
 * �����[[3,5],[6,9],[12,14]]
 * ���ͣ��ϴ����Ϊ "ddd", "eeee" �� "bbb"
 * @Author wbq
 * @Date 2021/1/5 22:19
 * @Version 1.0
 */
public class Solution {

    public static void main(String[] args) {

        List<List<Integer>> list = largeGroupPositions("abbxxxxzzy");
        System.out.println(list);
    }

    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> list = new ArrayList<>();
        int con = 1;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (i == n - 1 || s.charAt(i) != s.charAt(i + 1)) {
                if (con >= 3) {
                    list.add(Arrays.asList(i - con + 1, i));
                }
                con = 1;
            } else {
                con++;
            }
        }
        return list;
    }
}

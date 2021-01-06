package com.likou.array;

import java.util.List;

/**
 * @ClassName Solution1
 * @Description TODO
 * ����һ������������ equations ��һ��ʵ��ֵ���� values ��Ϊ��֪���������� equations[i] = [Ai, Bi] �� values[i] ��ͬ��ʾ��ʽ Ai / Bi = values[i] ��ÿ�� Ai �� Bi ��һ����ʾ�����������ַ�����
 * ����һЩ������ queries ��ʾ�����⣬���� queries[j] = [Cj, Dj] ��ʾ�� j �����⣬���������֪�����ҳ� Cj / Dj = ? �Ľ����Ϊ�𰸡�
 * ���� ��������Ĵ� ���������ĳ���޷�ȷ���Ĵ𰸣����� -1.0 �������𰸡�
 * <p>
 * ע�⣺����������Ч�ġ�����Լ�����������в�����ֳ���Ϊ 0 ��������Ҳ������κ�ì�ܵĽ����
 * ʾ�� 1��
 * <p>
 * ���룺equations = [["a","b"],["b","c"]], values = [2.0,3.0], queries = [["a","c"],["b","a"],["a","e"],["a","a"],["x","x"]]
 * �����[6.00000,0.50000,-1.00000,1.00000,-1.00000]
 * ���ͣ�
 * ������a / b = 2.0, b / c = 3.0
 * ���⣺a / c = ?, b / a = ?, a / e = ?, a / a = ?, x / x = ?
 * �����[6.0, 0.5, -1.0, 1.0, -1.0 ]
 * ʾ�� 2��
 * <p>
 * ���룺equations = [["a","b"],["b","c"],["bc","cd"]], values = [1.5,2.5,5.0], queries = [["a","c"],["c","b"],["bc","cd"],["cd","bc"]]
 * �����[3.75000,0.40000,5.00000,0.20000]
 * @Author wbq
 * @Date 2021/1/6 22:53
 * @Version 1.0
 */
public class Solution1 {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        double[] result = new double[queries.size()];

        return result;
    }
}

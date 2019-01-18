package com.hao.simple;

public class sortArrayByParity {
    /*给定一个非负整数数组 A，返回一个由 A 的所有偶数元素组成的数组，后面跟 A 的所有奇数元素。
    你可以返回满足此条件的任何数组作为答案。
    示例：
    输入：[3,1,2,4]
    输出：[2,4,3,1]
    输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
    提示：
            1 <= A.length <= 5000
            0 <= A[i] <= 5000*/


    public static void main(String[] args) {
        int[] A = {3, 1, 2, 4};
        print(A);
        int[] result = sortArrayByParity(A);
        print(result);
    }

    public static int[] sortArrayByParity(int[] A) {
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                int tem = A[i];
                A[i] = A[index];
                A[index++] = tem;
            }
        }
        return A;
    }

    public static int[] sortArrayByParity2(int[] A) {
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                int tem = A[i];
                A[i] = A[index];
                A[index++] = tem;
            }
        }
        return A;
    }


    public static void print(int[] result) {
        String out = "[";
        for (int i = 0; i < result.length; i++) {
            out += result[i] + ",";
        }
        out = out.substring(0, out.length() - 1);
        out += "]";
        System.out.println(out);
    }
}

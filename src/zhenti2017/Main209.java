package zhenti2017;

/*

一个数组有 N 个元素，求连续子数组的最大和。 例如：[-1,2,1]，和最大的连续子数组为[2,1]，其和为 3
输入描述:

输入为两行。 第一行一个整数n(1 <= n <= 100000)，表示一共有n个元素 第二行为n个数，即每个元素,每个整数都在32位int范围内。以空格分隔。

输出描述:

所有连续子数组中和最大的值。

示例1
输入

3 -1 2 1

输出

3


 */

// 因此， dp[n] = max(dp[n-1],0)+num[n];

import java.util.Scanner;

public class Main209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (sc.hasNext()){
            n = sc.nextInt();
            int[] num = new int[n];
            for (int i = 0; i < n ; i++) {
                num[i] = sc.nextInt();
            }
            int max = num[0];
            int sum = num[0];
            for (int i = 0; i < n ; i++) {
                if(sum > 0){
                    sum += num[i];
                }else {
                    sum = num[i];
                }
                max = max >sum?max:sum;

            }
            System.out.println(max);
        }
    }
}

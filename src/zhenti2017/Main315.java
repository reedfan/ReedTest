package zhenti2017;

/*created by fanqunsong
    Date : 2017/11/20
    Time : 21:24
    */

/*
题目描述
给你六种面额1、5、10、20、50、100元的纸币，假设每种币值的数量都足够多，编写程序求组成N员（N为0-10000的非负整数）的不同组合的个数。
输入描述:

输入为一个数字N，即需要拼凑的面额

输出描述:

输出也是一个数字，为组成N的组合个数。

示例1
输入

5

输出

2


 */

import java.util.Scanner;

/*
1.dp概念：简单来说就是将原来的问题分解成多个子问题，然后将子问题一个一个的解决，最终问题的规模变小了；
2.本题可以使用dp的思想来做，合成一个面值为n的组合数，可以看成合成n-1,n-5,n-10,n-20,n-50,n-100五个面值的组合数之和，然后将问题细分化，
最终可以求出结果，其中我们知道，面值为1的组合数为1
 */
public class Main315 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            System.out.println(count(N));
        }
    }
    private static long count(int N){
        int[] a = {1,5,10,20,50,100};
        long[] dp = new long[N+1];
        dp[0] = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j <= N ; j++) {
                if(j>=a[i]){
                    dp[j] = dp[j]+dp[j-a[i]];
                }
            }
        }
        return dp[N];
    }
}

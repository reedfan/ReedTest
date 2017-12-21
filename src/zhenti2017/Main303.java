package zhenti2017;

/*created by fanqunsong
    Date : 2017/11/16
    Time : 20:35
    */

/*
题目描述
给定一个正整数，编写程序计算有多少对质数的和等于输入的这个正整数，并输出结果。输入值小于1000。
如，输入为10, 程序应该输出结果为2。（共有两对质数的和为10,分别为(5,5),(3,7)）
输入描述:

输入包括一个整数n,(3 ≤ n < 1000)

输出描述:

输出对数

示例1
输入

10

输出

2


 */

import java.util.Scanner;
import static java.lang.Math.sqrt;
public class Main303 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int res = 0;
            int n = scanner.nextInt();
            for (int i = 2; i <  n/2; i++) {
                if(isSS(i)&isSS(n-i)){
                    res++;
                }
            }
            System.out.println(res);
        }
    }
    private static  boolean isSS(int num){
        boolean isSS = true;
        for (int i = 2; i <= sqrt(num); i++) {
            if(num%i == 0){
                isSS = false;
                return isSS;
            }
        }
        return isSS;
    }
}

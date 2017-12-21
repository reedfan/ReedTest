package zhenti2017;

/*created by fanqunsong
    Date : 2017/11/29
    Time : 14:02
    */
/*

Fibonacci数列是这样定义的：
F[0] = 0
F[1] = 1
for each i ≥ 2: F[i] = F[i-1] + F[i-2]
因此，Fibonacci数列就形如：0, 1, 1, 2, 3, 5, 8, 13, ...，在Fibonacci数列中的数我们称为Fibonacci数。给你一个N，你想让其变为一个Fibonacci数，每一步你可以把当前数字X变为X-1或者X+1，现在给你一个数N求最少需要多少步可以变为Fibonacci数。
输入描述:

输入为一个正整数N(1 ≤ N ≤ 1,000,000)

输出描述:

输出一个最小的步数变为Fibonacci数"

示例1
输入

15

输出

2


 */


import java.util.Scanner;

public class Main117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int N = sc.nextInt();
            System.out.println(Fib(N));
        }
    }
    private static int Fib(int N){
        int a = 0;
        int b = 1;
        int tmp = 0;
        while (b<=N){
             tmp = b+a;
             a = b;
             b = tmp;
        }
        return (b-N)<(N-a)?(b-N):(N-a);
    }
}

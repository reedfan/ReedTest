package zhenti2017;

/*
题目描述
给定一个十进制数M，以及需要转换的进制数N。将十进制数M转化为N进制数
输入描述:

输入为一行，M(32位整数)、N(2 ≤ N ≤ 16)，以空格隔开。

输出描述:

为每个测试实例输出转换后的数，每个输出占一行。如果N大于9，则对应的数字规则参考16进制（比如，10用A表示，等等）

示例1
输入

7 2

输出

111


 */

import java.util.Scanner;

/*created by fanqunsong
    Date : 2017/11/16
    Time : 19:47
    */
public class Main213 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int M = scanner.nextInt();
            int N = scanner.nextInt();
            String str = "";
            String res = "";
            while(M>0){
                int tmp = M%N;
                if(tmp==10){
                    str = String.valueOf("A");
                }
                if(tmp==11){
                    str = String.valueOf("B");
                }
                if(tmp==12){
                    str = String.valueOf("C");
                }if(tmp==13){
                    str = String.valueOf("D");
                }if(tmp==14){
                    str = String.valueOf("E");
                }if(tmp==15){
                    str = String.valueOf("F");
                }
                if(tmp<=9){
                    str = String.valueOf(tmp);
                }
              res = str + res;
                M = M/N;
            }
            System.out.println(res);
        }
    }
}

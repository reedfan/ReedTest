package zhenti2017;



/*created by fanqunsong
    Date : 2017/11/16
    Time : 19:18
    */
/*
题目描述
读入一个字符串str，输出字符串str中的连续最长的数字串
输入描述:

个测试输入包含1个测试用例，一个字符串str，长度不超过255。

输出描述:

在一行内输出str中里连续最长的数字串。

示例1
输入

abcd12345ed125ss123456789

输出

123456789


 */
import java.util.Scanner;
public class Main215 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            int len = str.length();
            int[] num = new int[len];
            if(str.charAt(0)<='9' && str.charAt(0)>='0'){
                num[0] = 1;
            }
            else {
                num[0] = 1;
            }
            int maxlength = num[0];
            int pos = 0;
            for (int i = 1; i < len; i++) {
                if(str.charAt(i)<='9' && str.charAt(i)>='0'){
                    num[i] = num [i-1] + 1;
                }
                else {
                    num[i] = 0;
                }
                if( maxlength <num[i]){
                    maxlength = num[i];
                    pos = i;
                }
            }
            String res = str.substring(pos-maxlength+1,pos+1);
            System.out.println(res);
        }
    }
}

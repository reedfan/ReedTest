package zhenti2017;

import java.util.Scanner;

/*created by fanqunsong
    Date : 2017/11/16
    Time : 21:16
    */
/*
题目描述
现在有一个数组，其值为从1到10000的连续增长的数字。出于某次偶然操作，导致这个数组中丢失了某三个元素，同时顺序被打乱，现在需要你用最快的方法找出丢失的这三个元素，并且将这三个元素根据从小到大重新拼接为一个新数字，
计算其除以7的余数。 例：丢失的元素为336，10，8435，得到的新数字为103368435，除以七的余数为2。
输入描述:

输入数据为一行，包含9997个数字，空格隔开。

输出描述:

输出为一行，包含一个数字。

示例1
输入

同题设例子输入

输出

2


 */
public class Main313 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int[] tmp= new int[9997];
            for (int i = 0; i < 9997; i++) {
                tmp[i] = scanner.nextInt();
            }
            int[] queShi = new int[3];
            int j = 0;
            if(tmp[0]==2){
                queShi[0] = 1;
                j++;
            }
            if (tmp[0] == 3)
            {
                queShi[0] = 1;
                queShi[1] = 2;
                j =2;
            }
            if (tmp[0] ==4)
            {
                queShi[0] = 1;
                queShi[1] = 2;
                queShi[2] = 3;
                j =3;
            }
            for (int i = 1; i < 9997; i++) {
                if(tmp[i]-tmp[i-1]!=1){
                    if(tmp[i]-tmp[i-1] == 2){
                        queShi[j] = tmp[i] -1;
                        j++;
                    }
                    if(tmp[i]-tmp[i-1] == 3){
                        queShi[j] = tmp[i] -2;
                        j++;
                        queShi[j] = tmp[i] -1;
                        j++;
                    }
                    if(tmp[i]-tmp[i-1] == 4){
                        queShi[j] = tmp[i] -3;
                        j++;
                        queShi[j] = tmp[i] -2;
                        j++;
                        queShi[j] = tmp[i] -1;
                        j++;
                    }
                }
            }
            if(tmp[9996]==9997){
                queShi[0] = 9998;
                queShi[1] = 9999;
                queShi[2] = 1000;
            }
            if(tmp[9996]==9998){
                queShi[1] = 9999;
                queShi[2] = 1000;
            }
            if(tmp[9996]==9999){
                queShi[2] = 1000;
            }
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < 3; i++) {
                 sb.append(queShi[i]);
            }
            long num = Long.parseLong(sb.toString());
            System.out.println(num%7);
        }
    }
}

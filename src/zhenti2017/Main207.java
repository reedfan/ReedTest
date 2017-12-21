package zhenti2017;

import java.util.Scanner;

import static java.lang.Math.sqrt;

/*created by fanqunsong
    Date : 2017/11/13
    Time : 21:39
    题目描述
小易去附近的商店买苹果，奸诈的商贩使用了捆绑交易，只提供6个每袋和8个每袋的包装(包装不可拆分)。 可是小易现在只想购买恰好n个苹果，小易想购买尽量少的袋数方便携带。如果不能购买恰好n个苹果，小易将不会购买。
输入描述:

输入一个整数n，表示小易想购买n(1 ≤ n ≤ 100)个苹果

输出描述:

输出一个整数表示最少需要购买的袋数，如果不能买恰好n个苹果则输出-1

示例1
输入

20

输出

3


    */
public class Main207 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int res1 = buyApple(n,0);
            System.out.println(res1);
        }
    }
    private static int buyApple(int n,int res){
        if(n%2==1){
            return -1;
        }else {
            if(n%8==0){
                res += n/8;
            }
            else {
                if(n%8==6){
                    res += n/8+1;
                }else{
                    if(n%8 ==4&&n/8>=2){
                        res++;
                        n-=6;
                        buyApple(n,res);
                    }
                    else {
                        if(n%8==2&&n/8>=3){
                            res = res+2;
                            n-=12;
                            buyApple(n,res);
                        }
                        else {
                            return -1;
                        }
                    }
                }
            }
        }
        return res;

    }
}

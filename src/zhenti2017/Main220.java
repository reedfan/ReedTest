package zhenti2017;

/*created by fanqunsong
    Date : 2017/12/7
    Time : 17:41
    */



/*

输入两个整数 n 和 m，从数列1，2，3.......n 中随意取几个数,使其和等于 m ,要求将其中所有的可能组合列出来
输入描述:

每个测试输入包含2个整数,n和m

输出描述:

按每个组合的字典序排列输出,每行输出一种组合

示例1
输入

5 5

输出

1 4
2 3
5
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main220 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            List<Integer> list = new ArrayList<Integer>();
            help(n,m,list,1);
        }
    }
    public static void help(int n,int m,List<Integer> list,int begin){
        if(m == 0){
            for (int i = 0; i < list.size()-1; i++) {
                System.out.print(list.get(i));
                System.out.print(" ");
            }
            System.out.println(list.get(list.size()-1));
        }
        for (int i = begin; i < n&& i<m ; i++) {
            list.add(i);
            help(n,m-i,list,i+1);
            list.clear();
        }
    }
}

package zhenti2017;

/*created by fanqunsong
    Date : 2017/11/21
    Time : 21:29
    */

import java.util.ArrayList;
import java.util.Scanner;

public class Main203 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            int n = scanner.nextInt();
            int  m = scanner.nextInt();
            int r = count(n,m);
            if(r == Integer.MAX_VALUE){
                System.out.println(-1);
            }else {
                System.out.println(r);
            }
        }
    }
    private static int count(int n,int m){
        int[] mark = new int[m+1];
        for (int i = n+1; i <= m ; i++) {
            mark[i] = Integer.MAX_VALUE;
        }
        for (int i = n; i <m-1; i++) {
            if(mark[i] ==Integer.MAX_VALUE){
                continue;
            }
            ArrayList<Integer> list = yueshu(i);
            for (int j = 0; j < list.size(); j++) {
                int tmp = i + list.get(j);
                int count = mark[i] + 1;
                if(tmp <= m && mark[tmp]>count){
                    mark[tmp] = count;
                }
            }
        }
        return mark[m];
    }
    private static ArrayList<Integer> yueshu(int n){
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if(n%i ==0){
                res.add(i);
                if(i*i != n){
                    res.add(n/i);
                }
            }
        }
        return res;
    }
}

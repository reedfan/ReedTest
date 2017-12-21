package zhenti2017;

import java.util.Scanner;

/*created by fanqunsong
    Date : 2017/11/20
    Time : 21:48
    */
public class Main312 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            int count = 0;
            for (int i = 1; i <= N ; i++) {
                if(erjinzhi(i) == shijinzhi(i)){
                    count ++;
                }
            }
            System.out.println(count);
        }
    }
    private static int erjinzhi(int N){
        int res = 0;
        while(N>0){
            res += N%2;
            N = N/2;
        }
        return res;
    }

    private static int shijinzhi(int N){
        int sum = 0;
        while(N>0){
            sum += N%10;
            N = N/10;
        }
        return sum;
    }
}

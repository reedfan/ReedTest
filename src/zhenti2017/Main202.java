package zhenti2017;

import java.util.Scanner;

import static java.lang.Math.sqrt;

/*created by fanqunsong
    Date : 2017/11/13
    Time : 20:37
    */
public class Main202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int times = 0;
            for (int i = 0; i < sqrt(n); i++) {
                double j = sqrt(n - i*i);
                if((int) j >= j){
                    times++;
                }
            }
            System.out.println(times*4);
        }
    }
}

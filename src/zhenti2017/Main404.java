package zhenti2017;

/*created by fanqunsong
    Date : 2017/11/21
    Time : 21:11
    */

import java.util.Scanner;

public class Main404 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double sum = 0;
            double n = scanner.nextInt();
            double m = scanner.nextInt();
            for (int i = 0; i < m; i++) {
                sum += n;
                n = Math.pow(n, 0.5);
            }
                System.out.printf("%.2f", sum);

        }

    }
}

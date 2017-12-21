package zhenti2017;

/*created by fanqunsong
    Date : 2017/11/29
    Time : 17:00
    */


import java.util.Arrays;
import java.util.Scanner;

public class Main118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(min(arr));

        }
    }
    private static int min(int[] arr){
        int res = 1;

        return res;

    }



}

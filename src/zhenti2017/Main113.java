package zhenti2017;

/*created by fanqunsong
    Date : 2017/11/23
    Time : 20:20
    */

import java.util.Scanner;

public class Main113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            int count = 0;
            for (int i = 0; i <= str1.length(); i++) {
                String str = str1.substring(0,i)+str2+str1.substring(i,str1.length());
                if(isHuiwen(str)){
                    count ++;
                }
            }
            System.out.println(count);
        }
    }
    private static boolean isHuiwen(String str){
        boolean res = true;
        for (int i = 0; i <= str.length()/2 ; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                res = false;
                break;
            }
        }
        return res;
    }
}

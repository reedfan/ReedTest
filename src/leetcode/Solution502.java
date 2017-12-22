package leetcode;

/*created by fanqunsong
    Date : 2017/12/22
    Time : 15:19
    */
/*
Given a number represented as an array of digits, plus one to the number.
 */

import java.util.Arrays;

public class Solution502 {
    public static void main(String[] args) {
        int[] num = new int[]{9};
        System.out.println(plusOne(num));
    }
//    public static  int[] plusOne(int[] digits) {
//        int sum = digits.length;
//        if(digits[sum-1] < 9){
//            digits[sum-1] ++;
//            return digits;
//        }else {
//            digits[sum-1]++;
//            digits[sum-2] ++;
//            for (int i = sum - 2; i > 0 ; i--) {
//                if(digits[i]==10){
//                    digits[i]=0;
//                    digits[i-1]++;
//                }else {
//                    return digits;
//                }
//            }
//            if(digits[0] == 10){
//                int[] res = new int[sum+1];
//                res[0] = 1;
//                res[1] = 0;
//                for (int i = 2; i <= sum ; i++) {
//                    res[i] = digits[i+1];
//                }
//                return res;
//            }
//        }
//        return null;
//    }

    public static int[] plusOne(int[] digits) {
        int sum = digits.length;
        digits[sum-1] ++;
        for (int i = sum-1; i >0 ; i--) {
            if(digits[i]>9){
                digits[i] = 0;
                digits[i-1]++;
            }
        }
        if(digits[0]<10){
            return digits;
        }
        int[] res = new int[sum+1];
        res[0] = 1;
        res[1] = 0;
        for (int i = 2; i <= sum ; i++) {
            res[i] = digits[i-1];
        }
        return res;
    }
}

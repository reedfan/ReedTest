package leetcode;

/*created by fanqunsong
    Date : 2017/12/22
    Time : 17:09
    */
public class Solution209 {
    public static void main(String[] args) {
        int[] num = new int[]{1,2};
        System.out.println(maxProfit(num));
    }
    public static int maxProfit(int[] prices) {
        if(prices.length == 0 ||prices.length == 1 || prices == null){
            return 0;
        }
        int[] profit = new int[prices.length-1];
        for (int i = 1; i < prices.length; i++) {
            profit[i-1] = prices[i] - prices[i-1];
        }
        int sum = 0;
        for (int i = 0; i < profit.length; i++) {
            if (profit[i]>0){
                sum += profit[i];
            }
        }
        return sum;

    }
}

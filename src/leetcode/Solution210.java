package leetcode;

/*created by fanqunsong
    Date : 2017/12/22
    Time : 16:32
    Tips：先买才能卖
    */
public class Solution210 {
    public static void main(String[] args) {
        int[] num = new int[]{1,2};
        System.out.println(maxProfit(num));
    }
    public static int maxProfit(int[] prices) {
        if(prices.length == 0 ||prices.length == 1 || prices == null){
            return 0;
        }
        int min = prices[0];
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]>min){
                res = res > prices[i] - min?res : prices[i] - min;
            }
            else {
                min = prices[i];
            }
        }
        return res;
    }
}

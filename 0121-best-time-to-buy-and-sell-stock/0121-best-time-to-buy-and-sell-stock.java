class Solution {
    public int maxProfit(int[] prices) {
        int right=0;
        int left=0;
        int maxprofit=0;
        while (right<prices.length){
            if(prices[left]<prices[right]){
                int profit=prices[right]-prices[left];
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                left=right;
            }
            right++;
        }
        return maxprofit;
    }
}
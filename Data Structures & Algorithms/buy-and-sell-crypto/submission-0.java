class Solution {
    public int maxProfit(int[] prices) {

        int maxPrice = 0;

        int maxSell = prices[prices.length-1];

        for(int i=prices.length-2;i>=0;i--){
            if(prices[i]>maxSell){
                maxSell = prices[i];
            }
            else{
                int val = maxSell - prices[i];
                maxPrice = (maxPrice<val)?val:maxPrice;
            }
        }

            return maxPrice;

        }
        
    }


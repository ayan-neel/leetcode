package leetcode.easy;

public class TradingAlgo {

	public static int processTrade(int[] sellPrices) {
		int j = 0;
		int profit = 0;
		int buyPrice = Integer.MIN_VALUE;
		int sellPrice = Integer.MIN_VALUE;
		for (int i = 0; i<sellPrices.length-1; i++) {
			if (sellPrices[i] < sellPrices[i + 1]&&buyPrice==Integer.MIN_VALUE) {
				buyPrice = sellPrices[i];
				continue;
			}
			if(buyPrice<sellPrices[i]&&buyPrice!=Integer.MIN_VALUE) {
				
			if (sellPrices[i] > sellPrices[i + 1]) {
				sellPrice = sellPrices[i];
				profit += sellPrice - buyPrice;
				buyPrice=Integer.MIN_VALUE;
				sellPrice=Integer.MIN_VALUE;
				continue;
			} else {

				if (sellPrices[i] < sellPrices[i + 1] && i != sellPrices.length - 1)
					continue;
				else {
					sellPrice = sellPrices[i + 1];
					System.out.println(sellPrice);
					profit += sellPrice - buyPrice;

				}
			}
		}
			else {
				
				continue;
				
			}
				
		
	}

		return profit;

	}
	 public int maxProfit(int[] prices) {
	        int maxprofit = 0;
	        for (int i = 1; i < prices.length; i++) {
	            if (prices[i] > prices[i - 1])
	                maxprofit += prices[i] - prices[i - 1];
	        } return maxprofit;
	    }

	public static void main(String[] args) {
		System.out.println(TradingAlgo.processTrade(new int[] { 1, 2, 3, 4, 5 }));

	}

}

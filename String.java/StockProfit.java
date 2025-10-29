public class StockProfit {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfitValue = 0;

        for (int price : prices) {
            if (price < minPrice)
                minPrice = price;  
            else if (price - minPrice > maxProfitValue)
                maxProfitValue = price - minPrice;  
        }

        return maxProfitValue;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + maxProfit(prices));
    }
}

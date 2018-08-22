package stockmarket;

public class DemoClass {
	public static void main(String[] args) {
		BuyStocksSubject subject = new BuyStocksSubject();

		new NewYorkStockExchange(subject);
		new MumbaiStockExchange(subject);
		new ShanghaiStockExchange(subject);

		int minPrice = subject.getMinimalPriceForStocks(12);
		System.out.println("Minimum Price Offered : " + minPrice);
		/*
		 * prints 
		 * Minimum price offered by New York Stock Exchange : 564 
		 * Minimum price offered by Mumbai Stock Exchange : 792 
		 * Minimum price offered by Shanghai Stock Exchange : 204 
		 * Minimum Price Offered : 204
		 */

	}
}

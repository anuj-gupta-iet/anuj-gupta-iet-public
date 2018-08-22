package stockmarket;

public class ShanghaiStockExchange extends ExchangeObserver {

	public ShanghaiStockExchange(BuyStocksSubject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public int notifyObserverAndGetMinPriceForStocks(int noofstocks) {
		int pricePerStock = random.nextInt(100);
		int minPriceOffered = pricePerStock * noofstocks;
		System.out.println("Minimum price offered by Shanghai Stock Exchange : " + minPriceOffered);
		return minPriceOffered;
	}
}

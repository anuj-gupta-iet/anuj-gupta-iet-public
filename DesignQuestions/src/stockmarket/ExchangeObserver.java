package stockmarket;

import java.util.Random;

public abstract class ExchangeObserver {
	protected BuyStocksSubject subject;

	protected Random random = new Random();

	public abstract int notifyObserverAndGetMinPriceForStocks(int noofstocks);
}

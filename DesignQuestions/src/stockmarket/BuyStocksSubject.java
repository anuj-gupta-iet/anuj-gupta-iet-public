package stockmarket;

import java.util.ArrayList;

public class BuyStocksSubject {
	private ArrayList<ExchangeObserver> exchangeObserversList = new ArrayList<>();
	private int noofstocks;

	public int getMinimalPriceForStocks(int noofstocks) {
		this.noofstocks = noofstocks;
		return notifyAllObserversAndGetMinPriceForStocks();
	}

	public void attach(ExchangeObserver observer) {
		exchangeObserversList.add(observer);
	}

	public void detach(ExchangeObserver observer) {
		exchangeObserversList.remove(observer);
	}

	private int notifyAllObserversAndGetMinPriceForStocks() {
		int minPrice = Integer.MAX_VALUE;
		for (ExchangeObserver observer : exchangeObserversList) {
			int minPriceOffered = observer.notifyObserverAndGetMinPriceForStocks(noofstocks);
			if (minPriceOffered < minPrice) {
				minPrice = minPriceOffered;
			}
		}
		return minPrice;
	}
}

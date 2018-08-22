package restaurent;

public interface Kitchen {

	void requestOrder(Order order);

	boolean isOrderReady(Order order);

	Order getOrder(Order order);

}

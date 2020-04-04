package k_interface;

public interface DeliveryStore {
	/*
	 *   인터 페이스를 만들고 
	 *   set orderList (String[])
	 *   get total price: Integer
	 *    
	 */
	public void setOrderList(String[] order);
	
	public Integer getTotalPrice();
	

}

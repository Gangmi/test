package k_interface;

public class order extends PizzaStore {

	public static void main(String[] args) {
		
		String[] orderList = {"Cheese","Pineapple", "Meatball"};
		PizzaStore ps = new PizzaStore();
		ps.setOrderList(orderList);
		
		ps.getTotalPrice();
		

	}

}

package k_interface;



public class PizzaStore extends Food implements DeliveryStore  {
	
	private String[] OrderList = new String [5];
	
	

	
	
	
	public PizzaStore() { // 피자스토어 생성자에서  메뉴의 이름과 가격을 초기화.
		
		super();
		
			
		}
		
		
	
	
	@Override
	public void setOrderList(String[] order) {
		this.OrderList = order;
		
	}

	@Override
	public Integer getTotalPrice() { // 인티저를 리턴하는 이유가 뭐지..? 
		for(int i=0; i<OrderList.length; i++) {
			super.Food();
			
			
		}
		 return null;
		
		
	}
	
	

}

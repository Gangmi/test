package k_interface;

import java.util.HashMap;

public class Food {
	
	public String name ;
	public Integer price;
	
	
	
	
	public void Food() {
		HashMap MenuList = new HashMap();
		MenuList.put("Pineapple", "150000");
		MenuList.put("Cheese", "18000");
		MenuList.put("Meatball", "18600");
		
		if (MenuList.containsKey(name)) {
			MenuList.get(name);
		}
		
		
		
		
		
		
	}

	
		
	}
	
	
	
			



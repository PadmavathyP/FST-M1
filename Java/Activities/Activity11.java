package Activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		
		Map<Integer,String> colours = new HashMap<>();
		colours.put(1,"Purple");
		colours.put(2, "Lavender");
		colours.put(3, "Pink");
		colours.put(4,"Peach");
		colours.put(5, "Green");
		
		System.out.println(colours.entrySet());
		
		colours.remove(5);
		
		if(colours.containsValue("Green")== true) {
			System.out.println("It has Green");
		}
		else {
			System.out.println("No Green");
		}
		
		System.out.println("Size is:" +colours.size());
		

	}

}

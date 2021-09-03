package Activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {

	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<>();
		hs.add("Lakshmi");
		hs.add("Velu");
		hs.add("Anuja");
		hs.add("Jothi");
		hs.add("Bala");
		hs.add("Venkat");
		
		System.out.println("Size is:" +hs.size());
		hs.remove("Anuja");
		hs.remove("Priya");
		
		System.out.println("Contains or not:" +hs.contains("Priya"));
		
		
		System.out.println("Updated Set:" +hs);
		


}

}
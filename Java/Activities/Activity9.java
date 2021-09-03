package Activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Lakshmi");
		myList.add("Bala");
		myList.add("Venkat");
		myList.add("Gayathri");
		myList.add("Velu");
		
		for(String i : myList) {
			System.out.println(i);
		}
		
		System.out.println("Third element is:" + myList.get(2));
		System.out.println("It Contains:" +myList.contains("Lakshmi"));
		System.out.println("Size is:" + myList.size());
		myList.remove(3);
		
		System.out.println("Size is:" + myList.size());
	}

}

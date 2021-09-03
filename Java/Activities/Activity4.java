package Activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		
		int nums[] = {5,1,9,4,3};
		
		System.out.println("Array before sorting:");
		for(int i:nums) {
			System.out.print(" " +i);
		}
		System.out.println(" ");
		System.out.println("Array after sorting:");
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));

	}
} 


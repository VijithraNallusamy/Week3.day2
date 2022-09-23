package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementsInAnArray {
	public static void main(String[] args) {
	
	
	int[] arr = { 1, 2, 3 , 4 , 7, 6, 8 };

	List<Integer> Arrayvalues = new ArrayList<Integer>();
	for (Integer eachValue : arr) {
		Arrayvalues.add(eachValue);

	}
	Collections.sort(Arrayvalues);
	System.out.println(Arrayvalues);

	for(int i=0;i<Arrayvalues.size();i++) {
		if (Arrayvalues.get(i) != (i + 1)) {
			System.out.println(i + 1);
		    break;
			
		}
	
	}
	
		
	}
	

}


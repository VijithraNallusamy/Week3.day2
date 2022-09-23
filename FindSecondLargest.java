package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};

		List<Integer>data1=new ArrayList<Integer>();
		for (Integer integer : data) {
			
			data1.add(integer);
		}
		Collections.sort(data1);
		System.out.println(data1);
		System.out.println(data1.get(data1.size()-2));
		
	}

}

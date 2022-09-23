package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindMostDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  input = {2,3,3,5,6,3,2,1,4,2,1,6,-1};
		
		
		Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer> ();
		
		for (int eachNumber : input) {
			
			if(map.containsKey(eachNumber))
			{
				map.put(eachNumber,map.get(eachNumber)+1);
				
			}
			else
			{
				map.put(eachNumber,1);
				
			}
		}
		
		// Print the Original MAP
		
		System.out.println("Original Map");
		System.out.println(map);
		

		// Printing the Number and its corresponding no of occurrence
		
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
        System.out.println();
		System.out.println("Number----->Occurance_Count");
		
		for (Entry<Integer, Integer> eachEntry : entrySet) {
			
			Integer number = eachEntry.getKey();
			Integer occurance = eachEntry.getValue(); 
			System.out.println(number+"----->"+occurance);	
		}
		
			
		
			
			int maxNumber = 0;
			int maxOccurrence =0;
			
				
		for (Entry<Integer, Integer> eachEntry1 : entrySet) {
			
			if(eachEntry1.getValue()>maxOccurrence)
			{
				
				maxOccurrence=eachEntry1.getValue();
				maxNumber = eachEntry1.getKey();
				
			}
			
		}
		
		
		System.out.println();
		System.out.println("Maximum occured number and its count in given sequence is ");	
		System.out.println(maxNumber+"------>"+maxOccurrence);	
		
	
	
		
		List<String> maxNum  = new ArrayList<String>(); 
		
	for (Entry<Integer, Integer> eachEntry1 : entrySet) {
		
		if(eachEntry1.getValue()>=maxOccurrence) 
		{
			
			maxOccurrence=eachEntry1.getValue();
			maxNumber = eachEntry1.getKey();
			String str = maxNumber + "----->" + maxOccurrence;
			maxNum.add(str);
			
		}
		
	}
	System.out.println("Maximum occured Number");
	System.out.println(maxNum);
	
	
	
	}

}

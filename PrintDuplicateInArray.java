package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
        List<Integer>ArrayList=new ArrayList<Integer>();
        
       
        for (Integer List1 : arr) {
        	ArrayList.add(List1);
			
		}
        
        Collections.sort(ArrayList);
        System.out.println(ArrayList);
        
        for(int i=1;i<ArrayList.size();i++) {
			
    		if(ArrayList.get(i)==ArrayList.get(i-1))   
    			System.out.println(ArrayList.get(i));
    		}
        
	}

}

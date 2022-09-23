package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
        String[] split = text.split(" ");
        
        Set<String>textSet=new LinkedHashSet<String>();
        
        for (String textString : split) {
			
        	textSet.add(textString); 	
		}
       
            System.out.println(textSet);

	}

}

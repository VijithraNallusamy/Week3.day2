package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class SortCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="Paypal India";
		char[] charArrayWord = word.toCharArray();
		
		Set<Character>ArrayWord=new LinkedHashSet<Character>();
		
		for (Character character : charArrayWord) {
			
			if(character!=' ') {
				ArrayWord.add(character);
			}
			
		}
		//List<Character>ListArrayWord=new ArrayList<Character>(ArrayWord);
		for (Character character : ArrayWord) {
		System.out.print(character);
		}
		
		
	}

}

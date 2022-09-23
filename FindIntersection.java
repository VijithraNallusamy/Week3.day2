package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection 
{

	public static void main(String[] args)
	{
		 int[] a={3,2,11,4,6,7};
		 int[] b= {1,2,8,4,9,7};
		 
		 
		 List<Integer>ArrayValue1=new ArrayList<Integer>();
		 
		 for (Integer value1 : a)
		 {
			 
			 ArrayValue1.add(value1);
			
		}
		 
		 List<Integer>ArrayValue2=new ArrayList<Integer>();
		 
		 for (Integer value2 : b)
		 {
			 ArrayValue2.add(value2);
		}
		 
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<b.length;j++)
			{
				if(ArrayValue1.get(i).equals(ArrayValue2.get(j)))
				{
					System.out.println(ArrayValue2.get(j));
				}
			}
		}
		 
	}

}

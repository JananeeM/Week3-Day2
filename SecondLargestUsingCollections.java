package Week3Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {3,2,11,4,6,7};
		List<Integer> ListArr1=new ArrayList<Integer>();
		for(int i=0;i<data.length-1;i++)
		{
			ListArr1.add(data[i]);
		}
		Collections.sort(ListArr1);
		
		System.out.println("The element in the list are :");
		for(int i=0;i<ListArr1.size();i++)
		{
			System.out.println(ListArr1.get(i));
		}
		int size=ListArr1.size();
		System.out.println();
		//System.out.println(ListArr1.get(size-1));
		System.out.println("The Second Largest number In The List Is : "+ListArr1.get(size-2));
		;
	}

}

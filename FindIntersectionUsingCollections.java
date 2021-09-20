package Week3Day2;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;


public class FindIntersectionUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {3,2,11,4,6,7};
		int[] arr2= {1,2,8,4,9,7};
		List<Integer> ListArr1=new ArrayList<Integer>();
		List<Integer> ListArr2=new ArrayList<Integer>();
		
		for(int i=0;i<arr1.length;i++)
		{
			ListArr1.add(arr1[i]);
			ListArr2.add(arr2[i]);
			
			
		}
		Collections.sort(ListArr1);
		Collections.sort(ListArr2);
		System.out.println("The First List");
		System.out.println(ListArr1);
		System.out.println("The Second List");
		System.out.println(ListArr2);
		System.out.println("The Common Elements in Both The List are");
		for(int i=0;i<ListArr1.size();i++)
		{
			for(int j=0;j<ListArr2.size();j++)
			{
				if(ListArr1.get(i).equals(ListArr2.get(j)))
				{
					System.out.println(ListArr1.get(i));
				}
			}
		
	}
	}

}

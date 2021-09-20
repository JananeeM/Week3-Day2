package Week3Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArrayCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,7,6,8};
		List<Integer> ListArr=new ArrayList<Integer>();
		
		for(int i=0;i<arr.length-1;i++)
		{
			ListArr.add(arr[i]);
		}
		Collections.sort(ListArr);
		System.out.println(ListArr);
		for(int i=1;i<arr.length-1;i++)
		{
			
			int j=ListArr.get(i-1);
			if(i!=j)
			{
				System.out.println("The Missing Element is   "+i);
				break;
			}
		}
			
				
			
		}
		

	}



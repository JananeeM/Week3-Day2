package Week3Day2;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicatesInArrayCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> ListArr=new ArrayList<Integer>();
		for(int i=0;i<arr.length-1;i++)
		{
			ListArr.add(arr[i]);
		}
		System.out.println(ListArr);
		for(int i=0;i<arr.length-1;i++)
		{
			int count=0;
			for(int j=i+1;j<arr.length-1;j++)
			{
				if(ListArr.get(i)==ListArr.get(j))
				{
					count++;
				}
			}
			if(count>0)
				System.out.println(ListArr.get(i));
	}
	}
}

package Week3Day2;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesUsingCollections {

	public static void main(String[] args) {
		
			String text = "We learn java basics as part of java sessions in java week1";
			
			String[] strArray=text.split(" ");
		List<String> strList=new ArrayList<String>();
		//boolean add;
		//strList.add(str);
		//System.out.println(strList);
		
		for(int i=0;i<strArray.length;i++)
		{
			
			for(int j=i+1;j<strArray.length;j++)
			{
				if(strArray[i].equals(strArray[j]))
				{
					
					strArray[j]="";
				}
				

			}
		}
		for(int i=0;i<strArray.length;i++)
		{
			if(!strArray[i].equals(""))
			{
			strList.add(strArray[i]);
			}
		}
		
		
		for(String stro:strList)
		{
			System.out.println(stro);
		}
	}
}


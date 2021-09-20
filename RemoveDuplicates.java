package Week3Day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="PayPal India";
	boolean add;
		char[] chArray=name.toCharArray();
		Set<Character> charSet=new LinkedHashSet<Character>();		
		Set<Character> dupCharSet=new LinkedHashSet<Character>();	
		for(int i=0;i<chArray.length;i++)

		{
			if(chArray[i]!=' ')
			{
			
			if(add=charSet.add(chArray[i]))
			{
				continue;
			}
			else
			{
				dupCharSet.add(chArray[i]);
			}
		}
		}
		System.out.println("Printing CharSet :");
		for(Character charse : charSet)
		{
			System.out.print(charse);
		}
		System.out.println();
		System.out.println("Printing dupCharSet  :");
		for(Character ducharse : dupCharSet)
		{
			System.out.print(ducharse);
		}
	}

}

package RevisionClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraySqureSorted {
	
	public static void main(String[] args)
	{
		String[] s1= {"java","smruti","biwi","java"};
		List list2=Arrays.asList(s1);
		Set set1=new HashSet<>(list2);
		if(list2.size()==set1.size())
		{
			System.out.println("Doesn't contain duplicates");
		}
		else {
			System.out.println("Contains duplicates");
			System.out.println(set1);
		}
	}
}

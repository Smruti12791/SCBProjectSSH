package RevisionClass;

import java.util.HashMap;
import java.util.Map;

public class UniqueNumberinArrayList {
	public static void main(String[] args)
	{
		int a[]= {2,2,3,3,1,5,6,6,6};
		Map<Integer, Integer> duplicates= findDuplicates(a);
		
		for(Map.Entry<Integer, Integer> entry: duplicates.entrySet())
		{
			System.out.println(" number "+entry.getKey()+"repeated "+entry.getValue());
		}
	}
	
	public static Map<Integer, Integer> findDuplicates(int[] arr)
	{
		Map<Integer, Integer> count= new HashMap<>();
		
		for(int num:arr)
		{
			count.put(num, count.getOrDefault(num, 0)+1);
		}
		
		Map<Integer, Integer> duplicates= new HashMap<>();
		for(Map.Entry<Integer, Integer> entry : count.entrySet())
		{
			if(entry.getValue()>1)
			{
				duplicates.put(entry.getKey(), entry.getValue());
			}
		}
		return duplicates;
		
	}
	

}

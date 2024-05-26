package RevisionClass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HasMap {
	
	public static void main(String[] args)
	{
		Map<Integer,String> unsorted=new HashMap<>();
		unsorted.put(1, "Smruti");
		unsorted.put(2, "is");
		unsorted.put(3, "Best");
		//Set s1=unsorted.entrySet();
		//Iterator it=s1.iterator();
		//while(it.hasNext())
		//{
			//Entry map=(Entry)it.next();
			//System.out.println("Key Values" + map.getKey()+" and values "+map.getValue());
		//}
		
		//or
		
		for(Map.Entry<Integer, String> usort:unsorted.entrySet())
		{
			System.out.println(usort.getKey()+ " "+usort.getValue());
		}
		Map<Integer, String> sorted=new TreeMap<Integer, String>(unsorted);
		for(Map.Entry<Integer, String> us1: sorted.entrySet())
		{
			System.out.println(us1.getKey()+" is "+us1.getValue());
		}
		
	}
}


//output: 
//Smruti
//is
//best
package RevisionClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapSortbyValue {
	
	public static void main(String[] args)
	{
		Map<Integer,String> mp1=new HashMap<>();
		mp1.put(1, "a");
		mp1.put(6, "t");
		mp1.put(3, "o");
		mp1.put(5, "p");
		mp1.put(4, "w");
		for(Map.Entry<Integer, String> mp2:mp1.entrySet())
		{
			System.out.println(mp2.getKey()+" "+ mp2.getValue());
		}
		Set<Entry<Integer,String>> setEntry=mp1.entrySet();
		List<Entry<Integer,String>> list=new ArrayList<>(setEntry);
		Collections.sort(list, new Comparator<Entry<Integer,String>>(){

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			 }
			
		}
		);
		for(Map.Entry<Integer,String> mp3:list)
		{
			System.out.println(mp3.getKey()+" After sort "+mp3.getValue());
		}
	}

}

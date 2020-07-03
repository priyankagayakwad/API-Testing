package Demopkg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class hashmap_Iterate 
{
	public static void main (String [] args)
	{
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("Alia", 35);
		hm.put("Rani", 15);
		hm.put("Pranita", 8);
		
		System.out.println(hm);
		
		for(Entry<String, Integer> str: hm.entrySet())
		{
			System.out.println(str);
		}
	}

}

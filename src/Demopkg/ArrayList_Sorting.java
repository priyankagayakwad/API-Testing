package Demopkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_Sorting 
{
public static void main(String [] args)
{
	ArrayList<String> al=new ArrayList<String>();
	al.add("Rainbow");
	al.add("Asset");
	al.add("Survik");
	
	System.out.println(al);
	
	Iterator it= al.iterator();
	
	/*while(it.hasNext())
	{
		System.out.println(it.next());
	}*/
	Collections.sort(al, Collections.reverseOrder());
	
	for (String str : al) 
	{
		System.out.println(str);
		
	}
}

}

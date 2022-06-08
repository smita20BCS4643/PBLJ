
package smita;
import java.util.*;
public class HashTable 
{
    public static void main (String[] args)
    {
    	Hashtable h1 = new Hashtable();
    	
    	h1.put("1", "ONE");
    	h1.put("2", "TWO");
    	h1.put("3", "THREE");
    	
    	
    	Enumeration e = h1.keys();
        
    	while(e.hasMoreElements())
    	{
    		System.out.println(e.nextElement());
    	}
    
    }
}

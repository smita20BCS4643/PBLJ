package smita;
import java.util.*;
public class HashMain
{
	 public static void main (String[] args)
	    {
		Set s1 = new HashSet();
		   s1.add("A");
		   s1.add("B");
		   s1.add("C");
		   s1.add("D");
		   s1.add("E");
		   
		   System.out.println("My set is :"+s1);
		   
		   List ll = new ArrayList();
		   ll.add("A");
		   ll.add("B");
		   ll.add("C");
		   ll.add("A");
     	           ll.add("E");
		   
		   Set s2 = new HashSet(ll);
	
		   System.out.println("My List is :"+ll);
		   System.out.println("Set 2 is:"+s2);
		   System.out.println(" is s1 equals :"+s1.equals(s2));
		   
		   System.out.println(s1.containsAll(ll));
		   System.out.println(s2.containsAll(ll));
		   
		   Iterator i = s1.iterator();
		   
		   while(i.hasNext())
		   {
			   System.out.println(i.next());   
		   }
		   
		   s1.clear();
		   System.out.println("Is set 1 empty or not ?"+ s1.isEmpty());
		   System.out.println("Is set 2 empty or not ?"+ s2.isEmpty());
		   
		   System.out.println("set 1 contains "+ s1.size() + " Element");
		   System.out.println("set 2 contains "+ s2.size() + " Element");

	    }
}
//set dose not support copy of elements

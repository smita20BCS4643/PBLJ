package smita_ex2;
import java.util.*;

public class TestJavaCollection1
{
	public static void main (String[] args) {{

       ArrayList<String>list=new ArrayList<String>(); //Creating arraylist  
       list.add("Ravi"); //Adding object in arraylist  
       list.add("Vijay");
       list.add("Ajay");
       Iterator<String> itr=list.iterator();
  
      while(itr.hasNext())
       {
       	System.out.println(itr.hasNext());
       }  
   }  
}}


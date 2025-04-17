package smita;

public class try_catch {
	
	public static void main(String args[])
	{
		 int[] marks = {39,340,42};
		 
		 try 
		 {
			 System.out.println(marks[4]);
	     } 
		 
		 catch (Exception exception) 
		 {
			 System.out.println("An exception for caught while accessing an index the 'marks' array");
		 }
		 
		 
			 System.out.println("We tried to print marks & an exception must have occurred with index >=3");
	}

}

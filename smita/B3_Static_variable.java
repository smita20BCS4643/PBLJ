package smita;

//A variable that is declared as static is called a static variable. 
//It cannot be local. 
//You can create a single copy of the static variable
//and share it among all the instances of the class. 
//Memory allocation for static variables happens only once when the class is loaded in the memory.

class student
{
	static int age;
}

public class B3_Static_variable {
	
	public static void main(String args[])
	{
		student s1 = new student();
		student s2 = new student();
		
		s1.age = 45;
		s2.age = 32;
		
//		student.age = 31;
		
		System.out.println("S1 age " + s1.age);
		System.out.println("S2 age " + s2.age);

		

	}

}

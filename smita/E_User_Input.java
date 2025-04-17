package smita;

import java.util.Scanner;
public class E_User_Input {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String name = sc.next();
		String Sline = sc.nextLine();
		
		
		 int i;
		 for (i=1; i<=20; i++) {
			 if (i % 2 == 0)
			 {
				 continue;
//				 System.out.println(i);
			 }
			 System.out.println(i);
		 }
		 
//		 int i;
		 for (i=1; i<=20; i++) {
			 if (i % 2 == 0)
			 {
				 break;
//				 System.out.println(i);
			 }
			 System.out.println(i);
		 }
		 
	}

}

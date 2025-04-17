package smita;
//import java.math.*;
//import java.util.Random;
import java.util.Scanner;

public class Mini_Project {
	
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	
    	int my_num = (int) (Math.random() * 100);
    	int user_num = 0;
    	
    	do
    	{
    		System.out.println("Guess the number:(1 - 100");
    		user_num = sc.nextInt();
    		
    		if (user_num == my_num)
    				{
    			System.out.println("Whoa..number is correct");
    			break;
    				}
    		else if (user_num >= my_num)
    		{
    			System.out.println("Number is larger");
    		}
    		else
    		{
    			System.out.println("NUmber is Smaller");
    		}
    	}
    	while(user_num >= 0);
    	
    	System.out.println("My number was :");
    	System.out.println(my_num);
    }
}

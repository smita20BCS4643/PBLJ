//Video Store Launcher code
import java.util.Scanner;
public class VideoStoreLauncher {
	public static void main(String[] args)
	{
		VideoStore vs = new VideoStore();
		int ch ,uch , ach;
		 
		String Title;
		
		String choice;
		do
		{
			System.out.println("======== | Menu | ========");
			System.out.println("1.login as User");
			System.out.println("2.login as Admin");
			System.out.println("Enter Your Choice");
			
			Scanner s1 = new Scanner(System.in);
					ch = s1.nextInt();
			do 
			{
				switch(ch)
				{
				   case 1:
					   System.out.println("1. list Inventory");
					   System.out.println("2. Rent Video");
					   System.out.println("3. Enter the rating of video");
					   System.out.println("4. Return video");
					   
					   uch = s1.nextInt();
					   
					   if(uch ==1)
					   {
						   vs.Inventory();
					   }
					   else if (uch ==2)
					   {
						   vs.Inventory();
						   System.out.println("Enter the name of video");
						   Title = s1.next();
						   vs.checkOut(Title);
					   }
					   else if (uch ==3)
					   {
						   vs.receiveRating();
					   }
					   else if(uch ==4)
					   {
						   System.out.println("Enter the name");
						   Title= s1.next();
						   vs.ReturnVideo(Title);
						   System.out.println("Your Video is Returned Successfully!");
						   
					   }
					   else
					   {
						   System.out.println("Invalid choice");
					   }
					   
					   break;
					   
				   case 2:
					   System.out.println("1. list Inventory ");
					   System.out.println("2. Add video");
					   
					   ach= s1.nextInt();
					   
					   if(ach ==1)
					   {
						   vs.Inventory();
						   
					   }
					   else if(ach ==2)
					   {
						   System.out.println("Enter the name of video");
						   Title = s1.next();
						   vs.addVideo(Title);
					   }
					   
					   break;
					   
					   default:
						   System.out.println("Wrong choice");
				}
				
				 System.out.println("\nDO you want to repeat yes/no");
				 choice = s1.next();
				 
			}while(choice.equalsIgnoreCase("yes"));
			System.out.println("Want to Return to main Menu yes/no");
			choice = s1.next();
			
		}while(choice.equalsIgnoreCase("yes"));
	}
}

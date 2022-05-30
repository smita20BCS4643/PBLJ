package smita;
import java.util.Scanner;
public class CarStore 
{
	Car c[]= new Car[10];
	  static int i =0;
	  
	  void addCar(String Title)
	  {
		  c[i]= new Car();
		  c[i].Title = Title;
		  i++;
		  
		  System.out.println("Car added successfully");
	  }
	  
	  void checkOut(String Title)
	  {
		  for(int k=0; k<i;k++)
		  {
			  if(c[k].Title.equalsIgnoreCase(Title))
			  {
				  if(c[k].checked())
				  {
					  c[k].rent();
					  System.out.println("Car is rented");
				  }
				  else 
				  {
					  System.out.println("Sorry! Car is not availabe in the store");
				  }
				 
			  }
		  }
	  }
	  
	  void ReturnVideo(String Title)
	  {
		  if(i==0)
		  {
			  System.out.println("You have no video to return");
		  }
		  
		  for(int k = 0; k<i; k++)
		  {
			  if(c[k].Title.equalsIgnoreCase(Title))
			  {
				  c[k].checked= true;
			  }
		  }
	  }
	  
	  
	  public void receiveRating()
	  {
		  if(i==0)
		  {
			  System.out.println("You have no video to give the Rating");
			  
		  }
		  else
		  { 
			  for (int k = 0; k<i; k++)
			  {
				  System.out.println("Enter the rating for Video "+c[k].Title);
				  Scanner obj = new Scanner(System.in);
				  c[k].AvgRating = obj.nextInt();
			  }
			  
		  }
	  }
		  
		  public void Inventory()
		  {
			  if(i==0)
			  {
				  System.out.println("You have no video in inventory");
				  
			  }
			  else 
			  {
				  for(int k = 0; k<i; k++)
				  {
					  System.out.println(k+1+"."+c[k].Title+" "+" Rating "+c[k].AvgRating + " Avaibility "+c[k].checked);
				  }
			  }
		  }

}

// Video Inventory System
import java.util.Scanner;
public class VideoStore extends Video
{
  Video v[]= new Video[10];
  static int i =0;
  
  void addVideo(String Title)
  {
	  v[i]= new Video();
	  v[i].Title = Title;
	  i++;
	  
	  System.out.println("Video added successfully");
  }
  
  void checkOut(String Title)
  {
	  for(int k=0; k<i;k++)
	  {
		  if(v[k].Title.equalsIgnoreCase(Title))
		  {
			  if(v[k].checked())
			  {
				  v[k].rent();
				  System.out.println("Video is rented");
			  }
			  else 
			  {
				  System.out.println("Sorry! video is not availabe in the store");
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
		  if(v[k].Title.equalsIgnoreCase(Title))
		  {
			  v[k].checked= true;
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
			  System.out.println("Enter the rating for Video "+v[k].Title);
			  Scanner obj = new Scanner(System.in);
			  v[k].AvgRating = obj.nextInt();
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
				  System.out.println(k+1+"."+v[k].Title+" "+" Rating "+v[k].AvgRating + " Avaibility "+v[k].checked);
			  }
		  }
	  }
  }

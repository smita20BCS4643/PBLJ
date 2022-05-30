import java.util.Scanner;
public class Video
{
      public String Title;
      public boolean checked = true;
      int AvgRating;
      
      public boolean checked()
      {
    	  return checked;
      }
      
      public void rent()
      {
          checked = false;   	  
      }
      
      public void returned()
      {
    	  checked = true;
    	  System.out.println("Video is returned");
      }
      
      public int getRating()
      {
    	  if(AvgRating>0)
    	  {
    		  return AvgRating;
    	  }
    	  else
    	  {
    		  System.out.println("Rating is not available");
    	      return 0;
    	  }
      }
}
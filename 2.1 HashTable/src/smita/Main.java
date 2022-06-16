package smita;
import java.util.ArrayList;
import java.util.List;

public class Main 
{
  public static void main(String[] args) 
  
  {
	List<String> CSE = new ArrayList<String>();
    CSE.add("IOT");
    CSE.add("BD");
    CSE.add("IS");
    CSE.add("AIML");

	for (int i = 0; i < CSE.size(); i++) {
        // Print all elements of List
        System.out.println(CSE.get(i));
    }
    
  }
}

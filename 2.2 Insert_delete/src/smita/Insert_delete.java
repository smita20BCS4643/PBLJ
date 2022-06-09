package smita;

import java.util.*;

public class Insert_delete {
	public static void main(String[] args) {
		List<String> liststring = new ArrayList<String>();
// Inserting the elements in Arraylist
		liststring.add("Smita");
		liststring.add("Dhruva");
		liststring.add("Dhanashree");
		liststring.add("Sushant");

		System.out.println("|== Smita shinde   UID =20BCS4643 ==|\n");
//		Displaying 
		System.out.println("Printing The ArrayList is : " + liststring);

// 		Searching
		System.out.println("\nSearching The Items in ArrayList is : ");
		if (liststring.contains("IOT")) {
			System.out.println("Item Found");
		} else {
			System.out.println("Item Not Found");
		}
//		Removing or Deleting
		System.out.println("\nRemoving The Element From ArrayList is : " + liststring.remove(0));
		
		System.out.println("\nAfter Removing The Element From Arraylist is :" + liststring);

//		Retrieving 		
		System.out.println("\nRetrieving the element From ArrayList : ");
		
		String element = liststring.get(1); // retrieving the element
		System.out.println(element);
	}
}

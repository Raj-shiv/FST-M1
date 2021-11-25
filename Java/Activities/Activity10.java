package Activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
 
        hs.add("Kar");
        hs.add("Tam");
        hs.add("Tel");
        hs.add("And");
        hs.add("Mah");
        hs.add("Deh");
   
        System.out.println("original HashSet: " + hs);        
        //Print size of HashSet
        System.out.println("Size of HashSet: " + hs.size());
        
        //Remove element
        System.out.println("Removing A from HashSet: " + hs.remove("Tam"));
        //Remove element that is not present
        if(hs.remove("Goa")) {
        	System.out.println("Goa removed from the Set");
        } else {
        	System.out.println("Goa is not present in the Set");
        }
        
        //Search for element
        System.out.println("Checking if Raj is present: " + hs.contains("Raj"));
        //Print updated HashSet
        System.out.println("Updated HashSet: " + hs);
	}

}

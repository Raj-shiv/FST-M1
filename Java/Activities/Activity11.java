package Activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<Integer, String> ();
		hm.put(1, "blue");
		hm.put(2, "Red");
		hm.put(3, "Orange");
		hm.put(4, "Green");
		hm.put(5, "black");
		hm.put(6, "Yellow");
		
		System.out.println("The Original map: " + hm);
        
        // Remove one colour
        hm.remove(4);
        // Map after removing a colour
        System.out.println("After removing Green: " + hm);
        
        // Check if green exists
        if(hm.containsValue("Green")) {
            System.out.println("Green exists in the Map");
        } else {
            System.out.println("Green does not exist in the Map");
        }
        
        // Print the size of the Map
        System.out.println("Number of pairs in the Map is: " + hm.size());
		
	}

}

package Activities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> Arr = new ArrayList<>();
		Arr.add("Naveen");
		Arr.add("FrAK");
		Arr.add("tOFEL");
		Arr.add("SUnny");
		Arr.add("Kishore");
		Arr.add("Karima");
		
		System.out.println("All the object of lists");
		for(String name : Arr)
		{
			System.out.println(name);
		}
		
		System.out.println("3rd element of the List is : "+Arr.get(2));
		System.out.println("Check the Name in List ;"+Arr.contains("Shiva"));
		System.out.println("Size of the List is :"+Arr.size());
		Arr.remove("Naveen");
		System.out.println("New List of the Names is :"+Arr);
	}

}

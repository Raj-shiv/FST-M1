package Activities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner myObj = new Scanner(System.in);
			
			
			ArrayList list = new ArrayList();
			
			while(myObj.hasNextInt())
			{
				System.out.println("Enter A Number to add it to arraylist ");
				list.add(myObj.nextInt());
//				System.out.println("would you like to stop adding the numbers to list Y/N");
//				String Notification = myObj.nextLine();
//				if(Notification.equals("Y"))
//					break;
//				else
//					continue;
			}
			// Integer[] num = (Integer[]) list.toArray();
			 Integer[] num = (Integer[]) list.toArray(new Integer[0]);
			Random ran = new Random();
			int indexGen = ran.nextInt(num.length);
			System.out.println("Index Generated is : "+ indexGen);
			System.out.println("Value in array for generated Index : "+ num[indexGen]);
	}

}

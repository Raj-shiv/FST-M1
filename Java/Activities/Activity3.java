package Activities;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Activity3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		double Age_sec=1000000000;
		int option = 1;
		age_cal(Age_sec,option);
	}
	
	public static void age_cal(double Age_sec,int option)
	{
		double age_earth;
		double age_mercury;
		double age_venus;
		double age_mars;
		double age_jupiter;
		double age_saturn;
		double age_uranus;
		double age_neptune;
		
		age_earth = Age_sec/31557600;
		age_mercury = age_earth*0.2408467;
		age_venus = age_earth*0.61519726;
		age_mars = age_earth*1.88;
		age_jupiter = age_earth*11.86;
		age_saturn = age_earth*29.44;
		age_uranus = age_earth*84;
		age_neptune = age_earth*164;
		
		switch(option)
		{
		case 1 : System.out.println("Age in earth is : "+age_earth);break;
		case 2 : System.out.println("Age in Mercury is : "+age_mercury);break;
		case 3 : System.out.println("Age in Venus is : "+age_venus);break;
		case 4 : System.out.println("Age in Mars is : "+age_mars);break;
		case 5 : System.out.println("Age in Jupiter is : "+age_jupiter);break;
		case 6 : System.out.println("Age in saturn is : "+age_saturn);break;
		case 7 : System.out.println("Age in Uranus is : "+age_uranus);break;
		case 8 : System.out.println("Age in Neptune is : "+age_neptune);break;
		
		}
	}

}

package Activities;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;


	
	class Plane {
	    private List<String> passengers;
	    private int maxPasgers;
	    private Date TookofTime;
	    private Date Landedtime;
	    
	    public Plane(int maxPassengers) {
	        this.maxPasgers = maxPassengers;
	        this.passengers = new ArrayList<>();
	    }
	    public void onboard(String passenger)
	    {
	    	this.passengers.add(passenger);
	    }
	    public Date takeoff() {
	    	this.TookofTime = new Date();
	    	return TookofTime;
	    }
	    public Date landed() {
	    	this.Landedtime = new Date();
	    	return Landedtime;
	    }
	    
	    public List<String> getPassangers(){
	    	return passengers;
	    }
	}
	
	public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Plane airindia = new Plane(10);
		airindia.onboard("Avi");
		airindia.onboard("Joseph");
		airindia.onboard("kalpana");
		airindia.onboard("kavita");
		System.out.println("Plane taking off now : "+ airindia.takeoff());
		System.out.println("Passengers List : "+airindia.getPassangers());
		Thread.sleep(6000);
		System.out.println("Plane landed time: "+airindia.landed());
		System.out.println("Passengers list when landed : "+airindia.getPassangers());
	}

}

package Activities;

 interface BicycleParts
{
	public int gears = 0;
	public int currentspeed = 0;
}

 interface BicycleOperations
 {
	 public  void applyBreake(int speed);
	 public  void speedup(int increase);
	 
 }
 
 class Bicycle implements BicycleParts,BicycleOperations{
	 public int gears ;
	 public int currentspeed ;
	 public Bicycle(int gears, int currentspeed)
	 {
		 this.gears = gears;
		 this.currentspeed = currentspeed;
	 }
	 

	@Override
	public void applyBreake(int speed) {
		// TODO Auto-generated method stub
		currentspeed -=speed;
		System.out.println("Current speed is reduced to "+currentspeed);
	}

	@Override
	public void speedup(int increase) {
		// TODO Auto-generated method stub
		
		currentspeed += increase;
		System.out.println("current speed is now "+currentspeed);
		
	}
	public String bicycleDesc()
	{
		return("Numbetr of the gears :"+gears+"\n Speed of the bicycle is : "+ currentspeed);
	}
	 
 }
 
 class MountainBike extends Bicycle{
	 public int seatHeight;
	 
	 public MountainBike(int gears, int currentspeed,int sHeight) {
		super(gears, currentspeed);
		seatHeight = sHeight;
		// TODO Auto-generated constructor stub
	}

	public void setHeight(int nHeight)
	 {
		  seatHeight = nHeight;
	 }
	
	public String bicycleDesc()
	{
		return(super.bicycleDesc()+ "\n Seat height of the Mountain Cycle is : "+ seatHeight);
	}
 }
public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike Hero = new MountainBike(5,50,10);
		System.out.println("Bike Description is :"+Hero.bicycleDesc());
		Hero.speedup(10);
		Hero.applyBreake(5);		
		System.out.println("Bike Description is :"+Hero.bicycleDesc());
	}

}

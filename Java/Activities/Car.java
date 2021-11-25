package Activities;
public class Car {

	String color;
	String Tranmission;
	int make;
	int tyres;
	int doors;
	
	public Car() {
		// TODO Auto-generated constructor stub
		
		tyres =4;
		doors =4;
	}
	void displayCharacteristics()
	{
		System.out.println(color);
		System.out.println(Tranmission);
		System.out.println(make);
		System.out.println(tyres);
		System.out.println(doors);
	}
	void accelarate()
	{
		System.out.println("Car is moving forward");
	}
	void brake()
	{
		System.out.println("Car has stopped");
	}

}

package Activities;

	interface Addable 
	{
		int add(int a, int b);
	}


public class Activity12 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Addable ad1 = (a, b) -> (a+b);
			Addable ad2 = (int a, int b)->{return (a+b);};
			
			System.out.println(ad1.add(4, 7));
			System.out.println(ad2.add(4, 7));
	}

}

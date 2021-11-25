package Activities;

//class Exception 
//{
//	
//	public String getMessage()
//	{
//		return string ;
//	}
//	public void exceptionTest()
//	{
//		
//	}
//}

class CustomException extends Exception {
	private String message;
	
	public CustomException(String msg)
	{
		message = msg;
		
	}
	@Override
	public String getMessage()
	{
		return message;
	}
	
}

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Activity8.exceptiontest("Activity 8 test");
			Activity8.exceptiontest(null);
			
		}
		catch(CustomException CM)
		{
			System.out.println("Inside catch block " + CM.getMessage());
		}
	}
	
	static void exceptiontest(String str) throws CustomException{
		if(str==null)
			throw new CustomException("String is null");
		else
			System.out.println(str);
	}

}

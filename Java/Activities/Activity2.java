package Activities;
public class Activity2 {

	public Activity2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,77,10,54,-11,10,10};
		int sum=0;
		int fixedsum=30;
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]==10)
			{
				sum+=arr[i];
			}
			
			if (sum==fixedsum)
			{
				break;
			}
		}
		System.out.println("Sum of 10's in array is :" +sum);

	}

}

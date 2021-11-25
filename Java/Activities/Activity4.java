package Activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] unsorted_Array= {3,1,6,7,4,8,21,53,63,12,54,67,14,74,31};
		
		for(int i=1;i<unsorted_Array.length;i++)
		{
			int value=unsorted_Array[i];
			int j=i-1;
			while( j>=0 && value<unsorted_Array[j])
			{
				
					unsorted_Array[j+1]=unsorted_Array[j];
					--j;
					
				}
				unsorted_Array[j+1]=value;
			}
			
		System.out.println(Arrays.toString(unsorted_Array));
		}
		
		

	}


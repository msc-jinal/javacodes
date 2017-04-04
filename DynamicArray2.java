import java.io.*;
import java.util.*;

public class DynamicArray2{

	public static void main(String[] args)
	{
		int[] arr1 = new int[1];
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter Numeric Value and Enter 0 to exit");
		int num=scnr.nextInt();
		
		while(num!=0)
		{
			
			arr1[arr1.length-1]=num;
			num=scnr.nextInt();
			if(num==0)
			{
				break;
			}		
			int[] tempArr = new int[arr1.length+1];
			for(int i=0;i<arr1.length;i++)
			{
				tempArr[i]=arr1[i];			
			}
			arr1=tempArr;
		}
		
		System.out.println("My Array Size"+arr1.length);
		
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	
	}

}
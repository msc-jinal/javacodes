import java.io.*;
import java.util.*;

public class NewtonRaphson
{
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		System.out.println("Define Total Number.");
		int no=scnr.nextInt();
		int[] x = new int[no];
		float[] y = new float[no];
		
		//-------------define x and y axis--------------------------
		System.out.println("Enter values of x axis.");
		for(int i=0;i<no;i++)
		{
			x[i]=scnr.nextInt();
		}
		System.out.println("Enter values of y axis.");
		for(int i=0;i<no;i++)
		{
			y[i]=scnr.nextFloat();
		}
		System.out.println("Enter value of xr.");
		float xr=scnr.nextFloat();
		System.out.println("Enter value of h.");
		int h=scnr.nextInt();
		float y0=y[0];
		
		//System.out.println("--"+xr+"---"+h+"--->"+y0);
		//-----------------calculation of delta y----------------------------
		float[] y1 = new float[no-1];
		float[] y2 = new float[no-1];
		int c=0;
		for(int i=no-1;i>0;i--)
		{
			for(int j=1;j<i+1;j++)
			{
				y1[j-1]=y[j]-(y[j-1]);
				
				if(j==1)
				{
					y2[c++]=y1[0];
				}
				System.out.println(y1[j-1]);		
			}
			y=y1;
			//System.out.println("Y = "+Arrays.toString(y));		
					
		}

		System.out.println(Arrays.toString(y2));		
		

		//--------------r Calculation----------------
		float r=(xr-x[0])/h;
		//System.out.println(h);
		//--------------------Yr Calculation------------------
		float yr=y0+(r*y2[0]);
		//System.out.println(yr);
		int facResult;
		for(int s=1;s<no-1;s++)
		{
			float temp=1;
			for(int t=1;t<=s;t++)
			{
				temp = temp * (r-t);
			}
			facResult=factorial(s+1);
			yr = (yr + (((r * temp)*y2[s])/facResult));
			//System.out.println(yr);
			
		}
		System.out.println("Value of Yr: "+yr);
		
		
		
	}
	
	public static int factorial(int no)
		{
			int fact = 1;
			while (no > 0)
			{
				fact = fact * no;
				no = no - 1; //Multiply, then decrement
			}
			//System.out.println(fact);	
			return fact;
		}
}
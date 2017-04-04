import java.util.*;
import java.io.*;

public class Trapezodial
{
	public static void main(String[] args)
	{
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Define No of Values of your array.");
		int no=scnr.nextInt();
		
		double[] xArr = new double[no];
		double[] yArr = new double[no];
		System.out.println("Enter Values of X Array.");
		for(int i=0;i<no;i++)
		{
			xArr[i]=scnr.nextDouble();
			System.out.println(xArr[i]);
		}
		System.out.println("Enter Values of Y Array.");
		for(int i=0;i<no;i++)
		{
			yArr[i]=scnr.nextDouble();
			System.out.println(yArr[i]);
		}
		double hVal=(xArr[0]-xArr[1])/2;
		double sumX=yArr[0]+yArr[no-1];
		
		System.out.println("--------"+hVal);
		System.out.println("--------"+sumX);
		double sumR=0;
		for(int i=1;i<no-1;i++)
		{
			sumR=sumR+yArr[i];
			
		}
		 System.out.println("--------"+sumR);
		double r=2*sumR;
		System.out.println("--------"+r);
		
		double result=hVal*(sumX+r);
		System.out.println("--------"+result);

	}
}
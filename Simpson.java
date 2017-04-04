import java.util.*;
import java.io.*;

public class Simpson
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
		double hVal=(xArr[0]-xArr[1])/3;
		double sumX=yArr[0]+yArr[no-1];
		
		System.out.println("--------"+hVal);
		System.out.println("--------"+sumX);
		double sumE=0;
		for(int i=2;i<no;i+=2)
		{
			sumE=sumE+yArr[i];
		}
		 System.out.println("--------"+sumE);
		double e=2*sumE;
		System.out.println("--------"+e);
		double sumO=0;
		for(int i=1;i<no;i+=2)
		{
			sumO=sumO+yArr[i];
			
		}
		 System.out.println("--------"+sumO);
		double o=4*sumO;
		System.out.println("--------"+o);
		
		double result=hVal*(sumX+e+o);
		System.out.println("--------"+result);

	}
}
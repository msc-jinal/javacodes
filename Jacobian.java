import java.io.*;
import java.util.*;

public class Jacobian
{
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		int no=3;
		double[] arrA=new double[no];
		double[] arrB=new double[no];
		double[] arrC=new double[no];
		double[] arrD=new double[no];
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter Value of a,b,c and d.");
			arrA[i]=scnr.nextDouble();
			arrB[i]=scnr.nextDouble();
			arrC[i]=scnr.nextDouble();
			arrD[i]=scnr.nextDouble();
		}
		for(int j=0;j<no;j++)
		{
			System.out.println((arrA[j])+"x + "+(arrB[j])+"y + "+(arrC[j])+"z = "+arrD[j]);
		}
		
		double[] x=new double[5];
		double[] y=new double[5];
		double[] z=new double[5];
		
		System.out.println(arrD[0]+"\t"+arrA[0]);
		x[0]=(arrD[0]/arrA[0]);
		y[0]=(arrD[1]/arrB[1]);
		z[0]=(arrD[2]/arrC[2]);
		
		for(int i=1;i<5;i++)
		{
			x[i]=(arrD[0]-(arrB[0]*y[i-1])-(arrC[0]*z[i-1]))/arrA[0];
			y[i]=(arrD[1]-(arrA[1]*x[i-1])-(arrC[1]*z[i-1]))/arrB[1];
			z[i]=(arrD[2]-(arrA[2]*x[i-1])-(arrB[2]*y[i-1]))/arrC[2];
			
		}
		for(int k=0;k<5;k++)
		{
			System.out.println(x[k]+" "+y[k]+" "+z[k]);
		}
		
	}
}
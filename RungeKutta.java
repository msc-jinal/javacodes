import java.io.*;
import java.util.*;

public class RungeKutta
{
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter Value of x,X0 and Y0");
		float x=scnr.nextFloat();
		float x0=scnr.nextFloat();
		float y0=scnr.nextFloat();
		//System.out.println(x+" "+x0+" "+y0);
		float h=x-x0;
		System.out.println("Vlaue of h "+h);
		//-------------K1 Calculation--------------
		float k1=(h*(x0+y0));
		System.out.println("Vlaue of k1 "+k1);
		//-------------K2 Calculation--------------
		float k2=(h*(x0+(h/2)+y0+(k1/2)));
		System.out.println("Vlaue of k2 "+k2);
		//-------------K3 Calculation--------------
		float k3=(h*(x0+(h/2)+y0+(k2/2)));
		System.out.println("Vlaue of k3 "+k3);
		//-------------K4 Calculation--------------
		float k4=(h*(x0+h+y0+k3));
		System.out.println("Vlaue of k4 "+k4);
		//-------------K Calculation--------------
		float k=(k1+(2*k2)+(2*k3)+k4)/6;
		System.out.println("Vlaue of k "+k);
		//-------------Y Calculation--------------
		float y=y0+k;
		System.out.println("Vlaue of y "+y);
				
	
	}

}
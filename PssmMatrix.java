import java.util.*;
import java.io.*;

public class PssmMatrix
{
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		System.out.println("Define Total no of Sequences and Length of your Sequence.");
		int no = scnr.nextInt();
		int wl = scnr.nextInt();
		
		String[] strArr = new String[no];
		System.out.println("Enter your Sequences.");
		for(int i=0;i<no;i++)
		{
			strArr[i]=scnr.next();
		}
		// for(int i=0;i<no;i++)
		// {
			// System.out.println(strArr[i]);
		// }
		//----------------------profile/position weight matrix--------------------------------
		int[][] pssm = new int[4][wl];

		for(int col =0;col<wl;col++)
		{

			int countA=0;
			int countT=0;
			int countG=0;
			int countC=0;
		
			for(int row=0;row<no;row++)
			{
				String temp=strArr[row];
				char ch=temp.charAt(col);
				if(ch=='a'|| ch=='A')
				{
					countA++;
				}
				if(ch=='t' || ch=='T')
				{
					countT++;
				}
				if(ch=='g' || ch=='G')
				{
					countG++;
				}
				if(ch=='c' || ch=='C')
				{
					countC++;
				}
			}
			pssm[0][col]=countA;
			pssm[1][col]=countC;
			pssm[2][col]=countG;
			pssm[3][col]=countT;
			
		}
		for(int row=0;row<4;row++)
		{
			for(int col =0;col<wl;col++)
			{
				System.out.print(pssm[row][col]);
			}
			System.out.println();
		}
		//-------------------------------------Absolute Frequency Matrix----------------------------------------------------
		float[][] psw = new float[4][wl];
		for(int row=0;row<4;row++)
		{
			for(int col =0;col<wl;col++)
			{
				float temp=pssm[row][col];
				float val=temp/no;
				psw[row][col]=val;
			}
			
		}
		
		for(int row=0;row<4;row++)
		{
			for(int col =0;col<wl;col++)
			{
				System.out.print(psw[row][col]);
			}
			System.out.println();
		}
		
		
		//---------------------------------------finding  probability of the sequence absolute Frequencies-----------------------------------
		String str=strArr[0];
		float temp=0;
		for(int i=0;i<wl;i++)
		{
			
			char ch1 = str.charAt(i);
			if(ch1=='a'|| ch1=='A')
			{
				 temp=temp+pssm[0][i];
			}
			if(ch1=='c'|| ch1=='C')
			{
				temp=temp+pssm[1][i];
			}
			if(ch1=='g'|| ch1=='G')
			{
				temp=temp+pssm[2][i];
			}
			if(ch1=='t'|| ch1=='T')
			{
				temp=temp+pssm[3][i];
			}
		}
		System.out.println("---------------------"+temp);
		//---------------------------------------finding  probability of the sequence relative Frequencies-----------------------------------
		float temp1=0;
		for(int i=0;i<wl;i++)
		{
			
			char ch1 = str.charAt(i);
			if(ch1=='a'|| ch1=='A')
			{
				 temp1=temp1+psw[0][i];
			}
			if(ch1=='c'|| ch1=='C')
			{
				temp1=temp1+psw[1][i];
			}
			if(ch1=='g'|| ch1=='G')
			{
				temp1=temp1+psw[2][i];
			}
			if(ch1=='t'|| ch1=='T')
			{
				temp1=temp1+psw[3][i];
			}
		}
		System.out.println("---------------------"+temp1);
	}
	
}
import java.util.*;
public class IdentityMatrix{

	public static void main(String[] args){
	
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter First Sequence.");
		String firstStr=scnr.next();
		
		System.out.println("Enter Second Sequence.");
		String lastStr=scnr.next();
		
		for(int i=0;i<firstStr.length();i++)
		{	
			char ch=firstStr.charAt(i);
			if(i==0)
			{
				System.out.print(" ");
				
			}
			System.out.print(ch);
		}
		System.out.println();
		for(int j=0;j<lastStr.length();j++)
		{
			 char ch1=lastStr.charAt(j);
			
			System.out.print(ch1);	
			
			calculateMatrices(firstStr.charAt(j),firstStr);
			System.out.println();
		}
		
	}
	
	
	
	public static void calculateMatrices(char ch,String s2)
		{
							
				for(int j=0;j<s2.length();j++)
				{
					char ch1=s2.charAt(j);
					
					if(ch1==ch)
					{
						System.out.print('1');						
					}
					else
					{
						System.out.print('0');						
					}
				}				
			
		}
}
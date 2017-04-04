import java.io.*;

public class ReadFastaFile{

	public static void main(String[] args){
	
		try{
			
			FileReader fr = new FileReader("FastaSequence.txt");
			BufferedReader br  = new BufferedReader(fr);
			br.readLine();
			char ch;
			int counterA=0;
			int counterT=0;
			int counterG=0;
			int counterC=0;
			String str=br.readLine();
			while(str != null)
			{
				for(int i=0;i<str.length();i++)
				{
					ch=str.charAt(i);
					if(ch=='A')
					{
						counterA++;
					}
					else if(ch=='T')
					{
						counterT++;
					}
					else if(ch=='G')
					{
						counterG++;
					}
					else if(ch=='C')
					{
						counterC++;
					}
				}
				str=br.readLine();

			}
			int total=counterA+counterT+counterG+counterC;
			System.out.println("Total A:"+counterA+" "+"Total T:"+counterT+" "+"Total G:"+counterG+" "+"Total C:"+counterC);
			System.out.println("Total :"+total);
			double gcContent=(counterG+counterC)*100/total;
			System.out.println("GC% :"+gcContent);
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	
	}
	
}


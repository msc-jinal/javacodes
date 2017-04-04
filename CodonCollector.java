import java.io.*;

public class CodonCollector
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("sequence(1).fasta");
		FileWriter writer = new FileWriter("codon.txt");
		BufferedReader br = new BufferedReader(fr);
		br.readLine();
		int ch;
		int count=0;
		while((ch=br.read())!=-1)
		{			
			if(ch=='\r' || ch=='\n')
			{
				continue;
			}
			else
			{
				if(count==3)
				{
					writer.write("\n");
					count=0;
				}
				writer.write((char)ch);
				count++;
			}
		}
		writer.close();
		fr.close();
		
	}


}
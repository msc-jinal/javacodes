import java.util.*;
public class SmithWaterman{

	public static void main(String[] args){
	
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter First Sequence.");
		String fStr=scnr.next();
		
		System.out.println("Enter Second Sequence.");
		String lStr=scnr.next();
		int g=-1;
		int m=1;
		int mm=-1;
		
		
		int col=fStr.length()+1;
		int row=lStr.length()+1;
		int[][][] matrix = new int[row][col][2];
		//display(matrix);
		int temp=g;
		for(int i=1;i<col;i++)
		{
			matrix[0][i][0]=temp;
			temp=temp+g;
		}
		
		int temp1=g;
		for(int i=1;i<row;i++)
		{
			matrix[i][0][0]=temp1;
			temp1=temp1+g;
		}
		
		for(int r=1;r<row;r++)
		{
			for(int c=1;c<col;c++)
			{
				int u=matrix[r-1][c][0]+g;
				int s = matrix[r][c-1][0]+g;
				int d = matrix[r-1][c-1][0];
				
				if(fStr.charAt(c-1)==lStr.charAt(r-1)){
					d = d+m;
				}else{
					d = d+mm;
				}
				
				int max= Math.max(Math.max(u,s),d);
				matrix[r][c][0]=max;
				if(max==u){
					matrix[r][c][1]=1;	
				}else if(max==s){
					matrix[r][c][1]=-1;	
				}else{
					matrix[r][c][1]=0;	
				}
				
			}
		}
				
		int r=row-1;
		int c=col-1;
		String newSequence1="";
		String newSequence2="";
		while(r > 0 && c > 0)
		{
			int direction = matrix[r][c][1];
			if(direction==0){
				//digonal
				newSequence1 = fStr.charAt(c-1) + newSequence1;
				newSequence2 = lStr.charAt(r-1) + newSequence2;
				c--;
				r--;
				
			}else if(direction==-1){
				// side
				newSequence1 = fStr.charAt(c-1) + newSequence1;
				newSequence2 = "-" + newSequence2;
				c--;
				
			}else if(direction==1){
				// up
				newSequence1 =  "-" + newSequence1;
				newSequence2 = lStr.charAt(r-1) + newSequence2;
				r--;
			}
		}		
		display(matrix);
		System.out.println(newSequence1);
		System.out.println(newSequence2);
		
	}
	public static void display(int[][][] mat)
	{
		for(int i =0;i<mat.length;i++)
		{
			int[][] t = mat[i];
			for(int j=0;j<t.length;j++)
			{
				System.out.print(mat[i][j][0]);
				//System.out.print(t[j][0]+"|"+t[j][1]+" ");
			}
			System.out.println();
		}
	}
	
}

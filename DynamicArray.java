import java.io.*;
import java.util.*;

public class DynamicArray{

	private Object[] mainArr=null;

	public void add(Object num)
	{
		Object[] tempArr;
		if(mainArr==null){
			tempArr = new Object[1];	
		}else{
			tempArr = new Object[mainArr.length+1];
			for(int i=0;i<mainArr.length;i++)
			{
				tempArr[i]=mainArr[i];			
			}
		}
		tempArr[tempArr.length-1]=num;
		mainArr = tempArr;
	}
	
	public boolean search(Object item){
		for(int i=0;i<mainArr.length;i++)
		{
				if(mainArr[i].equals(item))
					return true;
		}
		return false;
	}
	
	public Object get(int i){
		if(mainArr==null)
			return 0;
		else
			return mainArr[i];
	}
	
	public int size(){
		if(mainArr==null)
			return 0;
		else
			return mainArr.length;
	}

	public void remove(int pos)
	{
		Object[] tempArr = new Object[mainArr.length-1];
		int j=0;
		for(int i=0;i<mainArr.length;i++){
			if(pos!=i){
				tempArr[j]=mainArr[i];
				j++;
			}
		}
		mainArr=tempArr;
		
	}

}
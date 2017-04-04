import java.util.*;

public class ReuseOfArray
{
	public static void main(String[] args)
	{
		DynamicArray da1 = new DynamicArray();
		String s1=new String();
		String s2=new String();
		String s3=new String();
		
		da1.add(s1);
		da1.add(s2);
		da1.add(s3);
			
		System.out.println("Before Add Values: "+da1.size());

		DynamicArray da3 = new DynamicArray();
		Integer i1= new Integer(5);
		Integer i2= new Integer(15);
		Integer i3= new Integer(25);
		Integer i4= new Integer(35);

		da3.add(i1);
		da3.add(i2);
		da3.add(i3);
		da3.add(i4);
		System.out.println("After Add Values: "+da3.size());
		da3.remove(2);
		
		System.out.println("After Removing Elements: "+da3.size());
	}
}
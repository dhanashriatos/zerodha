package Collection;

import java.util.Vector;

public class Vectors
{
public static void main(String[] args)
{
	Vector v=new Vector();
	v.add("Samantha");
	v.add('A');
	v.add(100);
	v.add(null);
	v.add(null);
	v.add("samantha");//this is oldest class in collection
	v.add(100);
	v.add("suraj");
	System.out.println(v.size());//to check the size
	System.out.println(v.capacity());//to check capacity
	System.out.println(v.isEmpty());//to check whether it is empty
	System.out.println(v.contains(200));//false
	System.out.println(v.get(0));//it will fetch index value
	//insertion of elements(right shift operation)
	v.add(0,"Nagchaitanya");
	System.out.println(v);
	//remove the data(left shift operation)
	v.remove(0);
	System.out.println(v);
	//modify,replace,update trhe data
	v.set(1, 'B');
	System.out.println(v);
}
}
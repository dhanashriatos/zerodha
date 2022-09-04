package Collection;

import java.util.ArrayList;

public class arraylist
{
public static void main(String[] args)
{
	ArrayList al=new ArrayList();
	al.add("Ganesh");
	al.add(100);
	al.add('A');
	al.add(null);
	al.add(100);
	al.add(null);
	System.out.println(al);//it will print entire data in existing sequence
	System.out.println(al.size());//it will give size
	System.out.println(al.contains(100));//checks whether given value is present in arraylist or not
	System.out.println(al.isEmpty());//it will whether our AL is emplty 
	//insert new value in arraylist(right shift operation)
	al.add(2,200);
	System.out.println(al.get(2));
	System.out.println(al);
	//remove element from AL
	al.remove(3);
	System.out.println(al);
}
}
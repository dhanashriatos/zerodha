package Set;

import java.util.LinkedHashSet;

public class linkedhashset 
{
public static void main(String[] args)
{
	LinkedHashSet lhs=new LinkedHashSet();
	lhs.add("Rainbow");
	lhs.add('A');
	lhs.add(null);
	lhs.add(null);
	lhs.add(100);
	System.out.println(lhs.size());//to ger the size
	System.out.println(lhs.isEmpty());//false
	System.out.println(lhs.contains("Rainbow"));//true
	//print entire data
	System.out.println(lhs);
}
}
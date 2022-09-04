package Set;

import java.util.HashSet;

public class hashset 
{
public static void main(String[] args)
{
	HashSet hs=new HashSet();
	hs.add("Rashmika");
	hs.add(100);
	hs.add('A');
	hs.add(null);
	hs.add(null);
	hs.add(100);
	//print the entire data
	System.out.println(hs);
	System.out.println(hs.isEmpty());//false
	System.out.println(hs.contains(100));//true
	System.out.println(hs.size());//it will give size(4)	
	
	
	}
}
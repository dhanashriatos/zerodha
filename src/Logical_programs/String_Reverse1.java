package Logical_programs;

public class String_Reverse1 
{
public static void main(String[] args) 
{
	String org="swapnil";
	String rev="";
	for(int i=org.length()-1;i>=0;i--) 
	{
		rev=rev+org.charAt(i);
	}
	System.out.println(rev);
}
}
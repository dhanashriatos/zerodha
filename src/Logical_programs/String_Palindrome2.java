package Logical_programs;

public class String_Palindrome2 
{
public static void main(String[] args) 
{
	String org="MADAM";
	String rev="";
	for(int i=org.length()-1;i>=0;i--) 
	{
		rev=rev+org.charAt(i);
	}
	System.out.println(rev);
	if(org.equals(rev)) {
		System.out.println("Given string is palindrome");
	}
	else {
		System.out.println("given string is not palindrome");
	}
}
}
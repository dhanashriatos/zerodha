package Logical_programs;

public class White_spaces_counting3 
{
public static void main(String[] args) 
{
	String name="D  h  a";
	int count=0;
	for(int i=0;i<=name.length()-1;i++) 
	{
		char ch = name.charAt(i);
		if(ch==' ') 
		{
			count++;
			
		}
	}
	System.out.println(count);
}
}
package Logical_programs;

public class White_spaces_counting4
{
public static void main(String[] args) 
{
	String name="H A J A R E";
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
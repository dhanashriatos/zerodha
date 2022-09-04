package Logical_programs;

public class RNumber_Palindrome1 
{
public static void main(String[] args) 
{
	int num=1212;
	int revNum=0;
	for(int i=num;i>0;i=i/10) 
	{
		int rem=i%10;
		revNum=revNum*10+rem;
	}
	System.out.println(revNum);
	if(num==revNum) 
	{
		System.out.println("given number is palindrome");
	}
	else
	{
		System.out.println("Given number is not palindrome");
	}
}
}
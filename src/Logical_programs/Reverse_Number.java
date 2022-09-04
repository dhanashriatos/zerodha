package Logical_programs;

public class Reverse_Number
{
public static void main(String[] args) 
{
	int num=1234;
	int revNum=0;
	for(int i=num;i>0;i=i/10) 
	{
		int rem=i%10;
		revNum=revNum*10+rem;
	}
	System.out.println(revNum);
}
}
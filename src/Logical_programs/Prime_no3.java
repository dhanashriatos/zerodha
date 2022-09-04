package Logical_programs;

public class Prime_no3
{
public static void main(String[] args)
{
	int num=1;
	int count=0;
	for(int i=1;i<=num;i++) 
	{
		if(num%i==0) 
		{
			count++;
		}
	}
	if(count==2)
	{
		System.out.println("given no is prime");
	}
	else {
		System.out.println("given no is not prime");
	}
}
}
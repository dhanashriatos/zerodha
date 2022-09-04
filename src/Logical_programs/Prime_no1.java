package Logical_programs;

public class Prime_no1
{
public static void main(String[] args)
{
	int num=2;//given number
	int count=0;//count initially zero
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
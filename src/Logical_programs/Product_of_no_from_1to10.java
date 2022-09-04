package Logical_programs;

public class Product_of_no_from_1to10 
{
public static void main(String[] args) 
{
	int num=10;
	int product=1;
	for(int i=1;i<=num;i++) 
	{
		product=product*i;
	}
	System.out.println(product);
}
}
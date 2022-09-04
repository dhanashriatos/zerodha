package Logical_programs;

import java.util.Arrays;

public class Compare_two_arrays4
{
public static void main(String[] args)
{
	int ar1[]= {100,200,300,500,600};
	int ar2[]= {50,20,40,70,80};
	int ar3[]= {100,200,300,500,600};
	System.out.println(Arrays.equals(ar1,ar2));
	System.out.println(Arrays.equals(ar2,ar3));
	System.out.println(Arrays.equals(ar1,ar3));
}
}
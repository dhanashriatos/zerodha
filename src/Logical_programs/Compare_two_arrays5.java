package Logical_programs;

import java.util.Arrays;

public class Compare_two_arrays5
{
public static void main(String[] args)
{
	int ar1[]= {50,40,30,20,10};
	int ar2[]= {50,40,30,20,10};
	int ar3[]= {50,40,30,20,10};
	System.out.println(Arrays.equals(ar1,ar2));
	System.out.println(Arrays.equals(ar2,ar3));
	System.out.println(Arrays.equals(ar1,ar3));
}
}
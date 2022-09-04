package Logical_programs;

import java.util.Arrays;

public class Compare_two_arrays2
{
public static void main(String[] args)
{
	int ar1[]= {10,20,30};
	int ar2[]= {50,20,40};
	int ar3[]= {10,20,30};
	System.out.println(Arrays.equals(ar1,ar2));
	System.out.println(Arrays.equals(ar2,ar3));
	System.out.println(Arrays.equals(ar1,ar3));
}
}
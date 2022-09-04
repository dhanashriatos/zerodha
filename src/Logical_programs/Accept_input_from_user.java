package Logical_programs;

import java.util.Scanner;

public class Accept_input_from_user
{
public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter 1st no"); 
	int num1 = scan.nextInt();
	System.out.println("enter 2nd number");
	int num2 = scan.nextInt();
	System.out.println("additon"+(num1+num2));
}
}
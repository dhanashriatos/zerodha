package Exception_Handling;

public class Arithmetic_Exception 
{
public static void main(String[] args) 
{
	int a=1;
	int b=0;
	try 
	{
		int c=a/b;//risky code
	}
	catch(ArithmeticException ref){//actual exception name and ref variable name
	System.out.println("Idiot...! Enter valid denomenator");	
	}
	System.out.println("boss exception is handled");
}
}
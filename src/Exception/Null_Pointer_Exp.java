package Exception;

public class Null_Pointer_Exp
{
	int i=10;//whenever we are trying to fetch nonstatic members with null reference then we will  get NPE
public static void main(String[] args)
{
	Null_Pointer_Exp npe=null;
System.out.println(npe.i);
	
}
}
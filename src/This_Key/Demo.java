package This_Key;

public class Demo 
{//BLC
int a=50;//global
public void test() {
	int a=60;//local
	System.out.println(a);
	System.out.println(this.a);
}
}
package Super_Key;

public class Sample2 extends Sample1
{
int a=60;//global variable of subclass
public void test() 
{
	int a=20;// local variable of test method
	System.out.println(a);//1st priority goes to local variable//20
	System.out.println(this.a);//60
	System.out.println(super.a);//50
}
}
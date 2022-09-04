package Logical_programs;

public class Replace_single_special_character2
{
public static void main(String[] args) 
{
	String name="@abc@def@hij@";
	String actName=name.replace("@", "");
	System.out.println(actName);
}
}
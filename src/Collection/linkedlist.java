package Collection;

import java.util.LinkedList;

public class linkedlist 
{
public static void main(String[] args) 
{
	LinkedList ll=new LinkedList();
	ll.add("Ankush");
	ll.add('D');
	ll.add("Avantika");
	ll.add(100);
	ll.add("Ankush");
	ll.add(null);
	ll.add(null);
	System.out.println(ll.size());//size
	System.out.println(ll.get(6));
	System.out.println(ll.get(5));
	System.out.println(ll.isEmpty());//false
	System.out.println(ll.contains(200));//false
	System.out.println(ll.get(2));
	//insertion in ll (right shift operation)
	ll.add(2,"Rahul Gandhi");
	System.out.println(ll);
	//remove data from collection
	ll.remove(2);
	System.out.println(ll);
	//modification/updatipn/replace
	ll.set(0, "Ankushkumar");
	System.out.println(ll);
	}
}
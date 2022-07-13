package co4;
import java.util.*;
public class pgm17 {
public static void main(String[] args)
{
	Map<Integer,String> hm=new HashMap<>();
	hm.put(20,"twenty");
	hm.put(2,"two");
	hm.put(1,"one");
	System.out.println("HashMap:");
	System.out.println(hm);
	hm.put(2,"TWO");
	hm.put(null,"empty");
	System.out.println("\nHashMap after updation:");
	System.out.println(hm);
	hm.remove(20);
	System.out.println("\nHashMap after deletion:");
	System.out.println(hm);
	System.out.println("\nHashMap key interface:");
	for(Map.Entry<Integer,String> me:hm.entrySet())
	System.out.println(me.getKey()+":"+me.getValue());
}
}

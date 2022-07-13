package co4;
import java.util.*;
public class pgm18 {
public static void main(String[] args) {
	Map<Integer,String> hm=new HashMap<>();
	hm.put(2,"two");
	hm.put(3,"three");
	hm.put(1,"one");
	System.out.println("HashMap\n");
	Set<Integer> key=hm.keySet();
	for(Integer i:key)
	{
	System.out.println(i+":"+hm.get(i));
	}
	Map<Integer,String> tm=new TreeMap<>();
	tm.putAll(hm);
	System.out.println("TreeMap\n");
	Set<Integer> key1=tm.keySet();
	for(Integer i:key1)
	{
	System.out.println(i+":"+tm.get(i));
	}
	
}
}

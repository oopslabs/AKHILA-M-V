package co4;
import java.util.*;
public class pgm16 {
public static void main(String[] args) {
	HashSet<String> set1=new HashSet<>();
	HashSet<String> set2=new HashSet<>();
	HashSet<String> set3=new HashSet<>();
	set1.add("a");
	set1.add("b");
	set1.add("c");
	
	set2.add("a");
	set2.add("b");
	set2.add("c");
	
	set3.add("A");
	set3.add("B");
	set3.add("C");
	
	System.out.println("Both set1 and set2 are equal:"+set1.equals(set2));
	System.out.println("Both set1 and set3 are equal:"+set1.equals(set3));
}
}

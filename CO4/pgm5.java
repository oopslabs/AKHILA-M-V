package co4;
import java.util.*;
public class pgm5 {
public static void main(String[] args) {
	LinkedHashSet<Integer> lh=new LinkedHashSet<>();
	lh.add(1);
	lh.add(4);
	lh.add(2);
	System.out.println("LinkedHashSet:");
	System.out.println(lh);
	lh.remove(2);
	System.out.println("LinkedHashSet after deletion:");
	System.out.println(lh);
	System.out.println("size of LinkedHashSet:");
	System.out.println(lh.size());
	System.out.println("is 4 contains in LinkedHashSet:"+lh.contains(2));
	
	
}
}

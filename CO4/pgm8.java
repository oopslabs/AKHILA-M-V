package co4;
import java.util.*;
public class pgm8 {
public static void main(String[] args)
{
 Stack<Integer> s=new Stack<>(5);
 s.push(1);
 s.push(2);
 s.push(3);
 s.push(4);
 s.push(5);
 System.out.println("Stack");
 s.display();
 s.pop();
 System.out.println("Stack");
 s.display();
}
}
class Stack<T>{
	ArrayList<T> arr;
	Integer top=-1,n;
	Stack(int i){
		this.n=i;
		this.arr=new ArrayList<T>(i);
	}
	void push(T data) {
		if((top+1)==n)
		System.out.println("overflow");
		else
		{
			top++;
			if(arr.size()>top)
				arr.set(top,data);
			else
				arr.add(data);
		}
		
	}
	void pop()
	{
		if(top==-1)
		System.out.println("underflow");	
		else
		{
		System.out.println("Poped element :"+arr.get(top));
		top--;
		}
	}
	void display()
	{
		for(int j=top;j>-1;j--)
		{
			System.out.println(arr.get(j));
		}
	}
}
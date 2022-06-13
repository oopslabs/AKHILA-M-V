package CO4;
import java.io.*;
import java.util.*;
class even implements Runnable{
	int m,n;
	even(int m,int n){
		this.m=m;
		this.n=n;
	}
	public synchronized void run() {
		System.out.println("enter limit from"+m+" to "+n);
		for (int i=m;i<=n;i++) {
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
}
class fibonacci implements Runnable{
	int n;
	fibonacci(int n){
		this.n=n;
	}
	public synchronized void run() {
		System.out.println("Fibonacci series upto "+n);
		int a=0,b=1,c=0;
		System.out.println(a);
		System.out.println(b);
		while((a+b)<n){
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
public class pgm6 {
public static void main(String [] args) {
	Runnable obj1;
	even ev=new even(2,10);
	fibonacci f=new fibonacci(10);
	Thread t1=new Thread(ev);
	Thread t2=new Thread(f);
	t1.start();
	t2.start();
}
}

package co4;
import java.util.*;
class even implements Runnable{
	int m, n;
	even()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 limits: ");
		m=sc.nextInt();
		n=sc.nextInt();
	}
	public synchronized void run() {
		for(int i=m;i<=n;i++) {
			if(i%2==0)
			{
				System.out.println("Even :"+i);
			}
		}
	}
	
}
class fibonacci implements Runnable{
	int r;
	fibonacci()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limits: ");
		r=sc.nextInt();
	}
	public synchronized void run() {
		int a=0,b=1,c=0;
		System.out.println("Fibonacci :"+a);
		System.out.println("Fibonacci :"+b);
		while(c!=r) {
			c=a+b;
			System.out.println("Fibonacci :"+c);
			a=b;
			b=c;
			}
		}
	
}
public class pgm6 {
public static void main(String[] args) {
	even ev=new even();
	fibonacci fb=new fibonacci();
	Thread t1=new Thread(ev);
	Thread t2=new Thread(fb);
	t1.start();
	t2.start();
}
}

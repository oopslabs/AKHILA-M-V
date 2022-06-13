package CO4;
import java.util.*;
class mult extends Thread{
	public synchronized void run() {
		System.out.println("multiplication table of 5");
		for (int i=1;i<=10;i++) {
			System.out.println(i*5);
		}
	}
}
class prime extends Thread{
	public synchronized void run() {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("enter limit:");
		n=s.nextInt();
		for (int i=2;i<=n;i++) {
			int flag=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0)
				{
					flag=1;
				}
			}
			if(flag==0) {
				System.out.println(i+"is prime");
			}
		}
	}
}
public class pgm5 {
public static void main(String [] args) {
	mult m=new mult();
	prime p=new prime();
	m.start();
	p.start();
}
}

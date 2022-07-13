package co4;
import java.util.*;
class mult extends Thread{
	public synchronized void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit: ");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			System.out.println(i+" * 5 ="+(i*5));
		}
	}
}
class prime extends Thread{
	public synchronized void run() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the limit: ");
		int r=s.nextInt();
		int p=0;
		for(int i=2;i<=r;i++)
		{
			p=0;
			for(int j=2;j<=(i/2);j++)
			{
				if(i%j==0)
				{
					p=1;
				}
			}
			if(p==0)
			{
				System.out.println("prime :"+i);
			}
		}
	}
}
public class pgmm5 {
public static void main(String[] args)
{
	mult m=new mult();
	prime p=new prime();
	m.start();
	p.start();
}
}

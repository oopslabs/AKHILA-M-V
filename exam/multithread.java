package exam;
import java.util.*;
class number extends Thread{
	int n,a;
	int arr[]=new int[5];
	/*number(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter limit");
		n=s.nextInt();
	}*/
	public synchronized void run(){
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.println("enter element");
			a=s.nextInt();
			arr[i]=a;
			if(a%2==0)
			{
			square1 sq=new square1(a);
			sq.start();
			}
			else{
			cube cu=new cube(a);
			cu.start();
			}
			/*try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
}
}
}
class square1 extends Thread{
	int a;
	public square1(int a) {
		this.a=a;
	}
	public synchronized void run(){
		
		System.out.println("Square of "+a+"is "+(a*a));
		
	}
}
class cube extends Thread{
	int a;
	public cube(int a) {
		this.a=a;
	}
	public synchronized void run(){
		System.out.println("Cube of "+a+"is "+(a*a*a));
		
	}
}
public class multithread{
	public static void main(String[] args){
		number num=new number();
		num.start();
		int k=num.a;
		
		
		/*if(k%2==0)
		{
		square1 sq=new square1(k);
		sq.start();
		}
		else{
		cube cu=new cube(k);
		cu.start();
		}*/
	}
		
	}
	

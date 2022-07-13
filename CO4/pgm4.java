package co4;
import java.util.*;
class negExcep extends Exception{
	negExcep(String msg){
		super(msg);
	}
}
public class pgm4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter limit");
	int n=sc.nextInt();
	int sum=0,avg=0;
	for(int i=0;i<n;i++)
	{
		int a=sc.nextInt();
		try {
			if(a<0)
			{
				i--;
				throw new negExcep("negative number..");
			}
			else
			{
				sum=sum+a;
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	System.out.println("Average :" + (sum/n));
}
}

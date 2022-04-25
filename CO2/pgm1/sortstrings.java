package CO2;
import java.util.*;
public class sortstrings {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int m,pos=0;
		String temp;
		System.out.println("Enter the no of elements:");
		m=s.nextInt();
		String a[]=new String[m];
		System.out.println("Enter "+m+" elements:");
		s.nextLine();
		for(int i=0;i<m;i++)
		{
			a[i]=s.nextLine();
		}
		for(int i=0;i<m;i++)
		{
			for(int j=i+1;j<m;j++)
			{
			if(a[i].compareTo(a[j])>0)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
		}
		System.out.println("Elements in sorted order:");
		for(int i=0;i<m;i++)
		{
			System.out.println(a[i]+"\n");
		}
	}

}

package CO2;
import java.util.*;
public class searchelement {
		public static void main(String[] args){
			Scanner s=new Scanner(System.in);
			int m,pos=0;
			String se;
			System.out.println("Enter the no of elements:");
			m=s.nextInt();
			String a[]=new String[m];
			System.out.println("Enter "+m+" elements:");
			s.nextLine();
			for(int i=0;i<m;i++)
			{
				a[i]=s.nextLine();
			}
			System.out.println("Enter the element to be searched:");
			se=s.nextLine();
			int flag=0;
			for(int i=0;i<m;i++)
			{
				if(a[i].compareTo(se)==0)
				{
					pos=i;
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				pos=pos+1;
				System.out.println("Element "+se+" found at position "+pos);
			}
			if(flag==0)
			{
				System.out.println("Element "+se+" not found");
			}
		}

	}

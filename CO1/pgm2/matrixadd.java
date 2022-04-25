package CO1;
import java.util.Scanner;
public class matrixadd {
public static void main(String [] args){
	Scanner s = new Scanner(System.in);
	
	
	System.out.println("Enter rows of matrics:");
	int m=s.nextInt();
	System.out.println("Enter columns of matrics:");
	int n=s.nextInt();
	
	
	int a[][]=new int[m][n];
	int b[][]=new int[m][n];
	int c[][]=new int[m][n];
	
	
	System.out.println("Enter elements of first matrics:");
	for(int i=0;i<m;i++)
		for(int j=0;j<n;j++)
			a[i][j]=s.nextInt();
	
	System.out.println("Enter elements of second matrics:");
	for(int i=0;i<m;i++)
		for(int j=0;j<n;j++)
			b[i][j]=s.nextInt();
	
	for(int i=0;i<m;i++)
		for(int j=0;j<n;j++)
			c[i][j]=a[i][j]+b[i][j];
	
	System.out.println("first matrics:");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(a[i][j]+"\t");
		}
		System.out.println();
	}
	
	System.out.println("second matrics:");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(b[i][j]+"\t");
		}
		System.out.println();
	}
	
	System.out.println("Resultant matrics:");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(c[i][j]+"\t");
		}
		System.out.println();
	}
	
}
}

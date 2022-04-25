package CO1;
import java.util.Scanner;
public class symmetric {
public static void main(String [] args){
	Scanner s= new Scanner(System.in);
	System.out.println("Enter rows of matrics");
	int m=s.nextInt();
	System.out.println("Enter columns of matrics");
	int n=s.nextInt();
	int a[][]=new int[m][n];
	int b[][]=new int[m][n];
	
	System.out.println("Enter elements of matrics");
	for(int i=0;i<m;i++)
		for(int j=0;j<n;j++)
			a[i][j]=s.nextInt();
	
	for(int i=0;i<m;i++)
		for(int j=0;j<n;j++)
			b[j][i]=a[i][j];
	
	System.out.println("Entered Matrics");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(a[i][j]+"\t");
		}
		System.out.println();
	}
	
	
	System.out.println("Transpose of entered matrics");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(b[i][j]+"\t");
		}
		System.out.println();
	}
	
	int flag =0;
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(b[i][j]!=a[i][j])
			flag=1;
			
		}
	}
	
	if(flag==1)
		System.out.println("Matrics is not Symmetric");
	else
		System.out.println("Matrics is Symmetric");
	
}
}

package exam;
import java.util.*;
public class stack {
	Scanner s=new Scanner(System.in);
	int top=-1,n=5;
	int arr[]=new int[n];
	void push(){
		
		if(arr[top+1]==n)
		{
			System.out.println("Stack overflow");
		}
		else
		{
			System.out.println("enter element");
			int a1=s.nextInt();
			top++;
			arr[top]=a1;
		}
	}
	void pop(){
		if(top==-1)
		{
			System.out.println("Stack underflow");
		}
		else
		{
			top=top-1;
		}
	}
	void display(){
		System.out.println("Array elements:");
		for(int i=top;i>-1;i--)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		stack st=new stack();
		//System.out.println("enter the limit");
		//int n=s.nextInt();
		System.out.println("1:Push\n2:Pop\n3:Display");
		int d=1;
		do{
		System.out.println("Enter Choice");
		int ch=s.nextInt();
		switch(ch){
		case 1:st.push();
		break;
		case 2:st.pop();
		break;
		case 3:st.display();
		break;
		default:System.out.println("Invalid choice");
		}
		System.out.println("Do you want to continue? (0/1)");
		d=s.nextInt();
		}while(d!=0);
		
	}
}

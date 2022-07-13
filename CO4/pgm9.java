package co4;
import java.util.*;
public class pgm9 {
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter number of elements");
	int n=sc.nextInt();
	Integer[] arr=new Integer[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	Bubblesort<Integer> b=new Bubblesort<>(arr);
	System.out.println("Array before sorting: ");
	b.display();
	b.sort();
	System.out.println("Array after sorting: ");
	b.display();
}
}
class Bubblesort<T extends Comparable<?super T>>{
	T array[];
	Bubblesort(T a[]){
		this.array=a;
	}
	void display() {
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
	void sort() {
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if((array[i].compareTo(array[j]))>0)
						{
						  T temp=array[i];
						  array[i]=array[j];
						  array[j]=temp;
						}
			}
		}
	}
}
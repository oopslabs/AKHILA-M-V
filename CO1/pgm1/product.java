package CO1;
import java.util.Scanner;
public class product {
	int pcode;
	String pname;
	double price;
	void display(){
		System.out.println(pcode+"\t\t"+pname+"\t\t"+price+"\t\t");
	}
	public static void main(String [] args){
		product obj1= new product();
		product obj2= new product();
		product obj3= new product();
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter details of product:");
		System.out.println("Enter pcode of first product:");
		obj1.pcode=s.nextInt();
		s.nextLine();
		System.out.println("Enter pname of first product:");
		obj1.pname=s.nextLine();
		System.out.println("Enter price of first product:");
		obj1.price=s.nextDouble();

		System.out.println("Enter pcode of second product:");
		obj2.pcode=s.nextInt();
		s.nextLine();
		System.out.println("Enter pname of second product:");
		obj2.pname=s.nextLine();
		System.out.println("Enter price of second product:");
		obj2.price=s.nextDouble();
		
		System.out.println("Enter pcode of third product:");
		obj3.pcode=s.nextInt();
		s.nextLine();
		System.out.println("Enter pname of third product:");
		obj3.pname=s.nextLine();
		System.out.println("Enter price of third product:");
		obj3.price=s.nextDouble();
		
		System.out.println("\nProduct Information\n\nProduct_Code\tProduct_Name\tProduct_Price");
		obj1.display();
		obj2.display();
		obj3.display();
		
		if(obj1.price<obj2.price && obj1.price<obj3.price)
			System.out.println("price of product 1 is lesser");
		else if(obj2.price<obj1.price && obj2.price<obj3.price)
			System.out.println("price of product 2 is lesser");
		else if(obj3.price<obj2.price && obj3.price<obj1.price)
			System.out.println("price of product 3 is lesser");
		
		 
	}
}

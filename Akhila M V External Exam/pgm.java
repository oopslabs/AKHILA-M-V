package external;
import java.util.*;
class staff{
	Scanner sc=new Scanner(System.in);
	String name,desig;
	staff(){
		System.out.println("Enter staff name : ");
		name=sc.nextLine();
		System.out.println("Enter staff designation : ");
		desig=sc.nextLine();
	}
}
class staffdetails extends staff{
	Scanner sc=new Scanner(System.in);
	String dept;
	int salary;
	staffdetails(){
		System.out.println("Enter staff department : ");
		dept=sc.nextLine();
		System.out.println("Enter staff salary : ");
		salary=sc.nextInt();
	}
}
class staffdisplay extends staffdetails{
	void display() {
		System.out.println("STAFF DETAILS");
		System.out.println("Staff Name : "+name);
		System.out.println("Staff Designation : "+desig);
		System.out.println("Staff Department : "+dept);
		System.out.println("Staff Salary : "+salary);
	}
}
public class pgm {
public static void main(String[] args) {
	staffdisplay s=new staffdisplay();
	s.display();
}
}

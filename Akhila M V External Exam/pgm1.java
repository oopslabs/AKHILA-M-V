package external;
import java.util.*;
interface staff1{
	String name=null;
	String desig=null;
}
interface staffdetails1{
	
	String dept=null;
	int salary=0;
}
class staffdisplay1 implements staff1,staffdetails1{
	staffdisplay1(String name,String desig,String dept,int salary){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter staff name : ");
		name=sc.nextLine();
		System.out.println("Enter staff designation : ");
		desig=sc.nextLine();
		System.out.println("Enter staff department : ");
		dept=sc.nextLine();
		System.out.println("Enter staff salary : ");
		salary=sc.nextInt();
	}
	void display() {
		System.out.println("STAFF DETAILS");
		System.out.println("Staff Name : "+name);
		System.out.println("Staff Designation : "+desig);
		System.out.println("Staff Department : "+dept);
		System.out.println("Staff Salary : "+salary);
	}
}
public class pgm1 {
	public static void main(String[] args) {
		staffdisplay s=new staffdisplay();
		s.display();
	}
}

package CO3;
import java.util.*;
class person{
	String name,address,gender;
	int age;
	person(String pname,String padd,int page,String pgender){
		name=pname;
		address=padd;
		age=page;
		gender=pgender;
	}
}
class employees extends person{
	int eid,salary;
	String companyname,qualification;
	employees(String pname,String padd,int page,String pgender,int id,String cmpnyname,String emqualification,int esalary){
		super(pname,padd,page,pgender);
		eid=id;
		companyname=cmpnyname;
		qualification=emqualification;
		salary=esalary;
	}
	
}
class teachers extends employees{
	Scanner s= new Scanner(System.in);
	int teacherid;
	String department,subject;
	teachers(String pname,String padd,int page,String pgender,int id,String cmpnyname,String emqualification,int esalary,int tid,String dept, String sub){
		super(pname,padd,page,pgender,id,cmpnyname,emqualification,esalary);
		teacherid=tid;
		department=dept;
		subject=sub;
	}
		void read(){
			System.out.println("Enter person name");
			name=s.nextLine();
			System.out.println("Enter person address");
			address=s.nextLine();
			System.out.println("Enter person age");
			age=s.nextInt();
			System.out.println("Enter person gender");
			s.nextLine();
			gender=s.nextLine();
			System.out.println("Enter employee id");
			eid=s.nextInt();
			System.out.println("Enter employee's company name");
			s.nextLine();
			companyname=s.nextLine();
			System.out.println("Enter employee qualification");
			qualification=s.nextLine();
			System.out.println("Enter employee salary");
			salary=s.nextInt();
			System.out.println("Enter teacher id");
			teacherid=s.nextInt();
			System.out.println("Enter teacher's department name");
			s.nextLine();
			department=s.nextLine();
			System.out.println("Enter teacher's subject");
			subject=s.nextLine();
		}
		void display()
		{
			System.out.println("Person name: "+name);
			System.out.println("Person address: "+address);
			System.out.println("Person age: "+age);
			System.out.println("Person gender: "+gender);
			System.out.println("Employee id: "+eid);
			System.out.println("Employee's company name: "+companyname);
			System.out.println("Employee qualification: "+qualification);
			System.out.println("Employee salary: "+salary);
			System.out.println("Teacher id: "+teacherid);
			System.out.println("Teacher's department name: "+department);
			System.out.println("Teacher's subject: "+subject);
		}
}
public class personemp {
	public static void main(String [] args){
		int id = 0,esalary = 0,tid=0,page=0;
		String pname = null,padd = null,pgender=null,cmpnyname=null,emqualification=null,dept = null,sub = null;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of person");
		int num=s.nextInt();
		teachers t[]=new teachers[num];
		for(int i=0;i<num;i++)
		{
		t[i]=new teachers(pname,padd,page,pgender,id,cmpnyname,emqualification,esalary,tid,dept,sub);
		t[i].read();
		}
		for(int i=0;i<num;i++)
		{
		t[i].display();
		}
	}
}

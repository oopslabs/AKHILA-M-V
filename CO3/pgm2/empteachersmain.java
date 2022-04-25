package CO3;
import java.util.*;
class employee {
	int empid,salary;
	String name,address;
	employee(int id,int sal,String ename,String eadd)
	{
		empid=id;
		salary=sal;
		name=ename;
		address=eadd;
	}
}
class teacher extends employee{
	Scanner s= new Scanner(System.in);
	String department,subject;
	teacher(int id,int sal,String ename,String eadd,String dept,String sub)
	{
		super(id,sal,ename,eadd);
		department=dept;
		subject=sub;
	}
	void read()
	{
		System.out.println("Enter Teacher id");
		empid=s.nextInt();
		System.out.println("Enter Teacher name");
		s.nextLine();
		name=s.nextLine();
		System.out.println("Enter Teacher address");
		address=s.nextLine();
		System.out.println("Enter Teacher salary");
		salary=s.nextInt();
		System.out.println("Enter Teacher department");
		s.nextLine();
		department=s.nextLine();
		System.out.println("Enter Teacher subject");
		subject=s.nextLine();
	}
	void display()
	{
		System.out.println("Teacher id: "+empid);
		System.out.println("Teacher name: "+name);
		System.out.println("Teacher address: "+address);
		System.out.println("Teacher salary: "+salary);
		System.out.println("Teacher department: "+department);
		System.out.println("Teacher subject: "+subject);
	}
}
public class empteachersmain {
public static void main(String [] args){
	int eid = 0,esal = 0;
	String ename = null,eadd = null,edept = null,esubj = null;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of employes");
	int num=s.nextInt();
	teacher t[]=new teacher[num];
	for(int i=0;i<num;i++)
	{
	t[i]=new teacher(eid,esal,eadd,ename,edept,esubj);
	t[i].read();
	}
	for(int i=0;i<num;i++)
	{
	t[i].display();
	}
}
}

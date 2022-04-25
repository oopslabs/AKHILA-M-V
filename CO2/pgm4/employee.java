package CO2;
import java.util.*;
public class employee {
int eno,esalary;
String ename;
Scanner s=new Scanner(System.in);
void read()
{
System.out.println("Enter employee number");
eno=s.nextInt();
System.out.println("Enter employee name");
s.nextLine();
ename=s.nextLine();
System.out.println("Enter employee salary");
esalary=s.nextInt();
}
void display()
{
System.out.println("Employee number: "+eno);
System.out.println("Employee name: "+ename);
System.out.println("Employee salary: "+esalary);
}
public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of employes");
int num=s.nextInt();
employee emp[]=new employee[num];
for(int i=0;i<num;i++)
{
emp[i]=new employee();
emp[i].read();
}
System.out.println("Enter the employee number to be searched");
int n=s.nextInt();
int flag=0;
for(int i=0;i<num;i++)
{
if(emp[i].eno==n)
{
emp[i].display();
flag=1;
}
}
if(flag==0)
{
System.out.println("Employee not found");
}
}
}
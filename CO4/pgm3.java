package co4;
import java.util.*;
class excep extends Exception{
	excep(String msg){
		super(msg);
	}
}
public class pgm3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter username : ");
	String user=sc.nextLine();
	System.out.println("enter pass : ");
	String pass=sc.nextLine();
	try {
		if(user.length()<8) {
			throw new excep("username error...");
		}
		else if(pass.length()<8) {
			throw new excep("password error...");
		}
		else {
			System.out.println("logged in successfully...");
		}
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}

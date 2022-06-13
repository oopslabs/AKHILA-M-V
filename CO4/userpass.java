package CO4;
import java.util.*;
class excep1 extends Exception{
	excep1(String msg){
		super(msg);
	}
}
public class userpass {
public static void main(String [] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter user name :");
	String uname=s.nextLine();
	System.out.println("enter password :");
	String pass=s.nextLine();
	try {
		if(uname.length()<8)
		{
			throw new excep1("username length low");
		}
		else if(pass.length()<8)
		{
			throw new excep1("password length low");
		}
		else
		{
			System.out.println("login successfully");
		}
	}catch(excep1 e){
		System.out.println(e.getMessage());
	}
	
}
}

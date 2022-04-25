package CO1;
import java.util.Scanner;
public class complexadd {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int real,real1,real2,img,img1,img2;
		System.out.println("Enter the real part of first complex number:");
		real1=s.nextInt();
		System.out.println("Enter the imaginary part of first complex number:");
		img1=s.nextInt();
		System.out.println("Enter the real part of second complex number:");
		real2=s.nextInt();
		System.out.println("Enter the imaginary part of second complex number:");
		img2=s.nextInt();
		
		System.out.println("First complex number:"+real1+"+"+img1+"i");
		System.out.println("Second complex number:"+real2+"+"+img2+"i");
		
		real=real1+real2;
		img=img1+img2;
		
		System.out.println("Sum of two complex numbers:"+real+"+"+img+"i");
		
	}

}

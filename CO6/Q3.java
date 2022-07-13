package co6;
import java.io.*;
import java.util.*;
public class Q3 {
public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter file name1: ");
		String f1=sc.nextLine();
		System.out.println("Enter file name2: ");
		String f2=sc.nextLine();
		FileWriter fw=new FileWriter(f2,true);
		FileReader fr=new FileReader(f1);
		
		int c;
		while((c=fr.read())!=-1)
		{
			fw.write(c);
		}
		System.out.println("file1 copied to file2");
		fw.close();
		fr.close();
}
}

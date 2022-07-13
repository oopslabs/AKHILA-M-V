package co6;
import java.io.*;
public class Q2 {
public static void main(String args[]) {
	try {
		FileWriter fw=new FileWriter("E:/MCA 2021-23/record/file",true);
		fw.write("hello Akku\n hy dear");
		fw.close();
		
		FileReader fr=new FileReader("E:/MCA 2021-23/record/file");
		BufferedReader br=new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		fr.close();
	}catch(Exception e) {
		System.out.println("Error occured....");
	}
}
}

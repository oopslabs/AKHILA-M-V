package co6;
import java.io.*;
public class Q4 {
public static void main(String[] args) throws Exception {
	FileInputStream fr=new FileInputStream("E:/MCA 2021-23/record/file.txt");
	FileOutputStream fwe=new FileOutputStream("E:/MCA 2021-23/record/even.txt");
	FileOutputStream fwo=new FileOutputStream("E:/MCA 2021-23/record/odd.txt");
	int c;
	while((c=fr.read())!=-1)
		{
		if(c%2==0)
			fwe.write(c);
		else
			fwo.write(c);
		}
	fr.close();
	fwe.close();
	fwo.close();
}
}

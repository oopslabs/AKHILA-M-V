package co6;
import java.io.*;
public class Q1 {
	public static void main(String[] args) {
		File f1=new File("E:/MCA 2021-23/S2 MCA");
		String[] list=f1.list();
		for(String str: list)
			System.out.println(str);
			
	}

}


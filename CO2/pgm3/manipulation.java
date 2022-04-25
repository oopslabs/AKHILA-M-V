package CO2;
import java.util.*;
public class manipulation {
public static void main(String [] args){
Scanner s=new Scanner(System.in);
String str1,str2,ch;
int num;
System.out.println("Enter a word:");
str1 = s.nextLine();
System.out.println("Capitalized word:"+str1.toUpperCase());
System.out.println("Word in small letters:"+str1.toLowerCase());
System.out.println("First letter of the word:"+str1.charAt(0));
System.out.println("Enter another word:");
str2 = s.nextLine();
System.out.println("concatination of two words:"+str1.concat(str2));
System.out.println("comparison of two words:"+str1.compareTo(str2));
System.out.println("Enter a index number:");
num=s.nextInt();
System.out.println("letter at the given position:"+str1.charAt(num));
System.out.println("Enter a letter:");
s.nextLine();
ch=s.nextLine();
System.out.println("index number of the given letter:"+str1.indexOf(ch));
}
}

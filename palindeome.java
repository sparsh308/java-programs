package project;
import java.util.Scanner;
public class palindeome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s;
		s=sc.nextLine();//string input
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();//reverse method of string buffer class
        String s2=new String(sb.toString());//conversion of stringbuffer to string
        if(s.equalsIgnoreCase(s2))
        {
        	System.out.println("palindrome");
        }
        else
        	System.out.println("not palindrome");
	}//main
}//class

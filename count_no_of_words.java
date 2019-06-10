package project;
import java.util.Scanner;
public class count_no_of_words {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1;
		int c=0;
	   System.out.print("enter the string ");
	   s1=sc.nextLine();
	   for(int i=0;i<s1.length();i++)//for loop
	   {
		   if(s1.charAt(i)!=' '&& s1.charAt(i+1)==' ')//condition to check for spaces
		   {
			   c=c+1;
		   }
	   }
	   if(s1.charAt(s1.length()-1)==' ')
		System.out.println("total number of words are "+ c);
	   else
		   System.out.println("total number of words are "+ (c+1));
	}//main
}//class

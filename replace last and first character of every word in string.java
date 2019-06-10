package project;
import java.util.Scanner;
public class replace {
	public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    String str=sc.nextLine();
    char word[]=str.toCharArray();//conversion of string to array
    for(int i=0,j=0;i<word.length;i++)//for loop
    {
    	if(word[i]==' '||word[i]=='.')//condition to check if word at i is spaces of dot
    	{
    		char temp=word[i-1];
    		word[i-1]=word[j];
    		word[j]=temp;
    		j=i+1;
    	}
    }
    str=String.valueOf(word);
    System.out.println(str);
	}//main
}//class

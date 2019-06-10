package project;
import java.util.Scanner;
public class search{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter size. : ");
		int a=in.nextInt(),d=0;
		int b[]=new int[a];
		for(int i=0;i<a;i++)
		{
			b[i]=in.nextInt();//input of element in array
		}
		System.out.print("\nEnter key to search : ");
		int c=in.nextInt();//inputing of key to found
		for(int i=0;i<a;i++)
		{
			if (c==b[i])//condition to check key in array
			{
				  if(d==0)
				  {
					  System.out.print("\n\nKey is present in the given array\nIndex where the values are preent are : ");
					  d=1;
				  }
				  System.out.print(i+",");
			}
		}
		if(d==0)//check if key not found
			System.out.println("\n\nNot present in the givenarray");		
	}//main
}//class

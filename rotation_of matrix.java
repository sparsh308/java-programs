package project;
import java.util.Scanner;
public class rotation {
public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter size. for matrix : ");
		int a=in.nextInt();
		if(a<2||a>10)
		{
			System.out.println("\nInvalid choice of matrix ");
			System.exit(0);
		}
		int b[][]=new int[a][a];
		for(int i=0;i<a;i++)
		{
			for(int k=0;k<a;k++)
			{
				System.out.print("a["+(i+1)+"]["+(k+1)+"] : ");
				b[i][k]=in.nextInt();
			}
		}
		System.out.println("\nOriginal Matrix is :- \n");                                                      
		for(int i=0;i<a;i++)
		{
			for(int k=0;k<a;k++)
			{
				System.out.print(b[i][k]+"  ");
			}
			System.out.print("\n");
		}
		System.out.println("\nAfter rotating matrix 90 degree :- \n");  
		int d[][]=new int[a][a];
		for(int i=0;i<a;i++)
		{
			for(int k=0;k<a;k++)
			{
				d[k][a-1-i]=b[i][k];
			}
		}
		for(int i=0;i<a;i++)
		{
			for(int k=0;k<a;k++)
			{
				System.out.print(d[i][k]+"  ");
			}
			System.out.print("\n");
		}
		System.out.println("\n\nSum of corners of a matrix are :- \n"+(b[0][0]+b[0][a-1]+b[a-1][0]+b[a-1][a-1]));  
	}//main
}//class

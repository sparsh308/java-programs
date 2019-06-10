package project;
import java.util.Scanner;
public class jagged {
	public static void main(String[] args) {  
        int rows,n,i,j ,k;
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the number of row you want");
         k=sc.nextInt();//input of row count
            int a[][]=new int[k][];
            for(i=0;i<k;i++)
            {
            System.out.println("enter the no of columns in row no "+(i+1));
            n=sc.nextInt();//input of col count
            a[i]=new int[n];
            }
            System.out.println("enter the elements of array");
            for(i=0;i<k;i++) 
          {
        	 for(j=0;j<a[i].length;j++)
        	 {
        		 a[i][j]=sc.nextInt();//elements of array
        	 }
           }
            System.out.println("OUTPUT" );
            for(i=0;i<k;i++) 
          {
        	 for(j=0;j<a[i].length;j++)
        	 {
        		System.out.print(a[i][j]+" ");//printing the result
        	 }
        	 System.out.println("\n");
          }
        }//main
	}//class

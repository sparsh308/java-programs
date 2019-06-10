package advance;

import java.util.Scanner;

class hihi{  
synchronized void printTable(){
	 System.out.println("enter the no of which you want table");
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();//method not synchronized  
   for(int i=1;i<=10;i++){  
     System.out.println(n*i);  
     try{  
      Thread.sleep(400);  
     }catch(Exception e){System.out.println(e);}  
   }
}
}
class cook1 implements Runnable
{
	private hihi n;
	cook1(hihi n)
	{
		this.n=n;
	}
	 public void run()
	{
		
		 
		n.printTable();
	}
}


public class table
{
public static void main(String args[])
{
	hihi h=new hihi();
	Thread t2=new Thread(new cook1(h));
	Thread t1=new Thread(new cook1(h));
	 t1.setName("sparsh1");
     t2.setName("thread 2");
	     t1.start();
	     t2.start();
	    
	
}
}
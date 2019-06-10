package advance;
import java.io.*;
//example of file handling.. this code check all the vowel in file and save them to another file .. 
public class filehandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileWriter fout=null;
		FileReader din=null;
		char  ch1[]=new char[100],ch = ' ';
		int k;
		try {
		din=new FileReader("D://Desktop/sparsh1.txt");
		fout=new FileWriter("D://Desktop/sparsh2.txt");
		int	i=0;
		while((k= din.read())!=-1)
			ch=(char)k;
		ch1[i]=ch;
		i++;
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			fout.write(ch);
			System.out.print(ch);
		}
     
	

	
		}
		catch (IOException e) {
			// TODO: handle exception
		
		System.out.println("file not found");
		}
		for(int j=0;j<ch1.length;j++)
		{
			System.out.print(ch1[j]);
		}
		
	fout.close();
	din.close();
		
	}
}

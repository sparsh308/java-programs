package advance;
import java.io.*;
import java.net.*;
//operational only with server code   ....example of socket programming
public class client {

	public static void main(String[] args)throws Exception {


			
				// TODO Auto-generated method stub
				String ip="localhost";
				int port=9999;
		      Socket s=new Socket(ip,port);
		      
		      String str=(java.time.LocalTime.now()).toString(); 
		      OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());
		  
		      PrintWriter out=new PrintWriter(os);
		      os.write(str);
		      os.flush();
		      os.close();
		      
			}
}
	

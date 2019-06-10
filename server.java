package advance;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.zip.InflaterInputStream;

public class server {
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.out.println("server is started");
		ServerSocket ss=new ServerSocket(9999);
		
      System.out.println("server is waiting");
      Socket s=ss.accept();
      System.out.println("server is connected");
     BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
      String str=br.readLine();
      System.out.println(str);
      
}

}



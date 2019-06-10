package advance;
import javax.swing.*;
import java.awt.event.*;
public class swig extends JFrame implements ActionListener{

	 
	 JButton b1;
	 JLabel l1,l3;
	 JPanel p1;
	public JTextField t1,t3;
	 swig()
	 {
		 
	 }
	 swig(String s)
	 {
		 super(s);
	 }
	 public void setcomponent()
	 {
		 p1=new JPanel();
	 l1=new JLabel("enter the string");
	
	 t1=new JTextField(20);
	// l2=new JLabel("second no");
	// t2=new JTextField(20);
	 l3=new JLabel();
	 b1=new JButton("check");

	 b1.addActionListener(this);
	 p1.add(b1);
	p1. add(l1);
	// p1.add(l2);
	 p1.add(l3);
	p1. add(t1);
//	p1. add(t2);
	 //p1.add(l2);
	add(p1);
	 }
	
		 public void actionPerformed(ActionEvent e)
		 {
			 
		String str=t1.getText();
		StringBuffer br=new StringBuffer(str);
		br.reverse();
		String ss=br.toString();
		if(ss.equalsIgnoreCase(str))
		{
			l3.setText("yes its pal bro");
		}
		else
		{
			l3.setText("no bro its not");
		}
		 }
	
	 public static void main(String[] args) {
			
			swig jf=new swig("addtion by sparsh308 ");
			jf.setcomponent();
			jf.setSize(1000, 1000);
			jf.setVisible(true);
			jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		

		}
}

	


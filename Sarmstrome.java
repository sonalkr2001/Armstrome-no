import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Sarmstrome implements ActionListener  
{
  JFrame fr;
  JLabel l1,l2;
  JTextField t1;
  JButton b1,b2;
  int n,n1,r=0,s=0;
  String st;
  Sarmstrome()
  {
    fr=new JFrame("CHECK ARMSTROME");
	l1=new JLabel("Enter any no");
	l2=new JLabel();
	t1=new JTextField();
	b1=new JButton("CHECK");
	b2=new JButton("CLEAR");
	fr.setBackground(Color.YELLOW);
	fr.add(l1);
	fr.add(l2);
	fr.add(b1);
	fr.add(b2);
	fr.add(t1);
	l1.setBounds(20,20,100,20);
	l2.setBounds(40,60,160,20);
	t1.setBounds(140,20,100,20);
	b1.setBounds(60,100,80,20);
	b2.setBounds(160,100,80,20);
	fr.setBounds(40,40,300,200);
	fr.setResizable(false);
	fr.setLayout(null);
	fr.setVisible(true);
	b1.addActionListener(this);
	b2.addActionListener(this);
	fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		n=Integer.valueOf(t1.getText());
			
		if(e.getSource()==b1);
		{
			n1=n;
			while(n>0)
		   {
			r=n%10;
			s=s+(r*r*r);
			n=n/10;
		   }
		   if(n1==s)
			   st="no is Armstrome";
		   else
			   st="no is not Armstrome";
		   l2.setText(String.valueOf(st));
		}
		if(e.getSource()==b2)
		{
			l2.setText("");
			t1.setText("");
			n1=0;
			s=0;
			r=0;
		}
	}
		
  public static void main(String ar[])
  {
    new Sarmstrome();
  }
 }
 
	

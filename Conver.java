import java.awt.*;
import java.awt.BorderLayout;
import javax.swing.border.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.lang.*;
public class Conver extends JFrame implements ActionListener
{	
		String s1="",s2="",s3;
		double x,y,z;
		public JFrame f=new JFrame("Conversion Table");
		DefaultListModel<String> history;
		JList his;
		Border border=BorderFactory.createLineBorder(Color.red,2);
		Border border1=BorderFactory.createLineBorder(Color.green,2);
		Border border2=BorderFactory.createLineBorder(Color.black,2);
		JComboBox cb2;
		JPanel p1,p2;
		JLabel head,warn;
		JComboBox cb1;
		JButton b=new JButton("CALCULATE");
		JButton cl=new JButton("CLEAR");
		JButton sh=new JButton("SHOW HISTORY");
		JButton hh=new JButton("HIDE HISTORY");
		JTextField t1;
		JLabel l=new JLabel();
		String[] s={"OUNCE","POUNDS","KG","G","MG"};
		Color c=new Color(211,211,211);
		Conver()
		{
			JLabel hist=new JLabel("HISTORY",SwingConstants.CENTER);
			p2=new JPanel(new BorderLayout());
			hist.setForeground(Color.red);
			hist.setFont(new Font("Sans-serif", Font.BOLD, 20));
			hist.setBorder(new BevelBorder(BevelBorder.RAISED,Color.black,Color.black,Color.black,Color.black));
			hist.setBounds(50,510,120,30);
			history=new DefaultListModel();
			his=new JList(history);
			his.setFont(new Font("Sans-serif",Font.BOLD,15));
			JScrollPane scroll = new JScrollPane(his);
			f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			//f.getContentPane().setBackground(c);
			f.setContentPane(new JLabel(new ImageIcon("D:/057b2be2e40c928f071a47a50769cdf6.jpg")));
			his.setBorder(new BevelBorder(BevelBorder.RAISED,Color.black,Color.black,Color.black,Color.black));
			DefaultListCellRenderer renderer =(DefaultListCellRenderer)his.getCellRenderer();
        	renderer.setHorizontalAlignment(JLabel.CENTER);
			f.add(hist);
			p2.setBounds(50,550,450,350);
			p2.setBackground(Color.white);
			JScrollPane scrollPane = new JScrollPane();
		    scrollPane.setViewportView(his);
		    his.setLayoutOrientation(JList.VERTICAL);
			p2.add(scrollPane);
			f.add(p2);
			cb2=new JComboBox(s);
			cb1=new JComboBox(s);       
			t1=new JTextField();
			Color co=new Color(255,255,255);
			JLabel ques=new JLabel("Please Enter the Value Below",SwingConstants.CENTER);
			ques.setForeground(Color.black);
			ques.setBorder(new BevelBorder(BevelBorder.LOWERED,Color.white,Color.white,Color.white,Color.white));
			ques.setBounds(120,60,300,30);
			ques.setFont(new Font("Sans-serif",Font.BOLD,15));
			f.add(ques);
			head=new JLabel("CONCULATOR",JLabel.CENTER);
			head.setForeground(Color.black);
			head.setFont(new Font("Felix Titling",Font.BOLD,20));
			warn=new JLabel();
			warn.setBackground(Color.white);
			warn.setBorder(new BevelBorder(BevelBorder.RAISED,Color.white,Color.white,Color.white,Color.white));
			warn.setFont(new Font("Sans-serif",Font.BOLD,15));
			warn.setBounds(120,300,300,30);
			f.add(warn);
			p1=new JPanel();
			p1.setBounds(0,0,550,50);
			p1.setBackground(co);
			p1.setBorder(border2);
			f.add(p1);
			p1.add(head);
			t1.setBounds(200,110,150,30);
			t1.setBorder(new BevelBorder(BevelBorder.RAISED,Color.black,Color.black,Color.black,Color.black));
			f.add(t1);
			l.setBackground(Color.white);
			l.setOpaque(true);
			l.setBorder(new BevelBorder(BevelBorder.RAISED,Color.black,Color.black,Color.black,Color.black));
			l.setFont(new Font("Sans-serif", Font.BOLD, 15));
			l.setBounds(120,250,300,40);
			f.add(l);
			cb1.setBounds(80,160,150,30);
			cb1.setBorder(new BevelBorder(BevelBorder.RAISED,Color.white,Color.white,Color.white,Color.white));
			f.add(cb1);
			cb2.setBounds(300,160,150,30);
			cb2.setBorder(new BevelBorder(BevelBorder.RAISED,Color.white,Color.white,Color.white,Color.white));
			f.add(cb2);
			b.setBounds(89,400,150,30);
			b.setBorder(new BevelBorder(BevelBorder.RAISED,Color.black,Color.black,Color.black,Color.black));
			b.setFont(new Font("Sans-serif", Font.BOLD, 15));
			b.addActionListener(this);
			f.add(b);
			sh.setBounds(300,400,200,30);
			sh.setBorder(new BevelBorder(BevelBorder.RAISED,Color.black,Color.black,Color.black,Color.black));
			sh.setFont(new Font("Sans-serif", Font.BOLD, 15));
			sh.addActionListener(this);
			f.add(sh);
			hh.setBounds(300,450,200,30);
			hh.setBorder(new BevelBorder(BevelBorder.RAISED,Color.black,Color.black,Color.black,Color.black));
			hh.setFont(new Font("Sans-serif", Font.BOLD, 15));
			hh.addActionListener(this);
			f.add(hh);
			cl.setBounds(300,920,150,30);
			cl.setBorder(new BevelBorder(BevelBorder.RAISED,Color.black,Color.black,Color.black,Color.black));
			cl.setFont(new Font("Sans-serif", Font.BOLD, 15));
			cl.addActionListener(this);
			f.add(cl);
			f.setSize(565,545);
			f.setLayout(null);
			f.setResizable(false);
			f.setVisible(true);
		}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==b)
			{
					t1.setBorder(border1);
					warn.setBorder(border1);
					l.setBorder(border1);
					s1="";
					s2="";
				s1+=cb1.getItemAt(cb1.getSelectedIndex());
				s2+=cb2.getItemAt(cb2.getSelectedIndex());
				if((t1.getText()).isEmpty())
					{
						t1.setBorder(border);
						warn.setBorder(border);
						l.setBorder(border);
						l.setText("                  Please Enter the input");
						warn.setText(" Input should be in number Format Only");
					}
				else
					{
					try
					{

				if(s1.equals("KG")&&s2.equals("G"))
				{
					x=Double.parseDouble(t1.getText());
					warn.setText("1 KG == 1000 G");
					z=x*1000;
					s3=String.valueOf(z);
					l.setText(s3);
					history.addElement(t1.getText()+" KG == "+s3+" G");
				}
				if(s1.equals("KG")&&s2.equals("MG"))
				{
					x=Double.parseDouble(t1.getText());
					warn.setText("1 KG == 1000000 MG");
					z=x*1000000;
					s3=String.valueOf(z);
					l.setText(s3);
					history.addElement(t1.getText()+" KG == "+s3+" MG");
				}
				if(s1.equals("KG")&&s2.equals("POUNDS"))
				{
					x=Double.parseDouble(t1.getText());
					warn.setText("1 KG == 2.205 POUNDS");
					z=x*2.205;
					s3=String.valueOf(z);
					l.setText(s3);
					history.addElement(t1.getText()+" KG == "+s3+" POUNDS");
				}
				if(s1.equals("KG")&&s2.equals("OUNCE"))
				{
					x=Double.parseDouble(t1.getText());
					warn.setText("1 KG == 35.274 OUNCE");
					z=x*35.274;
					s3=String.valueOf(z);
					l.setText(s3);
					history.addElement(t1.getText()+" KG == "+s3+" OUNCE");
				}
				if(s1.equals("G")&&s2.equals("KG"))
				{
					x=Double.parseDouble(t1.getText());
					warn.setText("1 G == 0.001 G");
					z=x*0.001;
					s3=String.valueOf(z);
					l.setText(s3);
					history.addElement(t1.getText()+" G == "+s3+" KG");
				}
				if(s1.equals("G")&&s2.equals("MG"))
				{
					x=Double.parseDouble(t1.getText());
					warn.setText("1 G == 1000 MG");
					z=x*1000;
					s3=String.valueOf(z);
					l.setText(s3);
					history.addElement(t1.getText()+" G == "+s3+" MG");
				}
				if(s1.equals("G")&&s2.equals("POUNDS"))
				{
					x=Double.parseDouble(t1.getText());
					warn.setText("1 G == 0.00220462 POUNDS");
					z=x*0.00220462;
					s3=String.valueOf(z);
					l.setText(s3);
					history.addElement(t1.getText()+" G == "+s3+" POUNDS");
				}
				if(s1.equals("G")&&s2.equals("OUNCE"))
				{
					x=Double.parseDouble(t1.getText());
					warn.setText("1 G == 0.035274 OUNCE");
					z=x*0.035274;
					s3=String.valueOf(z);
					l.setText(s3);
					history.addElement(t1.getText()+" G == "+s3+" OUNCE");
				}
				if(s1.equals("MG")&&s2.equals("KG"))
				{
					x=Double.parseDouble(t1.getText());
					warn.setText("1 MG == 0.000001 KG");
					z=x*0.000001;
					s3=String.valueOf(z);
					l.setText(s3);
					history.addElement(t1.getText()+" MG == "+s3+" KG");
				}
				if(s1.equals("MG")&&s2.equals("G"))
				{
					x=Double.parseDouble(t1.getText());
					warn.setText("1 MG == 0.001 G");
					z=x*0.001;
					s3=String.valueOf(z);
					l.setText(s3);
					history.addElement(t1.getText()+" MG == "+s3+" G");
				}
				if(s1.equals("MG")&&s2.equals("POUNDS"))
				{
					x=Double.parseDouble(t1.getText());
					warn.setText("1 MG == 2.2046E-6 POUNDS");
					z=x*2.2046*0.000001;
					s3=String.valueOf(z);
					l.setText(s3);
					history.addElement(t1.getText()+" MG == "+s3+" POUNDS");
				}
				if(s1.equals("MG")&&s2.equals("OUNCE"))
				{
					x=Double.parseDouble(t1.getText());
					warn.setText("1 MG == 3.5274E-5 OUNCE");
					z=x*3.5274*0.00001;
					s3=String.valueOf(z);
					l.setText(s3);
					history.addElement(t1.getText()+" MG == "+s3+" OUNCE");
				}
				if(s1.equals("POUNDS")&&s2.equals("KG"))
				{
					x=Double.parseDouble(t1.getText());
					warn.setText("1 POUND == 0.453292 KG");
					z=x*0.453292;
					s3=String.valueOf(z);
					l.setText(s3);
					history.addElement(t1.getText()+" POUNDS == "+s3+" KG");
				}
				if(s1.equals("POUNDS")&&s2.equals("MG"))
				{
					x=Double.parseDouble(t1.getText());
					warn.setText("1 POUND == 453292 MG");
					z=x*453292;
					s3=String.valueOf(z);
					l.setText(s3);
					history.addElement(t1.getText()+" POUNDS == "+s3+" MG");
				}
				if(s1.equals("POUNDS")&&s2.equals("G"))
				{
					x=Double.parseDouble(t1.getText());
					warn.setText("1 POUND == 453.292 G");
					z=x*453.592;
					s3=String.valueOf(z);
					l.setText(s3);
					history.addElement(t1.getText()+" POUNDS == "+s3+" G");
				}
				if(s1.equals("POUNDS")&&s2.equals("OUNCE"))
				{
					x=Double.parseDouble(t1.getText());
					warn.setText("1 POUND == 16 OUNCE");
					z=x*16;
					s3=String.valueOf(z);
					l.setText(s3);
					history.addElement(t1.getText()+" POUNDS == "+s3+" OUNCE");
				}
				if(s1.equals("OUNCE")&&s2.equals("KG"))
				{
					x=Double.parseDouble(t1.getText());
					warn.setText("1 OUNCE == 0.283495 KG");
					z=x*0.0283495;
					s3=String.valueOf(z);
					l.setText(s3);
					history.addElement(t1.getText()+" OUNCE == "+s3+" KG");
				}
				if(s1.equals("OUNCE")&&s2.equals("G"))
				{
					x=Double.parseDouble(t1.getText());
					warn.setText("1 OUNCE == 28.3495 G");
					z=x*28.3495;
					s3=String.valueOf(z);
					l.setText(s3);
					history.addElement(t1.getText()+" OUNCE == "+s3+" G");
				}
				if(s1.equals("OUNCE")&&s2.equals("MG"))
				{
					x=Double.parseDouble(t1.getText());
					warn.setText("1 OUNCE == 28349.5 MG");
					z=x*28349.5;
					s3=String.valueOf(z);
					l.setText(s3);
					history.addElement(t1.getText()+" OUNCE == "+s3+" MG");
				}
				if(s1.equals("OUNCE")&&s2.equals("POUNDS"))
				{
					x=Double.parseDouble(t1.getText());
					warn.setText("1 OUNCE == 0.0625 POUNDS");
					z=x*0.0625;
					s3=String.valueOf(z);
					l.setText(s3);
					history.addElement(t1.getText()+" OUNCE == "+s3+" POUNDS");
				}
				if(s1.equals(s2))
				{
					x=Double.parseDouble(t1.getText());
					warn.setText("1 "+s1+" == 1 "+s1);
					z=x;
					s3=String.valueOf(z);
					l.setText(s3);
					history.addElement(t1.getText()+" "+s1+" == "+s3+" "+s1);
				}
			}
			catch(Exception e1)
			{
				l.setText("               Please Enter Valid Input");
				t1.setBorder(border);
				warn.setBorder(border);
				l.setBorder(border);
				warn.setText(" Input should be in number Format Only");
			}
		}
}
	else if(e.getSource()==cl)
	{
		history.clear();
	}
	else if(e.getSource()==sh)
	{
		f.setSize(565,1200);
	}
	else if(e.getSource()==hh)
	{
		f.setSize(565,545);
	}
}
		public static void main(String[] args) {
			new Conver();
		}
}
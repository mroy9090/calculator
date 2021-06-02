import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test implements ActionListener{
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bc,beq,ba,bs,bm,bd;
	JTextField tx;
	int a,b,flag=0;
	float temp=0;
	Test(){
		JFrame jf=new JFrame("swing calculator");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tx=new JTextField();
		JPanel jp=new JPanel();
		JPanel jp1=new JPanel(new GridLayout(4,4));
		FlowLayout fl=new FlowLayout(FlowLayout.LEFT);
		Dimension dim = new Dimension(65,30);
		b0=new JButton("0");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		bc=new JButton("C");
		beq=new JButton("=");
		ba=new JButton("+");
		bs=new JButton("-");
		bm=new JButton("*");
		bd=new JButton("/");
		jf.setSize(300,210);
		b7.setPreferredSize(dim); b8.setPreferredSize(dim); b9.setPreferredSize(dim); ba.setPreferredSize(dim); b4.setPreferredSize(dim); b5.setPreferredSize(dim); b6.setPreferredSize(dim); bs.setPreferredSize(dim); b1.setPreferredSize(dim); b2.setPreferredSize(dim); b3.setPreferredSize(dim); bm.setPreferredSize(dim); bc.setPreferredSize(dim); b0.setPreferredSize(dim); beq.setPreferredSize(dim); bd.setPreferredSize(dim);
		
		//jp.add(tx,BorderLayout.NORTH);
		jf.add(tx,BorderLayout.NORTH);
		jp.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		jp.add(b7); jp.add(b8); jp.add(b9); jp.add(ba); jp.add(b4); jp.add(b5); jp.add(b6); jp.add(bs); jp.add(b1); jp.add(b2); jp.add(b3); jp.add(bm); jp.add(bc); jp.add(b0); jp.add(beq); jp.add(bd);
		jp.setLayout(fl);
		jf.add(jp);
		jf.setVisible(true);
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bc.addActionListener(this);
		beq.addActionListener(this);
		ba.addActionListener(this);
		bs.addActionListener(this);
		bm.addActionListener(this);
		bd.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b0) {
			tx.setText(tx.getText().concat("0"));
		}
		if(e.getSource()==b1) {
			tx.setText(tx.getText().concat("1"));
			
		}
		if(e.getSource()==b2) {
			tx.setText(tx.getText().concat("2"));
		}
		if(e.getSource()==b3) {
			tx.setText(tx.getText().concat("3"));
		}
		if(e.getSource()==b4) {
			tx.setText(tx.getText().concat("4"));
		}
		if(e.getSource()==b5) {
			tx.setText(tx.getText().concat("5"));
		}
		if(e.getSource()==b6) {
			tx.setText(tx.getText().concat("6"));
		}
		if(e.getSource()==b7) {
			tx.setText(tx.getText().concat("7"));
		}
		if(e.getSource()==b8) {
			tx.setText(tx.getText().concat("8"));
		}
		if(e.getSource()==b9) {
			tx.setText(tx.getText().concat("9"));
		}
		if(e.getSource()==bc) {
			tx.setText("");
		}
		if(e.getSource()==ba) {
			a=Integer.parseInt(tx.getText());
			tx.setText("");
			flag=1;
		}
		
		if(e.getSource()==bs) {
			a=Integer.parseInt(tx.getText());
			tx.setText("");
			flag=2;
		}
		if(e.getSource()==bm) {
			a=Integer.parseInt(tx.getText());
			tx.setText("");
			flag=3;
		}
		if(e.getSource()==bd) {
			a=Integer.parseInt(tx.getText());
			tx.setText("");
			flag=4;
		}
		if(e.getSource()==beq) {
			
			b=Integer.parseInt(tx.getText());
			switch(flag) {
			case 1:
				temp=a+b;
				tx.setText(""+temp);
				break;
			case 2:
				temp=a-b;
				tx.setText(""+temp);
				break;
			case 3:
				temp=a*b;
				tx.setText(""+temp);
				break;
			case 4:
				temp=((float)a)/((float)b);
				tx.setText(""+temp);
				break;
			
			}
		}
	}
	
	
	public static void main(String[] args) {
		Test t=new Test();
		
	}
}

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;


public class Calc extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4,b5;
	JTextField t1,t2,t3;
	JLabel l1,l2,l3;

	public Calc()
	{
		setLayout(null);
		setContentPane(new JLabel(new ImageIcon("images/calc.png")));
		
		l1 = new JLabel("Enter 1 no.");
		l2 = new JLabel("Enter 2 no.");
		l3 = new JLabel("Your Ans");
		l1.setBounds(100,100,110,30);
		l2.setBounds(100,150,110,30);
		l3.setBounds(100,200,110,30);
		l1.setFont(new Font("verdana",Font.BOLD,20));
		l2.setFont(new Font("verdana",Font.BOLD,20));
		l3.setFont(new Font("verdana",Font.BOLD,20));
		l1.setForeground(Color.blue);
		l2.setForeground(Color.blue);
		l3.setForeground(Color.blue);
		add(l1);
		add(l2);
		add(l3);

		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t1.setFont(new Font("verdana",Font.PLAIN,20));
		t2.setFont(new Font("verdana",Font.PLAIN,20));
		t3.setFont(new Font("verdana",Font.PLAIN,20));
		t1.setBounds(220,100,150,30);
		t2.setBounds(220,150,150,30);
		t3.setBounds(220,200,150,30);
		add(t1);
		add(t2);
		add(t3);


		b1 = new JButton(new ImageIcon("images/add.png"));
		b2 = new JButton(new ImageIcon("images/minus.png"));
		b3 = new JButton(new ImageIcon("images/multiply.png"));
		b4 = new JButton(new ImageIcon("images/divide.png"));
		b5 = new JButton(new ImageIcon("images/reset.png"));

		b1.setFont(new Font("verdana",Font.BOLD,16));
		b2.setFont(new Font("verdana",Font.BOLD,16));
		b3.setFont(new Font("verdana",Font.BOLD,16));
		b4.setFont(new Font("verdana",Font.BOLD,16));
		b5.setFont(new Font("verdana",Font.BOLD,16));

		b1.setBounds(220,250,110,40);
		b2.setBounds(340,250,110,40);
		b3.setBounds(460,250,110,40);
		b4.setBounds(580,250,110,40);
		b5.setBounds(700,250,110,40);

		b1.addActionListener(this);		
		b2.addActionListener(this);		
		b3.addActionListener(this);		
		b4.addActionListener(this);		
		b5.addActionListener(this);		

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
	
		setSize(1366,768);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b5)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
		else
		{
			try
			{
			float a = Float.parseFloat(t1.getText());
			float b = Float.parseFloat(t2.getText());
			float c=0;
	
			if(ae.getSource()==b1)
			{
				c = a + b;
				t3.setText(""+c);
			}

			if(ae.getSource()==b2)
			{
				c = a - b;
				t3.setText(""+c);
			}

			if(ae.getSource()==b3)
			{
				c = a * b;
				t3.setText(""+c);
			}

			if(ae.getSource()==b4)
			{
				c = a / b;
				t3.setText(""+c);
			}

			}
			catch(Exception e)
			{
			JOptionPane.showMessageDialog(this,"Warning! invalid input");
			}
		}
	}

	public static void main(String args[])
	{
		new Calc();
	}
}


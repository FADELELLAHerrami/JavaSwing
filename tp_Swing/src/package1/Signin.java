package package1;
import java.awt.BorderLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Signin extends JFrame {
		//declaration

		private JLabel lbl1;
	
		private JButton btn1,btn2;
	
		public Signin() {
		setTitle("Signin");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(300,300);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
	
		//ceation
		lbl1=new JLabel("Mouhcine el moudir");
		btn1=new JButton("clic clickk");
		btn2=new JButton("deuxime botton");
		
		//placement
		
		
		//add
		add(btn1,BorderLayout.NORTH);
		add(btn2,BorderLayout.SOUTH);
		add(lbl1,BorderLayout.CENTER);
		
		setVisible(true);
		
	}
	
}

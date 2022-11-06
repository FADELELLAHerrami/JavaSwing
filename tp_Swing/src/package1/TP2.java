package package1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TP2 extends JFrame implements ActionListener {
	// declaration

	private JPanel jp1;
	private JButton btn1, btn2, btn3;

	public TP2() {
		setTitle("Signin");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(new BorderLayout());

		jp1 = new JPanel();
		btn1 = new JButton("errami");
		btn2 = new JButton("errami1");

		jp1.setLayout(new FlowLayout());
		add(btn1, BorderLayout.NORTH);
		add(btn2, BorderLayout.SOUTH);
		add(jp1, BorderLayout.CENTER);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
		}

	}
}
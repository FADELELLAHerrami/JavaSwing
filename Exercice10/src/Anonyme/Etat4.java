package Anonyme;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.*;

public class Etat4 extends JFrame {
	JButton btn;
	JTextField text;
	JTextArea area;

	public Etat4() {
		setTitle("ajouter un evenement par une classe interne");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		setLayout(new GridLayout(20, 1));
		btn = new JButton("ok");
		add(btn);

		text = new JTextField("Question ?");
		area = new JTextArea(18, 1);
		add(text, 1, 1);
		// stext.addFocusListener(this);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String text1 = text.getText();
				area.setText(text1);
			}
		});
		add(btn, 1, 1);
		add(area);
		text.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					String text1 = text.getText();
					area.setText(text1);
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

		});
		area.setBackground(Color.ORANGE);
		setVisible(true);
	}
	public static void main(String[]args) {
		new Etat4();
	}

}

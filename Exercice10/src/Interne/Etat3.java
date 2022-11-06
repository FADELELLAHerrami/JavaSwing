package Interne;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Etat3 extends JFrame {
	JButton btn;
	JTextField text;
	JTextArea area;

	private class Interne1 implements KeyListener {
		JTextField text1;
		JTextArea area1;

		public Interne1(JTextField text2, JTextArea area2) {
			text1 = text2;
			area1 = area2;
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				String text1 = text.getText();
				area.setText(text1);
			}

		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

	}
	private class Interne2 implements ActionListener{
		JTextField text1;
		JTextArea area1;
		public Interne2(JTextField text2,JTextArea area2) {
			text1=text2;
			area1=area2;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String text1 = text.getText();
			area.setText(text1);
		}

	}

	public Etat3() {
		setTitle("ajouter un evenement par une classe interne");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		setLayout(new GridLayout(20, 1));
		btn = new JButton("ok");
		add(btn);

		text = new JTextField("Question ?");
		area = new JTextArea(18, 1);
		add(text, 1, 1);
		btn.addActionListener(new Interne2(text,area));
		add(btn, 1, 1);
		add(area);
		text.addKeyListener(new Interne1(text,area));
		area.setBackground(Color.ORANGE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Etat3();
	}
}

package ClasseExterne;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Etat2 extends JFrame  {
	JButton btn;
	JTextField text;
	JTextArea area;

	public Etat2() {
		setTitle("ajouter un evenement par une classe interne");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		setLayout(new GridLayout(20, 1));
		btn = new JButton("ok");
		add(btn);

		text = new JTextField("Question ?");
		area = new JTextArea(18, 1);
		add(text, 1, 1);
		btn.addActionListener(new Externe2(text,area));
		add(btn, 1, 1);
		add(area);
		text.addKeyListener(new Externe1(text,area));
		area.setBackground(Color.ORANGE);
		setVisible(true);
	}
	public static void main(String[]args) {
		new Etat2();
	}
}

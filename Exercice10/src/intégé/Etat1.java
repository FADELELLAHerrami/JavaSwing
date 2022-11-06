package intégé;

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

public class Etat1 extends JFrame implements ActionListener, KeyListener {
	JButton btn;
	JTextField text;
	JTextArea area;

	public Etat1() {
		setTitle("ajouter un evenement par une classe interne");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new GridLayout(20, 1));
		btn = new JButton("ok");
		add(btn);

		text = new JTextField("Question ?");
		area = new JTextArea(18, 1);
		add(text, 1, 1);
		// stext.addFocusListener(this);
		btn.addActionListener(this);
		add(btn, 1, 1);
		add(area);
		text.addKeyListener(this);
		area.setBackground(Color.ORANGE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btn) {
			String text1 = text.getText();
			area.setText(text1);
		}
	}
	@Override
	public void keyPressed(KeyEvent event) {
		// TODO Auto-generated method stub
		if (event.getKeyCode() == KeyEvent.VK_ENTER) {
			String text1 = text.getText();
			area.setText(text1);
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new Etat1();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}

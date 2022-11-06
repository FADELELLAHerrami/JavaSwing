package GestionEvenementInteger;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import EvenementEnClasseExterne.ClasseExterne;
import EvenementEnClasseExterne.Fenetre;

public class Fenetre2 extends JFrame implements ActionListener {
	JButton btn;
	int compteur = 0;
	JTextField text;
	
	public Fenetre2() {
		setTitle("Exercice 5");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(500, 500, 500, 200);
		setLayout(new FlowLayout());
		btn = new JButton("click me");
		text = new JTextField();
		JLabel label = new JLabel("Enter un text : ");
		add(label);
		add(btn);
		add(text);
		text.setPreferredSize(new Dimension(120, 30));
		btn.addActionListener(this);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn) {
			text.setText("Le click numéro :" + (++compteur));
		}
	}

	public static void main(String[] args) {
		new Fenetre2();
	}
}

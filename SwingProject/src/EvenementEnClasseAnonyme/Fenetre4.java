package EvenementEnClasseAnonyme;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Fenetre4 extends JFrame {
	JButton btn;
	int cpt;
	public Fenetre4() {
		setTitle("Exercice 5");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(500, 500, 500, 200);
		setLayout(new FlowLayout());
		btn = new JButton("click me");
		JTextField text = new JTextField();
		JLabel label = new JLabel("Enter un text : ");
		add(label);
		add(btn);
		add(text);
		text.setPreferredSize(new Dimension(120, 30));
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText("Le click numero : "+(++cpt));
			}

		});

		setVisible(true);
	}

	public static void main(String[] args) {
		new Fenetre4();
	}
}

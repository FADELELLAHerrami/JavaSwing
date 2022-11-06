package EvenementEnClasseExterne;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ClasseExterne implements ActionListener {
	private int compteur;
	private JTextField message;

	public ClasseExterne(JTextField cible) {
		message = cible;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		message.setText("nombre de cilck " + (++compteur));
	}

}

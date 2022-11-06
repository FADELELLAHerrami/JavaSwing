package ClasseExterne;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Externe2 implements ActionListener{
	JTextField text;
	JTextArea area;
	public Externe2(JTextField text1,JTextArea area1) {
		text=text1;
		area=area1;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String text1 = text.getText();
		area.setText(text1);
	}

}

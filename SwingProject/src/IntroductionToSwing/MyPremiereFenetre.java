/*
		En swing ,si on veut créer une fenetre ,on utilise un objet de la classe JFrame qui apparteint au paquettage javax.swing 
	exemple JFrame jf=new JFrame();
	et la classe JFrame contient des méthodes : * setVisible() :Pour afficher
												* setSize( , ) : pour définir les dimensions de la fenetre
												* setTitle() : pout donner un titre à notre fenetre 
												* setBounds( , , , ) :	pour définir l'emplacement et les dimensions de la fenetre
												* setBackground() :pour donner une couleur à notre fenetre 
												* getSize() : Obtenir la taille de notre fenetre
		Implementation des interfaces (Evénement):
			*MouseListener : 
					Il existe une catégorie d’événement souris qu’on peut traiter par un écouteur de souris c’est à dire un objet d’une 
				classe implémentant l’interface MouseListener
				 	Elle comporte 5 méthodes correspondant chacune à 
				un événement particulier : mousePressed, 
				mouseReleased, mouseEntered, mouseExited, 
				mouseClicked
				MouseClicked : Correspond à un click usuel
			*MouseAdapter : 
				 implémente toutes les méthodes de l’interface MouseLinstener avec un corps vide
				 Exemple :::
				 class EcouteurSouris extends MouseAdapter {
				public void mouseClicked(MouseEvent ev) { // méthode gerant un clic souris
				int x = ev.getX() ; int y = ev.getY() ;
				System.out.println ("clic au point de coordonnees " + x + ", " + y );
			}
			}
			
			*Gestion des événement en swing :
				Les classes voulant recevoir une notification d'un évènement enregistrent un écouteur auprès de la source d'évènements. 
				L'écouteur est un objet dont la classe implémente une interface particulière 
				pour traiter un évènement comportant en général une seule méthode appelée pour notifier l'évènement qui s'est produit.
			* Les conposants graphiques en swing :
					*Les étiquettes (JLabel):
					*Les champs de texte :(JTextField)
						Déclaration : 
							JtextField jtf=new JTextField("Text");
						Modification de texte :
							jtf.setText()
						Récupérer le texte :
							jtf.getText()
						Copier/Coper/coller
							jtf.copy / jtf.cut / jtf.paste()
						Donner une à notre text :
							jtf.setFont();
						Interdier de saisir :
							jtf.setEditable(false)
					*Les champs de mot de passe (JPassword):
						Déclaration :
							JPasswordField jpf =new JPasswordField();
						Récupérer le mot de passe :
							jpf.getPassword(); ou jpf.getText()
						définissez le caractère Echo pour JPasswordField.	
							jtf.setEchoChar(char c);
					*JTextField (Evénements) :
						e la catégorie Focus doivent être traités par un écouteur 
						appartenant à une classe qui implémente l’interface FocusListener et laquelle comporte 2 méthodes :
						public void focusGained(FocusEvent fe){}
						public void focusLost(FocusEvent fe){}
					*JCheckBox( )
						Déclaration :
							JCheckBox jchk =new JCheckBox();
						Checker si jchk est coché ou non : 
							jchk.isSelected();
						Cocher jchk : 
							jchk.setSelected(true);
					*JCheckBox (Evenement) : 
						Pour écouter l'événement d'un objet JCheckBox , il fault utiliser l'écouteur ItemListener ,et l'interface ItemeListenr 
						a une seule méthode itemStateChanged() 
					*Les radiobuttons (JRadioBox) :
						Déclaration :
							JRadioButton jrb =new JRadioButton();
							ButtonGroup btnGrp =new ButtonGroup();
							btnGrp.add(jrb);
						void setText(String s) : Il est utilisé pour définir le texte spécifié sur le bouton.
						String getText() : Il est utilisé pour renvoyer le texte du bouton.
						void setEnabled(boolean b) : Il est utilisé pour activer ou désactiver le bouton.
						void setIcon(Icon b) : Il est utilisé pour définir l’icône spécifiée sur le bouton.
					*LES LISTES (JList):
						JList jlist =new JList(String [] tableau);
					getSelectedIndex() : Renvoie l’index de l’élément sélectionné de la liste
					getSelectedValue() : Renvoie la valeur sélectionnée de l’élément de la liste
					getSelectedValuesList() : Renvoie une liste de tous les éléments sélectionnés.
					
						Par défaut, une boîte de liste ne possède pas de barre de défilement. On peut lui en 
					ajouter une en introduisant la liste dans un panneau de défilement1 de type JScrollPane :						
					liste.setVisibleRowCount(3) ; // seules 3 valeurs seront visibles à la fois
					
					*Les boîtes conbo (JComboBox()) :
						getSelectedIndex() : Renvoie l’index de l’élément sélectionné de la liste
						getSelectedValue() : Renvoie la valeur sélectionnée de l’élément de la liste
						en passant par addItem(Object) : cb.addItem("dimanche");
					*Les boites de messages : 
						* ShowMessageDialog() :
							Déclaration :
								JOptionPane.ShowMessageDialog("Bonjour Monsieur Fadel Ellah ERRAMI");
						* ShowConfirmDialog() :
							Déclaration :
								JOptionPane.ShowConfirmDialog("Voulez-vous Continuer");
						*ShowInputDialog() :
								JOptionPane.ShowInputDialog("Saisir un texte");
					*Image (ImageIcon) :
						Déclaration :
							ImageIcon img =new ImageIcon();
					*Menu(JMenu):
						Déclaration :
						setJMenuBar(new JMenuBar()); 
							JMenu menu = new JMenu();
					* La difference entre classe interne et classe anonyme
							La définition d’une classe anonyme est la même que pour une classe interne
							 	Restrictions : 
							- pas de constructeurs
							- Impossibilité de créer des instances d’une classe anonyme à 2 endroits différents 
							dans le programme
					
						
	
	*/

package IntroductionToSwing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
// Dessiner en java 
public class MyPremiereFenetre extends JFrame  {
//	Pour dessiner en Java, il faut passer par la création d’un 
//	panneau (JPanel) et vous mettez vos dessins dedans.
	
	
	public MyPremiereFenetre() {
		setTitle("Dessiner en java");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(500,500,500,200);
//		pour obtenir un dessin permanent dans un composant,il 
//		faut redéfinir sa méthode paintComponent(de la classe 
//		JPanel), dont on sait qu’elle sera appelée chaque fois que le 
//		composant aura besoin d’être redessiné.
//		 la méthode paintComponent à redéfinir possède l’en-tête :
//		void paintComponent (Graphics g)
		
		setVisible(true);
	}
	 
	
	
	
	
	
	
	
	
}
//public class MyPremiereFenetre extends JFrame implements ItemListener {
//	JCheckBox jtb;
//
//	public MyPremiereFenetre() {
//		setTitle("Exercice6");
//		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//		setBounds(500, 500, 500, 200);
//		setLayout(new FlowLayout());
//		jtb = new JCheckBox("Check me");
//		add(jtb);
//		jtb.addItemListener(this);
//		setVisible(true);
//	}
//	
//	@Override
//	public void itemStateChanged(ItemEvent e) {
//		if(e.getSource()==jtb) {
//			System.out.println("");
//		}
//	}
//
//	public static void main(String[] args) {
//		new MyPremiereFenetre();
//	}
//}
























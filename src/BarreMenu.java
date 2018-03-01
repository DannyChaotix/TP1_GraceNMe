import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class BarreMenu extends JMenuBar {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2313658685286310363L;

	private JMenuItem optionNouv = new JMenuItem(" Nouveau");
	private JMenuItem optionEnreg = new JMenuItem(" Enregistrer");
	private JMenuItem optionEnregSous = new JMenuItem(" Enregistrer-sous");

	private JMenuItem optionOuv = new JMenuItem(" Ouvrir");
	private JMenuItem optionQuit = new JMenuItem(" Quitter");

	private JMenuItem optionAide = new JMenuItem(" Afficher l'aide");
	private JMenuItem optionAProp = new JMenuItem(" À propos de votre nom de logiciel");

	public BarreMenu(JPanel panneau) {
		JMenu menuFichier = new JMenu("Fichier");
		JMenu menuAide = new JMenu("?");

		ActionListener1 listener1 = new ActionListener1();

		add(menuFichier);
		add(menuAide);

		menuFichier.add(optionNouv);
		optionNouv.addActionListener(listener1);
		menuFichier.add(optionEnreg);
		optionEnreg.addActionListener(listener1);
		menuFichier.add(optionEnregSous);
		optionEnregSous.addActionListener(listener1);

		menuFichier.add(optionOuv);
		optionOuv.addActionListener(listener1);
		menuFichier.addSeparator();
		menuFichier.add(optionQuit);
		optionQuit.addActionListener(listener1);

		menuAide.add(optionAide);
		optionAide.addActionListener(listener1);
		menuAide.add(optionAProp);
		optionAProp.addActionListener(listener1);

	}

	class ActionListener1 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == optionNouv) {

			} else if (e.getSource() == optionEnreg) {

			} else if (e.getSource() == optionEnregSous) {

			} else if (e.getSource() == optionOuv) {

			} else if (e.getSource() == optionQuit) {
				Quitter quitter=new Quitter();
				quitter.quit();

			} else if (e.getSource() == optionAide) {

			} else if (e.getSource() == optionAProp) {

			}

		}

	}
}

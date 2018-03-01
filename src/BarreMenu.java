import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class BarreMenu extends JMenuBar {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2313658685286310363L;
	
	private JMenuItem optionNouv = new JMenuItem (" Nouveau");
	private JMenuItem optionEnreg = new JMenuItem (" Enregistrer");
	private JMenuItem optionEnregSous = new JMenuItem (" Enregistrer-sous");
	
	private JMenuItem optionOuv = new JMenuItem (" Ouvrir");
	private JMenuItem optionQuit = new JMenuItem (" Quitter");
	
	private JMenuItem optionAide = new JMenuItem (" Afficher l'aide");
	private JMenuItem optionAProp = new JMenuItem (" À propos de votre nom de logiciel");
	
	
	public BarreMenu (JPanel panneau) {
		JMenu menuFichier=new JMenu("Fichier");
		JMenu menuAide=new JMenu("?");
		
		add(menuFichier);
		add(menuAide);
		
		menuFichier.add(optionNouv);
		menuFichier.add(optionEnreg);
		menuFichier.add(optionEnregSous);
		
		menuFichier.add(optionOuv);
		menuFichier.addSeparator();
		menuFichier.add(optionQuit);
		
		menuAide.add(optionAide);
		menuAide.add(optionAProp);
	}
}

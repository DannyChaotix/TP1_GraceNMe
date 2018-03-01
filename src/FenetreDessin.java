import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;

public class FenetreDessin extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7228097512325153809L;
	private JMenuBar barreMenu;
	private JToolBar barreOutils;
	private PanDessin panneau;

	public FenetreDessin() {
		setTitle("David Provost_Paul Sasu - Bootleg Paint - Sans Titre ");
		setSize(700, 400);
		// cr�ation du pannaeu et son ajout � la fen�tre, au centre (par d�faut)
		panneau = new PanDessin(this);
		panneau.setBackground(Color.white);

		barreMenu = new BarreMenu(panneau);
		add(barreMenu, BorderLayout.NORTH);

		add(panneau); // add (panneau, Borderlayout.CENTER)

		// Cr�ation et ajout de la barre d'outils � la fen�tre, au sud
		//barreOutils = new BarreOutils(panneau);
		//add(barreOutils, BorderLayout.SOUTH);
		
		PanDessin listener2=new PanDessin(this);
		
		barreOutils = new BarreOutils(listener2);
		add(barreOutils, BorderLayout.SOUTH);
		

		panneau.addMouseListener(listener2);
		panneau.addMouseMotionListener(listener2);

	}
	
}

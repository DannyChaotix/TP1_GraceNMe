import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JPanel;

public class Enregistrer_Sous {

	public Enregistrer_Sous() {
		
	}
	public String enreg(PanDessin panneau) {
		String saveFilePath = "";
		
		JFileChooser choixFichier = new JFileChooser();
		//Afficher la bo�te de dialogue saveDialog dans le composant texte
		if ( choixFichier.showSaveDialog( panneau ) == JFileChooser.APPROVE_OPTION ) {}
		
		
		
		
		return saveFilePath;
	}
}

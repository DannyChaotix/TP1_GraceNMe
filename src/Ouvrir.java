import java.io.File;

import javax.swing.JFileChooser;

public class Ouvrir {

	public Ouvrir() {

	}

	public PanDessin open(JFileChooser choixFichier) {

		PanDessin panTemp = new PanDessin(null);
		File fileTemp;
		fileTemp = choixFichier.getSelectedFile();

		return panTemp;
	}
}

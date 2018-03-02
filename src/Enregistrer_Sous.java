import java.io.IOException;
import javax.swing.JFileChooser;

public class Enregistrer_Sous {

	public Enregistrer_Sous() {

	}

	public String enreg(PanDessin panneau) throws IOException {
		String saveFilePath = "";

		JFileChooser choixFichier = new JFileChooser();
		// Afficher la boîte de dialogue saveDialog dans le composant texte
		if (choixFichier.showSaveDialog(panneau) == JFileChooser.APPROVE_OPTION) {
			saveFilePath = choixFichier.getSelectedFile().getPath();
			Enregistrer enregistrer = new Enregistrer();
			enregistrer.enreg(saveFilePath, panneau);
		}

		return saveFilePath;
	}
}

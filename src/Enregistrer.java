import java.util.ArrayList;

import javax.swing.JPanel;

public class Enregistrer {

	public Enregistrer() {
		
	}
	public void enreg(String saveFilePath, PanDessin panneau) {
		
		if(saveFilePath == "") {
			Enregistrer_Sous enregistrerSous = new Enregistrer_Sous();
			enregistrerSous.enreg(panneau);
		}else {
			
		}
	}
	
}

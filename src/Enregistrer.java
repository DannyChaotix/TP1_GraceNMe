import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Enregistrer {

	public Enregistrer() {

	}

	public String enreg(String saveFilePath, PanDessin panneau) throws IOException {

		if (saveFilePath == "") {
			Enregistrer_Sous enregistrerSous = new Enregistrer_Sous();
			saveFilePath = enregistrerSous.enreg(panneau);
		} else {
			
			
			
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutput out =  new ObjectOutputStream(bos);
			byte[] byteArray = new byte[panneau.getListe().size()];
			try {
			for(int i=0; i<panneau.getListe().size();i++){
				
				
				    
				  out.writeObject(panneau.getListe().get(i));
				  out.flush();
				  byteArray = bos.toByteArray();
				
			}
			} finally {
			  try {
			    bos.close();
			    try (FileOutputStream fos = new FileOutputStream(saveFilePath)) {
			    	   fos.write(byteArray);
			    	   fos.close();
			    	}
			  } catch (IOException ex) {
			    // ignore close exception
			  }
			}	
			
		}
		return saveFilePath;
	}

}

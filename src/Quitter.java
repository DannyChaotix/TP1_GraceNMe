import javax.swing.JOptionPane;

public class Quitter {

	public Quitter() {
		
		
	}
	public void quit() {
		int i = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment quitter", "Quitter",
				JOptionPane.OK_CANCEL_OPTION);
		
		if(i == JOptionPane.OK_OPTION) {
			System.exit(0);
		}
	}

}

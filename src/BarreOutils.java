 
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

public class BarreOutils extends JToolBar {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1559938097717523848L;
	
	private ButtonGroup groupeForme;
	private ButtonGroup groupeRempl;
	private ButtonGroup groupeCont;
	
	PanDessin panneau;
	
	private JLabel forme = new JLabel("Forme : ");
	private JLabel rempl = new JLabel("Remplissage : ");
	private JLabel cont = new JLabel("Contour : ");
	
	private final String[] tabForme = {"Oval.png","Carré.png","TraitDroit.png"};
	private final String[] tabCouleur = {"black.png", "rouge.png", "vert.png","bleu.png","blanc.png","mauve.png"};
	private final Color[] tabCouleurs = {Color.black, Color.red, Color.green, Color.blue, Color.white, Color.magenta};
	private final int[] tabFormes = {0, 1, 2};
		
	private JToggleButton[] tabButForme = new JToggleButton[3];
	private JToggleButton[] tabButRempl = new JToggleButton[6];
	private JToggleButton[] tabButCont = new JToggleButton[6];
	
	public BarreOutils (PanDessin panneau) {
		this.panneau = panneau;
		groupeForme = new ButtonGroup();
		groupeRempl = new ButtonGroup();
		groupeCont = new ButtonGroup();
		
		ActionListeneur2 listener1=new ActionListeneur2();
		
		add(forme);
		
		for (int i = 0; i < tabButForme.length; i++){
			tabButForme[i] = new JToggleButton(new ImageIcon(BarreOutils.class.getResource("img/" + tabForme[i])));
			tabButForme[i].setToolTipText(tabForme[i]);
			add(tabButForme[i]);
			
			groupeForme.add(tabButForme[i]);
			tabButForme[i].addActionListener(listener1);
			
		}
		
		add(rempl);
		
		for (int i = 0; i < tabButRempl.length; i++){
			tabButRempl[i] = new JToggleButton(new ImageIcon(BarreOutils.class.getResource("img/" + tabCouleur[i])));
			tabButRempl[i].setToolTipText(tabCouleur[i]);
			add(tabButRempl[i]);
			
			groupeRempl.add(tabButRempl[i]);
			tabButRempl[i].addActionListener(listener1);
			
		}
		
		
		add(cont);
		
		for (int i = 0; i < tabButCont.length; i++){
			tabButCont[i] = new JToggleButton(new ImageIcon(BarreOutils.class.getResource("img/" + tabCouleur[i])));
			tabButCont[i].setToolTipText(tabCouleur[i]);
			add(tabButCont[i]);
			
			groupeCont.add(tabButCont[i]);
			tabButCont[i].addActionListener(listener1);
			
		}
		
		
	}
	
	class ActionListeneur2 implements ActionListener {
		@Override
		public void actionPerformed (ActionEvent e){
			for (int i = 0; i < tabButForme.length; i++){
				if (e.getSource() == tabButForme[i]) {
						panneau.setTypeFigure(tabFormes[i]);
						
				} 
			}
			
			for (int x = 0; x < tabButRempl.length; x++){
				if (e.getSource() == tabButRempl[x]) {
					panneau.setFg(tabCouleurs[x]);
					
				}
				
			}
			
			for (int z = 0; z < tabButCont.length; z++){
				if (e.getSource() == tabButCont[z]) {
					panneau.setBg(tabCouleurs[z]);
					
				}
				
			}
			
		}
		
	}
	
	
}

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class PanDessin extends JPanel implements MouseListener, MouseMotionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4881273900854116009L;
	private FenetreDessin f;
	private Color fg;
	private Color bg;
	private int typeFigure= -1;
	
	MouseEvent premierClic;
	
	Forme formeCourante;
	
	ArrayList <Forme> liste = new ArrayList<Forme>();


	public int getTypeFigure() {
		return typeFigure;
	}


	public void setTypeFigure(int type) {
		this.typeFigure = type;
		
	}


	public void setFg(Color fg) {
		this.fg = fg;

	}


	public void setBg(Color bg) {
		this.bg = bg;

	}
	
	
	public PanDessin(FenetreDessin f) {
		// TODO Auto-generated constructor stub
		this.f = f;
	}

		int x1, y1, x2, y2;

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			if (typeFigure != -1){
				
				x2 = e.getX();
				y2 = e.getY();
				formeCourante.setParameters(x1, y1, x2, y2);
				
				Graphics g= ((JComponent)e.getSource()).getGraphics();
				formeCourante.tracer(g);
				f.repaint();
			
			}
			
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent premierClic) {
			// TODO Auto-generated method stub}
			if (typeFigure != -1){
				x1 = premierClic.getX();
				y1 = premierClic.getY();
				
				
				
				System.out.println(typeFigure);
				
				if (typeFigure == 0){
					formeCourante = new Ovale(x1,y1,fg,bg);
					
					} else if (typeFigure == 1) {
						formeCourante = new Rectangle(x1,y1,fg,bg);
					
						} else if (typeFigure == 2){
							formeCourante = new Trait(x1,y1,fg,bg);
						     }	
			}
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			if (typeFigure != -1){
				
				formeCourante.setParameters(x1, y1, x2, y2);
				
				Graphics g= ((JComponent)e.getSource()).getGraphics();
				formeCourante.tracer(g);
				liste.add(formeCourante);
				paintComponent(g);
				
			}

		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void paintComponent (Graphics g){
			super.paintComponent(g);//Doit être la première instruction.  Appelle paintComponent())de la classe mère
									//qui réalise le dessin du composant de base.
			for (int i = 0; i < liste.size(); i++){
				liste.get(i).tracer(g);
				
			}
			
		}
	
}

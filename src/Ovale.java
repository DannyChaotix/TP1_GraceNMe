import java.awt.Color;
import java.awt.Graphics;

public class Ovale extends Forme {

	int hauteur, largeur;
	Color rempli, cont;

	public Ovale(int x, int y, Color rempli, Color cont) {
		super(x, y, rempli, cont);
		// TODO Auto-generated constructor stub
		this.rempli = rempli;
		this.cont = cont;
	}

	@Override
	public void setParameters(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub
		if(x2 > x1 && y2> y1){
		largeur = (x2 - x1);
		hauteur = (y2 - y1);
		
		}
	}

	@Override
	public void tracer(Graphics g) {
		// TODO Auto-generated method stub

		if (rempli != null) {
			g.setColor(cont);
			g.drawOval(x1, y1, largeur, hauteur);
			g.setColor(rempli);
			g.fillOval(x1, y1, largeur, hauteur);
			
		} else {
			g.setColor(cont);
			g.drawOval(x1, y1, largeur, hauteur);
			
		}
	}

}

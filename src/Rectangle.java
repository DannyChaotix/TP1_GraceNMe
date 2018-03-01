import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Forme {

	Color rempli, cont;
	int hauteur, largeur;

	public Rectangle(int x, int y, Color rempli, Color cont) {
		super(x, y, cont, rempli);
		this.rempli = rempli;
		this.cont = cont;
		// TODO Auto-generated constructor stub
	}

	public void setParameters(int x1, int y1, int x2, int y2) {
		if(x2>x1 && y2 > y1){
		largeur = (x2 - x1);
		hauteur = (y2 - y1);
		}

	}

	@Override
	public void tracer(Graphics g) {
		// TODO Auto-generated method stub

		if (rempli != null) {
			g.setColor(cont);
			g.drawRect(x1, y1, largeur, hauteur);
			g.setColor(rempli);
			g.fillRect(x1, y1, largeur, hauteur);
			
		} else {
			g.setColor(cont);
			g.drawRect(x1, y1, largeur, hauteur);
			
		}
	}
}

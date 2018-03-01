import java.awt.Color;
import java.awt.Graphics;

public abstract class Forme {

	public int x1 = 0, y1 = 0;
	public Color colCont, colRemp;

	public Forme(int x, int y, Color cont, Color rempli) {
		x1 = x;
		y1 = y;
		colCont = cont;
		colRemp = rempli;
	}

	public abstract void setParameters(int x1, int y1, int x2, int y2);

	public abstract void tracer(Graphics g);

}

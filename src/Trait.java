import java.awt.Color;
import java.awt.Graphics;

public class Trait extends Forme {

	int x2, y2;
	Color cont;

	public Trait(int x, int y, Color rempli, Color cont) {
		super(x, y, rempli, cont);
		// TODO Auto-generated constructor stub
		this.cont = cont;
	}

	@Override
	public void setParameters(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub
		this.x2 = x2;
		this.y2 = y2;
	}

	@Override
	public void tracer(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(cont);
		g.drawLine(x1, y1, x2, y2);

	}

}

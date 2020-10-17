import acm.graphics.*;
import acm.program.*;
import acm.util.*;
import java.awt.event.*;
public class GraphicsAndRandomNumbers extends GraphicsProgram{
	/* Private constants */
	private static final int SQSIZE = 75;
	private static final int NROWS = 4;
	private static final int NCOLS = 7;
	/* Private instance variables */
	private GImage frog; /* The image of the frog */
	private double fx; /* The x-coordinate of the frog's center */
	private double fy; /* The y-coordinate of the frog's center */
	/* Sets the graphics window size */
	public static final int APPLICATION_WIDTH = NCOLS * SQSIZE;
	public static final int APPLICATION_HEIGHT = NROWS * SQSIZE;
	
	public void run() {
		GImage frog = new GImage("Frogger_sprite.png", SQSIZE * 4, SQSIZE * 5);
		addMouseListeners();
		fx = (NCOLS / 2 + 0.5) * SQSIZE;
		fy = (NROWS - 0.5) * SQSIZE;
		add(frog, fx - frog.getWidth() / 2,
		 fy - frog.getHeight() / 2);
	}
	public void mouseClicked(MouseEvent click) {
		double mx = click.getX();
		double my = click.getY();
		if (Math.abs(mx - fx) > Math.abs(my - fy)) {
			if (mx > fx) {
			moveFrog(SQSIZE, 0);
			} else {
			moveFrog(-SQSIZE, 0);
			}
			} else {
			if (my > fy) {
			moveFrog(0, SQSIZE);
			} else {
			moveFrog(0, -SQSIZE);
			}
			}
	}
			private void moveFrog(double dx, double dy) {
				if (insideFroggerWorld(fx + dx, fy + dy)) {
					fx += dx;
					fy += dy;
					frog.move(dx, dy);
				}
			}
			/* Returns true if the point (x, y) is inside the frog's world */
			private boolean insideFroggerWorld(double x, double y) {
			return (x >= 0 && x <= NCOLS * SQSIZE &&
			 y >= 0 && y <= NROWS * SQSIZE);
			}
}
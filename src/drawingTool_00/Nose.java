package drawingTool_00;

import java.awt.Color;

public class Nose {
	private double radius;
	private Color color;

	public Nose() {
		this(1);
	}

	public Nose(double radius, Color color) {
		this.radius=radius;
		this.color = color;
	}

	public Nose(double skalierung) {
		this(100 * skalierung, Color.pink);
	}

	public void drawAt(double left, double bottom) {
		Drawing.pen().setColor(color);
		Drawing.pen().fillArc((int) left, (int) bottom, (int) radius, (int) radius, 400, 100);
	}

}

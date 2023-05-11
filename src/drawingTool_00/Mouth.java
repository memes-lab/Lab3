package drawingTool_00;

import java.awt.Color;

public class Mouth {
	private double width;
	private double height;
	private Color color;

	public Mouth() {
		this(1);
	}

	public Mouth(int width, int height, Color color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public Mouth(double skalierung) {
		this.width = 100*skalierung;
		this.height = 20*skalierung;
		this.color = Color.black;
	}


	public void drawAt(int left, int bottom) {
		Drawing.pen().setColor(color);
		Drawing.pen().fillRoundRect((int)left, (int)bottom, (int)width, (int)height, 20, 20);
	}
}

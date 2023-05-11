package drawingTool_00;

import java.awt.Color;

public class Skin {

	private Color color;
	
	public Skin() {
		this.color=Color.ORANGE;
	}
	
	public Skin(Color color) {
		this.color=color;
	}
	
	public void Shave() {
		this.color=Color.pink.darker();
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
}

package drawingTool_00;

import java.awt.Color;

public class Pinna {
	
	private double radius;
	private Color color;
	
	public Pinna(double radius, Color color){
		this.radius=radius;
		this.color=color;
	}
	
	public Pinna(){
		this(1);
	}

	public Pinna(double skalierung) {
		this(80*skalierung,Color.pink);
	}
	
	public void drawAt(double left, double bottom){
		Drawing.pen().setColor(color);
		Drawing.pen().fillOval((int)left, (int)bottom, (int)radius, (int)radius);
	}
}

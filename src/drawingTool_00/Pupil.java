package drawingTool_00;

import java.awt.Color;

public class Pupil {

	private double radius;
	private Color color;

	public Pupil(double radius, Color color){
		this.radius=radius;
		this.color = color;
	}
	
	public Pupil(){
		this(1);

	}
	
	public Pupil(double skalierung) {
		this(50*skalierung, Color.BLACK);
	}
	
	public void drawAt(double left, double bottom){
		Drawing.pen().setColor(color);
		Drawing.pen().fillOval((int)left, (int)bottom, (int)radius, (int)radius);
	}
	
}

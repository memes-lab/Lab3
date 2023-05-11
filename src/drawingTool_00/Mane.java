package drawingTool_00;

import java.awt.Color;

public class Mane
{
	private double radius;
	private Color color;
	
	public Mane(double radius, Color color){
		this.radius= radius;
		this.color = color;
	}
	
	public Mane(){
		this(1);
	}
	
	public Mane(double skalierung) {
		this(400*skalierung, Color.red);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void drawAt(double left, double bottom){
	    Drawing.pen().setColor(color);
	    Drawing.pen().fillOval((int)left, (int)bottom, (int)radius, (int)radius);
	}	
}

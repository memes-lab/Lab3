package drawingTool_00;

import java.awt.Color;

public class Eye {
	
	private double radius;
	private Color color;
	private Pupil pupil; //composite
	private final double DISTANCE_TO_RIGHT =20;
	private final double DISTANCE_TO_BOTTOM=20;

	public Eye(double radius, Color color, Pupil pupil){
		this.radius=radius;
		this.color=color;
		this.pupil=pupil;
	}

	public Eye(){
		this(1);
	}
	
	public Eye(double skalierung) {
		this(80*skalierung, Color.white, new Pupil(skalierung));
	}

	public void drawAt(double left, double bottom, double skalierung){
		Drawing.pen().setColor(color);
		Drawing.pen().fillOval((int)left, (int)bottom, (int)radius, (int)radius);
		pupil.drawAt((int)(left + DISTANCE_TO_RIGHT*skalierung), (int)(bottom + DISTANCE_TO_BOTTOM*skalierung));
	}
}

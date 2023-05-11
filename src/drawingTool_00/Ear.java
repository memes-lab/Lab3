package drawingTool_00;

import java.awt.Color;

public class Ear extends Skin{

	private double radius;
	private Pinna pinna; //composite
	private final double DISTANCE_TO_RIGHT =15;
	private final double DISTANCE_TO_BOTTOM=15;
	
	public Ear(Color color, double radius, Pinna pinna){
		super(color);
		this.radius=radius;
		this.pinna=pinna;
	}
	
	public Ear(){
		this(1);
	}

	public Ear(double skalierung) {
		this(Color.ORANGE,100*skalierung, new Pinna(skalierung));
	}

	public void drawAt(double left, double bottom, double skalierung){
		//Shave();
		Drawing.pen().setColor(super.getColor());
		Drawing.pen().fillOval((int)left, (int)bottom, (int)radius, (int)radius);
		pinna.drawAt((int)(left + DISTANCE_TO_RIGHT*skalierung), (int)(bottom + DISTANCE_TO_BOTTOM*skalierung));
	}
}

package drawingTool_00;

import java.awt.Color;

public class Face extends Skin{
	
	private double radius;//Feld(Klassenvariable)
	private Nose nose; // composite
	private Mouth mouth; // composite
	private final double DISTANCE_TO_RIGHT =100;
	private final double DISTANCE_TO_BOTTOM=150;
	
	public Face(){
		this(1);
	}
	
	public Face(Color color, double radius, Nose nose, Mouth mouth) {
		super(color);
		this.radius=radius;
		this.nose=nose;
		this.mouth=mouth;
	}
	
	public Face(double skalierung) {
		this(Color.ORANGE,300*skalierung,new Nose(skalierung), new Mouth(skalierung));
	}
	
	public void drawAt(double left, double bottom, double skalierung){
		//Shave();
		Drawing.pen().setColor(super.getColor());
		Drawing.pen().fillOval((int)left, (int)bottom, (int)radius, (int)radius);
		nose.drawAt((int)(left+(DISTANCE_TO_RIGHT*skalierung)),(int)( bottom+(DISTANCE_TO_BOTTOM*skalierung)));
		mouth.drawAt((int)(left+(DISTANCE_TO_RIGHT*skalierung)), (int)(bottom+((DISTANCE_TO_BOTTOM+80)*skalierung)));
	}
	
}

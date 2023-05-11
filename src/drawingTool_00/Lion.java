package drawingTool_00;

import java.awt.Point;

public class Lion implements LocatedRectangle {
	private Mane mane; // aggregate
	private Face face; // composite
	private Eye eye; // composite
	private Ear ear; // composite
	private Point address;
	private double skalierung;

	public Lion(Mane mane, Face face, Eye eye, Ear ear, Point address) {
		this.address = address;
		this.mane = mane;
		this.eye = eye;
		this.ear = ear;
		skalierung = 1;
	}

	public Lion(int radius) {
		mane = new Mane(radius);
		face = new Face(radius-(radius/2));
	}

	public Lion(double skalierung, int x, int y) {
		mane = new Mane(skalierung);
		face = new Face(skalierung);
		eye = new Eye(skalierung);
		ear = new Ear(skalierung);
		address = new Point(x, y);
		this.skalierung = skalierung;
	}

	public Lion(double skalierung) {
		this(skalierung, randomNumber(), randomNumber());
	}

	public static int randomNumber() {
		int x = (int) Math.random();
		return x;
	}

	public void drawAt(int left, int bottom) {
		mane.drawAt(left, bottom);
		face.drawAt(left + (50 * skalierung), bottom + (50 * skalierung), skalierung);
		eye.drawAt(left + (215 * skalierung), bottom + (100 * skalierung), skalierung);
		eye.drawAt(left + (90 * skalierung), bottom + (100 * skalierung), skalierung);
		ear.drawAt(left + (20 * skalierung), bottom + (20 * skalierung), skalierung);
		ear.drawAt(left + (275 * skalierung), bottom + (20 * skalierung), skalierung);
	}

	public void draw() {
		drawAt(this.address().x, this.address().y);
	}

	public Point address() {
		return address;
	}

	public double radius() {
		return mane.getRadius(); // Math.max(roof.getWidth(), facade.getWidth())
	}

	@Override
	public boolean intersects(LocatedRectangle other) {
		boolean disjoint = 
				other.address().x + other.radius() < this.address().x ||
				other.address().x > this.address().x + this.radius()  ||
				other.address().y + other.radius() < this.address().y||
				other.address().y > this.address().y + this.radius();
		return !disjoint;
	}
}

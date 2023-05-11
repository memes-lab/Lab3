package drawingTool_00;

import java.awt.Point;

public interface LocatedRectangle {
	public Point address();
	public double radius();
	public boolean intersects(LocatedRectangle other);
	public void draw();
}

package drawingTool_00;

import java.awt.Graphics;
import drawingTool_00.Drawing;

public class Drawing {

	private static Graphics pen = null;
	
	public static void set(Graphics pen) {
		Drawing.pen = pen;
	}
	
	public static Graphics pen() {
		return Drawing.pen;
	}
}
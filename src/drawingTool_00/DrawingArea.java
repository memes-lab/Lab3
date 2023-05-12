package drawingTool_00;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class DrawingArea extends JPanel { // inheritance
	
	private PrideOfLions lionlist;
	
	public DrawingArea() {
		lionlist= new PrideOfLions();
	}     // из-за последних строчек мы изменили то, что раньше при изменении размеров окна, обновлялась программа
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Drawing.set(g);
	
//		Lion lion2= new Lion(0.3, 200, 100);
		lionlist.drawAt();
	}
}

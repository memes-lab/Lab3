package drawingTool_00;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Dimension;

@SuppressWarnings("serial")
public class DrawingTool extends JFrame {
	
	private DrawingArea drawing;

	public DrawingTool(String name){ 
		super(name);
		constructDrawingArea();
		Dimension screenSize = getToolkit().getScreenSize();
		setBounds(0, 0, screenSize.width, screenSize.height); //первые два числа это координаты нашего окна, а вторые размеры окна//
		setBackground(Color.white);
		setVisible(true); // это позволяет увидеть окно 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрывает вместе с окном программу
		//setResizable(true) - даёт возможность менять размер окна. У меня почему-то и без этого работает
	}
	
	private void constructDrawingArea(){
		drawing = new DrawingArea();
		add(this.drawing);
	}
}

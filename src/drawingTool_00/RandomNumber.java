package drawingTool_00;

public class RandomNumber {
	public static double between(double min, double max) {
		return (double) (Math.random() * ((max - min) + 1) + min);
	}
}
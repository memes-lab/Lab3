package drawingTool_00;

import java.util.ArrayList;

public class PrideOfLions {

	private ArrayList<LocatedRectangle> lions;

	public PrideOfLions() {
		lions = new ArrayList<LocatedRectangle>();
		//generateLion(); //this aswell
		double skalierung = 0.8;
		Lion lion = new Lion(skalierung);
		addALion(lion);
        Lion mySecondLion = new Lion(skalierung);
		addALion(mySecondLion);
		//double skalierung2 = 3; //and this
		//Lion lion2 = new Lion(skalierung2);
		//addALion(lion2);
	}
	/* this was for genrATING THE PRIDE OFLIONS RANDOMLY ANd so that they dont overlap withbrandom skalierungen
	public void generateLion() {
		for (int x = 0; x < 1300; x += 1) {
			int y = (int) RandomNumber.between(0, 700);
			 double skalierung = RandomNumber.between(0.1,1);
			Lion lion = new Lion(skalierung, x, y);
			addALion(lion);
		}
	}
	*/
	public void addALion(LocatedRectangle newLion) {
		boolean contact = false;

		for (LocatedRectangle aLion : lions) {
			contact = contact || aLion.intersects(newLion);
		}
		if (!contact) {
			lions.add(newLion);
		}
	}

	public void drawAt() {
		for (LocatedRectangle OneLion : lions) {
			OneLion.draw();
		}
	}
}

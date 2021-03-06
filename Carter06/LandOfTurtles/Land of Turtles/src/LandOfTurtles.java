import java.util.Random;

import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;
import org.teachingextensions.logo.Turtle.Animals;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";
	
		/* 1. Get the panel to show */
		panel.showPanel();
		
		/* 2. Set the background image of the panel to the Galapagos Islands */
		panel.setBackgroundImage(galapagosIslands);
		/* 3. Instantiate a Turtle and add it to the panel */
		Turtle turtle1 = new Turtle();
		panel.addTurtle(turtle1);
		/* 4. Put 50 Turtles on the beach. */
		for(int i = 0; i < 50; i++){
			Turtle forTurtle = new Turtle();;
			forTurtle.setX(new Random().nextInt(400));
			forTurtle.setY(new Random().nextInt(400));
			
			panel.addTurtle(forTurtle);
		}
	}
}

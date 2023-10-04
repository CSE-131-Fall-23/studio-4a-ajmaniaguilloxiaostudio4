package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(StdDraw.CYAN);
		StdDraw.filledRectangle(0.5, 0.5, 0.35, 0.2);
		
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledRectangle(0.5, 0.35, 0.35, 0.1);
		
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledCircle(0.5, 0.5, 0.13);
		
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.text(0.5, 0.5, "Marialand");
		
	}
}
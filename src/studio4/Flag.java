package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		int canvasHeight = 512;
		int canvasWidth = 22 * canvasHeight / 16;
		StdDraw.setCanvasSize(canvasWidth, canvasHeight);
		
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		
		StdDraw.setPenColor(38, 50, 56);
		StdDraw.setPenRadius(0.1);
		StdDraw.rectangle(11, 8, 11, 8);
		
		StdDraw.filledRectangle(9.5, 6.5, 2.5, 2.5);
	
		StdDraw.setPenColor(69, 90, 100);
		double[] x = {7, 10, 15, 12};
    	double[] y = {9, 12, 12, 9};
    	StdDraw.filledPolygon(x, y);
    	
		StdDraw.setPenColor(96, 125, 139);
    	double[] x2 = {12, 12, 15, 15};
    	double[] y2 = {4, 9, 12, 7};
    	StdDraw.filledPolygon(x2, y2);
	}
}
package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;
import java.io.File;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		
		Color color = new Color(in.nextInt(), in.nextInt(), in.nextInt());
		StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(color);
        
        boolean isFilled = in.nextBoolean();
        
        if (shape.equals("rectangle")) {
        	if (isFilled == false) {
        		StdDraw.rectangle(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
        	} else {
        		StdDraw.filledRectangle(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
        	}
        } else if (shape.equals("ellipse")) {
        	if (isFilled == false) {
        		StdDraw.ellipse(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
        	} else {
        		StdDraw.filledEllipse(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
        	}
        } else {
        	double x1 = in.nextDouble();
        	double y1 = in.nextDouble();
        	double x2 = in.nextDouble();
        	double y2 = in.nextDouble();
        	double x3 = in.nextDouble();
        	double y3 = in.nextDouble();
        	double[] x = {x1, x2, x3};
        	double[] y = {y1, y2, y3};
        	if (isFilled == false) {
        		StdDraw.polygon(x, y);
        	} else {
        		StdDraw.filledPolygon(x, y);
        	}
        }
	}
}

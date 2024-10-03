package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		System.out.print("Shape: ");
		String shapeType = in.nextLine();
		
		if (shapeType == "square") {
			StdDraw.filledSquare(0.5, 0.5, .2);
			StdDraw.setPenColor(Color.RED);
			
		}
		
		
		//StdDraw.setPenColor(Color.RED);
		//StdDraw.filledSquare(0.5, 0.5, .2);
		
	}
}

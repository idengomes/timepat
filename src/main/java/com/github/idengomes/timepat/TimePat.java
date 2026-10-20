package com.github.idengomes.timepat;

import java.awt.GraphicsEnvironment;

import javax.swing.SwingUtilities;
import javax.swing.JFrame;

public class TimePat extends JFrame {
	public static void handleArgs(String[] args) throws IllegalArgumentException {
		for(int i = 0; i < args.length; i++) {
			if(args[i] == "-v" || args[i] == "--version") {
				printVersion();
				return;
			}

			throw new IllegalArgumentException(String.format("unknown argument \"%s\"", args[i]));
		}
	}
	public static void printVersion() { System.out.println("TimePat 0.1.0"); }

	public static void main(String[] args) {
		handleArgs(args);

		if(GraphicsEnvironment.isHeadless()) mainCLI(); else mainGUI();
	}
	public static void mainGUI() { SwingUtilities.invokeLater(() -> { new TimePat().setVisible(true); }); }
	public static void mainCLI() {}

	private Instant startTime;
}

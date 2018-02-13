package com.HVSoft.FXframework;

import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;

public class Colors {
	
	//Main Application fade-background color values
	private static final String appBackgroundColorMain="#E0F7FA";
	private static final String appBackgroundColorFade="#ECEFF1";
	
	
	//Returns Application Background LinearGradient color
	public LinearGradient appBackgroundColor() {
		return createLinearGradient(appBackgroundColorMain,appBackgroundColorFade);
	}
	
	//Used by other methods within the same class
	private LinearGradient createLinearGradient(String mainColor,String fadeColor) {
		Stop[] stops = new Stop[] { 
		         new Stop(0, Color.web(mainColor)),  
		         new Stop(1, Color.web(fadeColor))
		};  
		LinearGradient linearGradient = new LinearGradient(0, 1, 0, 0, true, CycleMethod.NO_CYCLE, stops);
		return linearGradient;
	}
	
	
}

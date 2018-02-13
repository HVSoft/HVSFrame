package com.HVSoft.FXframework;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class sample extends Application{
	
	Colors colors=new Colors();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
	      Group group = new Group();  
	      Scene scene = new Scene(group ,1280, 720);
	      scene.setFill(colors.appBackgroundColor());
	      primaryStage.setTitle("Test");
	      primaryStage.setScene(scene);
	      primaryStage.show();
	      
	}

}

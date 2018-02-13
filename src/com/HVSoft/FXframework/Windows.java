/**
 * 
 */
package com.HVSoft.FXframework;

import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;

/**
 * @author Harsha_V
 * com.HVSoft.FXframework
 */
public class Windows {
	
	Colors col=new Colors();
	Texts txt=new Texts();
	
	//Scene properties
	private static int sceneWidth=0;
	private static int sceneHeight=0;
	private static final double screenCornerDelta=0.95;
	
	//Header properties
	private static final int headerWidth=100;//in percentage width of window
	private static final int headerHeight=5;//in percentage height of window
	private static final double headerTextRightPosX=1;//in percentage (0.5-center)
	private static final double headerTextRightPosY=0.5;//in percentage (0.5-center)
	private static final double headerTextRightFontSize=30;
	
	//Constructor
	Windows(){
		
		//to Fullscreen
		Screen screen = Screen.getPrimary();
		Rectangle2D visualBounds = screen.getVisualBounds();
		sceneWidth=(int) (visualBounds.getWidth()*screenCornerDelta);
		sceneHeight=(int) (visualBounds.getHeight()*screenCornerDelta);
	}
	
	//Adds a header to pre-existing group
	public Group addHeader() {
		
		int headerWidthAbsolute=headerWidth*sceneWidth/100;
		int headerHeightAbsolute=headerHeight*sceneHeight/100;
		
		int headerTextRightPosXAbsolute=(int) (headerTextRightPosX*headerWidthAbsolute-(headerTextRightFontSize/1.8*txt.getHeaderTextRight().length()));
		int headerTextRightPosYAbsolute=(int) (headerTextRightPosY*headerHeightAbsolute+(headerTextRightFontSize/3));
		
		Rectangle headerRect = new Rectangle(0,0,headerWidthAbsolute,headerHeightAbsolute);
		headerRect.setFill(col.getHeaderBackgroundColor());
		
		Text headerTextRight=new Text();
		headerTextRight.setX(headerTextRightPosXAbsolute);
		headerTextRight.setY(headerTextRightPosYAbsolute);
		headerTextRight.setText(txt.getHeaderTextRight());
		headerTextRight.setStrokeWidth(1);
		headerTextRight.setFill(col.getHeaderTextRightColor());
		headerTextRight.setFont(Font.font(headerTextRightFontSize));
		headerTextRight.setStroke(col.getHeaderTextRightColor());
		
		return new Group(headerRect,headerTextRight);	
	}
	
	public Scene createScene(Group group) {
		return new Scene(group,sceneWidth,sceneHeight);
	}
}

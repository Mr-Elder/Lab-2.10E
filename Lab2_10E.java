/**
 * @(#)Lab2_10E.java
 *
 *
 * @author 
 * @version 1.00 2013/12/13
 */

import java.awt.*;
import java.applet.*;

public class Lab2_10E extends Applet {
	
	public void paint(Graphics page){
		final int MID_X = 300;
		final int MID_Y = 200;
		
		int x,y,height,width;
		double startAngle, arcAngle;
		
		setBackground(Color.black);
		
		page.setColor(new Color(105,105,105));
		page.fillRect(30, 30, 540, 340);
		
		page.setColor(Color.white);
		page.drawRect(MID_X + 75, MID_Y - 100, 180, 100);
		
		page.setColor(Color.black);
		page.fillArc(MID_X - 170, MID_Y - 95, 200, 200, 0, 360);
		
		page.setColor(Color.cyan);
		page.drawString("Rent and Utilities : 35%", MID_X + 80, MID_Y - 85);
		page.setColor(Color.red);
		page.drawString("Transportation : 15%", MID_X + 80, MID_Y - 65);
		page.setColor(Color.blue);
		page.drawString("Food : 15%", MID_X + 80, MID_Y - 45);
		page.setColor(Color.orange);
		page.drawString("Educational : 25%", MID_X + 80, MID_Y - 25);
		page.setColor(Color.green);
		page.drawString("Miscellaneous : 10%", MID_X + 80, MID_Y - 5);
		
		page.setColor(Color.cyan);
		page.drawString("Rent and Utilities", MID_X-70, MID_Y - 110);
		page.setColor(Color.red);
		page.drawString("Transportation", MID_X - 260, MID_Y -40);
		page.setColor(Color.blue);
		page.drawString("Food", MID_X - 220, MID_Y + 30);
		page.setColor(Color.orange);
		page.drawString("Educational", MID_X - 40, MID_Y + 125);
		page.setColor(Color.green);
		page.drawString("Miscellaneous", MID_X + 50, MID_Y + 30);
		
		page.setColor(Color.white);
		page.drawString("Terence Bezman", 500, 385);
		
	
		page.setColor(Color.cyan);
		x=MID_X - 160;
		y=MID_Y - 100;
		width = 200;
		height= 200;
		startAngle=0;
		arcAngle=360 * .35;
		page.fillArc(x,y,width, height, (int)startAngle, (int)arcAngle);
		
		page.setColor(Color.red);
		x=MID_X - 160;
		y=MID_Y - 100;
		width = 200;
		height= 200;
		startAngle=arcAngle + startAngle;
		arcAngle=360 * .15;
		page.fillArc(x,y,width, height, (int)startAngle, (int)arcAngle);
		
		page.setColor(Color.blue);
		x=MID_X - 160;
		y=MID_Y - 100;
		width = 200;
		height= 200;
		startAngle=arcAngle + startAngle;
		arcAngle=360 * .15;
		page.fillArc(x,y,width, height, (int)startAngle-1, (int)arcAngle);
		
		page.setColor(Color.orange);
		x=MID_X - 160;
		y=MID_Y - 100;
		width = 200;
		height= 200;
		startAngle=arcAngle + startAngle;
		arcAngle=360 * .25;
		page.fillArc(x,y,width, height, (int)startAngle, (int)arcAngle);
		
		page.setColor(Color.green);
		x=MID_X - 160;
		y=MID_Y - 100;
		width = 200;
		height= 200;
		startAngle=startAngle + arcAngle;
		arcAngle=360 * .10;
		page.fillArc(x,y,width, height, (int)startAngle, (int)arcAngle);
	}
    
}
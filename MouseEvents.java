//Demonstrate Mouse event handlers
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="MouseEvents" width=300 height=100>
</applet>
*/
public class MouseEvents extends Applet
implements MouseListener, MouseMotionListener{
	String msg = "";
	int mouseX = 0, mouseY = 0; // coordinates of the mouse
	public void init(){
		addMouseListener(this);
		addMouseMotionListener(this);
	}

//Handle mouse clicked
	public void mouseClicked(MouseEvent me){
		//save coordinates
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse clicked.";
		repaint();
	}
//Handle Mouse entered
	public void mouseEntered(MouseEvent me){
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse entered";
		repaint();

	}
//Handle mouse exited.
	public void mouseExited(MouseEvent me){
			mouseX = 0;
			mouseY = 10;
			msg = "Mouse exited";
			repaint();

		}
// Handle button pressed
	public void mouseEntered(MouseEvent me){
		mouseX = 0;
		mouseY = 10;
		msg = "Down";
		repaint();

	}
//Handle Button Released
	public void mouseEntered(MouseEvent me){
		mouseX = me.getX();
		mouseY = e.getY();
		msg = "Up";
		repaint();

	}
public void paint(Graphics g){
	g.drawString(msg, mouseX,mouseY);
}
}
import java.awt.*;
import javax.swing.*;

public class MyCanvas extends Canvas 
	{
 
	private static final long	serialVersionUID	= 1L;

    public static void main(String[] args) 
    		{
        MyCanvas canvas = new MyCanvas();
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    		}

    public void paint(Graphics graphics) 
    		{
        graphics.setColor(Color.black);
        graphics.drawLine(40, 30, 330, 380);
        
        //  Draw a rectangle
        
        //   graphics.drawRect(10, 10, 100, 100);
        
        // Change the outline color of the rectangle
        
        //   graphics.setColor(Color.red);
        
        //Draw a yellow rectangle with a red outline
        
//        graphics.setColor(Color.yellow);
//        graphics.fillRect(10, 10, 100, 100);
//        graphics.setColor(Color.red);
//        graphics.drawRect(10, 10, 100, 100); 
        
        // Draw a white circle with a red outline
        
//        graphics.setColor(new Color(0,0,255));
//        graphics.drawOval(50, 50, 100, 100);
    		}
	}

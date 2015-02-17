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
    		}
    }

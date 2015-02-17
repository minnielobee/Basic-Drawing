import java.awt.*;

import javax.swing.*;

public class MyCanvas extends Canvas 
    {
    private static final long	serialVersionUID	= 1L;

    public static void main(String[] args) 
    		{
	        MyCanvas canvas = new MyCanvas();
	        JFrame frame = new JFrame();
	        frame.setSize(1000, 1000);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas);
	        frame.setVisible(true);
	        
	        
    		}
    public void paint(Graphics graphics)
    	{
    	graphics.setColor(Color.orange);
    	graphics.drawRoundRect(250, 250, 500, 500, 500, 500);
    	graphics.fillRoundRect(250, 250, 500, 500, 500, 500);
    	graphics.setColor(Color.cyan);
    	graphics.fillRect(400, 400, 50, 50);
    	graphics.fillRect(600, 400, 50, 50);
    	graphics.setColor(Color.darkGray);
    	graphics.fillRoundRect(300, 500, 400, 100, 100, 150);
    	graphics.setColor(Color.red);
    	graphics.fillRoundRect(350, 550, 100, 200, 200, 150);
    	for (int i = 0; i < 600; i++)
			{
			graphics.setColor(Color.orange);
			graphics.fillRect(400, 400, 50, 50);
			graphics.fillRect(600, 400, 50, 50);
			graphics.setColor(Color.black);
			graphics.drawLine(400, 400, 450, 400);
			graphics.drawLine(600, 400, 650, 400);
			try
				{
				Thread.sleep(500);
				} catch (InterruptedException e)
				{
				e.printStackTrace();
				}
			graphics.setColor(Color.cyan);
			graphics.fillRect(400, 400, 50, 50);
	    	graphics.fillRect(600, 400, 50, 50);
	    	try
				{
				Thread.sleep(2000);
				} catch (InterruptedException e)
				{
				e.printStackTrace();
				}
			}
    	}

    }

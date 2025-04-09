import javax.swing.*;
import java.awt.*;

public class BikeAnimation extends JPanel 
{
    private int xPosition = 50;
    
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Bike Animation");
        BikeAnimation bikeAnimation = new BikeAnimation();
        
        frame.add(bikeAnimation);
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        while (true) 
        {
            bikeAnimation.moveBike();
            try 
            {
                Thread.sleep(50);
            } catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }
    
    public void moveBike()
    {
        xPosition += 5;
        if (xPosition > getWidth()) {
            xPosition = -100;
        }
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        drawBike(g, xPosition, 200);
    }
    
    private void drawBike(Graphics g, int x, int y) 
    {
        g.setColor(Color.BLACK);
        g.fillOval(x, y, 50, 50);  // Rear Wheel
        g.fillOval(x + 100, y, 50, 50);  // Front Wheel
        
        g.setColor(Color.BLUE);
        g.fillRect(x + 30, y - 30, 50, 10);  // Frame
        g.fillRect(x + 55, y - 50, 10, 30);  // Seat
        
        g.setColor(Color.RED);
        g.fillRect(x + 50, y - 70, 30, 40);  // Man's Body
        g.setColor(Color.YELLOW);
        g.fillOval(x + 60, y - 90, 20, 20);  // Man's Head
        
        g.setColor(Color.WHITE);
        g.drawString("Sourav", x + 55, y - 50);  // Name on Jacket
    }
}

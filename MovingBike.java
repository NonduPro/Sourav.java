import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class MovingBike extends JPanel 
{

    private int x = 0; // X-coordinate for the bike's position
    private int y = 300; // Y-coordinate for the bike's position

    public MovingBike() 
    {
        // Timer to animate the bike's movement
        Timer timer = new Timer(20, e -> {
            x += 2; // Move the bike to the right
            if (x > getWidth()) x = -200; // Reset position when the bike goes off-screen
            repaint(); // Redraw the scene
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set rendering hints for better quality
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Clear the background
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Translate to the bike's position
        g2d.translate(x, y);

        // Draw the bike
        drawBike(g2d);

        // Draw the rider
        drawRider(g2d);

        // Draw the name "Sourav" on the rider's jacket
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.BOLD, 14));
        g2d.drawString("Sourav", x + 50, y - 50);
    }

    private void drawBike(Graphics2D g2d) 
    {
        // Draw the bike frame
        g2d.setColor(Color.BLACK);
        g2d.drawLine(0, 0, 50, 0); // Horizontal bar
        g2d.drawLine(50, 0, 70, 30); // Diagonal bar
        g2d.drawLine(70, 30, 100, 30); // Seat bar
        g2d.drawLine(100, 30, 120, 0); // Front bar
        g2d.drawLine(120, 0, 170, 0); // Front horizontal bar

        // Draw the wheels
        g2d.setColor(Color.GRAY);
        g2d.fillOval(-10, -10, 40, 40); // Rear wheel
        g2d.fillOval(140, -10, 40, 40); // Front wheel

        // Draw the spokes
        g2d.setColor(Color.BLACK);
        g2d.drawLine(10, 10, 20, 20); // Rear wheel spoke
        g2d.drawLine(150, 10, 160, 20); // Front wheel spoke
    }

    private void drawRider(Graphics2D g2d) 
    {
        // Draw the rider's body
        g2d.setColor(Color.BLUE);
        g2d.fillOval(40, -50, 30, 30); // Head
        g2d.drawLine(55, -20, 55, 10); // Body
        g2d.drawLine(55, 10, 40, 30); // Leg 1
        g2d.drawLine(55, 10, 70, 30); // Leg 2
        g2d.drawLine(55, -10, 30, 0); // Arm 1
        g2d.drawLine(55, -10, 80, 0); // Arm 2
    }

    public static void main(String[] args) 
    {
        // Create a JFrame to display the moving bike
        JFrame frame = new JFrame("Moving Bike with Rider");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.add(new MovingBike());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
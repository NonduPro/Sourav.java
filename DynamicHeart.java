import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class DynamicHeart extends JPanel 
{

    private float scale = 1.0f; // Scale factor for the heart size
    private boolean growing = true; // Flag to determine if the heart is growing or shrinking

    public DynamicHeart() 
    {
        // Timer to animate the heart
        Timer timer = new Timer(50, e -> 
        {
            if (growing) {
                scale += 0.05f; // Increase the scale
                if (scale >= 1.5f) growing = false; // Stop growing at max size
            } else {
                scale -= 0.05f; // Decrease the scale
                if (scale <= 1.0f) growing = true; // Stop shrinking at min size
            }
            repaint(); // Redraw the heart
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

        // Translate to the center of the panel
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        g2d.translate(centerX, centerY);

        // Scale the heart based on the current scale factor
        g2d.scale(scale, scale);

        // Define the heart shape using Path2D
        Path2D heart = new Path2D.Double();
        heart.moveTo(0, 0);
        heart.curveTo(-50, -50, -100, 0, 0, 80); // Left curve
        heart.curveTo(100, 0, 50, -50, 0, 0);   // Right curve
        heart.closePath();

        // Set color and fill the heart
        g2d.setColor(Color.RED);
        g2d.fill(heart);

        // Draw the outline of the heart
        g2d.setColor(Color.BLACK);
        g2d.draw(heart);
    }

    public static void main(String[] args) 
    {
        // Create a JFrame to display the dynamic heart
        JFrame frame = new JFrame("Dynamic Beating Heart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new DynamicHeart());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

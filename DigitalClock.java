import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock extends JFrame 
{

    private JLabel timeLabel;

    public DigitalClock() {
        // Set up the JFrame
        setTitle("Digital Clock");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a label to display the time
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 40));
        timeLabel.setHorizontalAlignment(JLabel.CENTER);
        add(timeLabel);

        // Update the time every second
        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();

        // Display the initial time
        updateTime();
    }

    private void updateTime() 
    {
        // Get the current time
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String time = sdf.format(new Date());
        timeLabel.setText(time);
    }

    public static void main(String[] args) 
    {
        // Run the clock on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> 
        {
            DigitalClock clock = new DigitalClock();
            clock.setVisible(true);
        });
    }
}
package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Font.*;
public class TitleBar extends JPanel {
    private JLabel titleLabel;
    private Timer timer;
    private String[] titles = {"My To-Do-List :)","Let Get Things Done!"};
    private Color[] colors = {Color.WHITE, Color.black};
    private int currentIndex = 0;

    TitleBar() {
        this.setPreferredSize(new Dimension(400, 80));
        this.setBackground(Color.BLUE);
        titleLabel = new JLabel();
        titleLabel.setText(titles[0]);
        titleLabel.setPreferredSize(new Dimension(200, 60));
        titleLabel.setFont(new Font("Sans-serif", Font.BOLD, 20));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(titleLabel);
        // Initialize the timer to update the title every 2 seconds
        timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTitle(); // Update the title
            }
        });
        timer.start(); // Start the timer
    }

    // Method to update the title
    private void updateTitle() {
        titleLabel.setText(titles[currentIndex]); // Set the current title
        titleLabel.setForeground(colors[currentIndex]);// Set the current color
        currentIndex = (currentIndex + 1) % titles.length; // Move to the next title
    }

}

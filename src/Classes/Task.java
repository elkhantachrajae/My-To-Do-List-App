package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Task extends JLabel {
    private JLabel index;
    private JTextField TaskName;
    private JButton Done;
    private  Boolean cheked;
    //constructor
    Task(){
        this.setPreferredSize(new Dimension(400,20));
        this.setLayout(new BorderLayout());
        cheked=false;
        index=new JLabel();
        index.setPreferredSize(new Dimension(15,15));
        index.setHorizontalAlignment(JLabel.CENTER);
        index.setFont(new Font("Serif", Font.BOLD, 18));
        index.setBackground(Color.LIGHT_GRAY);
        index.setOpaque(true);
        this.add(index,BorderLayout.WEST);
        TaskName=new JTextField("  Your Task Here!");
        TaskName.setBounds(120,10,260,10);
        TaskName.setFont(new Font("Sans-Serif",Font.BOLD,20));
        TaskName.setBorder(BorderFactory.createEmptyBorder());
        TaskName.setBackground(Color.decode("#d0efff"));
        TaskName.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Clear the text when the text field gains focus
                if (TaskName.getText().equals("  Your Task Here!")) {
                    TaskName.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // If the text field loses focus and is empty, reset the text
                if (TaskName.getText().isEmpty()) {
                    TaskName.setText("  Your Task Here!");
                }
            }
        });
        this.add(TaskName);
        Done=new JButton("Done");
        Done.setPreferredSize(new Dimension(40,20));
        Done.setBorder(BorderFactory.createEmptyBorder());
        Done.setFocusPainted(false);
        Done.setFont(new Font("serif",Font.BOLD,15));
        Done.setBackground(Color.LIGHT_GRAY);
        this.add(Done,BorderLayout.EAST);

    }
    public JButton getDone(){
        return Done;
    }
    public void changeIndex(int num){
        this.index.setText(num+"");
        this.revalidate();
    }
    public void changeState(){
        this.setBackground(Color.green);
        TaskName.setBackground(Color.decode("#187bcd"));
        cheked=true;
        revalidate();
    }

    public boolean getState() {
        return cheked;
    }
}

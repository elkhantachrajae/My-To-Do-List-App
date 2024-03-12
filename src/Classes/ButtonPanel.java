package Classes;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
public class ButtonPanel extends JPanel{
    private JButton addTask;
    private JButton clear;
    Border lineBorder = BorderFactory.createLineBorder(Color.BLACK, 2);
    ButtonPanel(){
        this.setPreferredSize(new Dimension(400,60));
        this.setBackground(Color.BLUE);
        addTask=new JButton("Add task");
        addTask.setPreferredSize(new Dimension(130,50));
        addTask.setBorder(lineBorder);
        addTask.setFont(new Font("serif",Font.BOLD,20));
        addTask.setVerticalAlignment(JButton.CENTER);
        addTask.setBackground(Color.LIGHT_GRAY);
        this.add(addTask);
        this.add(Box.createHorizontalStrut(30));
        clear=new JButton("Clear");
        clear.setPreferredSize(new Dimension(130,50));
        clear.setBorder(lineBorder);
        clear.setVerticalAlignment(JButton.CENTER);
        clear.setBackground(Color.LIGHT_GRAY);
        clear.setFont(new Font("serif",Font.BOLD,20));
        this.add(clear);
    }
    public JButton getAddTask(){

        return addTask;
    }
    public JButton getClear(){
        return clear;

    }
}

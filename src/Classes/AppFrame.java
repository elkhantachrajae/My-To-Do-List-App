package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class AppFrame extends JFrame {
    private static TitleBar title;
    private  static ButtonPanel btnPanel;
    private static List list;
    private static JButton AddTask;
    private static JButton clear;
    AppFrame(){
            this.setSize(600, 600);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setTitle("My To Do List ;)");
            this.setVisible(true);
            ImageIcon Logo = new ImageIcon("FrameLogo.jpg");
            this.setIconImage(Logo.getImage());
            title = new TitleBar();
            list = new List();
            btnPanel = new ButtonPanel();
            this.add(title, BorderLayout.NORTH);
            this.add(btnPanel, BorderLayout.SOUTH);
            this.add(list, BorderLayout.CENTER);
            AddTask = btnPanel.getAddTask();
            clear = btnPanel.getClear();
            addListeners();
        }
        public void addListeners() {
            AddTask.addMouseListener(new MouseListener() {

                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {
                    Task task = new Task();
                    list.add(task);
                    list.updateNumbers();
                    task.getDone().addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            task.changeState();
                            revalidate();
                        }
                    });
                    revalidate();
                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {

                }


            });
            clear.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {
                    list.removeCompletedTasks();
                    repaint();
                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });
        }
    }

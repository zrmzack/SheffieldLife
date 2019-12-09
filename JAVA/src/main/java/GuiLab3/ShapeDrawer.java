package GuiLab3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.ArrayList;
import java.util.List;

public class ShapeDrawer extends JFrame implements ActionListener, ComponentListener {

    private MyPanel drawingPanel; // a panel to draw polygons

    public ShapeDrawer() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        this.setBounds((int) width / 4, (int) height / 4, (int) width / 2, (int) height / 2);

        Container contentPane = this.getContentPane();
        drawingPanel = new MyPanel();
        drawingPanel.addComponentListener(this);
        contentPane.add(drawingPanel, BorderLayout.CENTER);
        JPanel columnOfButtons = new JPanel(new GridLayout(8, 1));
        List<String> list = new ArrayList<>();
        makeButton(columnOfButtons, "square", this);
        makeButton(columnOfButtons, "circle", this);
        makeButton(columnOfButtons, "triangle", this);
        makeButton(columnOfButtons, "red", this);
        makeButton(columnOfButtons, "blue", this);
        makeButton(columnOfButtons, "green", this);
        makeButton(columnOfButtons, "Clear", this);
        makeButton(columnOfButtons, "Exit", this);
        contentPane.add(columnOfButtons,
                BorderLayout.EAST);
    }

    private void makeButton(JPanel p, String name, ActionListener target) {
        JButton b = new JButton(name);
        // add it to the specified JPanel and make the JPanel listen
        p.add(b);
        b.addActionListener(target);
    }

    List<Integer> list = new ArrayList<>();

    @Override
    public void actionPerformed(ActionEvent e) {
        // Do the appropriate thing depending on which button is pressed.
        // Use the getActionCommand() method to identify the button.
        String command = e.getActionCommand();
        System.out.println(command);
        if (command.equals("Exit")) {
            System.exit(0);
        } else if (command.equals("Clear")) {
            drawingPanel.setPolygon(0);
        } else {
            if (command.equals("square")) {
                int sides = 4;
                list.add(4);
                drawingPanel.setPolygon(sides);
            } else if (command.equals("triangle")) {
                int sides = 3;
                list.add(3);
                drawingPanel.setPolygon(sides);
            } else if (command.equals("circle")) {
                int sides = 1000;
                list.add(1000);
                drawingPanel.setPolygon(sides);
            } else if (command.equals("blue")) {
                drawingPanel.setColor(Color.blue);
                drawingPanel.setPolygon(list.get(list.size()-1));
            } else if (command.equals("green")) {
                drawingPanel.setColor(Color.green);
                drawingPanel.setPolygon(list.get(list.size()-1));
            } else if (command.equals("red")) {
                drawingPanel.setColor(Color.red);
                drawingPanel.setPolygon(list.get(list.size()-1));
            }

        }

    }

    public static void main(String args[]) {
        JFrame frm = new ShapeDrawer();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }

    @Override
    public void componentResized(ComponentEvent e) {
        if (e.getSource() == drawingPanel) {
            drawingPanel.setPolygon();
        }

    }

    @Override
    public void componentMoved(ComponentEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void componentShown(ComponentEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void componentHidden(ComponentEvent e) {
        // TODO Auto-generated method stub

    }

}

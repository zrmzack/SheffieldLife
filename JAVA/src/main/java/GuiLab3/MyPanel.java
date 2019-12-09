package GuiLab3;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    // TODO
    // everything

    private double radius;
    private Polygon polygon;
    private double xCentre, yCentre;
    private int sides;
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public MyPanel() {
        setBackground(Color.white);
        polygon = null;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(color);
        if (polygon != null) {
            g2.draw(polygon);
        }
    }


    public void setPolygon(int sides) {
        this.sides = sides;
        this.setPolygon();
    }

    public void setPolygon() {
        // coordinates of the centre of this JPanel
        xCentre = this.getWidth() / 2.0;
        yCentre = this.getHeight() / 2.0;

        // Radius of a circle that will occupy 90% of the smaller X or Y dimension
        radius = Math.min(xCentre, yCentre) * 0.9;

        int[] xs = new int[sides];
        int[] ys = new int[sides];
        double increment = 2 * Math.PI / sides;
        for (int i = 0; i < sides; i++) {
            xs[i] = (int) (xCentre + radius * Math.cos(i * increment));
            ys[i] = (int) (yCentre + radius * Math.sin(i * increment));
        }
        polygon = new Polygon(xs, ys, sides);
        this.repaint();
    }

//	public void paintComponent(Graphics g) {
//		super.paintComponent(g);
//
//		Graphics2D g2 = (Graphics2D) g;
//		g2.setColor(Color.RED);
//		if (polygon != null) {
//			g2.draw(polygon);
//		}
//	}

}

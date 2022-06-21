import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<BouncingBox> boxes = new ArrayList<BouncingBox>();
    BouncingOval oval1;

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        boxes.add(new BouncingBox(200, 50, Color.RED));
        boxes.get(0).setMovementVector(1, 1);
        boxes.add(new BouncingBox(144, 114, Color.CYAN));
        boxes.get(1).setMovementVector(6, -5);
        boxes.add(new BouncingBox(122, 152, Color.MAGENTA));
        boxes.get(2).setMovementVector(-7, -4);
        oval1 = new BouncingOval(70, 70, Color.YELLOW);
        oval1.setMovementVector(1, 5);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        surface.drawOval(30, 40, 50, 70);
        surface.drawRect(70, 50, 40, 30);
        for (int i = 0; i < boxes.size(); ++i) {
            boxes.get(i).draw(surface);
        }
        oval1.draw(surface);
    }
}
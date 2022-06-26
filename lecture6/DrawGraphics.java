import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    private static int index = 0;
    private static ArrayList<Bouncer> bouncerObjs = new ArrayList<Bouncer>();
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Rectangle box = new Rectangle(15, 20, Color.RED);
        bouncerObjs.add(new Bouncer(100, 170, box));
        bouncerObjs.get(index).setMovementVector(3, 1);
        index++;
        Oval circle = new Oval(22, 33, Color.green);
        bouncerObjs.add(new Bouncer(100, 170, circle));
        bouncerObjs.get(index).setMovementVector(-3, -1);
        index++;
    }

    /** Draw the contents of the window on surface. */
    public static void draw(Graphics surface) {
        for (int i = 0; i < index; ++i) {
            bouncerObjs.get(i).draw(surface);
        }
    }
}
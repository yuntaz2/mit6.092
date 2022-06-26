import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    private static int idx = 0;
    private static ArrayList<Mover> moverObjs = new ArrayList<Mover>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        moverObjs.add(new Bouncer(100, 170, new Rectangle(15, 20, Color.RED)));
        moverObjs.get(idx).setMovementVector(3, 1);
        idx++;
        moverObjs.add(new Bouncer(100, 170, new Oval(22, 33, Color.green)));
        moverObjs.get(idx).setMovementVector(-3, -1);
        idx++;
        moverObjs.add(new StraightMover(155, 155, new Rectangle(15, 51, Color.yellow)));
        moverObjs.get(idx).setMovementVector(1, 1);
        idx++;
        moverObjs.add(new StraightMover(122, 152, new Oval(36, 14, Color.blue)));
        moverObjs.get(idx).setMovementVector(-1, -1);
        idx++;
    }

    /** Draw the contents of the window on surface. */
    public static void draw(Graphics surface) {
        for (int i = 0; i < idx; ++i) {
            moverObjs.get(i).draw(surface);
        }
    }
}
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    private static int bouncerIdx = 0;
    private static ArrayList<Bouncer> bouncerObjs = new ArrayList<Bouncer>();
    private static int straightIdx = 0;
    private static ArrayList<StraightMover> straightObjs = new ArrayList<StraightMover>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Rectangle box = new Rectangle(15, 20, Color.RED);
        bouncerObjs.add(new Bouncer(100, 170, box));
        bouncerObjs.get(bouncerIdx).setMovementVector(3, 1);
        bouncerIdx++;
        Oval circle = new Oval(22, 33, Color.green);
        bouncerObjs.add(new Bouncer(100, 170, circle));
        bouncerObjs.get(bouncerIdx).setMovementVector(-3, -1);
        bouncerIdx++;
        Rectangle box2 = new Rectangle(15, 51, Color.yellow);
        straightObjs.add(new StraightMover(155, 155, box2));
        straightObjs.get(straightIdx).setMovementVector(1, 1);
        straightIdx++;
        Oval circle2 = new Oval(36, 14, Color.blue);
        straightObjs.add(new StraightMover(122, 152, circle2));
        straightObjs.get(straightIdx).setMovementVector(-1, -1);
        straightIdx++;
    }

    /** Draw the contents of the window on surface. */
    public static void draw(Graphics surface) {
        for (int i = 0; i < bouncerIdx; ++i) {
            bouncerObjs.get(i).draw(surface);
        }
        for (int i = 0; i < straightIdx; ++i) {
            straightObjs.get(i).draw(surface);
        }
    }
}
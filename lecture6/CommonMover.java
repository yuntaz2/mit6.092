public class CommonMover {
    public int x;
    public int y;
    public int xDirection;
    public int yDirection;
    public Sprite sprite;

    public CommonMover(int startX, int startY, Sprite sprite) {
        x = startX;
        y = startY;
        this.sprite = sprite;
    }

    public void setMovementVector(int xIncrement, int yIncrement) {
        xDirection = xIncrement;
        yDirection = yIncrement;
    }
}

import java.awt.Color;
import java.awt.Graphics;

public class Avatar {
    private int x, y;

    public Avatar(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLUE); //
        g.fillRect(x, y, 32, 32);
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void interactWithBlock(Block block) {
        int blockType = block.getType();
        if (blockType == 0) {

        } else if (blockType == 1) {
        } else if (blockType == 2) {
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

import java.awt.Color;
import java.awt.Graphics;

public class Block {
    private int type;
    private Color color;

    public Block(int type) {
        this.type = type;
        if (type == 0) {
            color = Color.ORANGE;
        } else if (type == 1) {
            color = Color.GRAY;
        } else if (type == 2) {
            color = Color.GREEN;
        }
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(color);
        g.fillRect(x, y, 32, 32);
    }

    public int getType() {
        return type;
    }
}

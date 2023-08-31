import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class World extends JPanel implements Runnable, KeyListener {
    private Block[][] blocks;
    private Avatar avatar;

    public World() {
        blocks = new Block[48][22];
        for (int i = 0; i < blocks.length; i++) {
            for (int j = 0; j < blocks[i].length; j++) {
                blocks[i][j] = new Block((i + j) % 3);
            }
        }
        avatar = new Avatar(0, 32); // Posição inicial do avatar

        JFrame frame = new JFrame("Minecraft");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.pack();
        frame.setVisible(true);

        setPreferredSize(new Dimension(320, 320));
        addKeyListener(this);
        setFocusable(true);

        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        while (true) {
            repaint();
            try {
                Thread.sleep(16);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.CYAN);
        g.fillRect(0, 0, getWidth(), getHeight() / 2);

        g.setColor(Color.GREEN);
        g.fillRect(0, getHeight() / 2, getWidth(), getHeight() / 2);

        for (int i = 0; i < blocks.length; i++) {
            for (int j = 0; j < blocks[i].length; j++) {
                blocks[i][j].draw(g, i * 32, j * 32 + getHeight() / 2);
            }
        }

        // Draw avatar
        avatar.draw(g);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_LEFT) {
            avatar.move(-32, 0);
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            avatar.move(32, 0);
        } else if (keyCode == KeyEvent.VK_UP) {
            avatar.move(0, -32);
        } else if (keyCode == KeyEvent.VK_DOWN) {
            avatar.move(0, 32);
        } else if (keyCode == KeyEvent.VK_SPACE) {
            placeBlock();
        }
        destroyBlockUnderAvatar();
        interactWithBlockUnderAvatar();
    }

    private void placeBlock() {
        int avatarX = avatar.getX() / 32;
        int avatarY = avatar.getY() / 32;
        if (avatarX >= 0 && avatarX < blocks.length && avatarY >= 0 && avatarY < blocks[0].length) {
            blocks[avatarX][avatarY] = new Block(blocks[avatarX][avatarY].getType());
        }
    }

    private void destroyBlockUnderAvatar() {
        int avatarX = avatar.getX() / 32;
        int avatarY = avatar.getY() / 32;
        if (avatarX >= 0 && avatarX < blocks.length && avatarY >= 0 && avatarY < blocks[0].length) {

            blocks[avatarX][avatarY] = new Block(0);
        }
    }

    private void interactWithBlockUnderAvatar() {
        int avatarX = avatar.getX() / 32;
        int avatarY = avatar.getY() / 32;
        if (avatarX >= 0 && avatarX < blocks.length && avatarY >= 0 && avatarY < blocks[0].length) {
            avatar.interactWithBlock(blocks[avatarX][avatarY]);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(World::new);
    }
}

import java.awt.Color;
import javax.swing.JPanel;

public class GamePanel extends JPanel {

    private World world;

    @Override
    protected void paintComponent(java.awt.Graphics g) {
/*        // Paint the background white
        g.setColor(java.awt.Color.WHITE);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        // Sample drawing statements
        g.setColor(Color.BLACK);
        g.drawRect(200, 200, 30, 30);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(140, 140, 30, 30);
        g.fillRect(260, 140, 30, 30);
        g.setColor(Color.BLACK);
        g.drawLine(150, 300, 280, 300);
        g.drawString("@@@", 135,120);
        g.drawString("@@@", 255,120);*/

        if(world == null){
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            return;
        }
        else {

            int cellX = this.getWidth() / world.getWidth();
            int cellY = this.getHeight() / world.getHeight();

            g.setColor(Color.WHITE);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());

            g.drawString(Integer.toString(world.getGenerationCount()), 10,getHeight()-50);

            for (int i = 0; i < world.getHeight(); i++) {
                for (int j = 0; j < world.getWidth(); j++) {
                    g.setColor(Color.lightGray);
                    if (cellX < cellY) {
                        g.drawRect(j * cellX, i * cellX, cellX, cellX);
                        if (world.getCell(i, j)) {
                            g.setColor(Color.BLACK);
                            g.fillRect(j * cellX, i * cellX, cellX, cellX);
                        }
                    } else {
                        g.drawRect(j * cellY, i * cellY, cellY, cellY);
                        if (world.getCell(i, j)) {
                            g.setColor(Color.BLACK);
                            g.fillRect(j * cellY, i * cellY, cellY, cellY);
                        }
                    }
                }
            }

        }
    }

    public void display(World w) {
        world = w;
        repaint();
    }

}

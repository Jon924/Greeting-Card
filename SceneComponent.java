import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.Color;

public class SceneComponent extends JComponent
{

   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      Graphics2D g2 = (Graphics2D) g;
      
      // Background color
      Color bg = new Color(251, 246, 242);
      
      g2.setColor(bg);
      g2.fillRect(0, 0, this.getWidth(), this.getHeight());
          
      int w = 15;
      int h = 15;
      
      int hSpace = this.getWidth() / (w + 1);
      int vSpace = this.getHeight() / (h + 2);
      
      int totalItems = w * h;
      DrawableItem[] items = new DrawableItem[totalItems];
      
      for (int i = 0; i < totalItems; i++) {
          DrawableItem[] choices = {
              new Turkey(),
              new Pumpkin(),
              new GreenPumpkin(),
              new Corn()
          };
          
          int choice = (int)(Math.random() * choices.length);
          items[i] = choices[ choice ];
          
          items[i].draw(
            g2,
            (i % w + 1) * hSpace - 20 + (
                items[i] instanceof Turkey ? 220 :
                items[i] instanceof Corn ? 10 : 0
            ),
            (i / w + 1) * vSpace + 10 + (
                items[i] instanceof Turkey ? 20 :
                items[i] instanceof Corn ? -10 : 0
            )
          );
      }
   }
}

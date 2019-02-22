import java.awt.Graphics2D;

public abstract class DrawableItem
{
    private int dx;
    private int dy;
    private double scale;
    
    public DrawableItem(int dx, int dy, double scale) {
        this.dx = dx;
        this.dy = dy;
        
        this.scale = scale;
    }
    
    public DrawableItem() {
        this(0, 0, 1);
    }
    
    abstract void paint(Graphics2D g2, double x, double y, double scale, int rotation);
    
    public void draw(Graphics2D g2, double x, double y, double scale, int rotation) {
        scale *= this.scale;
        this.paint(g2, scale * this.dx + x, scale * this.dy + y, scale, rotation);
    }
    
    public void draw(Graphics2D g2, double x, double y, double scale) {
        this.draw(g2, x, y, scale, 0);
    }
    
    public void draw(Graphics2D g2, double x, double y) {
        this.draw(g2, x, y, 1);
    }
    
    public void draw(Graphics2D g2) {
        this.draw(g2, 0, 0);
    }
}

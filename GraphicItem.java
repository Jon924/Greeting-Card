import java.awt.Graphics2D;
import java.awt.Polygon;

public class GraphicItem extends DrawableItem
{
    private final SVGPolygon[] shapes;
    
    public GraphicItem(SVGPolygon[] shapes, int dx, int dy, double scale) {
        super(dx, dy, scale);
        this.shapes = shapes;
    }
    
    private SVGPolygon[][] transpose(SVGPolygon[][] matrix) {
        SVGPolygon[][] res = new SVGPolygon[matrix[0].length][matrix.length];
        
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                res[i][j] = matrix[j][i];
            }
        }
        
        return res;
    }
    
    public void paint(Graphics2D g2, double x, double y, double scale, int rotation) {
        for (int i = 0; i < this.shapes.length; i++) {
            this.shapes[i].draw(g2, x, y, scale, rotation);
        }
    }
}

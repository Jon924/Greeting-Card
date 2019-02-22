import java.awt.Color;
import java.awt.Polygon;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class SVGPolygon extends DrawableItem
{
    public int[][] coordinates;
    public Color color;
    
    public SVGPolygon(String coordinates, Color color) {
        String[] pairs = coordinates.split(" ");
        int[][] coords = new int[pairs.length][2];
        
        int[] item;
        String[] res;
        for (int i = 0; i < pairs.length; i++) {
            item = new int[2];
            res = pairs[i].split(",");
            
            for (int j = 0; j < 2; j++) {
                item[j] = (int) Float.valueOf(res[j]).floatValue();
            }
            
            coords[i] = item;
        }
        
        this.coordinates = coords;
        this.color = color;
    }
    
    public int[][] transpose() {
        int[][] res = new int[this.coordinates[0].length][this.coordinates.length];
        
        for (int i = 0; i < this.coordinates[0].length; i++) {
            for (int j = 0; j < this.coordinates.length; j++) {
                res[i][j] = this.coordinates[j][i];
            }
        }
        
        return res;
    }
    
    public void paint(Graphics2D g2, double x, double y, double scale, int rotation) {
        int[][] coords = this.transpose();
        Polygon self = new Polygon(coords[0], coords[1], coords[0].length);
        
        // Scale
        AffineTransform oldTransform = g2.getTransform();
        
        AffineTransform scaleMatrix = new AffineTransform();
        
        scaleMatrix.rotate(Math.toRadians(rotation), x, y);
        scaleMatrix.scale(scale, scale);
        
        g2.setTransform(scaleMatrix);
        
        self.translate((int)( x / scale ), (int)( y / scale ));
        
        g2.setColor(this.color);
        g2.fill(self);
        
        g2.setTransform(oldTransform);
    }
}

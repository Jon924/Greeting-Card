import java.awt.Color;

public class Corn extends GraphicItem
{
    public Corn() {
        super(new SVGPolygon[]{
            new SVGPolygon(
                "92.6,0 80.8,2 66.1,10.5 43.6,44.5 28.6,96.5 16.1,179 56.6,284 92.6,308.4",
                Color.decode("#FDC02F")
            ),
            
            new SVGPolygon(
                "92.6,0 104.3,2 119.1,10.5 141.6,44.5 156.6,96.5 166.6,176.5 128.6,284 92.6,308.4",
                Color.decode("#FFB1F0")
            ),
            
            new SVGPolygon(
                "13.8,160.2 0,252.4 18.1,340.3 48.3,380.9 92.6,397.2 92.6,306.7 54.6,264.9",
                Color.decode("#FDC127")
            ),
            
            new SVGPolygon(
                "171.4,160.2 185.2,252.4 167.1,340.3 136.9,380.9 92.6,397.2 92.6,306.7 130.6,264.9",
                Color.decode("#9FA200")
            ),
            
            new SVGPolygon(
                "92.6,308.4 64.7,322.2 36.2,335.2 31,344.7 33.9,356.7 61.8,388.7 92.6,396",
                Color.decode("#9FB3F3")
            )
        }, 10, 150, 0.125);
    }
}
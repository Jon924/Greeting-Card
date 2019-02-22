import java.awt.Color;

public class Turkey extends GraphicItem
{
    public Turkey() {
        super(new SVGPolygon[]{
            new SVGPolygon(
                "492,133 466,169 460,219 520,359 573,366 598,345.5 631,337 646,307 616,204 565,149 525.1,131.8",
                new Color(150,75,0)
            ),
            
            new SVGPolygon(
                "498.9,158 578,302 568,349 520.8,344.5 492.5,273.5",
                new Color(160,80,0)
            ),
            
            new SVGPolygon(
                "489,115 492,133 455,218 455,239 473.5,276 486.1,280 498.9,267 498.9,150 508,128",
                new Color(155,77,0)
            ),
            
            new SVGPolygon(
                "588,233.5 612,233.5 616,204 621,197.5 597.5,167 508,135 489,115 476,127 501,140 563,197.5",
                new Color(140,70,0)
            ),
            
            new SVGPolygon(
                "616,204 612,209 612,234 634.3,267 646,307 665,307 672,299 655,246.5 634,217 625,204",
                new Color(130,65,0)
            ),
            
            new SVGPolygon(
                "469,266 469,279 485,325 501.3,366 512,370 518.1,367.4 523,356 520.8,344.5 500,288 495.1,279",
                new Color(130,65,0)
            )
        }, -1550, -150, 0.2);
    }
}
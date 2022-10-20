package snake;

/*
 * @author Sebastián
 */

import java.awt.Color;
import java.util.ArrayList;

class Snake {
    private Color color;
    private int speed;
    private ArrayList<Point> body = new ArrayList<Point>();
    
    public Snake() {
        color = Color.GREEN;
        speed = 1;
        body.add(new Point(5,2));
        body.add(new Point(4,2));
        body.add(new Point(3,2));
    }
    
    public ArrayList<Point> getBody() {
        return body;
    }
    
    public Color getColor() {
        return color;
    }
    
    //public void setColor(Color color) {
        //this.color = color;
    //}
    
    public int getSpeed() {
        return speed;
    }
    
}

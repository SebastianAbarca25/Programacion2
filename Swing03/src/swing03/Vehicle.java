package swing03;

/*
 * @author Sebastián
 */

import java.awt.Color;

public class Vehicle {
    private int speedX, speedY;
    private Color color;
    private Point point;
    
    public Vehicle (int x, int y, int speedX, int speedY, Color color) {
        point = new Point(x,y);
        this.speedX = speedX;
        this.speedY = speedY;
        this.color = color;
    }
    
    public Vehicle (Point d, int speedX,int speedY, Color color){
        Point point = new Point(d.getX(), d.getY());
        this.speedX = speedX;
        this.speedY = speedY;
        this.color = color;
    }
    
    public void move(){
        point.addX(speedX);
        point.addY(speedY);
    }
    
    public void setSpeedX(int speed){
        this.speedX = speed;
    }
    
    public void setSpeedY(int speed){
        this.speedY = speed;
    }
    
    public int getSpeedX(){
        return speedX;
    }
    
    public int getSpeedY(){
        return speedY;
    }
    
    public Color getColor() {
        return color;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }
    
    public Point getPoint() {
        return point;
    }
        
}
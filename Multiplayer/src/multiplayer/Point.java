package multiplayer;

/*
 * @author Sebastián
 */

public class Point {
    private double x;
    private double y;

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double xP){
        this.x=xP;
    }
    public void setY(double yP){
        this.y=yP;
    }
    //public Point getPoint(){
    //    Point p = new Point(getX(), getY());
    //    return p;
    //}


        
}
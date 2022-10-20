package swing03;

/*
 * @author Sebastián
 */

public class Point {
    private int x, y;

    //public Point(){
        //x = 0;
        //y = 0;
    //}

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void addX(int x) {
        this.x += x;
    }
    
    public void addY(int y) {
        this.y += y;
    }
    
    public boolean compare (Point d) {
        if ( x == d.getX() && y == d.getY())
            return true;
        else
        return false;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }
    
}
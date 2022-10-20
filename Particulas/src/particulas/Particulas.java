package particulas;

/*
 * @author Sebastián
 */

import java.awt.Color;

class Particulas {
    private int x, y;
    private Color color;

    public Particulas(int x, int y) {
        this.x = x; this.y = y;
        color = Color.RED;
    }
    
    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public Color getColor() {
        return color;
    }
    
    public void move() {
        int moveX = Math.random() > 0.5? 1: -1;
        int moveY = Math.random() > 0.5? 1: -1;
        x = x + moveX;
        y = y + moveY;
    }
}
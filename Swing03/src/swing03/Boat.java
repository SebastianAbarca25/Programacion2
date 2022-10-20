package swing03;

/*
 * @author Sebastián
 */

import java.awt.Color;
import java.awt.Graphics;

public class Boat extends Vehicle {
    private int w, h;    
    
    public Boat(int x, int y, int speedX, int speedY, Color color, int w, int h) {
        super(x, y, speedX, speedY, color);
        this.w = w;
        this.h = h;
    }
    
    public void draw(Graphics g) {
        g.setColor(this.getColor());
            g.fillRect(getPoint().getX(), getPoint().getY(), w, h);
            
        g.setColor(Config.COLOR_BOAT);
        
        //Tamaño del Bote
        double x1 = w, x2 = w;
        double y1 = h;
        x1 *= 0.15; x2 *= 0.65;
        y1 *= 0.8;
        
        //Vela del barco
        g.setColor(Color.WHITE);
        g.fillOval(getPoint().getX() + 25, getPoint().getY() + -45, 18, 45);
        
        g.setColor(Color.BLACK);
        g.fillOval(getPoint().getX() + 28, getPoint().getY() + -50, 5, 50);
        
        //Corriente en el mar (Añadido extra)
        g.setColor(Color.CYAN);
        g.fillOval(getPoint().getX() + -28, getPoint().getY() + -30, 50, 1);
        g.fillOval(getPoint().getX() + -100, getPoint().getY() + -20, 50, 1);
        g.fillOval(getPoint().getX() + -200, getPoint().getY() + -10, 50, 1);
        g.fillOval(getPoint().getX() + -300, getPoint().getY() + 10, 50, 1);
        g.fillOval(getPoint().getX() + -55, getPoint().getY() + 10, 50, 1);
        g.fillOval(getPoint().getX() + -250, getPoint().getY() + -25, 50, 1);
        g.fillOval(getPoint().getX() + -330, getPoint().getY() + -30, 50, 1);
        g.fillOval(getPoint().getX() + -380, getPoint().getY() + -10, 50, 1);
        g.fillOval(getPoint().getX() + -130, getPoint().getY() + 10, 50, 1);
        
        g.fillOval(getPoint().getX() + 65, getPoint().getY() + 15, 50, 1);
        g.fillOval(getPoint().getX() + 100, getPoint().getY() + -20, 50, 1);
        g.fillOval(getPoint().getX() + 200, getPoint().getY() + -10, 50, 1);
        g.fillOval(getPoint().getX() + 300, getPoint().getY() + 10, 50, 1);
        g.fillOval(getPoint().getX() + 250, getPoint().getY() + -25, 50, 1);
        g.fillOval(getPoint().getX() + 330, getPoint().getY() + -30, 50, 1);
        g.fillOval(getPoint().getX() + 380, getPoint().getY() + -10, 50, 1);
        g.fillOval(getPoint().getX() + 130, getPoint().getY() + 10, 50, 1);
        
        g.fillOval(getPoint().getX() + 265, getPoint().getY() + 15, 50, 1);
        g.fillOval(getPoint().getX() + 200, getPoint().getY() + -20, 50, 1);
        g.fillOval(getPoint().getX() + 400, getPoint().getY() + -10, 50, 1);
        g.fillOval(getPoint().getX() + 600, getPoint().getY() + 10, 50, 1);
        g.fillOval(getPoint().getX() + 750, getPoint().getY() + -25, 50, 1);
    
    }
    
}
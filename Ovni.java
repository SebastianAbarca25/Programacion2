import java.awt.Color;
import java.awt.Graphics;

public class Ovni extends Vehicle {
    
    public Ovni(int x, int y, int speedX, int speedY, Color color) {
        super(x, y, speedX, speedY, color);
    }
    
    public void draw(Graphics g) {
        
        //Se le añade el color
        g.setColor(Config.COLOR_OVNI);
        
        //Se le da forma al ovni
        g.fillOval(getPoint().getX() + 12, getPoint().getY() + -13, 60, 20);
        g.fillOval(getPoint().getX() + 25, getPoint().getY() + -23, 35, 20);
        
    }
    
}

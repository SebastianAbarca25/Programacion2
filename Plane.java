import java.awt.Color;
import java.awt.Graphics;

public class Plane extends Vehicle {
    
    public Plane(int x, int y, int speedX, int speedY, Color color){
        super(x, y, speedX, speedY, color);
    }
    
    public void draw(Graphics g){
        
        //Se le añade el color
        g.setColor(Config.COLOR_PLANE);
        
        //Se le da forma al avión
        g.fillOval(getPoint().getX() + 12, getPoint().getY() + -13, 100, 30);
        
        //Aquí se dibuja las alas delanteras
        g.fillOval(getPoint().getX() + 45, getPoint().getY() + -28, 15, 60);
        
        //Aquí se dibuja la ala trasera
        g.fillOval(getPoint().getX() + 88, getPoint().getY() + -32, 18, 40);
    }
}

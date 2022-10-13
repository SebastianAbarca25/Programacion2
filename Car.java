import java.awt.Color;
import java.awt.Graphics;

public class Car extends Vehicle {
    private int w, h;
    
    public Car(int x, int y, int speedX, int speedY, Color color, int w, int h){
        super(x, y, speedX, speedY, color);
        this.w = w;
        this.h = h;
    }
    
    public void draw(Graphics g) {
        
        //Dibujando los carros
        g.setColor(this.getColor());
            g.fillRect(getPoint().getX(), getPoint().getY(), w, h);
            
        //Se le añade el color
        g.setColor(Config.COLOR_CAR);
        
        //Tamaño del carro
        double x1 = w, x2 = w;
        double y = h;
        x1 *= 0.15; x2 *= 0.65;
        y *= 0.8;
        
        //Parte de arriba del carro
        g.fillOval(getPoint().getX() + 12, getPoint().getY() + -13, 38, 25);
        
        //Dibujo las ruedas de los carros
        g.setColor(Config.Color_Wheel);
        g.fillOval(getPoint().getX() + (int)x1, getPoint().getY() + (int)y, h/2, h/2);
        g.fillOval(getPoint().getX() + (int)x2, getPoint().getY() + (int)y, h/2, h/2);
    }
}

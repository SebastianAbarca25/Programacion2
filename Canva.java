import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Canvas extends JPanel {
    
    public Canvas() {
        setPreferredSize(new Dimension(400, 300));
        setBackground(Color.GRAY);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Aquí se hace el cielo
        g.setColor(new Color(127, 233, 245));
        g.fillRect(0, 0, 400, 100);
        
        //Aquí se hace el sol
        g.setColor(Color.YELLOW);
        g.fillOval(40, 40, 20, 20);
        
        //Cambio hecho el 1 de octubre
        //Aquí se hacen las montañas y el arbol
        Paintbrush paintBrush = new Paintbrush(g);
        paintBrush.drawSky();
        paintBrush.drawMountains();
        paintBrush.drawTree();
    }    
}

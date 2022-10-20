package swing03;

/*
 * @author Sebastián
 */

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.Action;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.plaf.DimensionUIResource;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.ArrayList;

public class MyCanvas extends JPanel implements KeyListener, ActionListener{
    Point pSun = new Point(Config.WINDOW_W/2, Config.WINDOW_H/2);
    
    //Arreglo para colocar los carros
    ArrayList<Car> car = new ArrayList<Car>();
    
    //Arreglo para colocar los ovnis
    ArrayList<Ovni> ovni = new ArrayList<Ovni>();
    
    //Arreglo para colocar los barcos
    ArrayList<Boat> boat = new ArrayList<Boat>();
    
    //Arreglo para colocar los aviones
    ArrayList<Plane> plane = new ArrayList<Plane>();

    public MyCanvas () {
        setPreferredSize(new Dimension(Config.WINDOW_W,Config.WINDOW_H));
        setBackground(Config.COLOR_BG);
        
        //Timer para que se puedan mover
        Timer timer = new Timer(50, this);
        timer.start();
        
        //Añadimos carros
        car.add(new Car(380, 155, -5, 0, Color.RED, 60, 20));
        car.add(new Car(-25, 190, 7, 0, Color.BLUE, 60, 20));
        car.add(new Car(880, 155, -6, 0, Color.WHITE, 60, 20));
        car.add(new Car(-525, 190, 5, 0, Color.ORANGE, 60, 20));
        car.add(new Car(1380, 155, -7, 0, Color.GRAY, 60, 20));
        
        //Añadimos ovnis
        ovni.add(new Ovni(-700, 220, 20, -3, Config.COLOR_OVNI));
        
        //Añadimos barcos
        boat.add(new Boat(400, 270, -2, 0, Config.COLOR_BOAT, 60, 20));
        
        //Añadimos aviones
        plane.add(new Plane(1700, 230, -10, -1, Config.COLOR_PLANE));
    }
    
    @Override //Siempre va existir este metodo 
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Paintbrush paintBrush = new Paintbrush(g);
        
        //Se dibuja el cielo
        paintBrush.drawSky();
        
        //Se dibujan las montañas
        paintBrush.drawMountains(15, 120, 100, 40, 180, 120);
        paintBrush.drawMountains(180, 120, 250, 40, 350, 120);
        paintBrush.drawMountains(100, 120, 175, 40, 250, 100);
        
        //Se dibujan los arboles
        paintBrush.drawTree(190, 10);
        paintBrush.drawTree(100, 5);
        paintBrush.drawTree(300, 10);

        //Se dibuja el sol (El que se puede mover)
        paintBrush.drawSun(pSun);
        
        //Se dibuja la carretera y las lineas de la carretera
        paintBrush.drawRoad(0, 220, 0, 165, 400, 165, 400, 220);
        paintBrush.drawLines(5, 195, 5, 185, 30, 185, 30, 195);
        paintBrush.drawLines(50, 195, 50, 185, 75, 185, 75, 195);
        paintBrush.drawLines(95, 195, 95, 185, 120, 185, 120, 195);
        paintBrush.drawLines(145, 195, 145, 185, 170, 185, 170, 195);
        paintBrush.drawLines(190, 195, 190, 185, 215, 185, 215, 195);
        paintBrush.drawLines(235, 195, 235, 185, 260, 185, 260, 195);
        paintBrush.drawLines(280, 195, 280, 185, 305, 185, 305, 195);
        paintBrush.drawLines(325, 195, 325, 185, 350, 185, 350, 195);
        paintBrush.drawLines(370, 195, 370, 185, 395, 185, 395, 195);
        
        //Se dibuja el mar
        paintBrush.drawSea(0, 300, 0, 230, 400, 230, 400, 300);
        
        //Ciclos donde se podran mostrar los vehiculos conforme el timer y el metodo move
        //Carros
        for(Car c : car){
           c.move();
           c.draw(g);
        }
        
        //Ovni
        for(Ovni o : ovni){
           o.move();
           o.draw(g);
        }
        
        //Barco
        for(Boat b : boat){
           b.move();
           b.draw(g);
        }
        
        //Avión
        for(Plane p : plane){
           p.move();
           p.draw(g);
        }
        
        //paintBrush.drawCar(230, 200, 230, 220, 290, 220, 290, 200);
        
    }

    @Override 
    public void keyPressed(KeyEvent event){

        int key = event.getKeyCode(); 
        if(key == KeyEvent.VK_UP){
            pSun.setY(pSun.getY()-Config.SUN_STEP);
        }

        if(key == KeyEvent.VK_DOWN){
            pSun.setY(pSun.getY()+Config.SUN_STEP);
        }

        if(key == KeyEvent.VK_RIGHT){
            pSun.setX(pSun.getX()+Config.SUN_STEP);
        }

        if(key == KeyEvent.VK_LEFT){
            pSun.setX(pSun.getX()-Config.SUN_STEP);
        }

        repaint();

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        /*int x = pSun.getX();
        x = x + 1;
        pSun.setX(x);
        int y = pSun.getY();
        y = y + 1;
        pSun.setY(y);
        */
        
        repaint();
        
    }
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
}
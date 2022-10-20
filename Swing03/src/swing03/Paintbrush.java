package swing03;

/*
 * @author Sebastián
 */

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;

public class Paintbrush {
    private Graphics g;
    
    public Paintbrush(Graphics g){
        this.g = g;
    }

    //Cielo y sol
    public void drawSky() {
        g.setColor(new Color (127, 233, 245));
        g.fillRect(0, 0, 400, 100);

        g.setColor(Color.YELLOW);
        g.fillOval(25, 20, 35, 35);
    }

    //Sol que se puede mover
    public void drawSun(Point p){

        g.setColor(Config.COLOR_SUN);
        //g.fillOval(p.getX(), p.getX(), Config.SUN_SIZE, Config.SUN_SIZE);
        
    }

    //Montañas
    public void drawMountains(int x1, int y1, int x2, int y2, int x3, int y3) {
        Polygon triangle = new Polygon();
        /* triangle.addPoint(15,120);
        triangle.addPoint(100,40);
        triangle.addPoint(180,130); */
        triangle.addPoint(x1,y1);
        triangle.addPoint(x2,y2);
        triangle.addPoint(x3,y3);
        g.setColor(Config.COLOR_MOUNTAINS);
        g.fillPolygon(triangle);
    }

    //Árboles
    public void drawTree(int start, int top) {
        /* int start = 200;
        int top = 50; */

        //Se dibuja el tronco
        g.setColor(Config.COLOR_TRUNK_TREE);
        g.fillRect(start-10, top+110, 26, 40);

        g.setColor(Config.COLOR_TREE);
        for(int i = 0; i < 5; i++ ){
            Polygon triangle = new Polygon();
            int height = 50;
            int width = 70;
            int spacing = 15;

            triangle.addPoint(start, top + (spacing * i));
            triangle.addPoint(start - (width/2), top + height + (spacing*i));
            triangle.addPoint(start + (width/2), top + height + (spacing*i));

            g.fillPolygon(triangle);
        }
    }                
    
    //Carretera
    public void drawRoad(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        Polygon rect = new Polygon();
        rect.addPoint(x1,y1);
        rect.addPoint(x2,y2);
        rect.addPoint(x3,y3);
        rect.addPoint(x4,y4);
        g.setColor(Config.Color_Road);
        g.fillPolygon(rect);
    }
    
    //Lineas de la carretera
    public void drawLines(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        Polygon rect = new Polygon();
        rect.addPoint(x1,y1);
        rect.addPoint(x2,y2);
        rect.addPoint(x3,y3);
        rect.addPoint(x4,y4);
        g.setColor(Color.YELLOW);
        g.fillPolygon(rect);
    }
    
    //Mar
    public void drawSea(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        Polygon rect = new Polygon();
        rect.addPoint(x1,y1);
        rect.addPoint(x2,y2);
        rect.addPoint(x3,y3);
        rect.addPoint(x4,y4);
        g.setColor(Color.BLUE);
        g.fillPolygon(rect);
    }
    
    /*
    public void drawCar(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        Polygon rect = new Polygon();
        rect.addPoint(x1,y1);
        rect.addPoint(x2,y2);
        rect.addPoint(x3,y3);
        rect.addPoint(x4,y4);
        g.setColor(Config.COLOR_CAR);
        g.fillPolygon(rect);
        
        g.setColor(Color.BLACK);
        g.fillOval(238, 213, 15, 15);
        g.fillOval(265, 213, 15, 15);
        
        g.setColor(Config.COLOR_CAR);
        g.fillOval(244, 186, 38, 25);
    
    } */
    
}
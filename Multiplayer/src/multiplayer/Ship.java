package multiplayer;

/*
 * @author Sebastián
 */

import java.awt.Color;
import java.util.ArrayList;
import java.awt.Graphics;

public class Ship {
    //Atributos
    private ArrayList<Point>points = new ArrayList<Point>();
    private ArrayList<Point>pointsTranlate = new ArrayList<Point>();
    private Color color;
    private double angle;
    private double x, y;
    private int dir;
    private Point p;
    public static final int UP =0, DOWN = 1, LEFT = 2, RIGHT = 3, ROTATE_RIGHT = 4, ROTATE_LEFT = 5, CANYON = 6; 

    public Ship(int x, int y, Color color, double angle){
        this.p=p;
        this.color=color;
        points.add(new Point (10,0));
        points.add(new Point (-15,-10));
        points.add(new Point (-15,10));
        //points.add(new Point (10,0));
        for(int i=0; i<points.size() ; i++){
            pointsTranlate.add(new Point(0, 0));
        }
    }
    
    public ArrayList<Point> getPointsTranlate() {
        return pointsTranlate;
    }
    
    public void setPointsTranlate(ArrayList<Point> pointsTranlate) {
        this.pointsTranlate = pointsTranlate;
    }
    /*
    public void shoot(double angle, double speed,int x,int y,char color){
        Bullet bullet=new Bullet(angle, speed, x, y, color);
        bullet.move(angle);
        
    }*/
    
    public ArrayList<Point> getPoints() {
        return points;
    }
    
    public Point getP() {
        return p;
    }
    
    public void setP(Point p) {
        this.p = p;
    }
    
    public double getAngle() {
        return angle;
    }
    
    public void setAngle(double angle) {
        this.angle = angle;
    }
    
    public double getX() {
        return x;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    public Color getColor() {
        return color;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }
    
    public void getHead() {
        
    }
    
    private void rotate(){

        for(int i = 0 ; i < points.size() ; i++){ 
            double xP, yP;
            xP = points.get(i).getX()*Math.cos(angle)-points.get(i).getY()*Math.sin(angle);
            yP = points.get(i).getX()*Math.sin(angle)+points.get(i).getY()*Math.cos(angle);
            pointsTranlate.get(i).setX(xP);
            pointsTranlate.get(i).setY(yP);
        } 
    }
    private void translate(){
        for(int i = 0 ; i < points.size() ; i++){ 
            pointsTranlate.get(i).setX(pointsTranlate.get(i).getX() + p.getX());
            pointsTranlate.get(i).setY(pointsTranlate.get(i).getY() + p.getY());
        } 
    }
    public void print(){
        rotate();
        translate();
    }
}
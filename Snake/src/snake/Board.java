package snake;

/*
 * @author Sebastián
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import javax.swing.*;

public class Board extends JPanel implements ActionListener {
    
    Snake snake;
    
    public static void main(String args[]) {
        Board b = new Board();
    }
    
    public Board() {
        setPreferredSize(new Dimension(Config.SIZE_WINDOW_W,Config.SIZE_WINDOW_H));
        setBackground(Color.LIGHT_GRAY);

        JFrame window = new JFrame("snake");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(Config.SIZE_WINDOW_W, Config.SIZE_WINDOW_H);
        window.add(this);
        window.pack();
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.add(this);
        Timer t=new Timer(1000,this);
        t.start();
        snake =new Snake();
    }
       
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(snake.getColor());
        
        for(Point p : snake.getBody()) {
            g.fillOval(p.getX()*Config.SIZE_SEG, p.getY()*Config.SIZE_SEG, Config.SIZE_SEG, Config.SIZE_SEG);
        }
        
        for(int i = 0; i < Config.SIZE_WINDOW_W; i += Config.SIZE_SEG) {
            g.drawLine(i, 0, i, Config.SIZE_WINDOW_H);
        }
        
        for(int j = 0; j < Config.SIZE_WINDOW_H; j += Config.SIZE_SEG) {
            g.drawLine(0, j, Config.SIZE_WINDOW_W, j);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        ArrayList<Point> body = new ArrayList<Point>();
        body = snake.getBody();
        int HEAD = 0;
        
        for(int i = body.size()-1; i > 0; i--) {
            int x = body.get(i-1).getX();
            body.get(i).setX(x);
            int y = body.get(i-1).getY();
            body.get(i).setY(y);
        }
        
        int y = body.get(HEAD).getY();
        y += 1;
        body.get(HEAD).setY(y);
        
        repaint();
    }
    
}
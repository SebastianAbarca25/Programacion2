package particulas;

/*
 * @author Sebastián
 */

import javax.swing.*;
import javax.swing.Timer;
import java.awt.Dimension;
import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Espacio extends JPanel implements ActionListener {
    ArrayList<Particulas> particulas = new ArrayList<Particulas>();
    
    public Espacio() {
        setPreferredSize(new Dimension(400, 300));
        
        for(int i = 0; i < 500; i++) {
            double x, y;
            x = Math.random()*399;
            y = Math.random()*299;
            particulas.add(new Particulas((int)x, (int)y));
            
            Timer timer = new Timer(120, this);
            timer.start();
        }
    }
    
    public void paintComponent(Graphics g) {
        //Particulas p;
            super.paintComponent(g);
        
        for(Particulas p: particulas) {
            //p = particulas.get();
            g.setColor(p.getColor());
            g.fillOval(p.getX(), p.getY(), 2, 2);
            System.out.println(p.getX());
        }
    }
    
    public static void main(String args[]) {
        JFrame window = new JFrame("Particulas");
        window.setVisible(true);
        window.setSize(new Dimension(400, 300));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        Espacio espacio = new Espacio();
        window.add(espacio);
        window.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(Particulas p:particulas){
            p.move();
        }
        repaint();
    }
}
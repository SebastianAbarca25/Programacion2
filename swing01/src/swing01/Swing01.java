package swing01;

/*
 * @author Sebastián
 */

import javax.swing.*;
import java.awt.Color;

class Swing01 {

    public static void main(String[] args) {
        JFrame window = new JFrame("Swing");
        JLabel label = new JLabel("Hola Java Swing");
        JButton button = new JButton("Botón");
        // Color color = new Color(255, 0, 0, 0);
        
        // window.setBackground(color);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        button.setBounds(50, 50, 100, 40);
        window.add(button);
        window.add(label);
        // label.setVisible(true);
        window.setSize(400, 300);
        window.setVisible(true);
    }
    
}
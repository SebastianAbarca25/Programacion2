package swing03;

/*
 * @author Sebastián
 */

import javax.swing.*;

public class Swing03 {

    public static void main (String args[]){
        JFrame window = new JFrame("Swing");
        MyCanvas canvas = new MyCanvas();   //Dibujar con canvas

        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(Config.WINDOW_W,Config.WINDOW_H);
        window.add(canvas);
        window.pack();  // set the "size of frame to preferred sizes"
        window.setResizable(false); // Do not change the size frame whit mouse
        window.setLocationRelativeTo(null); // center of window
        window.setVisible(true);

        window.addKeyListener(canvas);
    }
}
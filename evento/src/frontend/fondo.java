/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *

 */
public class fondo extends JDesktopPane{
    Image image;
    public fondo() {
        super();
        image = new ImageIcon(getClass().getResource("/recursos/y.jpg")).getImage();
        setBackground(new Color(69, 64, 92));
        
    }
   @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);

        
    } 
}

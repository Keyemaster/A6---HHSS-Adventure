package a6;


import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simmg9723
 */
public class JImage extends JComponent {
    private BufferedImage image;
    
    @Override
    public void paintComponent(Graphics g){
        if (image != null){
            g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
        }
    }
    
    public void setImage(BufferedImage img){
        this.image = img;
        repaint();
    }
    
}

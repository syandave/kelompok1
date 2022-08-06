/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok1;


/**
 *
 * @author Daff
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class bg1 extends JPanel{
    private Image image;
    public bg1() {
        image = new ImageIcon(getClass().getResource("/gambar/wp_login.jpg")).getImage();
      
    }


    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponents(grphcs);
        
        Graphics2D gd = (Graphics2D) grphcs.create();
        gd.drawImage(image, 0, 0, getWidth(), getHeight(), null);
        gd.dispose();
        
    }
    
}

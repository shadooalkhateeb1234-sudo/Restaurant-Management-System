
package programproject;

import java.awt.*;
import javax.swing.*;

public class ButtonShape extends JButton{
    ButtonShape(String text)
    {
        super(text);
    }
     
//    @Override
//    protected void paintComponent(Graphics g)
//    {
//        Graphics2D g2 = (Graphics2D) g;
//        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        g2.setColor(new Color(0xFFF8D005));//
//              
//        g2.fillRoundRect(200, 200, getWidth()-1, getHeight()-1, 75,75); 
//        super.paintComponent(g);
//    }

    @Override
    protected void paintBorder(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
       // g2.setColor(new Color(245, 245, 245));
        g2.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 75,75); 
       
    } 
    
}

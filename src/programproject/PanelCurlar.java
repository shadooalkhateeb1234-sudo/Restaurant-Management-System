
package programproject;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;

public class PanelCurlar  {
    PanelCurlar()
    {
     JFrame jframe=new JFrame();
     JPanel jpanel=new JPanel(){
               @Override
    protected void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
         super.paintComponent(g);
        Color color1 = new Color(0x00000);
        Color color2 = new Color(0, 0, 0);
        GradientPaint gradient = new GradientPaint(0,0, color1, getWidth(),getHeight(), color2);
        g2.setPaint(gradient);
        //g2.fillRect(0, 0, getWidth()-2, getHeight()-2);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Shape roundedRectangle = new RoundRectangle2D.Double(0, 0, getWidth() - 2, getHeight() - 2 ,200, 200);
        
       // g2.setColor(new Color(0x0000000));
        g2.fill(roundedRectangle);

        // رسم الحواف
        g2.setColor(new Color(0xfff8d008 ));
        g2.draw(roundedRectangle);//
       
              
        
    }  
     };
     jframe.setSize(1000, 600);
     jpanel.setSize(900, 500);
     jframe.add(jpanel);
     jframe.setVisible(true);
     jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
    }
    
}

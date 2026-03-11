
package programproject;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class WelcomeFrame implements MouseListener {
    String titel="𝓌𝑒𝓁𝒸𝑜𝓂𝑒 𝓉𝑜 𝓉𝒽𝑒 𝒷𝑒𝓈𝓉 𝓈𝑒𝓇𝓋𝒾𝒸𝑒";
    JFrame jFrame=new JFrame();
    JLabel jLabel=new JLabel();
    JButton jButton=new ButtonShape("𝓼𝓽𝓪𝓻𝓽");
    public WelcomeFrame(){
  JPanel background = new JPanel() {
            @Override
            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                Color color1 = new Color(0x0131000);
                Color color2 = new Color(0, 0, 0);
                GradientPaint gradient = new GradientPaint(0,0, color1, getWidth(),getHeight(), color2);
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        background.setBounds(0, 0, 1000, 600);
        jButton.setBounds(410, 380, 190, 60);
        jButton.setFocusable(false);
        jButton.setContentAreaFilled(false);
        jButton.setVisible(false);
        jButton.setBorder(BorderFactory.createLineBorder(new Color(0xFFF8D005), 3, true));
        jButton.setFont(new Font("",Font.ROMAN_BASELINE,25));
    
        
        jButton.setForeground(new Color(0xFFF8D005));
        jButton.addMouseListener(this);
        jLabel.setFont(new Font("",Font.PLAIN,35));
        jLabel.setBounds(255, 230, 520, 70);
        jLabel.setForeground(new Color(0xFFF8D005));
        jFrame.setSize(1000, 600);
        jFrame.setLayout(null);
        background.setLayout(null);
        background.add(jButton);
        background.add(jLabel );
        jFrame.add(background);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        //jFrame.getContentPane().setBackground(new Color(0x000000));
        
        for(int i=0;i<titel.length();i++)
        {
            jLabel.setText(jLabel.getText()+titel.charAt(i));
            try 
            {
                Thread.sleep(70);
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(WelcomeFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        try
        {
            Thread.sleep(1000);
            jButton.setVisible(true);
        } 
        catch (InterruptedException ex) 
        {
            System.out.println("thread"+ex);
        }
       jButton.addActionListener((ActionEvent e)->{
         jFrame.dispose();
         new MainFrame_swing();
       });
        
    }
    public static Font costumFont(String path,float size){
        Font font=null;
        try {
             font=Font.createFont(Font.TRUETYPE_FONT,new File(path));
            font=font.deriveFont(size);
        } catch (FontFormatException ex) {
            System.out.println("not found");
        } catch (IOException ex) {
            System.out.println("error");
        }
         font=font.deriveFont(size);
        return font;
    }

    @Override
    public void mouseClicked(MouseEvent me) {
       // jButton.setBorder(BorderFactory.createLineBorder(Color,2,true));
    }

    @Override
    public void mousePressed(MouseEvent me) {
       // jButton.setBorder(BorderFactory.createLineBorder(Color.red,2,true));
    }

    @Override
    public void mouseReleased(MouseEvent me) {
         //jButton.setBorder(BorderFactory.createLineBorder(Color.white,2,true));
    }

    @Override
    public void mouseEntered(MouseEvent me) {
         jButton.setForeground(Color.white);
         jButton.setBorder(BorderFactory.createLineBorder(Color.white,2,true));
    }

    @Override
    public void mouseExited(MouseEvent me) {
        jButton.setForeground(new Color(0xFFF8D005));
        jButton.setBorder(BorderFactory.createLineBorder(new Color(0xFFF8D005),2,true));
        
    }
  
 
    
}

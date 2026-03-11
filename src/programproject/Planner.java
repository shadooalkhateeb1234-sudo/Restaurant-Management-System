/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programproject;
import javax.swing.*;
import java.awt.*;

 
public class Planner extends JPanel{
  

    @Override
    public void setSize(int width, int height) {
        super.setSize(300, 200); 
   }
 

    @Override
    public void setForeground(Color fg) {
    super.setForeground(Color.decode("#FFBF00"));
    }        

    @Override
    public void setBackground(Color bg) {
         
        super.setBackground(Color.WHITE); 
    }
    private int[] values = {20, 15, 18, 22, 20, 30, 18, 14,16,21}; // القيم التي سيتم رسمها
    private  String []namemeals={"ka","yal","Chi ","sha","Bur","piz","Ch_Al","fish","Pas","Cris"};

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int barWidth = width / (values.length + 1); // عرض كل عمود
        int maxValue = getMaxValue(); // الحصول على القيمة القصوى لتحديد ارتفاع الأعمدة

        // رسم الأعمدة
        for (int i = 0; i < values.length; i++) {
            int barHeight = (int) ((double) values[i] / maxValue * (height - 50)); // حساب ارتفاع العمود
            g.fillRect((i + 1) * barWidth, height - barHeight - 30, barWidth - 10, barHeight); // رسم العمود
            g.drawString(namemeals[i], (i + 1) * barWidth + (barWidth - 10) / 4, height - 10); // إضافة التسمية
            
        }
        
        // رسم المحاور
        g.setColor(Color.decode("#FFBF00"));
        g.drawLine(0, height - 30, width, height - 30); // محور X
        g.setColor(Color.decode("#FFBF00"));
        g.drawLine(0, 0, 0, height - 30); // محور Y
       
    }

    private int getMaxValue() {
        int max = values[0];
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

 
}


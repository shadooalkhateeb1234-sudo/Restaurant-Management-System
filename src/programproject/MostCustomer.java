/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programproject;
import javax.swing.*;
import java.awt.*;

 
public class MostCustomer extends JPanel{
 
    @Override
    public void setSize(int width, int height) {
        super.setSize(300, 200); 
   }
 

   
    @Override
    public void setForeground(Color fg) {
    super.setForeground(Color.decode("#6AFB92").darker());
    }        

    @Override
    public void setBackground(Color bg) {
         
        super.setBackground(Color.WHITE); 
    }
    private int[] values = {20, 15, 18, 40, 20, 30 }; // القيم التي سيتم رسمها
    private  String []namemeals={"Nour","Aisha","Shahd","Omer","Lana","Salem" };

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
        g.setColor(Color.decode("#6AFB92").darker());
        g.drawLine(0, height - 30, width, height - 30); // محور X
        g.setColor(Color.RED);
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

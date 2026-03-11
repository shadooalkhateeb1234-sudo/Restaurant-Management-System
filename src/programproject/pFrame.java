/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programproject;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.*;

/**
 *
 * @author EslieM
 */
public class pFrame  {
    public pFrame(){
     JFrame frame = new JFrame("Order State ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 130);
        frame.setLayout(null);
        
        JProgressBar progressBar = new JProgressBar(0, 100); // Min value is 0, max value is 100
        progressBar.setValue(0); // Initial progress
        progressBar.setStringPainted(true);
        //progressBar.
        progressBar.setForeground(new Color(0xFFF8D005));
        progressBar.setBackground(Color.black);
        progressBar.setBounds(90, 30, 220, 35);
        progressBar.setBorderPainted(false);
        progressBar.setFont(new Font("Comic Sans",Font.BOLD,20));
        progressBar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
//        progressBar.setUI(new javax.swing.plaf.basic.BasicProgressBarUI() {
//            @Override
//            protected void paintString(Graphics g, int x, int y, int width, int height, int amountFull, Insets b) {
//                    super.paintString(g, x, y, width, height, amountFull, b);
//                    g.setColor(Color.RED);
//                    String progressText = progressBar.getString();
//                    FontMetrics fm = g.getFontMetrics();//حجم الخط الخاص ب الغرافك
//                    int stringWidth = fm.stringWidth(progressText);
//                    int stringHeight = fm.getAscent();
//                    int stringX = x+(width - stringWidth)/2 ;
//                    int stringY = y+ ((height - stringHeight)/2 ) + fm.getAscent();
//                    g.drawString(progressText,stringX ,stringY );
//            }});
        frame.add(progressBar);

        frame.setVisible(true);
            
                for (int i = 0; i <= 100; i++) {
                    try {
                       progressBar.setString(i+"% ");

                        Thread.sleep(60); // Simulate a delay
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    progressBar.setValue(i); // Update progress
                }
                  progressBar.setString("ready to take it (:");

            }

    }
    
          
            
            
            
//            f.add(panel);
//            f.setSize(500,500);
//            panel.setSize(500,500);
//            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            f.setLayout(null);
//            panel.setLayout(null);
       //    f.setVisible(true);
//
//            panel.setBackground(new Color(0x242450));
//            JButton b=new JButton("wellcome to the best service");
//            b.setBounds(120,200,230,50);
//            b.setFocusPainted(false);
//            b.setBorder(BorderFactory.createLineBorder(Color.black,2,true));
//            b.setContentAreaFilled(false);
//            b.setFont(new Font("italic",Font.ITALIC,16));
//            b.setForeground(Color.black);
//            panel.add(b);
    
    
    


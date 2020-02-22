package src.GUI;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;
import javax.swing.*;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;

public class VideoGameGUI {
    
    private final JButton FE7 = new JButton("");
    private final JButton GBVS = new JButton("");
    private final JButton Logo = new JButton("");
    
    JFrame VGFrame= new JFrame();

    public VideoGameGUI() {
        VGFrame.getContentPane().setBackground(new Color(175, 238, 238));
        VGFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        VGFrame.setBounds(800, 800, 800, 800);
        VGFrame.getContentPane().setLayout(null);
        
        Logo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VGFrame.dispose();
                HomePageGUI show= new HomePageGUI();
                show.HomeFrame.setVisible(true);
            }
        });
        
        Logo.setIcon(new ImageIcon(HomePageGUI.class.getResource("st,small,215x235-pad,210x230,f8f8f8.u1.jpg")));
        Logo.setBounds(6, 6, 206, 103);
        VGFrame.getContentPane().add(Logo);
        
        FE7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VGFrame.dispose();
                FireEmblem7GUI show= new FireEmblem7GUI();
                show.FE7Frame.setVisible(true);
            }
        });
        
        FE7.setBackground(new Color(238, 238, 238));
        FE7.setIcon(new ImageIcon(VideoGameGUI.class.getResource("220px-GBA_Fire_Emblem_Box.jpg")));
        FE7.setBounds(6, 121, 236, 244);
        VGFrame.getContentPane().add(FE7);
        
        GBVS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VGFrame.dispose();
                GBVSGUI show= new GBVSGUI();
                show.GBVSFrame.setVisible(true);
            }
        });
        
        GBVS.setBackground(new Color(238, 238, 238));
        GBVS.setIcon(new ImageIcon(VideoGameGUI.class.getResource("Screen Shot 2020-02-12 at 12.28.10 PM.png")));
        GBVS.setBounds(254, 121, 236, 244);
        VGFrame.getContentPane().add(GBVS);
    }

}

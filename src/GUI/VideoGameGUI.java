package GUI;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.*;  
import javax.swing.*;  


public class VideoGameGUI extends JFrame{

	public VideoGameGUI() {
		getContentPane().setBackground(new Color(175, 238, 238));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 800, 800, 800);
		getContentPane().setLayout(null);
		
		JButton Logo = new JButton("");        
		Logo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePageGUI frame= new HomePageGUI();
        		frame.setVisible(true);
			}
		});
	    Logo.setIcon(new ImageIcon(HomePageGUI.class.getResource("/GUI/st,small,215x235-pad,210x230,f8f8f8.u1.jpg")));
	    Logo.setBounds(6, 6, 206, 103);
	    getContentPane().add(Logo);
		
		JButton FE7 = new JButton("");        
		FE7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FireEmblem7GUI frame= new FireEmblem7GUI();
        		frame.setVisible(true);
			}
		});
		FE7.setBackground(new Color(238, 238, 238));
		FE7.setIcon(new ImageIcon(VideoGameGUI.class.getResource("/GUI/220px-GBA_Fire_Emblem_Box.jpg")));
		FE7.setBounds(6, 121, 236, 244);
        getContentPane().add(FE7);
	}

}

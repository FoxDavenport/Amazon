package GUI;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;
import javax.swing.*;

public class VideoGameGUI extends JFrame{
	
	private final JButton FE7 = new JButton("");
	private final JButton GBVS = new JButton("");
	private final JButton Logo = new JButton("");

	public VideoGameGUI() {
		getContentPane().setBackground(new Color(175, 238, 238));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 800, 800, 800);
		getContentPane().setLayout(null);
		
		Logo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePageGUI frame= new HomePageGUI();
				frame.setVisible(true);
			}
		});
	    
		Logo.setIcon(new ImageIcon(HomePageGUI.class.getResource("/GUI/st,small,215x235-pad,210x230,f8f8f8.u1.jpg")));
	    Logo.setBounds(6, 6, 206, 103);
	    getContentPane().add(Logo);
		
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
        
        GBVS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GBVSGUI frame= new GBVSGUI();
        		frame.setVisible(true);
			}
		});
        
        GBVS.setBackground(new Color(238, 238, 238));
        GBVS.setIcon(new ImageIcon(VideoGameGUI.class.getResource("/GUI/Screen Shot 2020-02-12 at 12.28.10 PM.png")));
        GBVS.setBounds(254, 121, 236, 244);
        getContentPane().add(GBVS);
	}
	
	public void setVG() {
		getContentPane().setBackground(new Color(175, 238, 238));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 800, 800, 800);
		getContentPane().setLayout(null);
		getContentPane().add(Logo);
		
		FE7.setBackground(new Color(238, 238, 238));
		FE7.setIcon(new ImageIcon(VideoGameGUI.class.getResource("/GUI/220px-GBA_Fire_Emblem_Box.jpg")));
		FE7.setBounds(6, 121, 236, 244);
        getContentPane().add(FE7);
		
		getContentPane().add(GBVS);

	}

}

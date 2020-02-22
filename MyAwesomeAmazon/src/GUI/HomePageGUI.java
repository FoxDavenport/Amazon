package src.GUI;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.MatteBorder; 

public class HomePageGUI {
	private final JButton TodayDeals= new JButton("Today's Deals");
	private final JButton BestSellers= new JButton("Best Sellers");
	private final JButton FindAGift= new JButton("Find a Gift");
	private final JButton CustomerService= new JButton("Customer Service");
	private final JButton Registry = new JButton("Registry");
	private final JButton NewReleases = new JButton("New Releases");
	private final JButton GiftCards = new JButton("Gift Cards");
	private final JButton Logo= new JButton("");  
	private final JButton VG = new JButton("");
	
	JFrame HomeFrame= new JFrame();

	public HomePageGUI() {
		HomeFrame.setForeground(Color.BLACK);
		HomeFrame.setBackground(Color.WHITE);
		
		HomeFrame.setBackground(Color.WHITE);
		HomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		HomeFrame.setBounds(800, 800, 800, 800);
		HomeFrame.getContentPane().setLayout(null);

		TodayDeals.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.WHITE));
		TodayDeals.setOpaque(true);
		TodayDeals.setForeground(Color.BLACK);
		TodayDeals.setBackground(Color.LIGHT_GRAY);
		TodayDeals.setBounds(224, 6, 95, 44);
		HomeFrame.getContentPane().add(TodayDeals);
		
		BestSellers.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.WHITE));
		BestSellers.setOpaque(true);
		BestSellers.setForeground(Color.BLACK);
		BestSellers.setBackground(Color.LIGHT_GRAY);
		BestSellers.setBounds(331, 62, 95, 44);
		HomeFrame.getContentPane().add(BestSellers);
		
		FindAGift.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.WHITE));
		FindAGift.setOpaque(true);
		FindAGift.setForeground(Color.BLACK);
		FindAGift.setBackground(Color.LIGHT_GRAY);
		FindAGift.setBounds(224, 62, 95, 44);
		HomeFrame.getContentPane().add(FindAGift);
		
		CustomerService.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.WHITE));
		CustomerService.setOpaque(true);
		CustomerService.setForeground(Color.BLACK);
		CustomerService.setBackground(Color.LIGHT_GRAY);
		CustomerService.setBounds(547, 6, 117, 44);
		HomeFrame.getContentPane().add(CustomerService);
		
		Registry.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.WHITE));
		Registry.setOpaque(true);
		Registry.setForeground(Color.BLACK);
		Registry.setBackground(Color.LIGHT_GRAY);
		Registry.setBounds(331, 6, 95, 44);
		HomeFrame.getContentPane().add(Registry);
		
		NewReleases.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.WHITE));
		NewReleases.setOpaque(true);
		NewReleases.setForeground(Color.BLACK);
		NewReleases.setBackground(Color.LIGHT_GRAY);
		NewReleases.setBounds(442, 6, 95, 44);
		HomeFrame.getContentPane().add(NewReleases);
		
		GiftCards.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.WHITE));
		GiftCards.setOpaque(true);
		GiftCards.setForeground(Color.BLACK);
		GiftCards.setBackground(Color.LIGHT_GRAY);
		GiftCards.setBounds(438, 62, 95, 44);
		HomeFrame.getContentPane().add(GiftCards);
              
        Logo.setIcon(new ImageIcon(HomePageGUI.class.getResource("st,small,215x235-pad,210x230,f8f8f8.u1.jpg")));
        Logo.setBounds(6, 6, 206, 103);
        HomeFrame.getContentPane().add(Logo);
                
        VG.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	    HomeFrame.dispose();
        	    VideoGameGUI show= new VideoGameGUI();
        	    show.VGFrame.setVisible(true);
        	   }
        });
        
        VG.setBackground(new Color(238, 238, 238));
        VG.setIcon(new ImageIcon(HomePageGUI.class.getResource("1161649.jpg")));
        VG.setBounds(6, 164, 359, 115);
        HomeFrame.getContentPane().add(VG);
        
        JLabel lblVideoGames = new JLabel("Video Games");
        lblVideoGames.setBackground(Color.GREEN);
        lblVideoGames.setBounds(133, 147, 122, 16);
        HomeFrame.getContentPane().add(lblVideoGames);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setBounds(0, 0, 800, 128);
        HomeFrame.getContentPane().add(panel);
		
		
	}
	
}



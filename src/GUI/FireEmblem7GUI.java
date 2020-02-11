package GUI;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;

public class FireEmblem7GUI extends JFrame{
	private final JButton AddToCart = new JButton("Add to Cart");

	public FireEmblem7GUI() {
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
		FE7.setBackground(new Color(238, 238, 238));
		FE7.setIcon(new ImageIcon(FireEmblem7GUI.class.getResource("/GUI/unnamed.jpg")));
		FE7.setBounds(6, 134, 528, 396);
        getContentPane().add(FE7);
        
        JLabel lblAboutTheProduct = new JLabel("About the Product");
        lblAboutTheProduct.setForeground(new Color(255, 140, 0));
        lblAboutTheProduct.setBackground(Color.ORANGE);
        lblAboutTheProduct.setBounds(6, 542, 123, 25);
        getContentPane().add(lblAboutTheProduct);
        
        JLabel lblThisIsA = new JLabel("This is a video game. Don't catch you slippin now");
        lblThisIsA.setBounds(6, 579, 338, 16);
        getContentPane().add(lblThisIsA);
        
        JLabel lblPrice = new JLabel("Price: $75");
        lblPrice.setBounds(548, 199, 67, 52);
        getContentPane().add(lblPrice);
        
        AddToCart.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.WHITE));
        AddToCart.setOpaque(true);
        AddToCart.setForeground(Color.WHITE);
        AddToCart.setBackground(Color.PINK);
        AddToCart.setBounds(442, 6, 95, 44);
		getContentPane().add(AddToCart);
	}
}

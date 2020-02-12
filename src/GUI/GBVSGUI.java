package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;

public class GBVSGUI extends JFrame{
	private final JButton AddToCart = new JButton("Add to Cart");

	public GBVSGUI() {
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
	    
	    JButton GBVS = new JButton("");        
	    GBVS.setBackground(new Color(238, 238, 238));
	    GBVS.setIcon(new ImageIcon(GBVSGUI.class.getResource("/GUI/Screen Shot 2020-02-12 at 12.28.10 PM.png")));
	    GBVS.setBounds(6, 236, 250, 305);
        getContentPane().add(GBVS);
        
        JLabel lblAboutTheProduct = new JLabel("About the Product");
        lblAboutTheProduct.setForeground(new Color(255, 140, 0));
        lblAboutTheProduct.setBackground(Color.ORANGE);
        lblAboutTheProduct.setBounds(6, 542, 123, 25);
        getContentPane().add(lblAboutTheProduct);
        
        JLabel lblThisIsA = new JLabel("Granblue Fantasy Versus is a fighting game.");
        lblThisIsA.setBounds(6, 579, 338, 16);
        getContentPane().add(lblThisIsA);
        
        JLabel lblPrice = new JLabel("Price: $60");
        lblPrice.setBounds(279, 250, 67, 52);
        getContentPane().add(lblPrice);
        
        AddToCart.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.WHITE));
        AddToCart.setOpaque(true);
        AddToCart.setForeground(Color.WHITE);
        AddToCart.setBackground(Color.PINK);
        AddToCart.setBounds(442, 6, 95, 44);
		getContentPane().add(AddToCart);
	}
}

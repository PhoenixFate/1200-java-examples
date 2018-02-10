package chapter11;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class BackgroundPanel259 extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7563775617740602621L;
	
	private Image image;
	
	public BackgroundPanel259() {
		super();
		setOpaque(false);
		setLayout(null);
	}

	public void setImage(Image image) {
		this.image = image;
	}

	@Override
	public void paint(Graphics g) {
		if(image!=null) {
			g.drawImage(image, 0, 0, this);
		}
		super.paint(g);
	}
	
	
	
}

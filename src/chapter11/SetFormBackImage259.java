package chapter11;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SetFormBackImage259 extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 290475134957934805L;
	
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				SetFormBackImage259 setFormBackImage259=new SetFormBackImage259();
				setFormBackImage259.setVisible(true);
				
			}
		});
	}
	
	public SetFormBackImage259() {
		setTitle("实现带背景图片的窗体");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane=new JPanel()	;
		setContentPane(contentPane);
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.setLayout(new BorderLayout(0,0));
		BackgroundPanel259 backgroundPanel259=new BackgroundPanel259();
		backgroundPanel259.setImage(getToolkit().getImage(getClass().getResource("Penguins.jpg")));
		contentPane.add(backgroundPanel259);
		
	}
}

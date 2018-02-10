package chapter11;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SetFormBackColor258 extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1805639185776266454L;
	
	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				try {
					SetFormBackColor258 setFormBackColor258=new SetFormBackColor258();
					setFormBackColor258.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public SetFormBackColor258() {
		setTitle("set window backcolor to pale blue");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 308, 238);
		contentPane=new JPanel();
		contentPane.setBackground(new Color(102, 204, 255));
		setContentPane(contentPane);
	}
}

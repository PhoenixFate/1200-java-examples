package chapter11;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class AlwaysActiveWindows249 extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5811297469857810537L;
	
	private JPanel contentPane;
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable(){

			@Override
			public void run() {
				try {
					AlwaysActiveWindows249 frame=new AlwaysActiveWindows249();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});	
	}
	
	public AlwaysActiveWindows249(){
		setTitle("始终在桌面最顶层显示的窗体");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 319, 206);
		setAlwaysOnTop(true);
		contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		JLabel label=new JLabel("我就是在上面不下去，咋地");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label);
	}
}

package chapter11;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class LoadPosition246 extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){

			@Override
			public void run() {
				try {
					LoadPosition246 frame=new LoadPosition246();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}
	
	public LoadPosition246(){
		setTitle("控制窗体加载时的位置:");
		addWindowListener(new WindowAdapter(){

			@Override
			public void windowOpened(WindowEvent e) {
				do_this_windowOpened(e);
			}
			
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
	}
	
	private void do_this_windowOpened(WindowEvent e){
		setLocationRelativeTo(null);
	}

}

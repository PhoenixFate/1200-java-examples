package chapter11;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SetFormSizeByDeskSize251 extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1598484474777281108L;
	
	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){

			@Override
			public void run() {
				try {
					SetFormSizeByDeskSize251 frame=new SetFormSizeByDeskSize251();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}
	
	public SetFormSizeByDeskSize251(){
		addWindowListener(new WindowAdapter(){

			@Override
			public void windowOpened(WindowEvent e) {
				do_this_windowOpened();
			}
			
		});
		setTitle("根据桌面大小调整窗体大小");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 450, 300);
		contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
	}
	
	public void do_this_windowOpened(){
		Toolkit toolkit=getToolkit();
		Dimension screenSize=toolkit.getScreenSize();
		int width=(int)(screenSize.width*0.8);
		int height=(int)(screenSize.height*0.8);
		setSize(width,height);
	}

}

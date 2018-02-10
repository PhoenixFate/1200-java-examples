package chapter11;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class FlashTitleBar257 extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5010494603875075914L;
	
	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				try {
					FlashTitleBar257 flashTitleBar257=new FlashTitleBar257();
					flashTitleBar257.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}
	
	public FlashTitleBar257() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				do_this_windowOpened(e);
				
			}
		});
		setTitle("set the flickering title");
		setBounds(100, 100, 400, 130);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		JLabel label=new JLabel("lack of memory,please save data immedidately");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label,BorderLayout.CENTER);
		
		
	}
	
	protected void do_this_windowOpened(WindowEvent event) {
		Timer timer=new Timer(500,new ActionListener() {
			String title=getTitle();
			@Override
			public void actionPerformed(ActionEvent e) {
				if(getTitle().isEmpty()){
					setTitle(title);
				}else {
					setTitle("");
				}
			}
		});
		timer.start();
	}
}

package chapter11;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class LimitChangeFormSize253 extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8627246415005151489L;
	
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
					LimitChangeFormSize253 frame=new LimitChangeFormSize253();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}
	
	public LimitChangeFormSize253(){
		setTitle("禁止改变窗体大小");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 298, 188);
		contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton button=new JButton("禁止改变窗体大小");
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				do_button_actionPerformed(e);
			};
		
		});
		button.setBounds(70, 54, 147, 30);
		contentPane.add(button);
	}
	
	protected void do_button_actionPerformed(ActionEvent e){
		setResizable(false);
	}
}

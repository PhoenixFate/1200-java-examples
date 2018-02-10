package chapter06;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class ThreadTest123 extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8506320749953712707L;

	private JPanel contentPane;
	private JTextArea textArea1;
	private JTextArea textArea2;
	
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
					ThreadTest123 frame=new ThreadTest123();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}
	
	public ThreadTest123(){
		setTitle("新建没有返回值的线程");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		
		JPanel buttonPanel=new JPanel();
		contentPane.add(buttonPanel,BorderLayout.NORTH);
		buttonPanel.setLayout(new GridLayout(1,2,5,5));
		
		JButton button1=new JButton("单线程程序");
		button1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				do_button1_actionPerformed(e);
			}
			
		});
		
		buttonPanel.add(button1);
		
		JButton button2=new JButton("多线程程序");
		button2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				do_button2_actionPerformed(e);
			}
			
		});
		buttonPanel.add(button2);
		
		JPanel panel=new JPanel();
		contentPane.add(panel,BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1,2,5,5));
		
		JScrollPane scrollPane1=new JScrollPane();
		textArea1=new JTextArea();
		scrollPane1.setViewportView(textArea1);
		panel.add(scrollPane1);
		
		JScrollPane scrollPane2=new JScrollPane();
		textArea2=new JTextArea();
		scrollPane2.setViewportView(textArea2);
		panel.add(scrollPane2);
	}
	
	public void do_button1_actionPerformed(ActionEvent e){
		StringBuilder builder=new StringBuilder();
		for(int i=0;i<5;i++){
			builder.append("《Java编程词典》\n");
		}
		for(int i=0;i<5;i++){
			builder.append("《视频学Java》\n");
		}
		textArea1.setText(builder.toString());
	}
	
	public void do_button2_actionPerformed(ActionEvent e){
		final StringBuilder builder=new StringBuilder();
		for(int i=0;i<5;i++){
			new Thread(){

				@Override
				public void run() {
					builder.append("《Java编程词典》\n");
					textArea2.setText(builder.toString());
				}
				
			}.start();
		}
		for(int i=0;i<5;i++){
			new Thread(){

				@Override
				public void run() {
					builder.append("《视频学Java》\n");
					textArea2.setText(builder.toString());
				}
				
			}.start();
		}
	}
}

package chapter05;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

public class IntegerConversion93 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField textField;
	private JLabel label3;
	
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
					IntegerConversion93 frame=new IntegerConversion93();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}
	
	public IntegerConversion93(){
		setTitle("计算平方数");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 200);
		contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(3,1,5,5));
		contentPane.add(panel,BorderLayout.CENTER);
		
		JPanel inputPanel=new JPanel();
		inputPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED,null,null));
		inputPanel.setLayout(new GridLayout(1,2,0,0));
		panel.add(inputPanel);
		
		JLabel label1=new JLabel("输入目标字符串：");
		label1.setFont(new Font("微软雅黑",Font.PLAIN,16));
		inputPanel.add(label1);
		
		textField=new JTextField();
		textField.setFont(new Font("微软雅黑",Font.PLAIN,16));
		textField.setColumns(10);
		inputPanel.add(textField);
		
		JPanel resultPanel=new JPanel();
		resultPanel.setBorder(new EtchedBorder(EtchedBorder.RAISED,null,null));
		resultPanel.setLayout(new GridLayout(1,2,0,0));
		panel.add(resultPanel);
		
		JLabel label2=new JLabel("目标字符串平方:");
		label2.setFont(new Font("微软雅黑",Font.PLAIN,16));
		resultPanel.add(label2);
		
		label3=new JLabel();
		label3.setFont(new Font("微软雅黑",Font.PLAIN,16));
		resultPanel.add(label3);
		
		JPanel buttonPanel=new JPanel();
		buttonPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED,null,null));
		panel.add(buttonPanel);
		
		JButton button=new JButton("转换");
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				do_button_actionPerformed(e);
			}
			
		});
		button.setFont(new Font("微软雅黑",Font.PLAIN,16));
		buttonPanel.add(button);
		
	}
	
	public void do_button_actionPerformed(ActionEvent e){
		String input=textField.getText();
		int number=Integer.parseInt(input);
		label3.setText(number*number+"");
	}
}

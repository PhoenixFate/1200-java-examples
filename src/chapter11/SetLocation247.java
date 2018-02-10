package chapter11;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class SetLocation247 extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JFormattedTextField leftField;
	private JFormattedTextField topField;
	
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
					SetLocation247 frame=new SetLocation247();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}
	
	public SetLocation247(){
		setTitle("设置窗体在屏幕中的位置");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 295, 157);
		contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel label=new JLabel("左边距");
		label.setBounds(6, 12, 55, 18);
		contentPane.add(label);
		
		leftField=new JFormattedTextField(NumberFormat.getIntegerInstance());
		leftField.setBounds(69, 6, 204, 30);
		leftField.setColumns(10);
		contentPane.add(leftField);
		
		JLabel label_1=new JLabel("上边距");
		label_1.setBounds(6, 42, 55, 18);
		contentPane.add(label_1);
		
		topField=new JFormattedTextField(NumberFormat.getIntegerInstance());
		topField.setBounds(69, 36, 204, 30);
		topField.setColumns(10);
		contentPane.add(topField);
		
		JButton button=new JButton("设置");
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				do_button_actionPerformed(e);
			}
			
		});
		button.setBounds(97, 83, 90, 30);
		contentPane.add(button);
	}
	
	private void do_button_actionPerformed(ActionEvent e){
		Object value=leftField.getValue();
		Object value2=topField.getValue();
		if(value==null || value2==null){
			return;
		}
		int left=((Number)value).intValue();
		int top=((Number)value2).intValue();
		setLocation(left, top);
	}
}

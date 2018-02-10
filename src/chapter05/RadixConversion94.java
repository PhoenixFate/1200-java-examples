package chapter05;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

public class RadixConversion94 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField textField;
	private String number;

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				try {
					RadixConversion94 frame = new RadixConversion94();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});
	}

	public RadixConversion94() {
		setTitle("进制转换工具");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 1, 5, 5));

		JPanel panel1 = new JPanel();
		panel1.setBorder(new EtchedBorder());
		panel1.setLayout(new GridLayout(1, 2, 5, 5));
		panel.add(panel1);

		JLabel label = new JLabel("输入要转换的数据:");
		label.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		panel1.add(label);

		textField = new JTextField();
		textField.addFocusListener(new FocusAdapter() {

			@Override
			public void focusLost(FocusEvent e) {
				do_textField_focusLost(e);
			}

		});
		textField.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		textField.setColumns(10);
		panel1.add(textField);
		
		JPanel panel2=new JPanel();
		panel2.setBorder(new EtchedBorder());
		panel.add(panel2);
		
		JRadioButton binaryButton=new JRadioButton("二进制");
		panel2.add(binaryButton);
		binaryButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				do_binaryRadioButton_actionPerformed(e);
			}
			
		});
		binaryButton.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		
		JRadioButton octalButton=new JRadioButton("八进制");
		panel2.add(octalButton);
		octalButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				do_octalRadioButton_actionPerformed(e);			}
			
		});
		octalButton.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		
		JRadioButton hexButton=new JRadioButton("十六进制");
		panel2.add(hexButton);
		hexButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				do_hexRadioButton_actionPerformed(e);
			}
			
		});
		hexButton.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		
		JRadioButton decimalButton=new JRadioButton("十进制");
		panel2.add(decimalButton);
		decimalButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				do_decimalButton_actionPerformed(e);
			}
			
		});
		decimalButton.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		
		ButtonGroup buttonGroup=new ButtonGroup();
		buttonGroup.add(binaryButton);
		buttonGroup.add(octalButton);
		buttonGroup.add(hexButton);
		buttonGroup.add(decimalButton);
	}

	public void do_decimalButton_actionPerformed(ActionEvent e){
		textField.setText(number);
	}
	
	public void do_hexRadioButton_actionPerformed(ActionEvent e){
		textField.setText(Integer.toHexString(Integer.parseInt(number)));
	}
	
	public void do_octalRadioButton_actionPerformed(ActionEvent e){
		textField.setText(Integer.toOctalString(Integer.parseInt(number)));
	}
	
	public void do_binaryRadioButton_actionPerformed(ActionEvent e){
		textField.setText(Integer.toBinaryString(Integer.parseInt(number)));
	}

	public void do_textField_focusLost(FocusEvent e) {
		number = textField.getText();
	}
	
}

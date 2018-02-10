package chapter03;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ButtonArrayExample47 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField textField;
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable(){

			@Override
			public void run() {
				try {
					ButtonArrayExample47 frame=new ButtonArrayExample47();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}
	
	public ButtonArrayExample47(){
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 290, 282);
		
		BorderLayout  borderLayout=(BorderLayout)(getContentPane().getLayout());
		borderLayout.setHgap(10);
		borderLayout.setVgap(20);
		textField=new JTextField();
		textField.setHorizontalAlignment(SwingConstants.TRAILING);
		textField.setPreferredSize(new Dimension(12,50));
		getContentPane().add(textField,BorderLayout.NORTH);
		textField.setColumns(10);
		GridLayout gridLayout=new GridLayout(4,4);
		gridLayout.setHgap(5);
		gridLayout.setVgap(5);
		JPanel panel=new JPanel();
		panel.setLayout(gridLayout);
		getContentPane().add(panel,BorderLayout.CENTER);
		
		String[][] names={{"1","2","3","+"},{"4","5","6","-"},{"7","8","9","*"},{".","0","=","/"}};
		JButton[][]buttons=new JButton[4][4];
		for(int row=0;row<names.length;row++){
			for(int col=0;col<names[row].length;col++){
				buttons[row][col]=new JButton(names[row][col]);
				panel.add(buttons[row][col]);
			}
		}
	}
}

package chapter03;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class ArrayBound46 extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JFormattedTextField codeField;
	private JTextArea infoArea;
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
					ArrayBound46 frame=new ArrayBound46();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}
	
	public ArrayBound46(){
		setTitle("数组下标越界异常");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 349, 199);
		contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label=new JLabel("聚 会 趣 味 题：选择0-5编号的题目");
		label.setBounds(10, 10, 317, 27);
		contentPane.add(label);
		
		codeField=new JFormattedTextField(NumberFormat.getIntegerInstance());
		codeField.setBounds(77, 40, 122, 30);
		contentPane.add(codeField);
		codeField.setColumns(10);
		
		
		JLabel label_2=new JLabel("题目编号：");
		label_2.setBounds(10, 46, 67, 18);
		contentPane.add(label_2);
		
		JButton button=new JButton("确定");
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				do_button_actionPerformed(e);
			}
			
		});
		button.setBounds(211, 40, 90, 30);
		contentPane.add(button);
		
		JScrollPane scrollPane=new JScrollPane();
		scrollPane.setBounds(10, 76, 317, 79);
		contentPane.add(scrollPane);
		
		infoArea=new JTextArea();
		infoArea.setLineWrap(true);
		scrollPane.setViewportView(infoArea);
		
	}
	
	private String[] infos={"50元奖金","唱一首歌","学狗叫","为大家讲一个笑话","3万元奖金"};
	
	protected void do_button_actionPerformed(ActionEvent e){
		int index=((Number)codeField.getValue()).intValue();
//		index=Integer.parseInt(codeField.getText());
		try {
			infoArea.setText(infos[index]);
		} catch (Exception e2) {
			infoArea.setText("发生异常：\n"+e2);
		}
		
	}
}

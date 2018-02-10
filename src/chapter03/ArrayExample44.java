package chapter03;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class ArrayExample44 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField nameField;
	private JTextArea personnelArea;
	private JTextArea resultArea;

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				ArrayExample44 frame = new ArrayExample44();
				frame.setVisible(true);
			}

		});
	}

	public ArrayExample44() {
		setTitle("利用数组随机抽取幸运观众");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "输入在场观众姓名按回车", TitledBorder.LEADING, TitledBorder.TOP, null,
				new Color(59, 59, 59)));
		panel.setBounds(10, 10, 174, 242);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 5));

		nameField = new JTextField();
		nameField.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				do_textField_keyPressed(e);
			}

		});
		nameField.setColumns(10);
		panel.add(nameField, BorderLayout.NORTH);
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);
		personnelArea = new JTextArea();
		personnelArea.setEditable(false);
		scrollPane.setViewportView(personnelArea);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(
				new TitledBorder(null, "取观众人员：", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(59, 59, 59)));
		panel_1.setBounds(183, 10, 219, 242);
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane_1 = new JScrollPane();
		panel_1.add(scrollPane_1);

		resultArea = new JTextArea();
		resultArea.setEditable(false);
		resultArea.setLineWrap(true);
		scrollPane_1.setViewportView(resultArea);

		JButton button = new JButton("抽取");
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				do_button_actionPerformed(e);
			}
			
		});
		button.setBounds(407, 164, 63, 25);
		contentPane.add(button);
		
		JButton button1=new JButton("退出");
		button1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				do_button1_actionPerformed(e);
			}
			
		});
		button1.setBounds(407, 215, 63, 25);
		contentPane.add(button1);
	}

	public void do_textField_keyPressed(KeyEvent e) {
		if (e.getKeyChar() != '\n') {
			return;
		}
		String name = nameField.getText();
		if (name.isEmpty()) {
			return;
		}
		personnelArea.append(name + "\n");
		nameField.selectAll();
	}

	public void do_button_actionPerformed(ActionEvent e) {
		String perString = personnelArea.getText();
		String[] personnelArray = perString.split("\n{1,}");
		int index = (int) (Math.random() * personnelArray.length);
		String formatArg = "本次抽取观众人员：\n\t%1$s\n恭喜%1$s成为本次观众抽奖的大奖得主。" + "\n\n我们将为%1$s颁发：\n\t过期的酸奶二十箱。";
		String info = String.format(formatArg, personnelArray[index]);
		resultArea.setText(info);
	}
	
	public void do_button1_actionPerformed(ActionEvent e){
		dispose();
	}
}

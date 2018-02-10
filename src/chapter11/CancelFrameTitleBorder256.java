package chapter11;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class CancelFrameTitleBorder256 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7916330057603287399L;

	private JTextArea textArea;

	public static void main(String[] args) {
		try {
			// after setting look and feel,textArea.setOpaque(false) is invalid;
			// UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				try {
					CancelFrameTitleBorder256 cancelFrameTitleBorder256 = new CancelFrameTitleBorder256();
					cancelFrameTitleBorder256.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CancelFrameTitleBorder256() {
		getContentPane().setBackground(new Color(240, 255, 255));
		setUndecorated(true);
		setTitle("about the enterprise distribution management system");
		setBounds(100, 100, 400, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(getClass().getResource("logo.png")));
		label.setBounds(10, 27, 112, 150);
		getContentPane().add(label);
		textArea = new JTextArea();
		textArea.setOpaque(false);
		textArea.setText("系统：\n  Microsoft Windows Server 2003\n" + "  Standard Editon\n  Service Pack 2\n\n\n"
				+ "软件：进销存管理系统\n版权：明日科技");
		textArea.setBounds(154, 6, 199, 154);
		getContentPane().add(textArea);

		JButton button = new JButton("close");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				do_button_actionPerformed(e);
			}
		});
		button.setBounds(230, 172, 90, 30);
		getContentPane().add(button);

	}

	protected void do_button_actionPerformed(ActionEvent e) {
		dispose();
	}
}

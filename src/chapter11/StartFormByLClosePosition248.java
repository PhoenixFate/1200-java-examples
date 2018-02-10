package chapter11;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.prefs.Preferences;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class StartFormByLClosePosition248 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JLabel label;

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
					StartFormByLClosePosition248 frame = new StartFormByLClosePosition248();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});
	}

	public StartFormByLClosePosition248() {
		addComponentListener(new ComponentAdapter() {

			@Override
			public void componentMoved(ComponentEvent e) {
				do_this_componentMoved(e);
			}

		});
		setTitle("从上次关闭窗体重新启动窗体");
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowOpened(WindowEvent e) {
				do_this_windowOpened(e);
			}

			@Override
			public void windowClosing(WindowEvent e) {
				do_this_windowClosing(e);
			}

		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 346, 237);

		
		
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout());
		label = new JLabel();
		contentPane.add(label);

	}

	protected void do_this_windowClosing(WindowEvent e) {
		Preferences root = Preferences.userRoot();
		Point location = getLocation();
		root.putInt("locationX", location.x);
		root.putInt("locationY", location.y);
	}

	protected void do_this_windowOpened(WindowEvent e) {
		Preferences root = Preferences.userRoot();
		int x = root.getInt("locationX", 100);
		int y = root.getInt("locationY", 100);
		System.out.println(x);
		System.out.println(y);
		setLocation(x, y);
	}

	protected void do_this_componentMoved(ComponentEvent e) {
		Point location = getLocation();
		int x = location.x;
		int y = location.y;
		label.setText("窗体当前坐标：X = " + x + "        Y = " + y);
	}
}

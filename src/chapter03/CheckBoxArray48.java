package chapter03;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class CheckBoxArray48 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JPanel panel;
	
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
					CheckBoxArray48 frame = new CheckBoxArray48();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});
	}
	
	public CheckBoxArray48(){
		setTitle("复选按钮控件数组");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 409, 331);
		contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		
		JLabel label=new JLabel("你的爱好有哪些：");
		contentPane.add(label, BorderLayout.NORTH);
		contentPane.add(getPanel(),BorderLayout.CENTER);
	}
	
	private JPanel  getPanel(){
		if(panel==null){
			panel=new JPanel();
			panel.setLayout(new GridLayout(0,4));
			String[] labels = { "足球", "篮球", "魔术", "乒乓球", "看电影", "魔兽世界", "CS战队",
                    "羽毛球", "游泳", "旅游", "爬山", "唱歌", "写博客", "动物世界", "拍照", "弹吉他",
                    "读报纸", "飙车", "逛街", "逛商场", "麻将", "看书", "上网看资料", "新闻", "军事",
                    "八卦", "养生", "饮茶" };
			JCheckBox[] boxs=new JCheckBox[labels.length];
			for(int i=0;i<boxs.length;i++){
				boxs[i]=new JCheckBox(labels[i]);
				panel.add(boxs[i]);
			}
		}
		return panel;
	}
}

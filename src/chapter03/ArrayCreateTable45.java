package chapter03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class ArrayCreateTable45 extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable(){

			@Override
			public void run() {
				ArrayCreateTable45 frame=new ArrayCreateTable45();
				frame.setVisible(true);
			}
			
		});
	}
	
	public ArrayCreateTable45(){
		setTitle("用数组设置JTable表格的列名与列宽");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100,100,557,300);
		contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		contentPane.add(getScrollPane(),BorderLayout.CENTER);
	}
	
	private JScrollPane getScrollPane(){
		if(scrollPane==null){
			scrollPane=new JScrollPane();
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	
	private JTable getTable(){
		if(table==null){
			table=new JTable();
		}
		String[] columns={"星期一","星期二","星期三","星期四","星期五","星期六","日日日日"};
		int[]columnWidth={10,20,30,40,50,60,70};
		DefaultTableModel model=new DefaultTableModel(columns,8);
		table.setModel(model);
		TableColumnModel columnModel=table.getColumnModel();
		int count=columnModel.getColumnCount();
		for(int i=0;i<count;i++){
			TableColumn column=columnModel.getColumn(i);
			column.setPreferredWidth(columnWidth[i]);
		}
		return table;
	}
	
}

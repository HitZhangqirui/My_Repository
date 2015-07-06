package myGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class Client extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client frame = new Client();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("rawtypes")
	public Client() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setToolTipText("lalall");
		tabbedPane.setBounds(10, 10, 690, 447);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("\u5B9E\u65F6\u60C5\u51B5");
		tabbedPane.addTab("实时情况", null, panel, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("车辆管理", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 685, 418);
		panel_1.add(tabbedPane_1);
		
		String [] colu = {"车牌号","状态"};
		Object [][] data_1 = {{new Integer(123),"空闲"}};
		table = new JTable(data_1,colu);
		JScrollPane scrollPane = new JScrollPane(table);
		tabbedPane_1.addTab("查看车辆状态", null, scrollPane, null);
		
		JPanel panel_7 = new JPanel();
		tabbedPane_1.addTab("增加车辆", null, panel_7, null);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("车牌号");
		lblNewLabel.setBounds(23, 38, 41, 28);
		panel_7.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(80, 42, 66, 21);
		panel_7.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("\u589E\u52A0");
		button.setBounds(23, 94, 60, 23);
		panel_7.add(button);
		
		JPanel panel_8 = new JPanel();
		tabbedPane_1.addTab("删除车辆", null, panel_8, null);
		panel_8.setLayout(null);
		
		JLabel label = new JLabel("\u8F66\u724C\u53F7");
		label.setBounds(23, 38, 41, 28);
		panel_8.add(label);
		
		JButton button_1 = new JButton("\u5220\u9664");
		button_1.setBounds(23, 94, 60, 23);
		panel_8.add(button_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(80, 42, 66, 21);
		panel_8.add(comboBox);
		
		JPanel panel_9 = new JPanel();
		tabbedPane_1.addTab("车辆调度", null, panel_9, null);
		panel_9.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("车牌号");
		lblNewLabel_1.setBounds(23, 38, 41, 28);
		panel_9.add(lblNewLabel_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(80, 42, 66, 21);
		panel_9.add(comboBox_1);
		
		JButton btnNewButton = new JButton("确定");
		btnNewButton.setBounds(23, 94, 60, 23);
		panel_9.add(btnNewButton);
		
		JLabel label_1 = new JLabel("\u8C03\u5EA6\u7EBF\u8DEF");
		label_1.setBounds(23, 188, 57, 28);
		panel_9.add(label_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(80, 192, 66, 21);
		panel_9.add(comboBox_2);
		
		
		Object [][] data_2 = {{new Integer(123),"空闲"}};
		table_1 = new JTable(data_2,colu);
		JScrollPane scrollPane_1 = new JScrollPane(table_1);
		scrollPane_1.setBounds(23, 127, 258, 51);
		panel_9.add(scrollPane_1);
		
		JButton button_2 = new JButton("\u786E\u5B9A");
		button_2.setBounds(23, 237, 60, 23);
		panel_9.add(button_2);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("司机管理", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("线路管理", null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("站点管理", null, panel_4, null);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("设置", null, panel_5, null);
	}
}

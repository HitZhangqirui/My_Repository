package myGUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	private JTable table_bus;
	private JTable table_bus_temp;
	private JTable table_diver;
	private JTable table_diver_delete;
	private JTable table_diver_dispatch;
	private JTable table_site;
	private JTable table_site_temp;
	
	private JTable record_route;
	private JTable record_bus;
	private JTable record_diver;
	
	private JTable site_id;
	private JTable route_site;
	
	private JTable all_infor;
	
	Object [][] data_bus = new Object [100][2];
	Object [][] data_bus_temp = new Object [1][2];
	Object [][] data_diver = new Object [100][3];
	Object [][] data_diver_delete = new Object [1][3];
	Object [][] data_diver_dispatch = new Object [1][3];
	Object [][] data_site = new Object [100][2];
	Object [][] data_site_temp = new Object [1][2];
	
	Object [][] data_record_route = new Object [100][3];
	Object [][] data_record_bus = new Object [100][4];
	Object [][] data_record_diver = new Object [100][4];
	
	Object [][] data_site_id = new Object [100][2];
	Object [][] data_route_site = new Object [100][2];
	
	Object [][] all_data = new Object [100][3];
	
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;

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
		
		String [] all_colu = {"线路名","车牌号","司机名"};
		String [] colu_bus = {"车牌号","状态"};
		String [] colu_diver = {"编号","司机名","状态"};
		String [] clou_route_site = {"编号","站点名"};
		String [] clou_site_id = {"请输入站点编号","次序"};
		String [] clou_site = {"编号","站点名"};
		String [] colu_record_route = {"日期","线路名","车次"};
		String [] colu_record_bus = {"日期","车牌号","前状态","后状态"};
		String [] colu_record_diver = {"日期","司机名","前状态","后状态"};

		
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
		
		
		all_data[0][0] = new Integer(123);
		all_data[0][1] = new Integer(123);
		all_data[0][2] = "张琦瑞";
		all_infor = new JTable(all_data, all_colu);
		JScrollPane scrollPane_12 = new JScrollPane(all_infor);
		tabbedPane.addTab("当前公交情况", null, scrollPane_12, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("车辆管理", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 685, 418);
		panel_1.add(tabbedPane_1);
		
		
		data_bus[0][0] = new Integer(123);
		data_bus[0][1] = "空闲";
		table_bus = new JTable(data_bus,colu_bus);
		JScrollPane scrollPane = new JScrollPane(table_bus);
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
		
		
		data_bus_temp[0][0] = new Integer(123);
		data_bus_temp[0][1] = "空闲";
		table_bus_temp = new JTable(data_bus_temp,colu_bus);
		JScrollPane scrollPane_1 = new JScrollPane(table_bus_temp);
		scrollPane_1.setBounds(23, 127, 258, 51);
		panel_9.add(scrollPane_1);
		
		JButton button_2 = new JButton("\u786E\u5B9A");
		button_2.setBounds(23, 237, 60, 23);
		panel_9.add(button_2);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("司机管理", null, panel_2, null);
		panel_2.setLayout(null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(0, 0, 685, 418);
		panel_2.add(tabbedPane_2);
		
		
		data_diver[0][0] = new Integer(123);
		data_diver[0][1] = "张琦瑞";
		data_diver[0][2] = "空闲";
		table_diver = new JTable(data_diver,colu_diver);
		JScrollPane scrollPane_2 = new JScrollPane(table_diver);
		tabbedPane_2.addTab("查看司机状态", null, scrollPane_2, null);
		
		JPanel panel_6 = new JPanel();
		tabbedPane_2.addTab("增加司机", null, panel_6, null);
		panel_6.setLayout(null);
		
		JLabel label_2 = new JLabel("\u53F8\u673A\u540D");
		label_2.setBounds(26, 76, 41, 28);
		panel_6.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(106, 80, 66, 21);
		panel_6.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("增加");
		btnNewButton_1.setBounds(26, 133, 60, 23);
		panel_6.add(btnNewButton_1);
		
		JLabel label_4 = new JLabel("\u7F16\u53F7");
		label_4.setBounds(26, 30, 41, 28);
		panel_6.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(106, 34, 66, 21);
		panel_6.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_10 = new JPanel();
		tabbedPane_2.addTab("删除司机", null, panel_10, null);
		panel_10.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("编号");
		lblNewLabel_2.setBounds(37, 41, 41, 28);
		panel_10.add(lblNewLabel_2);
		
		JButton button_3 = new JButton("\u5220\u9664");
		button_3.setBounds(37, 242, 60, 23);
		panel_10.add(button_3);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(99, 45, 66, 21);
		panel_10.add(comboBox_3);
		
		data_diver_delete[0][0] = new Integer(123);
		data_diver_delete[0][1] = "张琦瑞";
		data_diver_delete[0][2] = "空闲";
		table_diver_delete = new JTable(data_diver_delete,colu_diver);
		JScrollPane scrollPane_4 = new JScrollPane(table_diver_delete);
		scrollPane_4.setBounds(37, 145, 232, 52);
		panel_10.add(scrollPane_4);
		
		JButton button_5 = new JButton("\u786E\u5B9A");
		button_5.setBounds(37, 99, 60, 23);
		panel_10.add(button_5);
		
		JPanel panel_11 = new JPanel();
		tabbedPane_2.addTab("司机调度", null, panel_11, null);
		panel_11.setLayout(null);
		
		JLabel label_3 = new JLabel("\u7F16\u53F7");
		label_3.setBounds(37, 41, 41, 28);
		panel_11.add(label_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(99, 45, 66, 21);
		panel_11.add(comboBox_4);
		
		JButton button_4 = new JButton("\u786E\u5B9A");
		button_4.setBounds(37, 99, 60, 23);
		panel_11.add(button_4);
		
		data_diver_dispatch[0][0] = new Integer(123);
		data_diver_dispatch[0][1] = "张琦瑞";
		data_diver_dispatch[0][2] = "空闲";
		table_diver_dispatch = new JTable(data_diver_dispatch,colu_diver);
		JScrollPane scrollPane_3 = new JScrollPane(table_diver_dispatch);
		scrollPane_3.setBounds(37, 145, 232, 52);
		panel_11.add(scrollPane_3);
		
		JLabel label_5 = new JLabel("\u8C03\u5F80\u8F66\u8F86");
		label_5.setBounds(35, 235, 62, 28);
		panel_11.add(label_5);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(99, 239, 66, 21);
		panel_11.add(comboBox_5);
		
		JButton button_6 = new JButton("\u786E\u5B9A");
		button_6.setBounds(31, 285, 66, 23);
		panel_11.add(button_6);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("线路管理", null, panel_3, null);
		panel_3.setLayout(null);
		
		JTabbedPane tabbedPane_5 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_5.setBounds(0, 0, 685, 418);
		panel_3.add(tabbedPane_5);
		
		JPanel panel_5 = new JPanel();
		tabbedPane_5.addTab("增加线路", null, panel_5, null);
		panel_5.setLayout(null);
		
		data_route_site[0][0] = new Integer(123);
		data_route_site[0][1] = "哈工大";
		route_site = new JTable(data_route_site,clou_route_site);
		JScrollPane scrollPane_10 = new JScrollPane(route_site);
		scrollPane_10.setBounds(10, 10, 221, 369);
		panel_5.add(scrollPane_10);
		
		data_site_id[0][0] = new Integer(123);
		data_site_id[0][1] = new Integer(1);
		site_id = new JTable(data_route_site,clou_site_id);
		JScrollPane scrollPane_11 = new JScrollPane(site_id);
		scrollPane_11.setBounds(259, 10, 221, 369);
		panel_5.add(scrollPane_11);
		
		JButton button_11 = new JButton("\u63D0\u4EA4");
		button_11.setBounds(530, 356, 60, 23);
		panel_5.add(button_11);
		
		JLabel label_10 = new JLabel("\u8BF7\u8F93\u5165\u7EBF\u8DEF\u540D");
		label_10.setBounds(511, 10, 79, 29);
		panel_5.add(label_10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(511, 49, 79, 29);
		panel_5.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel label_11 = new JLabel("\u53D1\u8F66\u65F6\u95F4");
		label_11.setBounds(511, 88, 79, 29);
		panel_5.add(label_11);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setBounds(511, 127, 79, 29);
		panel_5.add(comboBox_8);
		
		JLabel label_12 = new JLabel("\u6536\u8F66\u65F6\u95F4");
		label_12.setBounds(511, 171, 79, 29);
		panel_5.add(label_12);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setBounds(511, 210, 79, 29);
		panel_5.add(comboBox_9);
		
		JLabel label_13 = new JLabel("\u5F80\u8FD4\u65F6\u95F4");
		label_13.setBounds(511, 254, 79, 29);
		panel_5.add(label_13);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setBounds(511, 290, 79, 29);
		panel_5.add(comboBox_10);
		
		JPanel panel_15 = new JPanel();
		tabbedPane_5.addTab("删除线路", null, panel_15, null);
		panel_15.setLayout(null);
		
		JLabel label_9 = new JLabel("\u7EBF\u8DEF\u540D");
		label_9.setBounds(23, 38, 41, 28);
		panel_15.add(label_9);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBounds(80, 42, 66, 21);
		panel_15.add(comboBox_7);
		
		JButton button_10 = new JButton("\u5220\u9664");
		button_10.setBounds(23, 94, 60, 23);
		panel_15.add(button_10);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("站点管理", null, panel_4, null);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setBounds(0, 0, 685, 418);
		panel_4.add(tabbedPane_3);
		
		data_site[0][0] = new Integer(123);
		data_site[0][1] = "哈工大";
		table_site = new JTable(data_site,clou_site);
		JScrollPane scrollPane_5 = new JScrollPane(table_site);
		tabbedPane_3.addTab("查看所有站点", null, scrollPane_5, null);
		
		JPanel panel_12 = new JPanel();
		tabbedPane_3.addTab("增加站点", null, panel_12, null);
		panel_12.setLayout(null);
		
		JLabel label_6 = new JLabel("\u7F16\u53F7");
		label_6.setBounds(26, 30, 41, 28);
		panel_12.add(label_6);
		
		textField_2 = new JTextField();
		textField_2.setBounds(106, 34, 66, 21);
		panel_12.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_7 = new JLabel("\u7AD9\u70B9\u540D");
		label_7.setBounds(26, 76, 41, 28);
		panel_12.add(label_7);
		
		textField_4 = new JTextField();
		textField_4.setBounds(106, 80, 66, 21);
		panel_12.add(textField_4);
		textField_4.setColumns(10);
		
		JButton button_7 = new JButton("\u786E\u5B9A");
		button_7.setBounds(26, 133, 60, 23);
		panel_12.add(button_7);
		
		JPanel panel_13 = new JPanel();
		tabbedPane_3.addTab("删除站点", null, panel_13, null);
		panel_13.setLayout(null);
		
		JLabel label_8 = new JLabel("\u7F16\u53F7");
		label_8.setBounds(37, 41, 41, 28);
		panel_13.add(label_8);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(99, 45, 66, 21);
		panel_13.add(comboBox_6);
		
		JButton button_8 = new JButton("\u786E\u5B9A");
		button_8.setBounds(37, 99, 60, 23);
		panel_13.add(button_8);
		
		data_site_temp[0][0] = new Integer(123);
		data_site_temp[0][1] = "哈工大";
		table_site_temp = new JTable(data_site_temp,clou_site);
		JScrollPane scrollPane_6 = new JScrollPane(table_site_temp);
		scrollPane_6.setBounds(37, 145, 232, 52);
		panel_13.add(scrollPane_6);
		
		JButton button_9 = new JButton("\u5220\u9664");
		button_9.setBounds(37, 242, 60, 23);
		panel_13.add(button_9);
		
		JPanel panel_14 = new JPanel();
		tabbedPane.addTab("日志", null, panel_14, null);
		panel_14.setLayout(null);
		
		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_4.setBounds(0, 0, 685, 408);
		panel_14.add(tabbedPane_4);
		
		data_record_route[0][0] = new Integer(123);
		data_record_route[0][1] = "12号路";
		data_record_route[0][2] = new Integer(123);
		record_route = new JTable(data_record_route, colu_record_route);
		JScrollPane scrollPane_7 = new JScrollPane(record_route);
		tabbedPane_4.addTab("线路日志", null, scrollPane_7, null);
		
		
		data_record_bus[0][0] = new Integer(123);
		data_record_bus[0][1] = new Integer(123);
		data_record_bus[0][2] = "空闲";
		data_record_bus[0][3] = "正在运行";
		record_bus = new JTable(data_record_bus, colu_record_bus);
		JScrollPane scrollPane_8 = new JScrollPane(record_bus);
		tabbedPane_4.addTab("车辆日志", null, scrollPane_8, null);
		
		
		data_record_diver[0][0] = new Integer(123);
		data_record_diver[0][2] = "张琦瑞";
		data_record_diver[0][1] = "空闲";
		data_record_diver[0][1] = "正在运行";
		record_diver = new JTable(data_record_diver, colu_record_diver);
		JScrollPane scrollPane_9 = new JScrollPane(record_diver);
		tabbedPane_4.addTab("司机日志", null, scrollPane_9, null);
		
	}
	
	class update_bus_Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			data_bus[0][0] = new Integer(234);
			data_bus[0][1] = "正在运行";
			table_bus.updateUI();
		}
	}
	
	class update_diver_Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
//			data_diver[0][0] = "张琦瑞";
			data_diver[0][2] = "正在运行";
			table_diver.updateUI();
		}
	}
}

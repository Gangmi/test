package sujeburger_GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.TabbedPaneUI;
import javax.swing.table.DefaultTableModel;

public class P_menu extends JPanel {
	private JTable table;
	private JTextField textField;
	public JButton btn_burger[] = new JButton[9] , btn_set[]= new JButton[9], 
				   btn_side[]= new JButton[9], btn_drink[]= new JButton[9];
	

	/**
	 * Create the panel.
	 */
	public P_menu() {
		setSize(new Dimension(1280, 1024));
		setLayout(null);
		
		UIManager.put("TabbedPane.contentBorderInsets", new Insets(0, 0, 0, 0));
		UIManager.put("TabbedPane.selected",ColorUIResource.LIGHT_GRAY);
		UIManager.put("TabbedPane.darkShadow", ColorUIResource.BLACK);
		UIManager.put("TabbedPane.selectHighlight", ColorUIResource.ORANGE);
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		tabbedPane.setBackground(new Color(255, 255, 255));
		tabbedPane.setAutoscrolls(true);
		tabbedPane.setName("");
		tabbedPane.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		tabbedPane.setBounds(12, 34, 828, 920);
		add(tabbedPane);
		
		JPanel P_burger = new JPanel();
		tabbedPane.addTab("  햄버거   ", null, P_burger, null);
		P_burger.setLayout(new GridLayout(3,3));
		
		JPanel P_set = new JPanel();
		tabbedPane.addTab("  세트  ", null, P_set, null);
		P_set.setLayout(new GridLayout(3, 3));
		
		JPanel P_side = new JPanel();
		tabbedPane.addTab("  사이드  ", null, P_side, null);
		P_side.setLayout(new GridLayout(3,3));

		JPanel P_drink = new JPanel();
		tabbedPane.addTab("  음료  ", null, P_drink, null);
		P_drink.setLayout(new GridLayout(3,3));
		
		
		for(int i =0; i<9; i++) {
			btn_burger[i] = new JButton();
			btn_burger[i].setBackground(Color.WHITE);
			btn_burger[i].setVerticalAlignment(SwingConstants.BOTTOM);
			btn_burger[i].setFont(new Font("맑은 고딕", Font.BOLD, 15));
			btn_burger[i].setIconTextGap(20);
			btn_burger[i].setHorizontalTextPosition(SwingConstants.CENTER);
			btn_burger[i].setVerticalTextPosition(SwingConstants.BOTTOM);
			
			
			btn_set[i] = new JButton();
			btn_set[i].setBackground(Color.WHITE);
			btn_set[i].setVerticalAlignment(SwingConstants.BOTTOM);
			btn_set[i].setFont(new Font("맑은 고딕", Font.BOLD, 15));
			btn_set[i].setIconTextGap(20);
			btn_set[i].setHorizontalTextPosition(SwingConstants.CENTER);
			btn_set[i].setVerticalTextPosition(SwingConstants.BOTTOM);
			
			btn_side[i] = new JButton();
			btn_side[i].setBackground(Color.WHITE);
			btn_side[i].setVerticalAlignment(SwingConstants.BOTTOM);
			btn_side[i].setFont(new Font("맑은 고딕", Font.BOLD, 15));
			btn_side[i].setIconTextGap(20);
			btn_side[i].setHorizontalTextPosition(SwingConstants.CENTER);
			btn_side[i].setVerticalTextPosition(SwingConstants.BOTTOM);
			
			btn_drink[i] = new JButton();
			btn_drink[i].setBackground(Color.WHITE);
			btn_drink[i].setVerticalAlignment(SwingConstants.BOTTOM);
			btn_drink[i].setFont(new Font("맑은 고딕", Font.BOLD, 15));
			btn_drink[i].setIconTextGap(20);
			btn_drink[i].setHorizontalTextPosition(SwingConstants.CENTER);
			btn_drink[i].setVerticalTextPosition(SwingConstants.BOTTOM);
			
			P_burger.add(btn_burger[i]);
			P_set.add(btn_set[i]);
			P_side.add(btn_side[i]);
			P_drink.add(btn_drink[i]);
			
		}
		
//		JButton btn_burger1 = new JButton("빅킹버거");
//		JButton btn_burger2 = new JButton("스파이시홍콩버거");			
//		JButton btn_burger3 = new JButton("킹치킨버거");		
//		JButton btn_burger4 = new JButton("더블더블버거");
//		JButton btn_burger5 = new JButton("비슈버거");
//		JButton btn_burger6 = new JButton("햄버거");
//		JButton btn_burger7 = new JButton("불포크버거");
//		JButton btn_burger8 = new JButton("베이컨토마토킹버거");
//		JButton btn_burger9 = new JButton("치즈버거");
//		
		
		
		JScrollPane scrollPane = new JScrollPane();
		JTable jtable = new JTable();
		jtable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"품명", "수량", "가격"
			}
		));
		jtable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jtable.setFillsViewportHeight(true);
		jtable.setColumnSelectionAllowed(true);
		jtable.setCellSelectionEnabled(true);
		scrollPane.add(jtable);
		
		
		
		
		scrollPane.setBounds(872, 104, 370, 324);
		add(scrollPane);
		
		textField = new JTextField();
		textField.setBounds(872, 429, 370, 36);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_10 = new JButton("New button");
		btnNewButton_10.setBounds(872, 500, 175, 86);
		add(btnNewButton_10);
		
		JButton btnNewButton_10_1 = new JButton("New button");
		btnNewButton_10_1.setBounds(1067, 500, 175, 86);
		add(btnNewButton_10_1);
		
		JButton btnNewButton_10_2 = new JButton("New button");
		btnNewButton_10_2.setBounds(872, 626, 370, 86);
		add(btnNewButton_10_2);
		
		JButton btnNewButton_10_2_1 = new JButton("New button");
		btnNewButton_10_2_1.setBounds(872, 746, 370, 86);
		add(btnNewButton_10_2_1);
		
		JButton btnNewButton_10_3 = new JButton("New button");
		btnNewButton_10_3.setBounds(872, 868, 108, 86);
		add(btnNewButton_10_3);
		
		JButton btnNewButton_10_3_1 = new JButton("New button");
		btnNewButton_10_3_1.setBounds(1015, 868, 99, 86);
		add(btnNewButton_10_3_1);
		
		JButton btnNewButton_10_3_2 = new JButton("New button");
		btnNewButton_10_3_2.setBounds(1143, 868, 99, 86);
		add(btnNewButton_10_3_2);
		
		

	}
}

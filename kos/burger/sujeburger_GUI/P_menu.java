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
		
		JButton btn_burger1 = new JButton("빅킹버거");
		btn_burger1.setBackground(Color.WHITE);
		btn_burger1.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_burger1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		btn_burger1.setIconTextGap(20);
		btn_burger1.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_burger1.setIcon(new ImageIcon("D:\\1583727841393-removebg-preview.png"));
		btn_burger1.setVerticalTextPosition(SwingConstants.BOTTOM);
		P_burger.add(btn_burger1);
		
		JButton btn_burger1_1 = new JButton("스파이시홍콩버거");
		btn_burger1_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btn_burger1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_burger1_1.setIconTextGap(20);
		btn_burger1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_burger1_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		btn_burger1_1.setBackground(Color.WHITE);
		P_burger.add(btn_burger1_1);
		
		JButton btn_burger1_2 = new JButton("킹치킨버거");
		btn_burger1_2.setVerticalTextPosition(SwingConstants.BOTTOM);
		btn_burger1_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_burger1_2.setIconTextGap(20);
		btn_burger1_2.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_burger1_2.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		btn_burger1_2.setBackground(Color.WHITE);
		P_burger.add(btn_burger1_2);
		
		JButton btn_burger4 = new JButton("더블더블버거");
		btn_burger4.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_burger4.setVerticalTextPosition(SwingConstants.BOTTOM);
		P_burger.add(btn_burger4);
		
		JButton btn_burger5 = new JButton("비슈버거");
		btn_burger5.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_burger5.setVerticalTextPosition(SwingConstants.BOTTOM);
		P_burger.add(btn_burger5);
		
		JButton btn_burger6 = new JButton("햄버거");
		btn_burger6.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_burger6.setVerticalTextPosition(SwingConstants.BOTTOM);
		P_burger.add(btn_burger6);
		
		JButton btn_burger7 = new JButton("불포크버거");
		btn_burger7.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_burger7.setVerticalTextPosition(SwingConstants.BOTTOM);
		P_burger.add(btn_burger7);
		
		JButton btn_burger8 = new JButton("베이컨토마토킹버거");
		btn_burger8.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_burger8.setVerticalTextPosition(SwingConstants.BOTTOM);
		P_burger.add(btn_burger8);
		
		JButton btn_burger9 = new JButton("치즈버거");
		btn_burger9.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_burger9.setVerticalTextPosition(SwingConstants.BOTTOM);
		P_burger.add(btn_burger9);
		
		JPanel P_set = new JPanel();
		tabbedPane.addTab("  세트  ", null, P_set, null);
		P_set.setLayout(new GridLayout(3, 3));
		
		JButton btnNewButton_9 = new JButton("New button");
		P_set.add(btnNewButton_9);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		P_set.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("New button");
		P_set.add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("New button");
		P_set.add(btnNewButton_3_1);
		
		JButton btnNewButton_4_1 = new JButton("New button");
		P_set.add(btnNewButton_4_1);
		
		JButton btnNewButton_5_1 = new JButton("New button");
		P_set.add(btnNewButton_5_1);
		
		JButton btnNewButton_6_1 = new JButton("New button");
		P_set.add(btnNewButton_6_1);
		
		JButton btnNewButton_7_1 = new JButton("New button");
		P_set.add(btnNewButton_7_1);
		
		JButton btnNewButton_8_1 = new JButton("New button");
		P_set.add(btnNewButton_8_1);
		
		JPanel P_side = new JPanel();
		tabbedPane.addTab("  사이드  ", null, P_side, null);
		P_side.setLayout(new GridLayout(3,3));
		
		JButton btnNewButton_9_1 = new JButton("New button");
		P_side.add(btnNewButton_9_1);
		
		JButton btnNewButton_1_1_1 = new JButton("New button");
		P_side.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2_1_1 = new JButton("New button");
		P_side.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_3_1_1 = new JButton("New button");
		P_side.add(btnNewButton_3_1_1);
		
		JButton btnNewButton_4_1_1 = new JButton("New button");
		P_side.add(btnNewButton_4_1_1);
		
		JButton btnNewButton_5_1_1 = new JButton("New button");
		P_side.add(btnNewButton_5_1_1);
		
		JButton btnNewButton_6_1_1 = new JButton("New button");
		P_side.add(btnNewButton_6_1_1);
		
		JButton btnNewButton_7_1_1 = new JButton("New button");
		P_side.add(btnNewButton_7_1_1);
		
		JButton btnNewButton_8_1_1 = new JButton("New button");
		P_side.add(btnNewButton_8_1_1);
		
		JPanel P_drink = new JPanel();
		tabbedPane.addTab("  음료  ", null, P_drink, null);
		P_drink.setLayout(new GridLayout(3,3));
		
		JButton btnNewButton_9_2 = new JButton("New button");
		P_drink.add(btnNewButton_9_2);
		
		JButton btnNewButton_1_1_2 = new JButton("New button");
		P_drink.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_2_1_2 = new JButton("New button");
		P_drink.add(btnNewButton_2_1_2);
		
		JButton btnNewButton_3_1_2 = new JButton("New button");
		P_drink.add(btnNewButton_3_1_2);
		
		JButton btnNewButton_4_1_2 = new JButton("New button");
		P_drink.add(btnNewButton_4_1_2);
		
		JButton btnNewButton_5_1_2 = new JButton("New button");
		P_drink.add(btnNewButton_5_1_2);
		
		JButton btnNewButton_6_1_2 = new JButton("New button");
		P_drink.add(btnNewButton_6_1_2);
		
		JButton btnNewButton_7_1_2 = new JButton("New button");
		P_drink.add(btnNewButton_7_1_2);
		
		JButton btnNewButton_8_1_2 = new JButton("New button");
		P_drink.add(btnNewButton_8_1_2);
		
		JScrollPane scrollPane = new JScrollPane();
		JTable jtable = new JTable();
		jtable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\uCD1D \uAE08\uC561", "\uC218\uB7C9", "\uC81C\uD488\uBA85"
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

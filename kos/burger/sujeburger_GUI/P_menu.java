package sujeburger_GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
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

public class P_menu extends JPanel  {
	private JTable table;
	private JTextField textField;
	public JButton btn_burger[] = new JButton[9], btn_set[] = new JButton[9], btn_side[] = new JButton[9],
			btn_drink[] = new JButton[9];
	public RoundJbutton btn_pay, btn_cancel, btn_discount, btn_cancel_discount, btn_member_ctrl, btn_admin, btn_logout;

	/**
	 * Create the panel.
	 */
	public P_menu() {
		setSize(new Dimension(1280, 1024));
		setBackground(Color.WHITE);
		setLayout(null);

		UIManager.put("TabbedPane.contentBorderInsets", new Insets(0, 0, 0, 0));
		UIManager.put("TabbedPane.selected", ColorUIResource.LIGHT_GRAY);
		UIManager.put("TabbedPane.darkShadow", ColorUIResource.BLACK);
		UIManager.put("TabbedPane.selectHighlight", ColorUIResource.ORANGE);

		// TabbedPane 생성
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

		// TabbedPane 옵션 조정
		tabbedPane.setBackground(new Color(255, 255, 255));
		tabbedPane.setAutoscrolls(true);
		tabbedPane.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		tabbedPane.setBounds(12, 34, 828, 920);

		// P_menu의 기본 패널에 붙이기
		add(tabbedPane);

		// tabbed pane 에 들어갈 메뉴 품목별 JPanel 생성
		JPanel P_burger = new JPanel();
		tabbedPane.addTab("  햄버거   ", null, P_burger, null);
		P_burger.setLayout(new GridLayout(3, 3));

		JPanel P_set = new JPanel();
		tabbedPane.addTab("  세트  ", null, P_set, null);
		P_set.setLayout(new GridLayout(3, 3));

		JPanel P_side = new JPanel();
		tabbedPane.addTab("  사이드  ", null, P_side, null);
		P_side.setLayout(new GridLayout(3, 3));

		JPanel P_drink = new JPanel();
		tabbedPane.addTab("  음료  ", null, P_drink, null);
		P_drink.setLayout(new GridLayout(3, 3));

		// 각 버튼을 반복문을 통해 생성 및 옵션 조정
		for (int i = 0; i < 9; i++) {
			// 햄버거 버튼 생성 , 옵션조정
			btn_burger[i] = new MenuJButton();
			btn_burger[i].setIcon(new ImageIcon(
					"burger\\sujeburger_GUI\\product_image\\이미지모음\\버거이미지\\" + (i + 1)
							+ ".png"));

			// 세트 버튼 생성, 옵션 조정
			btn_set[i] = new MenuJButton();
			btn_set[i].setIcon(new ImageIcon(
					"burger\\sujeburger_GUI\\product_image\\이미지모음\\세트이미지\\" + (i + 1)
							+ ".png"));

			// 사이드 버튼 생성, 옵션 조정
			btn_side[i] = new MenuJButton();
			btn_side[i].setIcon(new ImageIcon(
					"burger\\sujeburger_GUI\\product_image\\이미지모음\\사이드이미지\\" + (i + 1)
							+ ".png"));

			// 음료 버튼 생성, 옵션조정
			btn_drink[i] = new MenuJButton();
			btn_drink[i].setIcon(new ImageIcon(
					"burger\\sujeburger_GUI\\product_image\\이미지모음\\음료이미지\\" + (i + 1)
							+ ".png"));

			// 위에서 생성한 버튼을 각 매뉴의 패널에 붙임
			P_burger.add(btn_burger[i]);
			P_set.add(btn_set[i]);
			P_side.add(btn_side[i]);
			P_drink.add(btn_drink[i]);

		}
		//버거 버튼 텍스트 설정

		btn_burger[0].setText("빅킹버거");
		btn_burger[1].setText("스파이시홍콩버거");			
		btn_burger[2].setText("킹치킨버거");		
		btn_burger[3].setText("더블더블버거");
		btn_burger[4].setText("비슈버거");
		btn_burger[5].setText("햄버거");
		btn_burger[6].setText("불포크버거");
		btn_burger[7].setText("베이컨토마토킹버거");
		btn_burger[8].setText("치즈버거");
		
		//세트 버튼 텍스트 설정
		
		//사이드 버튼 텍스트 설정
		btn_side[0].setText("너겟 4조각");
		btn_side[1].setText("너겟 8조각");
		btn_side[2].setText("치즈 스틱");
		btn_side[3].setText("치즈 포테이토");
		btn_side[4].setText("어니언링");
		btn_side[5].setText("치즈볼");
		
		// 음료버튼 텍스트 설정
		btn_drink[0].setText("코카 콜라");
		btn_drink[1].setText("제로 콜라");
		btn_drink[2].setText("스프라이트");
		btn_drink[3].setText("씨그램");
		btn_drink[4].setText("미닛메이드");
		btn_drink[5].setText("물");
		
		
				
				

		JScrollPane scrollPane = new JScrollPane();
		JTable jtable = new JTable();
		jtable.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "품명", "수량", "가격" }));
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

		btn_pay = new RoundJbutton("결제");
		btn_pay.setBounds(872, 500, 175, 86);
		add(btn_pay);

		btn_cancel = new RoundJbutton("수량 취소");
		btn_cancel.setBounds(1067, 500, 175, 86);
		add(btn_cancel);

		btn_discount = new RoundJbutton("회원 할인");

		btn_discount.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btn_discount.setBounds(872, 626, 370, 86);

		add(btn_discount);

		btn_cancel_discount = new RoundJbutton("할인 취소");
		btn_cancel_discount.setBounds(872, 746, 370, 86);
		add(btn_cancel_discount);

		btn_member_ctrl = new RoundJbutton("회원 관리");
		btn_member_ctrl.setBounds(872, 868, 100, 86);
		add(btn_member_ctrl);

		btn_admin = new RoundJbutton("관리자");
		btn_admin.setBounds(1007, 868, 100, 86);
		add(btn_admin);

		btn_logout = new RoundJbutton("로그아웃");
		btn_logout.setBounds(1142, 868, 100, 86);
		add(btn_logout);

	}

	//각 버튼에 대한 이벤트 발생
	

}

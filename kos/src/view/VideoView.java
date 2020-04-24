package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;

import model.dao.VideoModel;
import model.vo.Video;

public class VideoView extends JPanel {
	// member field
	JTextField tfVideoNum, tfVideoTitle, tfVideoDirector, tfVideoActor;
	JComboBox comVideoJanre;
	JTextArea taVideoContent;

	JCheckBox cbMultiInsert;
	JTextField tfInsertCount;

	JButton bVideoInsert, bVideoModify, bVideoDelete;

	JComboBox comVideoSearch;
	JTextField tfVideoSearch;
	JTable tableVideo;

	VideoTableModel tbModelVideo;

	// 모델단 변수 선언
	VideoModel model;

	// ##############################################
	// constructor method
	public VideoView() {
		connectDB(); // DB연결
		addLayout(); // 화면설계
		initStyle();
		eventProc();
	}

	public void connectDB() { // DB연결
		try {
			model = new VideoModel();
		} catch (Exception e) {
			System.out.println("비디오 드라이브 로딩 실패 " + e.getMessage());
		}

	}

	public void eventProc() {
		ButtonEventHandler handler = new ButtonEventHandler();
		bVideoInsert.addActionListener(handler);
		bVideoDelete.addActionListener(handler);
		bVideoModify.addActionListener(handler);
		tfVideoSearch.addActionListener(handler);
		cbMultiInsert.addActionListener(new ActionListener() {

			// 다중입고 처리
			public void actionPerformed(ActionEvent e) {
//				if(cbMultiInsert.isSelected())tfInsertCount.setEditable(true);
//				else tfInsertCount.setEditable(false);
				tfInsertCount.setEditable(cbMultiInsert.isSelected());// 위의 if가 이미 boolean이니까
				// 그 이프문을 아얘 끌고들어올 수도 있다.

			}
		});

		tableVideo.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				int row = tableVideo.getSelectedRow();
				String vnum = (String) tableVideo.getValueAt(row, 0);
				try {

					Video vo = model.selectByPK(vnum);
					tfVideoActor.setText(vo.getActor());
					tfVideoDirector.setText(vo.getDirector());
					tfVideoTitle.setText(vo.getVideoName());
					taVideoContent.setText(vo.getExp());
					comVideoJanre.setSelectedItem(vo.getGenre());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

	}

	// 버튼 이벤트 핸들러 만들기
	class ButtonEventHandler implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			Object o = ev.getSource();

			if (o == bVideoInsert) {
				registVideo(); // 비디오 등록
			} else if (o == bVideoModify) {
				modifyVideo(); // 비디오 정보 수정
			} else if (o == bVideoDelete) {
				deleteVideo(); // 비디오 정보 삭제
			} else if (o == tfVideoSearch) {
				searchVideo(); // 비디오 검색
			}
		}
	}

	// 입고 클릭시 - 비디오 정보 등록
	public void registVideo() {
//		JOptionPane.showMessageDialog(null, "입고");
		// 각 화면의 입력값을 얻어옴
		String genre = String.valueOf(comVideoJanre.getSelectedItem());
		String videoName = tfVideoTitle.getText();
		String director = tfVideoDirector.getText();
		String actor = tfVideoActor.getText();
		String exp = taVideoContent.getText();
		int count = Integer.parseInt(tfInsertCount.getText());
		Video vo = new Video();
		vo.setActor(actor);
		vo.setDirector(director);
		vo.setExp(exp);
		vo.setGenre(genre);
		vo.setVideoName(videoName);

		// video class의 멤버로 지정하기

		// 모델단에 insertvideo 함수 호출
		try {
			model.insertVideo(vo, count);
			JOptionPane.showMessageDialog(null, "추가 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void initStyle() { // 입력하지 못하게 만듬.
		tfVideoNum.setEditable(false);
		tfInsertCount.setEditable(false);
		tfInsertCount.setHorizontalAlignment(JTextField.RIGHT);
	}

	// 수정 클릭시 - 비디오 정보 수정
	public void modifyVideo() {
		JOptionPane.showMessageDialog(null, "수정");
	}

	// 삭제 클릭시 - 비디오 정보 삭제
	public void deleteVideo() {

		JOptionPane.showMessageDialog(null, "삭제");
	}

	// 비디오현황검색
	public void searchVideo() {
//		String select =String.valueOf(comVideoSearch.getSelectedItem());
		int index = comVideoSearch.getSelectedIndex();
		String word = tfVideoSearch.getText();
		try {
			ArrayList data = model.searchVideo(index, word);
			tbModelVideo.data = data;
			tableVideo.setModel(tbModelVideo);
			tbModelVideo.fireTableDataChanged();

		} catch (Exception e) {
			System.out.println("비디오검색 실패" + e.getMessage());
		}

	}

	// 화면설계 메소드
	public void addLayout() {
		// 멤버변수의 객체 생성
		tfVideoNum = new JTextField();
		tfVideoTitle = new JTextField();
		tfVideoDirector = new JTextField();
		tfVideoActor = new JTextField();

		String[] cbJanreStr = { "멜로", "엑션", "스릴", "코미디" };
		comVideoJanre = new JComboBox(cbJanreStr);
		taVideoContent = new JTextArea();

		cbMultiInsert = new JCheckBox("다중입고");
		tfInsertCount = new JTextField("1", 5);

		bVideoInsert = new JButton("입고");
		bVideoModify = new JButton("수정");
		bVideoDelete = new JButton("삭제");

		String[] cbVideoSearch = { "제목", "배우" };
		comVideoSearch = new JComboBox(cbVideoSearch);
		tfVideoSearch = new JTextField(15);

		tbModelVideo = new VideoTableModel();
		tableVideo = new JTable(tbModelVideo);

		// *********************************************************************
		// 화면 구성
		// 왼쪽영역
		JPanel p_left = new JPanel();
		JPanel p_left_c = new JPanel();
		p_left_c.setBorder(new TitledBorder("비디오정보입력"));

		JPanel p_left_c_up = new JPanel();
		p_left_c_up.setLayout(new GridLayout(5, 2));
		p_left_c_up.add(new JLabel("비디오번호"));
		p_left_c_up.add(tfVideoNum);
		p_left_c_up.add(new JLabel("장르"));
		p_left_c_up.add(comVideoJanre);
		p_left_c_up.add(new JLabel("제목"));
		p_left_c_up.add(tfVideoTitle);
		p_left_c_up.add(new JLabel("감독"));
		p_left_c_up.add(tfVideoDirector);
		p_left_c_up.add(new JLabel("배우"));
		p_left_c_up.add(tfVideoActor);

		JPanel p_left_c_down = new JPanel();
		p_left_c_down.setLayout(new BorderLayout());
		p_left_c_down.add(new JLabel("설명"), BorderLayout.WEST);
		p_left_c_down.add(taVideoContent, BorderLayout.CENTER);

		p_left_c.setLayout(new BorderLayout());
		p_left_c.add(p_left_c_up, BorderLayout.NORTH);
		p_left_c.add(p_left_c_down, BorderLayout.CENTER);

		// 왼쪽의 아래 영역
		JPanel p_left_s = new JPanel();

		p_left.setLayout(new BorderLayout());
		p_left.add(p_left_c, BorderLayout.CENTER);
		p_left.add(p_left_s, BorderLayout.SOUTH);

		JPanel p_left_s_up = new JPanel();
		p_left_s_up.setBorder(new TitledBorder("다중입력시 선택하세요"));

		p_left_s_up.add(cbMultiInsert);
		p_left_s_up.add(tfInsertCount);
		p_left_s_up.add(new JLabel("개"));

		JPanel p_left_s_down = new JPanel(new GridLayout(1, 3));

		p_left_s.setLayout(new GridLayout(2, 1));
		p_left_s.add(p_left_s_up);
		p_left_s.add(p_left_s_down);

		p_left_s_down.add(bVideoInsert);
		p_left_s_down.add(bVideoModify);
		p_left_s_down.add(bVideoDelete);

		// 오른쪽

		JPanel p_right = new JPanel();
		p_right.setBorder(new TitledBorder("비디오 검색"));

		// 오른쪽 영역 위
		JPanel p_right_up = new JPanel();
		p_right_up.add(comVideoSearch);
		p_right_up.add(tfVideoSearch);

		p_right.add(p_right_up);
		p_right.add(new JScrollPane(tableVideo), BorderLayout.CENTER);

		setLayout(new GridLayout(1, 2));
		add(p_left);
		add(p_right);

	}

	// 화면에 테이블 붙이는 메소드
	class VideoTableModel extends AbstractTableModel {

		ArrayList data = new ArrayList();
		String[] columnNames = { "비디오번호", "제목", "배우" };

		// =============================================================
		// 1. 기본적인 TabelModel 만들기
		// 아래 세 함수는 TabelModel 인터페이스의 추상함수인데
		// AbstractTabelModel에서 구현되지 않았기에...
		// 반드시 사용자 구현 필수!!!!

		public int getColumnCount() {
			return columnNames.length;
		}

		public int getRowCount() {
			return data.size();
		}

		public Object getValueAt(int row, int col) {
			ArrayList temp = (ArrayList) data.get(row);
			return temp.get(col);
		}

		public String getColumnName(int col) {
			return columnNames[col];
		}
	}
}

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class MenuTebleModel extends AbstractTableModel {

	ArrayList data = new ArrayList();
	String[] columnNames = { "품명", "수량", "가격" };

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

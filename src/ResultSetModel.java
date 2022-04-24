import java.util.Vector;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Students
 */
public class ResultSetModel extends AbstractTableModel {

    public String[] columnsname = new String[0];
    public Vector<String[]> datarows = new Vector<String[]>();
    int colunms;

    public void MetaResult(ResultSet result) {
        try {

            ResultSetMetaData metaData = result.getMetaData();
            colunms = metaData.getColumnCount();
            columnsname = new String[colunms];

            for (int i = 0; i < colunms; i++) {
                columnsname[i] = metaData.getColumnLabel(i + 1);
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle);
        }

    }

    public void dataResult(ResultSet result) {
        MetaResult(result);

        try {

            datarows.clear();
            String[] rowdata;
            while (result.next()) {
                rowdata = new String[colunms];
                for (int i = 0; i < colunms; i++) {
                    rowdata[i] = result.getString(i + 1);
                }
                datarows.addElement(rowdata);
            }
            fireTableChanged(null);
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle);
        }

    }

    public int getRowCount() {
        return datarows == null ? 0 : datarows.size();
    }

    public int getColumnCount() {
        return columnsname.length;
    }

    public Object getValueAt(int row, int column) {
        return datarows.elementAt(row)[column];
    }

    public String getColumnName(int column) {
        return columnsname[column] == null ? "No Name" : columnsname[column];
    }
}

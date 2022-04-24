
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;    // Import the Vector class
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Invoice extends javax.swing.JFrame {

    ResultSetModel rsm = new ResultSetModel();
    Product pro = new Product();
    //   ResultSetModel irsm = new ResultSetModel();
    DefaultTableModel dtm = new DefaultTableModel();
    String sqc = "";
    Statement stm;
    ResultSet rs;
    PreparedStatement prstm;

    /**
     * Creates new form Invoice
     */
    public Invoice() {
        initComponents();
        loadCombo();
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
        Date date = new Date();
        String newdate = df.format(date);
        d.setText(newdate);
    }

    private void loadCombo() {
        pro.MyDriver();
        pname.addItem("");
        try {
            stm = pro.con.createStatement();
            rs = stm.executeQuery("select product_name from product");
            while (rs.next()) {
                pname.addItem(rs.getString("product_name"));
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle);
        }
    }

    private void clearFields() {
        bno.setText("");
        pid.setText("");
        pname.setSelectedIndex(0);
        stock.setText("");
        up.setText("");
        quantity.setText("");
        total.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        d = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pname = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        stock = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        up = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        save = new javax.swing.JButton();
        nf = new javax.swing.JButton();
        show = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Invoice");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Invoice");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Bill No.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Date");

        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Product Name");

        pname.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pnameItemStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Product ID");

        pid.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Stock");

        stock.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Unit Price");

        up.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Quantity");

        quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Total");

        jTable1.setModel(rsm);
        jScrollPane1.setViewportView(jTable1);

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        nf.setText("New");
        nf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nfActionPerformed(evt);
            }
        });

        show.setText("Show");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel6))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(bno, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel3))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel7)
                                                                                .addComponent(jLabel5))))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(up, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(69, 69, 69))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addComponent(nf)
                                                .addGap(26, 26, 26)
                                                .addComponent(save)
                                                .addGap(30, 30, 30)
                                                .addComponent(show)
                                                .addGap(31, 31, 31)
                                                .addComponent(exit))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(bno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5)
                                                .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nf)
                                        .addComponent(save)
                                        .addComponent(exit)
                                        .addComponent(show))
                                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void showActionPerformed(java.awt.event.ActionEvent evt) {
        pro.MyDriver();
//        try {
//            stm = pro.con.createStatement();
//            rs = stm.executeQuery("SELECT * FROM Invoice");
//            Vector<String> header = new Vector<String>();
//            header.add("Bill No");
//            header.add("Bill Date");
//            header.add("Product Name");
//            header.add("Unit Price");
//            header.add("Quantity");
//            header.add("Total");
//
//            Vector<Vector<Object>> data = new Vector<Vector<Object>>();
//            while (rs.next()) {
//                Vector<Object> row = new Vector<Object>();
//                row.add(rs.getString(1));
//                row.add(rs.getString(2));
//                row.add(rs.getString(3));
//                row.add(rs.getString(4));
//                row.add(rs.getString(5));
//                row.add(rs.getString(6));
//                data.add(row); // add each result/row to data Vector
//            } // loop
//            dtm.setDataVector(data, header);
//
//        } catch (Exception e) {
//            System.out.println("Error in table: " + e);
//        }
        try {
            stm = pro.con.createStatement();
            rs = stm.executeQuery("SELECT * FROM Invoice");
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle);
        }

        rsm.dataResult(rs);
    }

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {
        pro.MyDriver();
        int st = Integer.parseInt(stock.getText());
        int q = Integer.parseInt(quantity.getText());
        int sup = st - q;

        sqc = "Insert into invoice values("
                + Integer.parseInt(bno.getText())
                + ",'" + d.getText() + "','"
                + pname.getSelectedItem() + "',"
                + Integer.parseInt(up.getText()) + ","
                + q + "," + Integer.parseInt(total.getText()) + ")";

        try {
            stm = pro.con.createStatement();
            stm.executeUpdate(sqc);

        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle);
        }
        int pr = Integer.parseInt(pid.getText());
        try {
            String str = "update product set STOCK=? where PRODUCT_ID=?";
            prstm = pro.con.prepareStatement(str);
            prstm.setInt(1, sup);
            prstm.setInt(2, pr);
            prstm.executeUpdate();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle);
        }
        clearFields();
    }

    private void nfActionPerformed(java.awt.event.ActionEvent evt) {
        clearFields();
    }

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    private void quantityKeyReleased(java.awt.event.KeyEvent evt) {
        int u = Integer.parseInt(up.getText());
        int q = Integer.parseInt(quantity.getText());
        int t = 0;
        int st = Integer.parseInt(stock.getText());
        if (q > st) {
            JOptionPane.showMessageDialog(null, "Stock Don't Support");
            total.setText("");
            quantity.setText("");
        } else {
            t = q * u;
            total.setText(String.valueOf(t));
        }
    }

    private void pnameItemStateChanged(java.awt.event.ItemEvent evt) {
        // TODO add your handling code here:
        sqc = "Select * from product "
                + "where PRODUCT_NAME='"
                + String.valueOf(pname.getSelectedItem()) + "'";
        try {
            stm = pro.con.createStatement();
            rs = stm.executeQuery(sqc);
            while (rs.next()) {
                pid.setText(rs.getString("PRODUCT_ID"));
                stock.setText(rs.getString("STOCK"));
                up.setText(rs.getString("UNIT_PRICE"));
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle);
        }
    }

    private void dActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Invoice().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify
    private javax.swing.JTextField bno;
    private javax.swing.JTextField d;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton nf;
    private javax.swing.JTextField pid;
    private javax.swing.JComboBox pname;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton save;
    private javax.swing.JButton show;
    private javax.swing.JTextField stock;
    private javax.swing.JTextField total;
    private javax.swing.JTextField up;
    // End of variables declaration
}

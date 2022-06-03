package javaswingproject;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Arifeen Mahmud
 */
public class NewJFrame extends javax.swing.JFrame {
    
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/product?zeroDateTimeBehavior=convertToNull";
    Connection con;
    Statement stm;
    PreparedStatement prstm;
    ResultSet rs;
    // ResultSetModel rsm = new ResultSetModel();
    DefaultTableModel dtm = new DefaultTableModel();
    String sqls = "";
    String sqc = "";
//    ResultSetModel rsm = new ResultSetModel();

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        setSize(1100, 500);
        date();
        times();
        loadCombo();
        subtotalTF.requestFocus();
        ImageIcon img = new ImageIcon("C:\\Users\\Arifeen Mahmud\\Documents\\NetBeansProjects\\JavaSwingProject 1\\src\\javaswingproject\\rsz_3rsz_1vanilla.png");
        this.setIconImage(img.getImage());
        getContentPane().setBackground(Color.WHITE);
        
    }
    
    public void date() {
        String textDate = new SimpleDateFormat("dd/MM/yyy", Locale.US).format(new Date());
        SysDate.setText("" + textDate);
    }
    
    public void times() {
        Thread dateTime = new Thread(){
        public void run(){
            
            try {
                for(;;){
                    Calendar cal = new GregorianCalendar();
                    
                    int second = cal.get(Calendar.SECOND);
                    int minute = cal.get(Calendar.MINUTE);
                    int hours = cal.get(Calendar.HOUR);
                    
                    time.setText("Time: " + hours + ":" + minute + ":" + second);
                    sleep(1000);
                    
                    
                
                }
                
            } catch (Exception e) {
            }
        
        }
        };
        dateTime.start();
    
    }
    
    private void loadCombo() {
        
        MyDriver();
        jComboBox1.addItem("");
        try {
            stm = con.createStatement();
            rs = stm.executeQuery("select subtotal from product");
            while (rs.next()) {
                jComboBox1.addItem(rs.getString("subtotal"));
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle);
        }
    }
    
    public void MyDriver() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, "root", "");
        } catch (ClassNotFoundException cnf) {
            System.out.println(cnf);
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle);
        }
        
    }
    
    public void clearFields() {
        subtotalTF.setText("");
        taxTF.setText("");
        totalTF.setText("");
        
    }
    
    public void clearTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        model.setRowCount(0);
//        model.setColumnCount(0);

        int rowCount = model.getRowCount();
//Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }
    
    public void showTable() {
        try {
            // TODO add your handling code here:
            Class.forName(driver);
            con = DriverManager.getConnection(url, "root", "");
            
            Statement st = con.createStatement();
            sqls = "select * from product";
            ResultSet rs = st.executeQuery(sqls);
            
            while (rs.next()) {
                String subtotal = String.valueOf(rs.getDouble("subtotal"));
                String tax = String.valueOf(rs.getDouble("tax"));
                String total = String.valueOf(rs.getDouble("total"));
//                String 	id = String.valueOf(rs.getDouble("id"));

                String tbData[] = {subtotal, tax, total};
                DefaultTableModel tbModel = (DefaultTableModel) jTable1.getModel();
                
                tbModel.addRow(tbData);
            }
            
        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(InvoiceForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
//            Logger.getLogger(InvoiceForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        SysDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        calculateBtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        vanillaRad = new javax.swing.JRadioButton();
        strawberryRad = new javax.swing.JRadioButton();
        chocolateRad = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        sprinklesChk = new javax.swing.JCheckBox();
        peanutsChk = new javax.swing.JCheckBox();
        fudgechk = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        subtotalTF = new javax.swing.JTextField();
        taxTF = new javax.swing.JTextField();
        totalTF = new javax.swing.JTextField();
        time = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1120, 470));
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        SysDate.setEditable(false);
        SysDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SysDateActionPerformed(evt);
            }
        });
        jPanel3.add(SysDate);
        SysDate.setBounds(90, 20, 110, 30);

        jLabel5.setText("Date:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(40, 20, 40, 30);

        exitBtn.setBackground(new java.awt.Color(153, 255, 153));
        exitBtn.setText("Close");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel3.add(exitBtn);
        exitBtn.setBounds(820, 420, 70, 60);

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setText("Print");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(670, 420, 140, 60);

        resetBtn.setBackground(new java.awt.Color(255, 255, 255));
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        jPanel3.add(resetBtn);
        resetBtn.setBounds(540, 420, 120, 60);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select price" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jPanel3.add(jComboBox1);
        jComboBox1.setBounds(190, 420, 110, 60);
        jPanel3.add(jTextField1);
        jTextField1.setBounds(300, 420, 40, 60);
        jPanel3.add(jTextField2);
        jTextField2.setBounds(340, 420, 40, 60);

        jButton7.setBackground(new java.awt.Color(204, 51, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Delete Price");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);
        jButton7.setBounds(380, 420, 150, 60);

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
        jButton4.setText("Delete Row");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(180, 200, 120, 40);

        calculateBtn.setBackground(new java.awt.Color(255, 204, 204));
        calculateBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        calculateBtn.setText("Calculate");
        calculateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBtnActionPerformed(evt);
            }
        });
        jPanel3.add(calculateBtn);
        calculateBtn.setBounds(180, 150, 120, 40);

        jButton3.setBackground(new java.awt.Color(204, 255, 204));
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(300, 150, 100, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sub Total", "tax", "Total"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(210, 265, 650, 150);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Show all Data");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(300, 200, 110, 40);

        jButton8.setBackground(new java.awt.Color(153, 153, 255));
        jButton8.setText("Update");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8);
        jButton8.setBounds(630, 200, 120, 40);

        jButton9.setText("Menu Bar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9);
        jButton9.setBounds(760, 200, 90, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Ice cream Box");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(440, 10, 131, 22);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        vanillaRad.setText("Vanilla 1.00$");
        vanillaRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vanillaRadActionPerformed(evt);
            }
        });

        strawberryRad.setText("Strawberry 2.00$");
        strawberryRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strawberryRadActionPerformed(evt);
            }
        });

        chocolateRad.setText("Chocolate 3.50$");
        chocolateRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocolateRadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vanillaRad)
                    .addComponent(strawberryRad)
                    .addComponent(chocolateRad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(vanillaRad)
                .addGap(10, 10, 10)
                .addComponent(strawberryRad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
                .addComponent(chocolateRad)
                .addContainerGap())
        );

        jPanel3.add(jPanel1);
        jPanel1.setBounds(520, 50, 140, 90);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        sprinklesChk.setText("Sprinkles $.20");

        peanutsChk.setText("Peanuts $.30");

        fudgechk.setText("Fudge$ .40");
        fudgechk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fudgechkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sprinklesChk)
                    .addComponent(peanutsChk)
                    .addComponent(fudgechk))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sprinklesChk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(peanutsChk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fudgechk)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2);
        jPanel2.setBounds(710, 50, 130, 91);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Subtotal:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(440, 160, 64, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tax:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(460, 200, 40, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Total:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(450, 230, 50, 17);

        subtotalTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtotalTFActionPerformed(evt);
            }
        });
        jPanel3.add(subtotalTF);
        subtotalTF.setBounds(520, 160, 99, 30);
        jPanel3.add(taxTF);
        taxTF.setBounds(520, 190, 99, 30);

        totalTF.setText(" ");
        jPanel3.add(totalTF);
        totalTF.setBounds(520, 220, 99, 30);

        time.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        time.setText("Time");
        jPanel3.add(time);
        time.setBounds(210, 20, 120, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaswingproject/120-SM632651.jpg"))); // NOI18N
        jPanel3.add(jLabel6);
        jLabel6.setBounds(0, 0, 1120, 610);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1120, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void vanillaRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vanillaRadActionPerformed
        // TODO add your handling code here:
        if (vanillaRad.isSelected()) {
            chocolateRad.setSelected(false);
        }
        strawberryRad.setSelected(false);

    }//GEN-LAST:event_vanillaRadActionPerformed

    private void subtotalTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtotalTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtotalTFActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
//        System.exit(0);
//        dispose();
        setVisible(false);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        vanillaRad.setSelected(false);
        chocolateRad.setSelected(false);
        strawberryRad.setSelected(false);
        
        sprinklesChk.setSelected(false);
        peanutsChk.setSelected(false);
        fudgechk.setSelected(false);
        
        subtotalTF.setText("");
        taxTF.setText("");
        totalTF.setText("");
        
        clearTable();
        loadCombo();

    }//GEN-LAST:event_resetBtnActionPerformed

    private void strawberryRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strawberryRadActionPerformed
        // TODO add your handling code here:
        if (strawberryRad.isSelected()) {
            chocolateRad.setSelected(false);
        }
        vanillaRad.setSelected(false);
    }//GEN-LAST:event_strawberryRadActionPerformed

    private void chocolateRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocolateRadActionPerformed
        // TODO add your handling code here:
        if (chocolateRad.isSelected()) {
            vanillaRad.setSelected(false);
        }
        strawberryRad.setSelected(false);

    }//GEN-LAST:event_chocolateRadActionPerformed

    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed
        // TODO add your handling code here:
        double total;
        double subtotal = 0;
        final double TAXRATE = .05;
        double tax;
        if (vanillaRad.isSelected()) {
            subtotal = subtotal + 1.00;
        } else if (strawberryRad.isSelected()) {
            subtotal = subtotal + 2.00;
        } else if (chocolateRad.isSelected()) {
            subtotal = subtotal + 3.50;
        }
        
        if (sprinklesChk.isSelected()) {
            subtotal = subtotal + .20;
            subtotalTF.setText(Double.toString(subtotal));
            
            subtotal = Double.parseDouble(subtotalTF.getText());
            tax = subtotal * TAXRATE;
            total = tax + subtotal;
            taxTF.setText(Double.toString(tax));
            totalTF.setText(Double.toString(total));
        }
        if (peanutsChk.isSelected()) {
            subtotal = subtotal + .30;
            subtotalTF.setText(Double.toString(subtotal));
            
            subtotal = Double.parseDouble(subtotalTF.getText());
            tax = subtotal * TAXRATE;
            total = tax + subtotal;
            taxTF.setText(Double.toString(tax));
            totalTF.setText(Double.toString(total));
        }
        if (fudgechk.isSelected()) {
            subtotal = subtotal + .40;
            
            subtotalTF.setText(Double.toString(subtotal));
            
            subtotal = Double.parseDouble(subtotalTF.getText());
            tax = subtotal * TAXRATE;
            total = tax + subtotal;
            taxTF.setText(Double.toString(tax));
            totalTF.setText(Double.toString(total));
        }
        
        DefaultTableModel modle = (DefaultTableModel) jTable1.getModel();
        
        modle.addRow(new Object[]{subtotalTF.getText(), taxTF.getText(), totalTF.getText()});
        

    }//GEN-LAST:event_calculateBtnActionPerformed

    private void fudgechkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fudgechkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fudgechkActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if (subtotalTF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select your flavor then Calculate.");
        } else {
            MyDriver();
            sqls = "Insert into product values(" + Double.parseDouble(subtotalTF.getText()) + ",'" + Double.parseDouble(taxTF.getText()) + "',"
                    + Double.parseDouble(totalTF.getText()) + ")";
            System.out.println(sqls);
            
            try {
                
                stm = con.createStatement();
                System.out.println(con);
                stm.executeUpdate(sqls);
                JOptionPane.showMessageDialog(null, "Success");
            } catch (SQLException sqle) {
                JOptionPane.showMessageDialog(null, sqls);
            } catch (java.lang.NumberFormatException empty) {
                JOptionPane.showMessageDialog(null, "Please select your flavor first.");
            }
            clearFields();
            
        }
        loadCombo();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        
        if (jTable1.getSelectedRowCount() == 1) {
            tblModel.removeRow(jTable1.getSelectedRow());
        } else {
            if (jTable1.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table is empty");
            } else {
                JOptionPane.showMessageDialog(this, "Please Select Single Row");
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        MessageFormat head = new MessageFormat("This is header");
        MessageFormat Footer = new MessageFormat("This is Footer");
        
        try {
            jTable1.print(JTable.PrintMode.NORMAL, head, Footer);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        clearTable();
        try {
            // TODO add your handling code here:
            Class.forName(driver);
            con = DriverManager.getConnection(url, "root", "");
            
            Statement st = con.createStatement();
            sqls = "select * from product";
            ResultSet rs = st.executeQuery(sqls);
            
            while (rs.next()) {
                String subtotal = String.valueOf(rs.getDouble("subtotal"));
                String tax = String.valueOf(rs.getDouble("tax"));
                String total = String.valueOf(rs.getDouble("total"));
//                String 	id = String.valueOf(rs.getDouble("id"));

                String tbData[] = {subtotal, tax, total};
                DefaultTableModel tbModel = (DefaultTableModel) jTable1.getModel();
                
                tbModel.addRow(tbData);
            }
            
        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(InvoiceForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
//            Logger.getLogger(InvoiceForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:

        sqc = "Select * from product where subtotal='"
                + String.valueOf(jComboBox1.getSelectedItem()) + "'";
        try {
            stm = con.createStatement();
            rs = stm.executeQuery(sqc);
            while (rs.next()) {
                jTextField1.setText(rs.getString("tax"));
                jTextField2.setText(rs.getString("total"));
                
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle);
        }

    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:

        if (jTextField1.getText().isEmpty() && jTextField2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select your Price to Delete.");
        } else {
            if (JOptionPane.showConfirmDialog(null, "Do you want to Delete") == 0) {
                sqls = "delete from product where total=" + Double.parseDouble(jTextField2.getText());
                try {
                    stm = con.createStatement();
                    stm.executeUpdate(sqls);
                    JOptionPane.showMessageDialog(null, "Success");
                } catch (SQLException sqle) {
                    JOptionPane.showMessageDialog(null, sqle);
                }
            }
        }
        
        clearTable();
        try {
            // TODO add your handling code here:
            Class.forName(driver);
            con = DriverManager.getConnection(url, "root", "");
            
            Statement st = con.createStatement();
            sqls = "select * from product";
            ResultSet rs = st.executeQuery(sqls);
            
            while (rs.next()) {
                String subtotal = String.valueOf(rs.getInt("subtotal"));
                String tax = String.valueOf(rs.getString("tax"));
                String total = String.valueOf(rs.getString("total"));
                
                String tbData[] = {subtotal, tax, total};
                DefaultTableModel tbModel = (DefaultTableModel) jTable1.getModel();
                
                tbModel.addRow(tbData);
            }
            
        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(InvoiceForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
//            Logger.getLogger(InvoiceForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel tbModel = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        
        subtotalTF.setText(tbModel.getValueAt(selectedIndex, 0).toString());
        taxTF.setText(tbModel.getValueAt(selectedIndex, 1).toString());
        totalTF.setText(tbModel.getValueAt(selectedIndex, 2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        DefaultTableModel tbModel = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        
        try {
//              String id = ((String) tbModel.getValueAt(selectedIndex, 3));

            String subtotal = subtotalTF.getText();
            String tax = taxTF.getText();
            String total = totalTF.getText();
            
            Class.forName(driver);
            con = DriverManager.getConnection(url, "root", "");
            
            prstm = con.prepareStatement("update product set subtotal=?, total=?  where tax=? ");
            
            prstm.setString(1, subtotal);
            prstm.setString(2, total);
            prstm.setString(3, tax);
//            prstm.setString(4, id);

            prstm.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Update Success");
            
        } catch (ClassNotFoundException cnf) {
            System.out.println(cnf);
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle);
        }
        
        clearTable();
        showTable();
        

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        MenuItems i = new MenuItems();
        i.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void SysDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SysDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SysDateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SysDate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calculateBtn;
    private javax.swing.JRadioButton chocolateRad;
    private javax.swing.JButton exitBtn;
    private javax.swing.JCheckBox fudgechk;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JCheckBox peanutsChk;
    private javax.swing.JButton resetBtn;
    private javax.swing.JCheckBox sprinklesChk;
    private javax.swing.JRadioButton strawberryRad;
    private javax.swing.JTextField subtotalTF;
    private javax.swing.JTextField taxTF;
    private javax.swing.JLabel time;
    private javax.swing.JTextField totalTF;
    private javax.swing.JRadioButton vanillaRad;
    // End of variables declaration//GEN-END:variables
}

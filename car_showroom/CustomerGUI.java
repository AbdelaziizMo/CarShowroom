package car_showroom;

import javax.swing.JFrame;

/**
 *
 * @author minaa
 */
public class CustomerGUI extends javax.swing.JFrame {

    /**
     * Creates new form CarsGUI
     */
    public CustomerGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        Cars = new javax.swing.JButton();
        Customers = new javax.swing.JButton();
        Rental = new javax.swing.JButton();
        Return = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Right = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CustIdTb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CustIdTb1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CustIdTb2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CustIdTb3 = new javax.swing.JTextField();
        SaveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MANAGECARS");
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Left.setBackground(new java.awt.Color(0, 102, 102));
        Left.setPreferredSize(new java.awt.Dimension(200, 500));

        Cars.setBackground(new java.awt.Color(0, 102, 102));
        Cars.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        Cars.setForeground(new java.awt.Color(255, 255, 255));
        Cars.setText("MANAGE CARS");
        Cars.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Cars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarsActionPerformed(evt);
            }
        });

        Customers.setBackground(new java.awt.Color(0, 102, 102));
        Customers.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Customers.setForeground(new java.awt.Color(255, 255, 255));
        Customers.setText("MANAGE CUSTOMERS");
        Customers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Customers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomersActionPerformed(evt);
            }
        });

        Rental.setBackground(new java.awt.Color(0, 102, 102));
        Rental.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Rental.setForeground(new java.awt.Color(255, 255, 255));
        Rental.setText("CARS RENTAL");
        Rental.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Rental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentalActionPerformed(evt);
            }
        });

        Return.setBackground(new java.awt.Color(0, 102, 102));
        Return.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Return.setForeground(new java.awt.Color(255, 255, 255));
        Return.setText("RETUN CARS");
        Return.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(0, 102, 102));
        btnHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("HOME");
        btnHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnHome.setContentAreaFilled(false);
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\toshiba\\OneDrive\\Documents\\NetBeansProjects\\Car_Showroom\\src\\Icon\\6.png")); // NOI18N

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cars, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Customers, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rental, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Cars, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Customers, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Rental, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jPanel1.add(Left);
        Left.setBounds(0, 0, 210, 500);

        Right.setBackground(new java.awt.Color(255, 255, 255));
        Right.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MANAGE CUSTOMERS");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("CUSTOMER ID");

        CustIdTb.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        CustIdTb.setForeground(new java.awt.Color(0, 102, 51));
        CustIdTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustIdTbActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("CUSTOMER NAME");

        CustIdTb1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        CustIdTb1.setForeground(new java.awt.Color(0, 102, 51));
        CustIdTb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustIdTb1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("ADDRESS");

        CustIdTb2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        CustIdTb2.setForeground(new java.awt.Color(0, 102, 51));
        CustIdTb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustIdTb2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("PHONE");

        CustIdTb3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        CustIdTb3.setForeground(new java.awt.Color(0, 102, 51));
        CustIdTb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustIdTb3ActionPerformed(evt);
            }
        });

        SaveBtn.setBackground(new java.awt.Color(0, 102, 102));
        SaveBtn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(255, 255, 255));
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        EditBtn.setBackground(new java.awt.Color(0, 102, 102));
        EditBtn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(255, 255, 255));
        EditBtn.setText("Edit");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(0, 102, 102));
        DeleteBtn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        ResetBtn.setBackground(new java.awt.Color(0, 102, 102));
        ResetBtn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(255, 255, 255));
        ResetBtn.setText("Resest");
        ResetBtn.setActionCommand("");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        Table.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Table.setForeground(new java.awt.Color(0, 102, 102));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CUSTID", "CUSTNAME", "CUSTADD", "CUSTPHONE"
            }
        ));
        Table.setRowHeight(25);
        jScrollPane1.setViewportView(Table);

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RightLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(RightLayout.createSequentialGroup()
                                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(CustIdTb2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CustIdTb1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel5)
                                                .addComponent(CustIdTb, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                                .addComponent(CustIdTb3))
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(RightLayout.createSequentialGroup()
                                                .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(RightLayout.createSequentialGroup()
                                                .addComponent(DeleteBtn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ResetBtn))))))))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CustIdTb1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustIdTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CustIdTb2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustIdTb3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SaveBtn)
                            .addComponent(EditBtn))
                        .addGap(18, 18, 18)
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteBtn)
                            .addComponent(ResetBtn))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jPanel1.add(Right);
        Right.setBounds(210, 0, 590, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarsActionPerformed
        // TODO add your handling code here:
        ManageCars manageFrame = new ManageCars(); 
        manageFrame.setVisible(true);
        manageFrame.pack();
        manageFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_CarsActionPerformed

    private void CustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomersActionPerformed
        // TODO add your handling code here:
        CustomerGUI CustomerFrame = new CustomerGUI(); 
        CustomerFrame.setVisible(true);
        CustomerFrame.pack();
        CustomerFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_CustomersActionPerformed

    private void RentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentalActionPerformed
        // TODO add your handling code here:
        RentalGUI RentalFrame = new RentalGUI(); 
        RentalFrame.setVisible(true);
        RentalFrame.pack();
        RentalFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_RentalActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        // TODO add your handling code here:
        ReturnGUI ReturnFrame = new ReturnGUI(); 
        ReturnFrame.setVisible(true);
        ReturnFrame.pack();
        ReturnFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_ReturnActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        Home h = new Home();
        h.setVisible(true);
        h.pack();
        h.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void CustIdTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustIdTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustIdTbActionPerformed

    private void CustIdTb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustIdTb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustIdTb1ActionPerformed

    private void CustIdTb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustIdTb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustIdTb2ActionPerformed

    private void CustIdTb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustIdTb3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustIdTb3ActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // System.out.println("save btn clicked");
        String customerId,customerName,customerAdd,customerPhone,query;

        /*String SUr1,SCustId,SCustName,SCustAdd,SCustPhone;
        SUr1 = "jdbc:MySQL://localhost:3306/java_user_database";
        SCustId="root";
        SCustName="";
        SCustAdd="";
        SCustPhone="";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getconnection("Surl,SCustId,SCustName,SCustAdd,SCustPhone");
            Statement st = con.createStatement();
            if("".equals(CustIdTb.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "customerId is requiered", "Error", JOptionPane.ERROR_MESSAGE);
            }else if ( "".equals(CustNameTb.getText())   ){
                JOptionPane.showMessageDialog(new JFrame(), "customerName is requiered", "Error", JOptionPane.ERROR_MESSAGE);

            }else if("".equals(CustAddTb.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "customerAdd is requiered", "Error", JOptionPane.ERROR_MESSAGE);

            }else if("".equals(CustPhoneTb.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "customerPhone is requiered", "Error", JOptionPane.ERROR_MESSAGE);

            }else{
                customerId = CustIdTb.getText();
                customerName =CustNameTb.getText();
                customerAdd= CustAddTb.getText();
                customerPhone =CustPhoneTb.getText();
                System.out.println(customerName);

                query = "INSERT INTO user(customerId,customerName,customerAdd,customerPhone)"+"VALUES('"+customerId+"' , '"+customerName+"' ,'"+customerAdd+"' , '"+customerAdd+"' , '"+customerPhone+"')";
                st.execute(query);
                CustIdTb.setText("");
                CustNameTb.setText("");
                CustAddTb.setText("");
                CustPhoneTb.setText("");

                showMessageDialog(null,"name created ","Add created","Phone created");

            }

        } catch(Exception e){
            System.out.println("Error!"+e.getMessage());

        }*/

    }//GEN-LAST:event_SaveBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed

    }//GEN-LAST:event_ResetBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
            JFrame Home = new JFrame();
        HomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cars;
    private javax.swing.JTextField CustIdTb;
    private javax.swing.JTextField CustIdTb1;
    private javax.swing.JTextField CustIdTb2;
    private javax.swing.JTextField CustIdTb3;
    private javax.swing.JButton Customers;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JPanel Left;
    private javax.swing.JButton Rental;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton Return;
    private javax.swing.JPanel Right;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTable Table;
    private javax.swing.JButton btnHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

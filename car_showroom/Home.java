
package car_showroom;

import javax.swing.JFrame;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LogoutBtn1 = new javax.swing.JButton();
        manage_customers = new javax.swing.JButton();
        cars_renatl = new javax.swing.JButton();
        return_cars = new javax.swing.JButton();
        manage_cars = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 500));

        LogoutBtn1.setBackground(new java.awt.Color(0, 102, 102));
        LogoutBtn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogoutBtn1.setForeground(new java.awt.Color(255, 255, 255));
        LogoutBtn1.setText("LOGOUT");
        LogoutBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        LogoutBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtn1ActionPerformed(evt);
            }
        });

        manage_customers.setBackground(new java.awt.Color(0, 102, 102));
        manage_customers.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        manage_customers.setForeground(new java.awt.Color(255, 255, 255));
        manage_customers.setText("MANAGE CUSTOMERS");
        manage_customers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        manage_customers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manage_customersActionPerformed(evt);
            }
        });

        cars_renatl.setBackground(new java.awt.Color(0, 102, 102));
        cars_renatl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cars_renatl.setForeground(new java.awt.Color(255, 255, 255));
        cars_renatl.setText("CARS RENTAL");
        cars_renatl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cars_renatl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cars_renatlActionPerformed(evt);
            }
        });

        return_cars.setBackground(new java.awt.Color(0, 102, 102));
        return_cars.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        return_cars.setForeground(new java.awt.Color(255, 255, 255));
        return_cars.setText("RETURN CARS");
        return_cars.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        return_cars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_carsActionPerformed(evt);
            }
        });

        manage_cars.setBackground(new java.awt.Color(0, 102, 102));
        manage_cars.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        manage_cars.setForeground(new java.awt.Color(255, 255, 255));
        manage_cars.setText("MANAGE CARS");
        manage_cars.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        manage_cars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manage_carsActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\toshiba\\OneDrive\\Documents\\NetBeansProjects\\Car_Showroom\\src\\Icon\\6.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LogoutBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manage_cars, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(manage_customers, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(cars_renatl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(return_cars, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manage_cars, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(manage_customers, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(cars_renatl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(return_cars, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(LogoutBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Welcome Back");

        user.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        user.setForeground(new java.awt.Color(0, 102, 102));
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user.setText("*************");
        user.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        user.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\toshiba\\OneDrive\\Documents\\NetBeansProjects\\Car_Showroom\\src\\Icon\\Modern Minimalist Car Illustration Logo (4).png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(388, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtn1ActionPerformed
        LoginAndSignup LoginAndSignupframe = new LoginAndSignup();
        LoginAndSignupframe.setVisible(true);
        LoginAndSignupframe.pack();
        LoginAndSignupframe.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_LogoutBtn1ActionPerformed

    private void manage_customersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manage_customersActionPerformed
       CustomerGUI cg = new CustomerGUI();
       cg.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_manage_customersActionPerformed

    private void cars_renatlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cars_renatlActionPerformed
       RentalGUI rg = new RentalGUI();
       rg.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_cars_renatlActionPerformed

    private void return_carsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_carsActionPerformed
       ReturnGUI rg = new ReturnGUI();
       rg.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_return_carsActionPerformed

    private void manage_carsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manage_carsActionPerformed
         ManageCars mc = new ManageCars();
         mc.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_manage_carsActionPerformed
    
    public void setUser(String name){
        user.setText(name);
    }
   
    public static void main(String args[]) {
  
        
        JFrame Home = new JFrame();
        HomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogoutBtn1;
    private javax.swing.JButton cars_renatl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton manage_cars;
    private javax.swing.JButton manage_customers;
    private javax.swing.JButton return_cars;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}

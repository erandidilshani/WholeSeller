
package view;

import controller.CustomerFormController;
import controller.ItemFormController;
import controller.OrderController;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modal.Customer;
import modal.Item;


public class PlaceOrderForm extends javax.swing.JFrame {

    
    public PlaceOrderForm() {
        initComponents();
        initializeCustomDetails();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblOrderId = new javax.swing.JLabel();
        txtOrderId = new javax.swing.JTextField();
        lblTime = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cmbCustomerId = new javax.swing.JComboBox<>();
        cmbItemCode = new javax.swing.JComboBox<>();
        lblName = new javax.swing.JLabel();
        lblSalary = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblDesc = new javax.swing.JLabel();
        lblQtyOnHand = new javax.swing.JLabel();
        lblUnitPrice = new javax.swing.JLabel();
        lblQty = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        txtQtyOnHand = new javax.swing.JTextField();
        txtUnitPrice = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        btnPlaceOrder = new javax.swing.JButton();
        BtnRemoveFromCart = new javax.swing.JButton();
        btnAddToCart = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1);
        jPanel1.setBounds(710, 113, 0, 0);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(46, 204, 113));
        jLabel1.setText("Place Order Form");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(238, 10, 220, 29);

        lblOrderId.setForeground(new java.awt.Color(22, 160, 133));
        lblOrderId.setText("Order ID");
        getContentPane().add(lblOrderId);
        lblOrderId.setBounds(12, 52, 49, 16);

        txtOrderId.setEditable(false);
        getContentPane().add(txtOrderId);
        txtOrderId.setBounds(92, 49, 116, 22);

        lblTime.setForeground(new java.awt.Color(22, 160, 133));
        lblTime.setText("Time");
        getContentPane().add(lblTime);
        lblTime.setBounds(360, 50, 29, 16);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        cmbCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCustomerIdActionPerformed(evt);
            }
        });

        cmbItemCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbItemCodeActionPerformed(evt);
            }
        });

        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name");

        lblSalary.setForeground(new java.awt.Color(255, 255, 255));
        lblSalary.setText("salary");

        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("Address");

        lblDesc.setForeground(new java.awt.Color(255, 255, 255));
        lblDesc.setText("Description");

        lblQtyOnHand.setForeground(new java.awt.Color(255, 255, 255));
        lblQtyOnHand.setText("Qty On Hand");

        lblUnitPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblUnitPrice.setText("Unit Price");

        lblQty.setForeground(new java.awt.Color(255, 255, 255));
        lblQty.setText("QTY");

        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Description", "Unit Price", "QTY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl);

        btnPlaceOrder.setText("place Order");

        BtnRemoveFromCart.setBackground(new java.awt.Color(255, 255, 255));
        BtnRemoveFromCart.setText("Remove From Cart");
        BtnRemoveFromCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRemoveFromCartActionPerformed(evt);
            }
        });

        btnAddToCart.setBackground(new java.awt.Color(255, 255, 255));
        btnAddToCart.setText("Add to Cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        lblTotal.setText("Total 0 LKR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(lblName)
                        .addGap(271, 271, 271)
                        .addComponent(lblAddress)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbItemCode, 0, 96, Short.MAX_VALUE)
                            .addComponent(cmbCustomerId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(82, 82, 82)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblSalary)
                                            .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 364, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDesc))
                                .addGap(69, 69, 69)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQtyOnHand, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblQtyOnHand))
                                .addGap(73, 73, 73)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblQty)
                                            .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap())
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(btnAddToCart)
                                                .addGap(18, 18, 18)
                                                .addComponent(BtnRemoveFromCart)
                                                .addGap(22, 22, 22))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(btnPlaceOrder)
                                                .addGap(31, 31, 31)))
                                        .addComponent(lblUnitPrice)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(lblSalary)
                    .addComponent(lblAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblQty)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUnitPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblQtyOnHand)
                                .addComponent(lblDesc)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQtyOnHand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnRemoveFromCart)
                            .addComponent(btnAddToCart))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPlaceOrder))
                    .addComponent(lblTotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 70, 740, 660);

        lblDate.setForeground(new java.awt.Color(22, 160, 133));
        lblDate.setText("Date");
        getContentPane().add(lblDate);
        lblDate.setBounds(560, 50, 26, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        new DashBoard().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        
       addToCart(); 
    }//GEN-LAST:event_txtQtyActionPerformed

    private void cmbCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCustomerIdActionPerformed
        try {
            // TODO add your handling code here:
            
            
            
            Customer customer = new CustomerFormController().getCustomer(cmbCustomerId.getSelectedItem().toString());
        
            if(customer != null){
                
               
                txtName.setText(customer.getName());
                txtAddress.setText(customer.getAddress());
                txtSalary.setText(String.valueOf(customer.getSalary()));
            }
            else{
                JOptionPane.showMessageDialog(this,"we don't have any result");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
       
    }//GEN-LAST:event_cmbCustomerIdActionPerformed

    private void cmbItemCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbItemCodeActionPerformed
        try {
            // TODO add your handling code here:
            
            Item  item = new ItemFormController().getItemCodes(cmbItemCode.getSelectedItem().toString());
            
            if(item!=null){
                txtDesc.setText(item.getDescription());
                txtQtyOnHand.setText(String.valueOf(item.getQtyOnHand()));
                txtUnitPrice.setText(String.valueOf(item.getUnitPrice()));
            } else {
                JOptionPane.showMessageDialog(this, "Oops....... Empty Result");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_cmbItemCodeActionPerformed

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        
        
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void BtnRemoveFromCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRemoveFromCartActionPerformed
        
        int rowIndex=tbl.getSelectedRow();
        
        if(rowIndex==-1){
            return;
        }
        tbl.remove(rowIndex);
    }//GEN-LAST:event_BtnRemoveFromCartActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRemoveFromCart;
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JComboBox<String> cmbCustomerId;
    private javax.swing.JComboBox<String> cmbItemCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOrderId;
    private javax.swing.JLabel lblQty;
    private javax.swing.JLabel lblQtyOnHand;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblUnitPrice;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOrderId;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtQtyOnHand;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables

    private void initializeCustomDetails() {

        try {
            
            //load OrderId-----------------
            
            String orderId=new OrderController().getOrderId();
            txtOrderId.setText(orderId);
            
            //load OrderId-----------------
            
            
            
            
            // load Date-------------------------

            Date date = new Date();
            SimpleDateFormat formatPattern = new SimpleDateFormat("YYYY-MM-dd");
            String today = formatPattern.format(date);
            lblDate.setText(today);

            // load Date-------------------------
            // loadTime------------------------
//            start();
            // loadTime------------------------

            // load Customer Ids------------------
            List<String> idList = new CustomerFormController().getAllCustomerIds();

            for (String id : idList) {
                cmbCustomerId.addItem(id);
            }

            // load Customer Ids------------------
            // load Item Ids-----------------------
            List<String> codeList = new ItemFormController().getItemCodes();

            for (String id : codeList) {
                cmbItemCode.addItem(id);
            }

            // load Item Ids-----------------------
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    Calendar calander;
    int currentSeccond = 0;

    public void reset() {
        calander = Calendar.getInstance();
        currentSeccond = calander.get(Calendar.SECOND);
    }

//    public void start() {
//
//        SimpleDateFormat formatPattern = new SimpleDateFormat("HH:mm:ss");
//
//        reset();
//        ScheduledExecutorService worker = Executors.newScheduledThreadPool(3);
//        worker.scheduleAtFixedRate(new Runnable() {
//            @Override
//            public void run() {
//                if (currentSeccond == 60) {
//                    reset();
//                }
//                lblTime.setText(String.format("%s:%02d", formatPattern.format(calander.getTime()), currentSeccond));
//                currentSeccond++;
//            }
//        }, 0, 1000, TimeUnit.MILLISECONDS);
//    }

    private void addToCart() {

        DefaultTableModel modal = (DefaultTableModel) tbl.getModel();
        int qty = Integer.parseInt(txtQty.getText());
        double unitPrice = Double.parseDouble(txtUnitPrice.getText());
        double total = qty * unitPrice;

        if (qty > Integer.parseInt(txtQtyOnHand.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid QTY");
            return;
        }

        int rowIndex = isAlreadyExists(cmbItemCode.getSelectedItem().toString());

        if (rowIndex == -1) {

            Object[] rowdata = {
                cmbItemCode.getSelectedItem().toString(),
                txtDesc.getText(),
                unitPrice,
                qty,
                total
            };
            modal.addRow(rowdata);

        } else {

            qty += (int) modal.getValueAt(rowIndex, 3);
            total = qty * unitPrice;

            if (qty > Integer.parseInt(txtQtyOnHand.getText())) {
                JOptionPane.showMessageDialog(this, "Invalid QTY");
                return;
            }
            
            tbl.setValueAt(qty,rowIndex, 3);
            tbl.setValueAt(total,rowIndex, 4);
            
            

        }
        
        txtQty.setText("");
        txtQty.requestFocus();
        
        calculateTotal();

    }

    private int isAlreadyExists(String code) {
        DefaultTableModel modal = (DefaultTableModel) tbl.getModel();

        for (int i = 0; i < modal.getRowCount(); i++) {
            String tempCode = modal.getValueAt(i, 0).toString();
            if (code.equals(tempCode)) {
                return i;
            }
        }

        return -1;

    }

    private void calculateTotal() {
       double total=0;
       
       DefaultTableModel modal= (DefaultTableModel) tbl.getModel();
       
       for(int x=0;x<modal.getRowCount();x++){
           double tempTtl=(double)modal.getValueAt(x, 4);
           total+=tempTtl;
       }
       
       lblTotal.setText("Total "+total+" LKR");
       
       
    }

}
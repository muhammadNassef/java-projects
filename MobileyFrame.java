package mobiley;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MobileyFrame extends javax.swing.JFrame {

    private String productNameVar;
    private double productMainPriceVar;
    private double productSoldPriceVar;
    private double productsPricesVar;

    // Arraylists for quick report to store daily sold products... 
    private ArrayList<String> productNames = new ArrayList<>();
    private ArrayList<Double> productMainPrices = new ArrayList<>();
    private ArrayList<Double> productSoldPrices = new ArrayList<>();

    private ConnectDataBase connectDataBase = new ConnectDataBase();

    public MobileyFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        productMainPrice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        productName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        productSoldPrice = new javax.swing.JTextField();
        soldButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        productsPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        finalReport = new javax.swing.JButton();
        refreshDataBase = new javax.swing.JButton();
        generalReport2 = new javax.swing.JButton();
        dropInfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mobiley");
        setBackground(new java.awt.Color(153, 153, 153));
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("أسم المنتج ");

        productMainPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        productMainPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        productMainPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productMainPriceActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("السعر الأصلي ");

        productName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        productName.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        productName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 153, 153));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("السعر المباع");

        productSoldPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        productSoldPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        productSoldPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productSoldPriceActionPerformed(evt);
            }
        });

        soldButton.setBackground(new java.awt.Color(153, 255, 153));
        soldButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        soldButton.setForeground(new java.awt.Color(102, 102, 255));
        soldButton.setText("تم");
        soldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soldButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 51, 102));
        cancelButton.setText("الغاء");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        productsPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        productsPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        productsPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsPriceActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("سعر المشتريات");

        finalReport.setBackground(new java.awt.Color(255, 255, 153));
        finalReport.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        finalReport.setText("تقرير");
        finalReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalReportActionPerformed(evt);
            }
        });

        refreshDataBase.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        refreshDataBase.setText("تحديث");
        refreshDataBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshDataBaseActionPerformed(evt);
            }
        });

        generalReport2.setBackground(new java.awt.Color(255, 255, 153));
        generalReport2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        generalReport2.setText("تقرير عام");
        generalReport2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generalReport2ActionPerformed(evt);
            }
        });

        dropInfo.setBackground(new java.awt.Color(204, 204, 204));
        dropInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dropInfo.setForeground(new java.awt.Color(255, 0, 0));
        dropInfo.setText("حذف البيانات");
        dropInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(productsPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(dropInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(soldButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(productMainPrice, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productSoldPrice, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(refreshDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(295, 295, 295)
                    .addComponent(finalReport, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(389, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(generalReport2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(642, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(productsPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productMainPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(refreshDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productSoldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soldButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(dropInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(425, Short.MAX_VALUE)
                    .addComponent(finalReport, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(202, 202, 202)
                    .addComponent(generalReport2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(241, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productMainPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productMainPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productMainPriceActionPerformed

    private void productSoldPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productSoldPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productSoldPriceActionPerformed

    private void productNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameActionPerformed

    private void productsPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productsPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productsPriceActionPerformed

    private void soldButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soldButtonActionPerformed
        this.getInformationsFromTxtFields();
        this.storeInformationsIntoArrLists();
        connectDataBase.insertIntoProductsTable(productNameVar, productMainPriceVar, productSoldPriceVar);
        this.clearStoredInformationsInTxtField();
    }//GEN-LAST:event_soldButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.clearStoredInformationsInTxtField();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void finalReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalReportActionPerformed
        this.finalReportOfTheDay();
    }//GEN-LAST:event_finalReportActionPerformed

    private void refreshDataBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshDataBaseActionPerformed
        this.getInfoFromPurchases();
        connectDataBase.insertIntoPurchasesTable(productsPricesVar);
        this.clearInfoFromPurchases();
    }//GEN-LAST:event_refreshDataBaseActionPerformed

    private void generalReport2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generalReport2ActionPerformed
        JOptionPane.showMessageDialog(this, connectDataBase.generalReport());
    }//GEN-LAST:event_generalReport2ActionPerformed

    private void dropInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropInfoActionPerformed
        connectDataBase.dropAllInfo();
    }//GEN-LAST:event_dropInfoActionPerformed

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
            java.util.logging.Logger.getLogger(MobileyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MobileyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MobileyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MobileyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MobileyFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton dropInfo;
    private javax.swing.JButton finalReport;
    private javax.swing.JButton generalReport2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField productMainPrice;
    private javax.swing.JTextField productName;
    private javax.swing.JTextField productSoldPrice;
    private javax.swing.JTextField productsPrice;
    private javax.swing.JButton refreshDataBase;
    private javax.swing.JButton soldButton;
    // End of variables declaration//GEN-END:variables

    private void getInformationsFromTxtFields() {
        try {
            this.productNameVar = this.productName.getText();
            this.productMainPriceVar = Double.parseDouble(this.productMainPrice.getText());
            this.productSoldPriceVar = Double.parseDouble(this.productSoldPrice.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "خطأ في الادخال !!");
            this.productNameVar = "";
            this.productMainPriceVar = 0;
            this.productSoldPriceVar = 0;

        }
    }

    private void storeInformationsIntoArrLists() {
        this.productNames.add(this.productNameVar);
        this.productMainPrices.add(this.productMainPriceVar);
        this.productSoldPrices.add(this.productSoldPriceVar);
    }

    private void clearStoredInformationsInTxtField() {
        this.productName.setText("");
        this.productMainPrice.setText("");
        this.productSoldPrice.setText("");
    }

    private void finalReportOfTheDay() {
        double mainPrices = 0;
        double soldPrices = 0;
        for (double mprices : this.productMainPrices) {
            mainPrices += mprices;
        }
        for (double sprices : this.productSoldPrices) {
            soldPrices += sprices;
        }
        JOptionPane.showMessageDialog(this, "مجموع الاسعار الفعليه للمنتجات : " + mainPrices + "\n" + "مجموع الاسعار المباعه للمنتجات : " + soldPrices);
    }

    private void getInfoFromPurchases() {
        try {
            this.productsPricesVar = Double.parseDouble(this.productsPrice.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "خطأ في الادخال !!");
            this.productsPricesVar = 0;
        }
    }

    private void clearInfoFromPurchases() {
        this.productsPrice.setText("");
    }
}

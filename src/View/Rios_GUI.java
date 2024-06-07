/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
/**
 *
 * @author netoh
 */
    import Controller.Database;
    import Controller.Rivers;
    import java.util.ArrayList;
    



public class Rios_GUI extends javax.swing.JFrame {
    
    public static ArrayList<Rivers> rivers = new ArrayList<>();

   

    /**
     * Creates new form Rios_GUI
     */


            
    public Rios_GUI() {
        rivers = new Database().rivers;
        initComponents();
        loading();
    }
    
    public static void loading(){
        
        nomerio1_txt.setText(rivers.get(0).name);
        nomerio2_txt.setText(rivers.get(1).name);
        nomerio3_txt.setText(rivers.get(2).name);
        nomerio4_txt.setText(rivers.get(3).name);
        nomerio5_txt.setText(rivers.get(4).name);
        
        phrio1_txt.setText(String.valueOf(rivers.get(0).pH));
        phrio2_txt.setText(String.valueOf(rivers.get(1).pH));
        phrio3_txt.setText(String.valueOf(rivers.get(2).pH));
        phrio4_txt.setText(String.valueOf(rivers.get(3).pH));
        phrio5_txt.setText(String.valueOf(rivers.get(4).pH));
        
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
        jLabel1 = new javax.swing.JLabel();
        nomerio3_txt = new javax.swing.JLabel();
        nomerio2_txt = new javax.swing.JLabel();
        nomerio4_txt = new javax.swing.JLabel();
        nomerio5_txt = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();
        jProgressBar4 = new javax.swing.JProgressBar();
        jProgressBar5 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        phrio1_txt = new javax.swing.JLabel();
        phrio3_txt = new javax.swing.JLabel();
        phrio5_txt = new javax.swing.JLabel();
        phrio2_txt = new javax.swing.JLabel();
        phrio4_txt = new javax.swing.JLabel();
        nomerio1_txt = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        teste = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rios");

        nomerio3_txt.setBackground(new java.awt.Color(255, 255, 51));
        nomerio3_txt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nomerio3_txt.setForeground(new java.awt.Color(255, 255, 0));
        nomerio3_txt.setText("null");

        nomerio2_txt.setBackground(new java.awt.Color(255, 255, 51));
        nomerio2_txt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nomerio2_txt.setForeground(new java.awt.Color(255, 255, 0));
        nomerio2_txt.setText("null");

        nomerio4_txt.setBackground(new java.awt.Color(255, 255, 51));
        nomerio4_txt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nomerio4_txt.setForeground(new java.awt.Color(255, 255, 0));
        nomerio4_txt.setText("null");

        nomerio5_txt.setBackground(new java.awt.Color(255, 255, 51));
        nomerio5_txt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nomerio5_txt.setForeground(new java.awt.Color(255, 255, 0));
        nomerio5_txt.setText("null");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 255));
        jLabel3.setText("Nome");

        jProgressBar1.setToolTipText("");

        jProgressBar2.setValue(50);

        jProgressBar3.setValue(50);

        jProgressBar4.setValue(50);

        jProgressBar5.setValue(50);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 255, 255));
        jLabel4.setText("PH");

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        phrio1_txt.setBackground(new java.awt.Color(255, 255, 51));
        phrio1_txt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        phrio1_txt.setForeground(new java.awt.Color(255, 255, 0));
        phrio1_txt.setText("null");
        phrio1_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phrio1_txtMouseClicked(evt);
            }
        });

        phrio3_txt.setBackground(new java.awt.Color(255, 255, 51));
        phrio3_txt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        phrio3_txt.setForeground(new java.awt.Color(255, 255, 0));
        phrio3_txt.setText("null");
        phrio3_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phrio3_txtMouseClicked(evt);
            }
        });

        phrio5_txt.setBackground(new java.awt.Color(255, 255, 51));
        phrio5_txt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        phrio5_txt.setForeground(new java.awt.Color(255, 255, 0));
        phrio5_txt.setText("null");
        phrio5_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phrio5_txtMouseClicked(evt);
            }
        });

        phrio2_txt.setBackground(new java.awt.Color(255, 255, 51));
        phrio2_txt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        phrio2_txt.setForeground(new java.awt.Color(255, 255, 0));
        phrio2_txt.setText("null");
        phrio2_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phrio2_txtMouseClicked(evt);
            }
        });

        phrio4_txt.setBackground(new java.awt.Color(255, 255, 51));
        phrio4_txt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        phrio4_txt.setForeground(new java.awt.Color(255, 255, 0));
        phrio4_txt.setText("null");
        phrio4_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phrio4_txtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phrio4_txt)
                    .addComponent(phrio2_txt)
                    .addComponent(phrio5_txt)
                    .addComponent(phrio3_txt)
                    .addComponent(phrio1_txt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(phrio1_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phrio2_txt)
                .addGap(8, 8, 8)
                .addComponent(phrio3_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phrio4_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(phrio5_txt))
        );

        nomerio1_txt.setBackground(new java.awt.Color(255, 255, 51));
        nomerio1_txt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nomerio1_txt.setForeground(new java.awt.Color(255, 255, 0));
        nomerio1_txt.setText("null");
        nomerio1_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nomerio1_txtMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 255, 255));
        jLabel5.setText("Profundidade");

        teste.setText("teste");
        teste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(teste)
                .addGap(150, 150, 150))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nomerio2_txt)
                                            .addComponent(nomerio1_txt))
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nomerio3_txt)
                                            .addComponent(nomerio4_txt)
                                            .addComponent(nomerio5_txt))
                                        .addGap(7, 7, 7)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jProgressBar4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(jProgressBar3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(jProgressBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(11, 11, 11)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(108, 108, 108)
                                        .addComponent(jLabel5)))
                                .addGap(45, 45, 45)
                                .addComponent(jLabel4)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomerio1_txt))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomerio2_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jProgressBar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomerio3_txt))
                            .addComponent(jProgressBar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomerio4_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jProgressBar4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomerio5_txt))
                            .addComponent(jProgressBar5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(teste)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void phrio1_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phrio1_txtMouseClicked
            Database.Rivers();    
            Object madeiraPH = null;
            phrio1_txt.setText(String.valueOf(madeiraPH));
    }//GEN-LAST:event_phrio1_txtMouseClicked

    private void nomerio1_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomerio1_txtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nomerio1_txtMouseClicked

    private void phrio3_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phrio3_txtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_phrio3_txtMouseClicked

    private void phrio5_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phrio5_txtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_phrio5_txtMouseClicked

    private void phrio2_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phrio2_txtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_phrio2_txtMouseClicked

    private void testeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testeActionPerformed
        
    }//GEN-LAST:event_testeActionPerformed

    private void phrio4_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phrio4_txtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_phrio4_txtMouseClicked

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
            java.util.logging.Logger.getLogger(Rios_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rios_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rios_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rios_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rios_GUI().setVisible(true);
            }
        });
    }

    public void recebendo(String recebe){
        phrio1_txt.setText(recebe);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JProgressBar jProgressBar5;
    public static javax.swing.JLabel nomerio1_txt;
    public static javax.swing.JLabel nomerio2_txt;
    public static javax.swing.JLabel nomerio3_txt;
    public static javax.swing.JLabel nomerio4_txt;
    public static javax.swing.JLabel nomerio5_txt;
    public static javax.swing.JLabel phrio1_txt;
    public static javax.swing.JLabel phrio2_txt;
    public static javax.swing.JLabel phrio3_txt;
    public static javax.swing.JLabel phrio4_txt;
    public static javax.swing.JLabel phrio5_txt;
    private javax.swing.JButton teste;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */
public class app_dias extends javax.swing.JApplet {

    /**
     * Initializes the applet app_dias
     */
    @Override
    public void init() {
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
            java.util.logging.Logger.getLogger(app_dias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(app_dias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(app_dias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(app_dias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the applet */
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputTime = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        buttonMain = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        outputMain = new javax.swing.JLabel();
        outputHours = new javax.swing.JLabel();
        outputMinutes = new javax.swing.JLabel();
        outputSeconds = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("HORAS - MINUTOS y SEGUNDOS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese la cantidad de días");

        inputTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputTime.setModel(new javax.swing.SpinnerNumberModel(0, 0, 365, 1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Horas:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Minutos:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Segundos:");

        buttonMain.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonMain.setText("Calcular");
        buttonMain.setBorder(new javax.swing.border.SoftBevelBorder(0));
        buttonMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMainMouseClicked(evt);
            }
        });
        buttonMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMainActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Resultado:");

        outputMain.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        outputMain.setBorder(new javax.swing.border.SoftBevelBorder(0));

        outputHours.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        outputHours.setText("...");

        outputMinutes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        outputMinutes.setText("...");

        outputSeconds.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        outputSeconds.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inputTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(outputMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(144, 144, 144)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(outputHours)
                                    .addComponent(buttonMain, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(outputMinutes)
                                    .addComponent(outputSeconds)))
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonMain, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputHours)
                    .addComponent(jLabel3))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(outputMinutes))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(outputSeconds))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(outputMain, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMainActionPerformed

    private void buttonMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMainMouseClicked
        
        //inputs
        int int_dias = (int) inputTime.getValue();
        
        //constantes
        int SEGUNDOSPORMINUTO = 60;
        int MINUTOSPORHORA = 60;
        int HORAPORDIA = 24;
        
        //horas
        int int_horasTotal = HORAPORDIA * int_dias;
        String str_horasTotal = Integer.toString(int_horasTotal);
        outputHours.setText(str_horasTotal);
        
        //minutos
        int int_minutosTotal = HORAPORDIA * MINUTOSPORHORA * int_dias;
        String str_minutosTotal = Integer.toString(int_minutosTotal);
        outputMinutes.setText(str_minutosTotal);
        
        //Segundos
        int int_segundosTotal = HORAPORDIA * MINUTOSPORHORA * SEGUNDOSPORMINUTO * int_dias;
        String str_segundosTotal = Integer.toString(int_segundosTotal);
        outputSeconds.setText(str_segundosTotal);
        
        //Mesaje resultado
        String str_resultado = int_dias + " días tienen: " + int_horasTotal + " horas - " + int_minutosTotal + " minuntos - " + int_segundosTotal + " segundos";
        outputMain.setText(str_resultado);
    }//GEN-LAST:event_buttonMainMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonMain;
    private javax.swing.JSpinner inputTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel outputHours;
    private javax.swing.JLabel outputMain;
    private javax.swing.JLabel outputMinutes;
    private javax.swing.JLabel outputSeconds;
    // End of variables declaration//GEN-END:variables
}

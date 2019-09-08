/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JIBIN JOSE
 */
public class Start extends javax.swing.JFrame {

    /**
     * Creates new form Start
     */
    public Start() {
        initComponents();
        setSize(592, 309);
        setTitle("Payment Billing System- P B S");
        setLocation(200, 200);
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
        ssg = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        p = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        s = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setLayout(null);

        ssg.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        ssg.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(ssg);
        ssg.setBounds(135, 215, 340, 22);
        jPanel1.add(jProgressBar1);
        jProgressBar1.setBounds(25, 203, 540, 6);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Splash.PNG"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 90, 440, 56);

        p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pbsl1.png"))); // NOI18N
        jPanel1.add(p);
        p.setBounds(70, 10, 51, 49);

        b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pbsl2.png"))); // NOI18N
        jPanel1.add(b);
        b.setBounds(250, 10, 51, 49);

        s.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pbsl3.png"))); // NOI18N
        jPanel1.add(s);
        s.setBounds(460, 10, 51, 49);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Splashhomescreen.PNG"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(3, 1, 590, 310);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
         new Thread()
        {
            public void run()
            {
                for(int i=0;i<101;i++)
                {
                    jProgressBar1.setValue(i);
                    switch(i)
                    {
                        case 0:ssg.setText("Initializing System");
                            break;
                        case 10:ssg.setText("Reading Modules.");
                            break;
                        case 30:ssg.setText("Reading Modules..");
                            break;    
                        case 50:ssg.setText("Reading Modules...");
                            break;
                        case 80: for(int j=0;j<10;j++)
                        {
                     switch(j)
                       {
                        case 0:ssg.setText("Checking System Requirements");
                            break;
                        case 1:ssg.setText("Turning on Modules");
                            break;
                        case 2:ssg.setText("Starting Payment Billing System.");
                              p.setVisible(true);  
                            break;
                        case 3:ssg.setText("Starting Payment Billing System...");
                              b.setVisible(true);
                            break;    
                        case 4:ssg.setText("Starting Payment Billing System....");
                              s.setVisible(true);
                            break;
                        case 5:ssg.setText("Starting Payment Billing System.....");
                            break;    
                        }
                        try {
                            sleep(300);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            
                        }     
                        case 99:ssg.setText("Done!");
                            break;
                    }
                    try {
                        sleep(88);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
               BillPayHome bph=new BillPayHome();
               bph.setVisible(true);
                   setVisible(false);
            }
        }.start();          
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        p.setVisible(false);
        b.setVisible(false);
        s.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel p;
    private javax.swing.JLabel s;
    private javax.swing.JLabel ssg;
    // End of variables declaration//GEN-END:variables
}

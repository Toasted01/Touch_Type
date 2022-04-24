/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package touch_type;

/**
 *
 * @author Tom
 */
public class Typing extends javax.swing.JFrame {

    /**
     * Creates new form Typing
     */
    public Typing() {
        initComponents();
    }

    /**
     * My Variables
     */
    public int mode = 0;
    private int colour = 0;
    private int magnify = 0;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TypingHome = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        TextOutput = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TextInput = new javax.swing.JTextField();
        ColourBlind = new javax.swing.JToggleButton();
        Magniy = new javax.swing.JToggleButton();
        SaveStats = new javax.swing.JButton();
        Clock = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TypingHome.setText("Home");
        getContentPane().add(TypingHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextOutput.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        TextOutput.setText(" ");
        jPanel1.add(TextOutput, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 16, 970, 150));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 990, 180));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(TextInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 970, 160));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 990, 180));

        ColourBlind.setText("Colour Blind");
        ColourBlind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColourBlindActionPerformed(evt);
            }
        });
        getContentPane().add(ColourBlind, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, -1, -1));

        Magniy.setText("Magnify");
        Magniy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MagniyActionPerformed(evt);
            }
        });
        getContentPane().add(Magniy, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 550, -1, -1));

        SaveStats.setText("Save");
        SaveStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveStatsActionPerformed(evt);
            }
        });
        getContentPane().add(SaveStats, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 550, -1, -1));

        Clock.setFont(new java.awt.Font("sansserif", 0, 48)); // NOI18N
        Clock.setText("00:00");
        getContentPane().add(Clock, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ColourBlindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColourBlindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColourBlindActionPerformed

    private void SaveStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveStatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveStatsActionPerformed

    private void MagniyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MagniyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MagniyActionPerformed

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
            java.util.logging.Logger.getLogger(Typing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Typing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Typing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Typing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Typing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Clock;
    private javax.swing.JToggleButton ColourBlind;
    private javax.swing.JToggleButton Magniy;
    private javax.swing.JButton SaveStats;
    private javax.swing.JTextField TextInput;
    private javax.swing.JLabel TextOutput;
    private javax.swing.JButton TypingHome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    /**
     * used to set the mode when button is clicked on menu and this frame is
     * opened.
     * @param modeInput 
     */
    public void setMode(int modeInput)
    {
        mode = modeInput;
    }
    
    
}

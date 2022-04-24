/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package touch_type;

/**
 *
 * @author Tom
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        Exit = new javax.swing.JButton();
        WordsBTN = new javax.swing.JButton();
        ParagrahsBTN = new javax.swing.JButton();
        LettersBTN = new javax.swing.JButton();
        TutorialBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 0, 51));
        Exit.setText("X");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        WordsBTN.setText("Words");
        WordsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WordsBTNActionPerformed(evt);
            }
        });
        getContentPane().add(WordsBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 90, -1));

        ParagrahsBTN.setText("Paragrahs");
        ParagrahsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParagrahsBTNActionPerformed(evt);
            }
        });
        getContentPane().add(ParagrahsBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 90, -1));

        LettersBTN.setText("Letters");
        LettersBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LettersBTNActionPerformed(evt);
            }
        });
        getContentPane().add(LettersBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 90, -1));

        TutorialBTN.setText("Tutorial");
        TutorialBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TutorialBTNMouseClicked(evt);
            }
        });
        TutorialBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TutorialBTNActionPerformed(evt);
            }
        });
        getContentPane().add(TutorialBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 90, -1));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 48)); // NOI18N
        jLabel1.setText("Touch type training");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LettersBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LettersBTNActionPerformed
        Typing typing = new Typing();
        typing.setVisible(true);
        typing.setMode(1);
        this.setVisible(false);
    }//GEN-LAST:event_LettersBTNActionPerformed

    private void WordsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WordsBTNActionPerformed
        Typing typing = new Typing();
        typing.setVisible(true);
        typing.setMode(2);
        this.setVisible(false);
    }//GEN-LAST:event_WordsBTNActionPerformed

    private void TutorialBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TutorialBTNActionPerformed
        Tutorial tutorial = new Tutorial();
        tutorial.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_TutorialBTNActionPerformed

    private void TutorialBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TutorialBTNMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TutorialBTNMouseClicked

    private void ParagrahsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParagrahsBTNActionPerformed
        Typing typing = new Typing();
        typing.setVisible(true);
        typing.setMode(3);
        this.setVisible(false);
    }//GEN-LAST:event_ParagrahsBTNActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton LettersBTN;
    private javax.swing.JButton ParagrahsBTN;
    private javax.swing.JButton TutorialBTN;
    private javax.swing.JButton WordsBTN;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

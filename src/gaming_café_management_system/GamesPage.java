package gaming_café_management_system;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GamesPage extends javax.swing.JFrame {

    public GamesPage() {
        initComponents();
    }

    private void showHelpDialog() {
        // HTML content for the help dialog with bold IDs
        String message = "<html>"
                + "<p>Hilal (<b>001</b>)</p>"
                + "<p>Raza (<b>019</b>)</p>"
                + "<p>Qasim (<b>033</b>)</p>"
                + "</html>";

        // Load the help icon image from the specified file path
        ImageIcon icon = new ImageIcon("src/images/help-60.png");

        // Show the message dialog with the formatted HTML and icon
        JOptionPane.showMessageDialog(this, message, "Help", JOptionPane.INFORMATION_MESSAGE, icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonLogout = new javax.swing.JButton();
        buttonHelp = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        buttonHome = new javax.swing.JButton();
        FORTNITE = new javax.swing.JButton();
        CS2 = new javax.swing.JButton();
        APEX = new javax.swing.JButton();
        R6S = new javax.swing.JButton();
        ROCKETLEAGUE = new javax.swing.JButton();
        MINECRAFT = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonLogout.setBackground(new java.awt.Color(254, 254, 254));
        buttonLogout.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        buttonLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-back-35.png"))); // NOI18N
        buttonLogout.setText("Logout ");
        buttonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(buttonLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(852, 12, 120, 50));

        buttonHelp.setBackground(new java.awt.Color(207, 255, 246));
        buttonHelp.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        buttonHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help-60.png"))); // NOI18N
        buttonHelp.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Help", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        buttonHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHelpActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, -1));

        buttonExit.setBackground(new java.awt.Color(174, 231, 248));
        buttonExit.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        buttonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit-60.png"))); // NOI18N
        buttonExit.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Exit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });
        getContentPane().add(buttonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 200, -1));

        buttonHome.setBackground(new java.awt.Color(254, 254, 254));
        buttonHome.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-outline.png"))); // NOI18N
        buttonHome.setText("Home");
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 12, 110, 50));

        FORTNITE.setBackground(new java.awt.Color(254, 254, 254));
        FORTNITE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FORTNITE.png"))); // NOI18N
        getContentPane().add(FORTNITE, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 100, -1, -1));

        CS2.setBackground(new java.awt.Color(254, 254, 254));
        CS2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CSGO.png"))); // NOI18N
        getContentPane().add(CS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        APEX.setBackground(new java.awt.Color(254, 254, 254));
        APEX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/APEX.png"))); // NOI18N
        getContentPane().add(APEX, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, -1, -1));

        R6S.setBackground(new java.awt.Color(254, 254, 254));
        R6S.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/R6S.png"))); // NOI18N
        getContentPane().add(R6S, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 370, -1, -1));

        ROCKETLEAGUE.setBackground(new java.awt.Color(254, 254, 254));
        ROCKETLEAGUE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ROCKETLEAGUE.png"))); // NOI18N
        getContentPane().add(ROCKETLEAGUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, -1, -1));

        MINECRAFT.setBackground(new java.awt.Color(254, 254, 254));
        MINECRAFT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MINECRAFT.png"))); // NOI18N
        getContentPane().add(MINECRAFT, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/games-bg.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHelpActionPerformed
        // TODO add your handling code here:
        showHelpDialog();
    }//GEN-LAST:event_buttonHelpActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Select", JOptionPane.YES_NO_OPTION);

        // If the user clicked "Yes" (a == 0), exit the application
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogoutActionPerformed
        // TODO add your handling code here:
        // Hide the current window (Home)
        this.setVisible(false);

        // Create a new instance of LoginAccountPage and show it
        new LoginAccountPage().setVisible(true);
    }//GEN-LAST:event_buttonLogoutActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        // TODO add your handling code here:
        // Create an instance of Home and make it visible
        Home homeFrame = new Home();
        homeFrame.setVisible(true);

        // Optional: Close the current frame if needed
        this.dispose();
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GamesPage().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton APEX;
    private javax.swing.JButton CS2;
    private javax.swing.JButton FORTNITE;
    private javax.swing.JButton MINECRAFT;
    private javax.swing.JButton R6S;
    private javax.swing.JButton ROCKETLEAGUE;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonHelp;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonLogout;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}

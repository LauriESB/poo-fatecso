/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ichla
 */
public class Aplic extends javax.swing.JFrame {

    /**
     * Creates new form Aplic
     */
    public Aplic() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRA = new javax.swing.JTextField();
        txtNomeAluno = new javax.swing.JTextField();
        txtP1 = new javax.swing.JTextField();
        txtP2 = new javax.swing.JTextField();
        txtMedia = new javax.swing.JTextField();
        txtSituacao = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("RA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(428, 93, 21, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Nome do aluno");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(47, 90, 109, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Nota P1");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(78, 214, 56, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Nota P2");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(409, 216, 56, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Média");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(210, 320, 41, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Situação");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(530, 310, 59, 20);
        getContentPane().add(txtRA);
        txtRA.setBounds(483, 93, 170, 20);
        getContentPane().add(txtNomeAluno);
        txtNomeAluno.setBounds(160, 92, 170, 20);
        getContentPane().add(txtP1);
        txtP1.setBounds(160, 216, 170, 20);
        getContentPane().add(txtP2);
        txtP2.setBounds(483, 216, 170, 20);
        getContentPane().add(txtMedia);
        txtMedia.setBounds(180, 360, 95, 42);
        getContentPane().add(txtSituacao);
        txtSituacao.setBounds(510, 350, 95, 42);

        btnCalcular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCalcular.setText("Calcular");
        getContentPane().add(btnCalcular);
        btnCalcular.setBounds(130, 470, 80, 25);

        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        getContentPane().add(btnLimpar);
        btnLimpar.setBounds(330, 470, 73, 23);

        btnSair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSair.setText("Sair");
        getContentPane().add(btnSair);
        btnSair.setBounds(500, 470, 73, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Aplic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtMedia;
    private javax.swing.JTextField txtNomeAluno;
    private javax.swing.JTextField txtP1;
    private javax.swing.JTextField txtP2;
    private javax.swing.JTextField txtRA;
    private javax.swing.JTextField txtSituacao;
    // End of variables declaration//GEN-END:variables
}
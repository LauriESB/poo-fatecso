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
     * Creates new form 
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("RA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Nome do aluno");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Nota P1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Nota P2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Média");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Situação");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, -1));
        getContentPane().add(txtRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 170, -1));
        getContentPane().add(txtNomeAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 170, -1));
        getContentPane().add(txtP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 170, -1));
        getContentPane().add(txtP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 170, -1));
        getContentPane().add(txtMedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 95, 42));
        getContentPane().add(txtSituacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 95, 42));

        btnCalcular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCalcular.setText("Calcular");
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 80, -1));

        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, 80, -1));

        btnSair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSair.setText("Sair");
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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

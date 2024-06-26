/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.control.DaoVendedor;
import fatec.poo.control.PreparaConexao;
import fatec.poo.model.Vendedor;
import javax.swing.JOptionPane;

/**
 *
 * @author ichla
 */
public class GuiVendedor extends javax.swing.JFrame {

    /**
     * Creates new form GuiVendedor
     */
    public GuiVendedor() {
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

        lblCPF = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblSalarioBase = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtSalarioBase = new javax.swing.JTextField();
        txtDDD = new javax.swing.JTextField();
        lblUF = new javax.swing.JLabel();
        lblCEP = new javax.swing.JLabel();
        txtCEP = new javax.swing.JTextField();
        lblComissao = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtTaxaComissao = new javax.swing.JTextField();
        cbxUF = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblCPF.setText("CPF");

        lblNome.setText("Nome");

        lblEndereco.setText("Endereco");

        lblTelefone.setText("Telefone");

        lblCidade.setText("Cidade");

        lblSalarioBase.setText("Salário base");

        txtNome.setEnabled(false);

        txtEndereco.setEnabled(false);

        txtCidade.setEnabled(false);

        txtTelefone.setEnabled(false);

        txtSalarioBase.setEnabled(false);

        txtDDD.setEnabled(false);

        lblUF.setText("UF");

        lblCEP.setText("CEP");

        txtCEP.setEnabled(false);

        lblComissao.setText("Taxa Comissão");

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        txtTaxaComissao.setEnabled(false);

        cbxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        cbxUF.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(68, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCPF)
                            .addComponent(lblEndereco)
                            .addComponent(lblCidade)
                            .addComponent(lblNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(lblUF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxUF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lblTelefone)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblSalarioBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDDD))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(txtSalarioBase, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(lblComissao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTaxaComissao, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(lblCEP)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnConsultar)
                                .addGap(11, 11, 11)
                                .addComponent(btnIncluir)
                                .addGap(9, 9, 9)
                                .addComponent(btnAlterar)
                                .addGap(5, 5, 5)
                                .addComponent(btnExcluir)
                                .addGap(7, 7, 7)
                                .addComponent(btnSair)))))
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade)
                    .addComponent(lblUF)
                    .addComponent(cbxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCEP)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComissao)
                    .addComponent(txtSalarioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSalarioBase)
                    .addComponent(txtTaxaComissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultar)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        prepCon = new PreparaConexao("","");
        prepCon.setDriver("oracle.jdbc.driver.OracleDriver");
        prepCon.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoVendedor = new DaoVendedor(prepCon.abrirConexao());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        prepCon.fecharConexao();
    }//GEN-LAST:event_formWindowClosed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        vendedor = null;
        vendedor = daoVendedor.consultar(txtCPF.getText());
       
       if (vendedor == null){//não encontrou o objeto na BD
           txtCPF.setEnabled(true);
           txtNome.setEnabled(true);
           txtEndereco.setEnabled(true);
           txtCidade.setEnabled(true);
           cbxUF.setEnabled(true);
           txtDDD.setEnabled(true);
           txtTelefone.setEnabled(true);
           txtCEP.setEnabled(true);
           txtSalarioBase.setEnabled(true);
           txtTaxaComissao.setEnabled(true);
           
           txtCPF.requestFocus();
                      
           btnConsultar.setEnabled(false);
           btnIncluir.setEnabled(true);
           btnAlterar.setEnabled(false);
           btnExcluir.setEnabled(false);
       }
       else{ //encontrou o objeto na BD
        
          txtNome.setText(vendedor.getNome());
          txtCPF.setText(vendedor.getCpf());
          txtEndereco.setText(vendedor.getEndereco());
          txtCidade.setText(vendedor.getCidade()); 
          cbxUF.setSelectedItem(vendedor.getUf());
          txtDDD.setText(vendedor.getDdd());
          txtTelefone.setText(vendedor.getTelefone());
          txtCEP.setText(vendedor.getCep());
          txtSalarioBase.setText(String.valueOf(vendedor.getSalarioBase()));
          txtTaxaComissao.setText(String.valueOf(vendedor.getTaxaComissao()));
          
           txtCPF.setEnabled(false);
           txtNome.setEnabled(false);
           txtEndereco.setEnabled(true);
           txtCidade.setEnabled(true);
           cbxUF.setEnabled(true);
           txtDDD.setEnabled(true);
           txtTelefone.setEnabled(true);
           txtCEP.setEnabled(true);
           txtSalarioBase.setEnabled(true);
           txtTaxaComissao.setEnabled(true);
                      
           btnConsultar.setEnabled(false);
           btnIncluir.setEnabled(false);
           btnAlterar.setEnabled(true);
           btnExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
       vendedor = new Vendedor(txtCPF.getText(), txtNome.getText(), Double.parseDouble(txtSalarioBase.getText()));
          
       
       vendedor.setEndereco(txtEndereco.getText());
       vendedor.setCidade(txtCidade.getText());
       vendedor.setUf(cbxUF.getSelectedItem().toString());
       vendedor.setDdd(txtDDD.getText());
       vendedor.setTelefone(txtTelefone.getText());
       vendedor.setCep(txtCEP.getText());
       vendedor.setSalarioBase(Double.parseDouble(txtSalarioBase.getText()));
       vendedor.setTaxaComissao(Double.parseDouble(txtTaxaComissao.getText()));
      
       daoVendedor.inserir(vendedor);
         
       //Incializando a GUI 
       txtCPF.setText(null);
       txtNome.setText(null); 
       txtEndereco.setText(null);
       txtCidade.setText(null);
       cbxUF.setSelectedItem(-1);
       txtDDD.setText(null);
       txtTelefone.setText(null);
       txtCEP.setText(null);
       txtSalarioBase.setText(null);
       txtTaxaComissao.setText(null);
       
       txtCPF.requestFocus();
       
       txtCPF.setEnabled(true);
       txtNome.setEnabled(false);
       txtEndereco.setEnabled(false);
       txtCidade.setEnabled(false);
       cbxUF.setEnabled(false);
       txtDDD.setEnabled(false);
       txtTelefone.setEnabled(false);
       txtCEP.setEnabled(false);
       txtSalarioBase.setEnabled(false);
       txtTaxaComissao.setEnabled(false);
       
       btnConsultar.setEnabled(true);
       btnIncluir.setEnabled(false);
       btnAlterar.setEnabled(false);
       btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão?") == 0){
                daoVendedor.excluir(vendedor);

                txtCPF.setText(null);
                txtNome.setText(null); 
                txtEndereco.setText(null);
                txtCidade.setText(null);
                cbxUF.setSelectedItem(-1);
                txtDDD.setText(null);
                txtTelefone.setText(null);
                txtCEP.setText(null);
                txtSalarioBase.setText(null);
                txtTaxaComissao.setText(null);

                txtCPF.requestFocus();

                txtCPF.setEnabled(true);
                txtNome.setEnabled(false);
                txtEndereco.setEnabled(false);
                txtCidade.setEnabled(false);
                cbxUF.setEnabled(false);
                txtDDD.setEnabled(false);
                txtTelefone.setEnabled(false);
                txtCEP.setEnabled(false);
                txtSalarioBase.setEnabled(false);
                txtTaxaComissao.setEnabled(false);

                btnConsultar.setEnabled(true);
                btnIncluir.setEnabled(false);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false); 
            }    
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?")== 0){    //Sim
           vendedor.setEndereco(txtEndereco.getText());
           vendedor.setCidade(txtCidade.getText());
           vendedor.setUf(cbxUF.getSelectedItem().toString());
           vendedor.setDdd(txtDDD.getText());
           vendedor.setTelefone(txtTelefone.getText());
           vendedor.setCep(txtCEP.getText());
           vendedor.setSalarioBase(Double.parseDouble(txtSalarioBase.getText()));
           vendedor.setTaxaComissao(Double.parseDouble(txtTaxaComissao.getText()));
           
           daoVendedor.alterar(vendedor);
        }      
        //Incializando a GUI 
        txtCPF.setText(null);
        txtNome.setText(null); 
        txtEndereco.setText(null);
        txtCidade.setText(null);
        cbxUF.setSelectedItem(-1);
        txtDDD.setText(null);
        txtTelefone.setText(null);
        txtCEP.setText(null);
        txtSalarioBase.setText(null);
        txtTaxaComissao.setText(null);
        
        txtCPF.requestFocus();
       
        txtCPF.setEnabled(true);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtCidade.setEnabled(false);
        cbxUF.setEnabled(false);
        txtDDD.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtCEP.setEnabled(false);
        txtSalarioBase.setEnabled(false);
        txtTaxaComissao.setEnabled(false);
       
        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false); 
    }//GEN-LAST:event_btnAlterarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxUF;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComissao;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalarioBase;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUF;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtDDD;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalarioBase;
    private javax.swing.JTextField txtTaxaComissao;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
    private DaoVendedor daoVendedor;
    private Vendedor vendedor;
    private PreparaConexao prepCon;
}

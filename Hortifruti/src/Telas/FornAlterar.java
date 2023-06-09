package Telas;

import java.util.ArrayList;

import Banco.FAlterar;
import Banco.FSelecionar;
import Banco.FDeletar;
import Dados.Fornecedor;

public class FornAlterar extends javax.swing.JFrame {
    
    public FornAlterar() {
        initComponents();
        
        FSelecionar f = new FSelecionar();
        
        ArrayList<Fornecedor> lista = f.fornLista();
        for(int i=0; i<lista.size();i++){
            cbID.addItem(lista.get(i).getID());    
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbID = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tEndereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tTelp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tTels = new javax.swing.JTextField();
        bDeletar = new javax.swing.JButton();
        bAlterar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        bProdutos = new javax.swing.JMenu();
        bFornecedores = new javax.swing.JMenu();
        bCompras = new javax.swing.JMenu();
        bCaixa = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel1.setText("ID* :");

        cbID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIDActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel2.setText("NOME* :");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel3.setText("ENDEREÇO* :");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel4.setText("TEL. PRINCIPAL* :");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel5.setText("TEL. SECUNDÁRIO :");

        bDeletar.setBackground(new java.awt.Color(255, 104, 104));
        bDeletar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bDeletar.setText("CANCELAR");
        bDeletar.setBorder(null);
        bDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeletarActionPerformed(evt);
            }
        });

        bAlterar.setBackground(new java.awt.Color(154, 255, 79));
        bAlterar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bAlterar.setText("ALTERAR");
        bAlterar.setBorder(null);
        bAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bAlterarMouseClicked(evt);
            }
        });
        bAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlterarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 21)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ALTERAR FORNECEDOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(bAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tTels, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(tTelp))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(tEndereco))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbID, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tNome)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel6)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tTels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );

        jMenuBar1.setBackground(new java.awt.Color(154, 255, 79));

        bProdutos.setBorder(null);
        bProdutos.setText("PRODUTOS");
        bProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bProdutos.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        bProdutos.setIconTextGap(20);
        bProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bProdutosMouseClicked(evt);
            }
        });
        jMenuBar1.add(bProdutos);

        bFornecedores.setBorder(null);
        bFornecedores.setText("FORNECEDORES");
        bFornecedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bFornecedores.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        bFornecedores.setIconTextGap(20);
        bFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bFornecedoresMouseClicked(evt);
            }
        });
        jMenuBar1.add(bFornecedores);

        bCompras.setBorder(null);
        bCompras.setText("REGISTRO DE COMPRAS");
        bCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bCompras.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        bCompras.setIconTextGap(20);
        bCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bComprasMouseClicked(evt);
            }
        });
        jMenuBar1.add(bCompras);

        bCaixa.setBorder(null);
        bCaixa.setText("CAIXA");
        bCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bCaixa.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        bCaixa.setIconTextGap(20);
        bCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bCaixaMouseClicked(evt);
            }
        });
        jMenuBar1.add(bCaixa);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(bCancelar)
                .addGap(82, 997, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bCancelar)
                .addGap(30, 30, 30))
        );

        setSize(new java.awt.Dimension(1116, 689));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bProdutosMouseClicked
        Menu m = new Menu();
        m.bProdutosMouseClicked(evt);
        dispose();
    }//GEN-LAST:event_bProdutosMouseClicked

    private void bFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bFornecedoresMouseClicked
        Menu m = new Menu();
        m.bFornecedoresMouseClicked(evt);
        dispose();
    }//GEN-LAST:event_bFornecedoresMouseClicked

    private void bComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bComprasMouseClicked
        Menu m = new Menu();
        m.bComprasMouseClicked(evt);
        dispose();
    }//GEN-LAST:event_bComprasMouseClicked

    private void bCaixaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCaixaMouseClicked
        Menu m = new Menu();
        m.bCaixaMouseClicked(evt);
        dispose();
    }//GEN-LAST:event_bCaixaMouseClicked

    private void cbIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIDActionPerformed
  	int numid = cbID.getSelectedIndex();
        
        FSelecionar f = new FSelecionar();
        
        ArrayList<Fornecedor> lista = f.fornLista();
        tNome.setText(lista.get(numid).getNome());
        tEndereco.setText(lista.get(numid).getEndereco());
        tTelp.setText(lista.get(numid).getTelp());
        tTels.setText(lista.get(numid).getTels());     
    }//GEN-LAST:event_cbIDActionPerformed

    private void bAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlterarActionPerformed
        String nome, endereco, tel1, tel2;
        Object id = cbID.getSelectedItem();
        
        nome = tNome.getText();
        endereco = tEndereco.getText();
        tel1  = tTelp.getText();
        tel2 = tTels.getText();
        
        Fornecedor forn = new Fornecedor();
        FAlterar fo = new FAlterar();
        Fornecedores f = new Fornecedores();
        
        forn.setID(String.valueOf(id));
        forn.setNome(nome);
        forn.setEndereco(endereco);
        forn.setTelp(tel1);
        forn.setTels(tel2);
        
        fo.Alterar(forn);
        
    }//GEN-LAST:event_bAlterarActionPerformed

    private void bDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeletarActionPerformed
        Object id = cbID.getSelectedItem();
        
        Fornecedor forn = new Fornecedor();
        FDeletar del = new FDeletar();
        Fornecedores f = new Fornecedores();
        
        forn.setID(String.valueOf(id));
        
        del.Deletar(forn);
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_bDeletarActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        Fornecedores f = new Fornecedores();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAlterarMouseClicked
        Menu m = new Menu();
        m.bFornecedoresMouseClicked(evt);
        dispose();
    }//GEN-LAST:event_bAlterarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlterar;
    private javax.swing.JMenu bCaixa;
    private javax.swing.JButton bCancelar;
    private javax.swing.JMenu bCompras;
    private javax.swing.JButton bDeletar;
    private javax.swing.JMenu bFornecedores;
    private javax.swing.JMenu bProdutos;
    private javax.swing.JComboBox<String> cbID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tEndereco;
    private javax.swing.JTextField tNome;
    private javax.swing.JTextField tTelp;
    private javax.swing.JTextField tTels;
    // End of variables declaration//GEN-END:variables
}

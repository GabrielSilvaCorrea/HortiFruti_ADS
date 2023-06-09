package Telas;

import java.util.ArrayList;

import Banco.PSelecionar;
import Banco.PAlterar;
import Dados.Produto;

public class ProdAlterar extends javax.swing.JFrame {

    public ProdAlterar() {
        initComponents();
        
        PSelecionar p = new PSelecionar();
        
        ArrayList<Produto> plista = p.prodLista();
        for(int i=0; i<plista.size(); i++){
            cbID.addItem(plista.get(i).getID());
        }          
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bAlterar = new javax.swing.JButton();
        tForID = new javax.swing.JTextField();
        bCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tQuant = new javax.swing.JTextField();
        tPreco = new javax.swing.JTextField();
        tNome = new javax.swing.JTextField();
        cbID = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        bProdutos = new javax.swing.JMenu();
        bFornecedores = new javax.swing.JMenu();
        bCompras = new javax.swing.JMenu();
        bCaixa = new javax.swing.JMenu();

        jLabel5.setText("ID");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        bCancelar.setBackground(new java.awt.Color(255, 104, 104));
        bCancelar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bCancelar.setText("CANCELAR");
        bCancelar.setBorder(null);
        bCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel1.setText("NOME* :");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel2.setText("PREÇO* :");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel3.setText("QUANTIDADE* :");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel4.setText("FORNECEDOR* :");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel6.setText("ID* :");

        tNome.setToolTipText("");

        cbID.setBackground(new java.awt.Color(255, 255, 254));
        cbID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIDActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 21)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ALTERAR PRODUTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(bAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(21, 21, 21)
                                .addComponent(cbID, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tQuant, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
                                .addComponent(tForID))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(24, 24, 24)
                                .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel7)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tForID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                
        PSelecionar p = new PSelecionar();

        ArrayList<Produto> lista = p.prodLista();
      
            tNome.setText(lista.get(numid).getNome());
            tPreco.setText(lista.get(numid).getPreco());
            tQuant.setText(lista.get(numid).getQuant());
            tForID.setText(lista.get(numid).getForID());
    }//GEN-LAST:event_cbIDActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        Produtos p = new Produtos();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlterarActionPerformed
        String nome, preco, quant, forid;
        Object id = cbID.getSelectedItem();
        
        nome = tNome.getText();
        preco = tPreco.getText();
        quant  = tQuant.getText();
        forid  = tForID.getText();
                
        Produto pr = new Produto();
        PAlterar prod = new PAlterar();
        Produtos p = new Produtos();
        
        pr.setID(String.valueOf(id));
        pr.setNome(nome);
        pr.setPreco(preco);
        pr.setQuant(quant);
        pr.setForID(forid);
        
        prod.Alterar(pr);
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_bAlterarActionPerformed

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
    private javax.swing.JMenu bFornecedores;
    private javax.swing.JMenu bProdutos;
    private javax.swing.JComboBox<String> cbID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tForID;
    private javax.swing.JTextField tNome;
    private javax.swing.JTextField tPreco;
    private javax.swing.JTextField tQuant;
    // End of variables declaration//GEN-END:variables
}

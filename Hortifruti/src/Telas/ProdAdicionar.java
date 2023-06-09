package Telas;

import javax.swing.JOptionPane;
import java.util.ArrayList;

import Banco.FSelecionar;
import Banco.PAdicionar;
import Dados.Fornecedor;
import Dados.Produto;

public class ProdAdicionar extends javax.swing.JFrame {

  public ProdAdicionar() {
        initComponents();
        
        FSelecionar f = new FSelecionar();
        
        ArrayList<Fornecedor> lista = f.fornLista();
        for(int i=0; i<lista.size();i++){
            cbNome.addItem(lista.get(i).getNome());    
        }
        
        tNome.setText("");
        tPreco.setText("");
        tQuant.setText("");
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bAdicionar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tPreco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tQuant = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbNome = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        bProdutos = new javax.swing.JMenu();
        bFornecedores = new javax.swing.JMenu();
        bCompras = new javax.swing.JMenu();
        bCaixa = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        bAdicionar.setBackground(new java.awt.Color(154, 255, 79));
        bAdicionar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bAdicionar.setText("ADICIONAR");
        bAdicionar.setBorder(null);
        bAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bAdicionarMouseClicked(evt);
            }
        });
        bAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdicionarActionPerformed(evt);
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

        tNome.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel2.setText("PREÇO* :");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel3.setText("QUANTIDADE* :");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel4.setText("FORNECEDOR* :");

        cbNome.setBackground(new java.awt.Color(255, 255, 254));
        cbNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbNome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um fornecedor" }));
        cbNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNomeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 21)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ADICIONAR PRODUTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(bAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tPreco))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(tQuant))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(cbNome, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel5)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void bAdicionarActionPerformed(java.awt.event.ActionEvent evt) {                                           

        
    }                     

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        Produtos p = new Produtos();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void cbNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNomeActionPerformed

    private void bAdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAdicionarMouseClicked
        String nome;
        String preco;
        String quant;
        Object forid;

        PAdicionar add = new PAdicionar();
        Produto prod = new Produto();

        nome = tNome.getText();
        preco = tPreco.getText();
        quant = tQuant.getText();
        forid = cbNome.getSelectedIndex();
        
        prod.setNome(nome);
        prod.setPreco(preco);
        prod.setQuant(quant);
        prod.setForID(String.valueOf(forid));

        if("".equals(nome) || "0".equals(forid) || "".equals(preco) || "".equals(quant)){
            JOptionPane.showMessageDialog(null, "Os campos * não podem estar vazios!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else{
            add.Inserir(prod);
            Produtos p = new Produtos();
            p.setVisible(true);
            dispose();    
        }
    }//GEN-LAST:event_bAdicionarMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdicionar;
    private javax.swing.JMenu bCaixa;
    private javax.swing.JButton bCancelar;
    private javax.swing.JMenu bCompras;
    private javax.swing.JMenu bFornecedores;
    private javax.swing.JMenu bProdutos;
    private javax.swing.JComboBox<String> cbNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tNome;
    private javax.swing.JTextField tPreco;
    private javax.swing.JTextField tQuant;
    // End of variables declaration//GEN-END:variables
}

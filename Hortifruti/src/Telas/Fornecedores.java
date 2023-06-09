package Telas;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

import Banco.FSelecionar;
import Dados.Fornecedor;
import java.awt.Font;
import java.awt.Color;

public class Fornecedores extends javax.swing.JFrame {    
    
    public Fornecedores() {
        initComponents();
        Imprimir();
        
        jTable.getTableHeader().setFont(new Font("Sagoe UI", Font.PLAIN, 18));
        jTable.getTableHeader().setOpaque(false);
        jTable.getTableHeader().setBackground(new Color (224,223,223));
        jTable.setRowHeight(50);
    }
    
    public void Imprimir(){

        FSelecionar f = new FSelecionar();
        
        ArrayList<Fornecedor> lista = f.fornLista();
        DefaultTableModel m = (DefaultTableModel)jTable.getModel();
        Object[] linha = new Object[5];
        for(int i=0; i<lista.size();i++){
            linha[0] = lista.get(i).getID();
            linha[1] = lista.get(i).getNome();
            linha[2] = lista.get(i).getEndereco();
            linha[3] = lista.get(i).getTelp();
            linha[4] = lista.get(i).getTels();
            m.addRow(linha);
        }
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        bAlterar = new javax.swing.JButton();
        bAdicionar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        bProdutos = new javax.swing.JMenu();
        bFornecedores = new javax.swing.JMenu();
        bCompras = new javax.swing.JMenu();
        bCaixa = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 254));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 21)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORNECEDORES");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Endereço", "Tel. Principal", "Tel. Secundário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.setSelectionBackground(new java.awt.Color(224, 223, 223));
        jTable.setSurrendersFocusOnKeystroke(true);
        jScrollPane.setViewportView(jTable);

        bAlterar.setBackground(new java.awt.Color(129, 190, 255));
        bAlterar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bAlterar.setText("ALTERAR");
        bAlterar.setBorder(null);
        bAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlterarActionPerformed(evt);
            }
        });

        bAdicionar.setBackground(new java.awt.Color(154, 255, 79));
        bAdicionar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bAdicionar.setText("ADICIONAR");
        bAdicionar.setBorder(null);
        bAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 96, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(bAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(93, 93, 93))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
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

    private void bAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdicionarActionPerformed
       FornAdicionar add = new FornAdicionar();
        add.setVisible(true);
        dispose();
    }//GEN-LAST:event_bAdicionarActionPerformed

    private void bAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlterarActionPerformed
        FornAlterar alt = new FornAlterar();
        alt.setVisible(true);
        dispose();
    }//GEN-LAST:event_bAlterarActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdicionar;
    private javax.swing.JButton bAlterar;
    private javax.swing.JMenu bCaixa;
    private javax.swing.JMenu bCompras;
    private javax.swing.JMenu bFornecedores;
    private javax.swing.JMenu bProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}

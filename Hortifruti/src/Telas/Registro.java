package Telas;

import Banco.RCSelecionar;
import Banco.RCodSelecionar;
import Banco.RPSelecionar;
import Dados.Compra;
import Dados.Produto;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.Color;

public class Registro extends javax.swing.JFrame {
    
    public float total = 0;
    
    public Registro() {
        initComponents();
        
        RCodSelecionar cs = new RCodSelecionar();
        
        ArrayList<Compra> lista = cs.compraLista();
        int linha = lista.size();
        for(int i=0; i<linha;i++){
            int l = Integer.parseInt(lista.get(i).getCod());
            
            if(i == linha-1){
                for(int c=0; c<l; c++){
                    cbID.addItem(lista.get(c).getID());
                    
                }
            }
        }
        
        jTable1.getTableHeader().setFont(new Font("Sagoe UI", Font.PLAIN, 18));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color (224,223,223));
        jTable1.setRowHeight(50);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbID = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lTotal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        bProdutos = new javax.swing.JMenu();
        bFornecedores = new javax.swing.JMenu();
        bCompras = new javax.swing.JMenu();
        bCaixa = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 21)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE COMPRAS");

        cbID.setBackground(new java.awt.Color(255, 255, 254));
        cbID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID" }));
        cbID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIDActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produtos", "Preço", "Quantidade", "Data", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(224, 223, 223));
        jScrollPane1.setViewportView(jTable1);

        lTotal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lTotal.setText("Total: 0,00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lTotal)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbID, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(94, 94, 94))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(cbID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(lTotal)
                .addGap(55, 55, 55))
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

    public void cbIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIDActionPerformed
        jTable1.setModel(new DefaultTableModel(null, new String[]{"Produtos(s)", "Preço", "Quantidade", "Data", "Hora"}));
        total = 0;
        RPSelecionar rps = new RPSelecionar();
        RCSelecionar rcs = new RCSelecionar();
        Produto prod = new Produto();
        Compra comp = new Compra();
        
        String numid = String.valueOf(cbID.getSelectedIndex());
        comp.setCod(numid);

        ArrayList<Compra> lista = rcs.cLista(comp);
        DefaultTableModel m = (DefaultTableModel)jTable1.getModel();
        for(int c=0; c<lista.size();c++){
            Object[] linha = new Object[5];
            linha[2] = lista.get(c).getQuant();
            linha[3] = lista.get(c).getData();
            linha[4] = lista.get(c).getHora();
            m.addRow(linha);
        }
        
        int rn = 0;
        int rp = 0;
        int linha = jTable1.getRowCount();
        for(int c=0; c<linha; c++){
            String proid = lista.get(c).getProid();
            prod.setForID(proid);
            rps.Caixa(prod);
            String n = prod.getNome();
            String p = prod.getPreco();
            m.setValueAt(n, rn, 0);
            m.setValueAt(p, rp, 1);
            rn++;
            rp++;
        }
        
        for(int c=0; c<linha; c++){
            String preco = String.valueOf(jTable1.getValueAt(c, 1));
            String quant = String.valueOf(jTable1.getValueAt(c, 2));
        
            float fp = Float.parseFloat(preco);
            float fq = Float.parseFloat(quant);
            
            total = total+(fp*fq);
            DecimalFormat dc = new DecimalFormat("0.00");
            lTotal.setText("Total: "+dc.format(total));

        }
    }//GEN-LAST:event_cbIDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu bCaixa;
    private javax.swing.JMenu bCompras;
    private javax.swing.JMenu bFornecedores;
    private javax.swing.JMenu bProdutos;
    public javax.swing.JComboBox<String> cbID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lTotal;
    // End of variables declaration//GEN-END:variables
}

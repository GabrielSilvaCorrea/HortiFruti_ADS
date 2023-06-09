package Telas;

import Banco.CAdicionar;
import Banco.CPSelecionar;
import Banco.CCSelecionar;
import Banco.CPAlterar;
import Banco.PSelecionar;
import Dados.Compra;
import Dados.Produto;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.Color;


public class Caixa extends javax.swing.JFrame {
    public float total = 0;
    private Menu l;
        
    public Caixa() {
        initComponents();
        tID.setText("");
        tQuant.setText("");
        l = new Menu();
        
        jTable1.getTableHeader().setFont(new Font("Sagoe UI", Font.PLAIN, 18));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color (224,223,223));
        jTable1.setRowHeight(50);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tQuant = new javax.swing.JTextField();
        bAdicionar = new javax.swing.JButton();
        lTotal = new javax.swing.JLabel();
        bCancelar = new javax.swing.JButton();
        bRemover = new javax.swing.JButton();
        bFinalizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        bProdutos = new javax.swing.JMenu();
        bFornecedores = new javax.swing.JMenu();
        bRegistro = new javax.swing.JMenu();
        bCaixa = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Preço", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel1.setText("ID* :");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel2.setText("QUANTIDADE* :");

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

        lTotal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lTotal.setText("Total: 0,00");

        bCancelar.setBackground(new java.awt.Color(255, 104, 104));
        bCancelar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bCancelar.setText("CANCELAR");
        bCancelar.setBorder(null);
        bCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        bRemover.setBackground(new java.awt.Color(129, 190, 255));
        bRemover.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bRemover.setText("REMOVER");
        bRemover.setBorder(null);
        bRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bRemoverMouseClicked(evt);
            }
        });

        bFinalizar.setBackground(new java.awt.Color(154, 255, 79));
        bFinalizar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bFinalizar.setText("FINALIZAR");
        bFinalizar.setBorder(null);
        bFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bFinalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bFinalizarMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 21)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CAIXA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(bRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(96, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(lTotal)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(tID))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(103, 103, 103))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(bAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lTotal)))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
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

        bRegistro.setBorder(null);
        bRegistro.setText("REGISTRO DE COMPRAS");
        bRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bRegistro.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        bRegistro.setIconTextGap(20);
        bRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bRegistroMouseClicked(evt);
            }
        });
        jMenuBar1.add(bRegistro);

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

    private void bFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bFornecedoresMouseClicked
       Menu m = new Menu();
       m.bFornecedoresMouseClicked(evt);
       dispose();    
    }//GEN-LAST:event_bFornecedoresMouseClicked

    private void bProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bProdutosMouseClicked
        Menu m = new Menu();
        m.bProdutosMouseClicked(evt);
        dispose();
    }//GEN-LAST:event_bProdutosMouseClicked

    private void bRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRegistroMouseClicked
        Menu m = new Menu();
        m.bComprasMouseClicked(evt);
        dispose();
    }//GEN-LAST:event_bRegistroMouseClicked

    private void bCaixaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCaixaMouseClicked
        Menu m = new Menu();
        m.bCaixaMouseClicked(evt);
        dispose();
    }//GEN-LAST:event_bCaixaMouseClicked
    
    public void bAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdicionarActionPerformed
        String id, quant;
        String preco;
        float p = 0;
        
        Produto prod = new Produto();
        Compra compra = new Compra();
        CPSelecionar s = new CPSelecionar();
        CCSelecionar c = new CCSelecionar();
        
        id = tID.getText();
        quant = tQuant.getText();
        prod.setID(id);
        
        s.Caixa(prod);
        c.Codigo(compra);
        int totalq = Integer.parseInt(prod.getQuant());
        int quantt = Integer.parseInt(quant);
        
        PSelecionar ps = new PSelecionar();
        ArrayList<Produto> lista = ps.prodLista();
       
        if("".equals(id) || "".equals(quant)){
            JOptionPane.showMessageDialog(null, "Os campos * não podem estar vazios!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else{
            if(quantt > totalq){
                JOptionPane.showMessageDialog(null, "A quantidade do produto não pode ultrapassar "+totalq+".", "Erro", JOptionPane.ERROR_MESSAGE);
            }else{    
                DefaultTableModel m = (DefaultTableModel)jTable1.getModel();
                Object[] linha = new Object[5];
                linha[0] = prod.getID();
                linha[1] = prod.getNome();
                linha[2] = prod.getPreco();
                linha[3] = tQuant.getText();
                linha[4] = "Deletar";
                m.addRow(linha);      
  
                preco = prod.getPreco();
                p = Float.parseFloat(preco);
                Float q = Float.parseFloat(String.valueOf(quant));
                total = total + (p*q);
                DecimalFormat dc = new DecimalFormat("0.00");
                lTotal.setText("Total: "+dc.format(total));            
            }   
        }
    }//GEN-LAST:event_bAdicionarActionPerformed

    private void bFinalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bFinalizarMouseClicked
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Compra cx = new Compra();
        Compra cxx = new Compra();
        CCSelecionar c = new CCSelecionar();
        CAdicionar insert = new CAdicionar();
        CPAlterar pa = new CPAlterar();
        Produto prod = new Produto();
        CPSelecionar s = new CPSelecionar();

        c.Codigo(cxx);
        
        int cod = Integer.parseInt(cxx.getCod());
        int ca = cod + 1;
        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now();
        
        for(int i=0; i < model.getRowCount(); i++){
            cx.setCod(String.valueOf(ca));
            cx.setData(String.valueOf(data));
            cx.setHora(String.valueOf(hora));
            cx.setQuant(String.valueOf(model.getValueAt(i, 3)));
            cx.setProid(String.valueOf(model.getValueAt(i, 0)));
            insert.Inserir(cx);
        }
        
        for(int i=0; i < model.getRowCount(); i++){
            String id = String.valueOf(model.getValueAt(i, 0));
            prod.setID(id);
            s.Caixa(prod);
            int pquant = Integer.parseInt(s.quant);
            int tquant = Integer.parseInt(String.valueOf(model.getValueAt(i, 3)));
            int fquant = pquant - tquant;
            prod.setQuant(String.valueOf(fquant));
            pa.Alterar(prod);
        }
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_bFinalizarMouseClicked

    private void bRemoverMouseClicked(java.awt.event.MouseEvent evt) {
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int tq = jTable1.getRowCount();
        
        if(tq<=0 || jTable1.getSelectionModel().isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Uma linha deve ser selecionada.", "Erro", JOptionPane.ERROR_MESSAGE);
        }else{
            
        int coluna = jTable1.getColumnModel().getColumnIndexAtX(evt.getX());
        int linha = evt.getY()/jTable1.getRowHeight();
        
        int c = 2;
        int cq = 3;
        int l = jTable1.getSelectedRow();
        String preco = jTable1.getModel().getValueAt(l, c).toString();
        String quant = jTable1.getModel().getValueAt(l, cq).toString();
        
        float p = Float.parseFloat(preco);
        float q = Float.parseFloat(quant);
        total = total-(p*q);
        DecimalFormat dc = new DecimalFormat("0.00");
        lTotal.setText("Total: "+dc.format(total));
        
        if(linha < jTable1.getRowCount() && linha >= 0 && coluna < jTable1.getColumnCount() && coluna >= 0){
            Object rowValue = jTable1.getValueAt(linha, coluna);
            DefaultTableModel tableModel = (DefaultTableModel)this.jTable1.getModel();
            int[] selectedRows = jTable1.getSelectedRows();
            for(int i = 0; i < selectedRows.length; i++){
                tableModel.removeRow(selectedRows[i]);
            }
        }
        }        
    }

    private void bCancelarMouseClicked(java.awt.event.MouseEvent evt) {
            l.setVisible(true);
        dispose();
    }                                       
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdicionar;
    private javax.swing.JMenu bCaixa;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bFinalizar;
    private javax.swing.JMenu bFornecedores;
    private javax.swing.JMenu bProdutos;
    private javax.swing.JMenu bRegistro;
    private javax.swing.JButton bRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JLabel lTotal;
    private javax.swing.JTextField tID;
    private javax.swing.JTextField tQuant;
    // End of variables declaration//GEN-END:variables

}

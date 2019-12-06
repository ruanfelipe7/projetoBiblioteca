/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.view;

import static br.com.biblioteca.main.Main.bibliotecarias;
import static br.com.biblioteca.main.Main.contaSessao;
import static br.com.biblioteca.main.Main.nomeSessao;
import static br.com.biblioteca.main.Main.usuarioSessao;
import br.com.biblioteca.model.Bibliotecaria;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rf
 */
public class TelaPesquisaBibliotecaria extends javax.swing.JDialog {

    /**
     * Creates new form TelaPesquisaBibliotecaria
     */
    private Frame parent;
    
    public TelaPesquisaBibliotecaria(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.parent = parent;
        this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        buscarBibliotecaria(false); 
        txtBuscaBibliot.requestFocus();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        txtBuscaBibliot = new javax.swing.JTextField();
        btnInformacoes = new javax.swing.JButton();
        comboBoxBuscaBibliot = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaListaBibliotecaria = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        kGradientPanel1.setkEndColor(new java.awt.Color(107, 22, 22));
        kGradientPanel1.setkGradientFocus(250);
        kGradientPanel1.setkStartColor(new java.awt.Color(75, 77, 75));

        jPanel1.setBackground(new java.awt.Color(1, 19, 123));

        jLabel3.setFont(new java.awt.Font("UnPilgi", 1, 48)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Pesquisar Bibliotecária");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/biblioteca/images/buscarbibliot.png"))); // NOI18N

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/biblioteca/images/back.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVoltarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVoltarMouseEntered(evt);
            }
        });
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(202, 202, 202))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );

        txtBuscaBibliot.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtBuscaBibliot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaBibliotActionPerformed(evt);
            }
        });
        txtBuscaBibliot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaBibliotKeyPressed(evt);
            }
        });

        btnInformacoes.setBackground(new java.awt.Color(255, 255, 255));
        btnInformacoes.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnInformacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/biblioteca/images/info.png"))); // NOI18N
        btnInformacoes.setText("Informações");
        btnInformacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInformacoesMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInformacoesMouseEntered(evt);
            }
        });
        btnInformacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacoesActionPerformed(evt);
            }
        });

        comboBoxBuscaBibliot.setBackground(new java.awt.Color(255, 255, 255));
        comboBoxBuscaBibliot.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        comboBoxBuscaBibliot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "CPF", "Telefone" }));

        tabelaListaBibliotecaria.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        tabelaListaBibliotecaria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Telefone", "RG"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaListaBibliotecaria.setRowHeight(30);
        jScrollPane1.setViewportView(tabelaListaBibliotecaria);

        btnPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/biblioteca/images/loupe.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseEntered(evt);
            }
        });
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/biblioteca/images/pencil.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluir.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/biblioteca/images/delete.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExcluirMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExcluirMouseEntered(evt);
            }
        });
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(btnInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1018, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(txtBuscaBibliot, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboBoxBuscaBibliot, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaBibliot, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxBuscaBibliot, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        txtBuscaBibliot.setText("");
        dispose();
        this.parent.enable();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtBuscaBibliotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaBibliotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaBibliotActionPerformed

    private void txtBuscaBibliotKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaBibliotKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER)
            buscarBibliotecaria(true);
    }//GEN-LAST:event_txtBuscaBibliotKeyPressed

    private void btnInformacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacoesActionPerformed
        // TODO add your handling code here:
        int linhaSelecionada = tabelaListaBibliotecaria.getSelectedRow();
        if(linhaSelecionada == -1){
            JOptionPane.showMessageDialog(this, "Nenhuma Bibliotecaria Selecionada", "Falha ao Ver as Informações", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Bibliotecaria bibliotecaria = new Bibliotecaria();
        try{
            Object obj = tabelaListaBibliotecaria.getValueAt(linhaSelecionada, 1);
            String cpf = String.valueOf(obj);
            bibliotecaria = bibliotecarias.getBibliotecariaCPF(cpf);
            TelaInfoEditBibliotecaria telaInfoEditBibliotecaria = new TelaInfoEditBibliotecaria(this.parent, false, bibliotecaria, false, false);
            telaInfoEditBibliotecaria.setVisible(true);
            telaInfoEditBibliotecaria.setLocationRelativeTo(null);
            dispose();
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(this, "Erro ao Selecionar a Bibliotecaria", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnInformacoesActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        buscarBibliotecaria(true);

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        int linhaSelecionada = tabelaListaBibliotecaria.getSelectedRow();
        if(linhaSelecionada == -1){
            JOptionPane.showMessageDialog(this, "Nenhuma Bibliotecária Selecionada", "Falha ao Editar as Informações", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Bibliotecaria bibliotecaria = new Bibliotecaria();
        try{
            Object obj = tabelaListaBibliotecaria.getValueAt(linhaSelecionada, 1);
            String cpf = String.valueOf(obj);
            bibliotecaria = bibliotecarias.getBibliotecariaCPF(cpf);
            TelaInfoEditBibliotecaria telaInfoEditBibliotecaria = new TelaInfoEditBibliotecaria(this.parent, false, bibliotecaria, true, false);
            telaInfoEditBibliotecaria.setVisible(true);
            telaInfoEditBibliotecaria.setLocationRelativeTo(null);
            dispose();
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(this, "Erro ao Selecionar a Bibliotecaria", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        int linhaSelecionada = tabelaListaBibliotecaria.getSelectedRow();
        if(linhaSelecionada == -1){
            JOptionPane.showMessageDialog(this, "Nenhum Bibliotecária Selecionado", "Falha na Exclusão", JOptionPane.WARNING_MESSAGE);
            return;
        }
        removerBibliotecaria(linhaSelecionada);

        limparTabela();
        txtBuscaBibliot.setText("");
        buscarBibliotecaria(false);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseEntered
        // TODO add your handling code here:
        btnVoltar.setBackground(Color.decode("#708090"));
        btnVoltar.setForeground(Color.white);
    }//GEN-LAST:event_btnVoltarMouseEntered

    private void btnVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseExited
        // TODO add your handling code here:
        btnVoltar.setBackground(Color.white);
        btnVoltar.setForeground(Color.black);
    }//GEN-LAST:event_btnVoltarMouseExited

    private void btnPesquisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseEntered
        // TODO add your handling code here:
        btnPesquisar.setBackground(Color.decode("#708090"));
        btnPesquisar.setForeground(Color.white);

    }//GEN-LAST:event_btnPesquisarMouseEntered

    private void btnPesquisarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseExited
        // TODO add your handling code here:
        btnPesquisar.setBackground(Color.white);
        btnPesquisar.setForeground(Color.black);

    }//GEN-LAST:event_btnPesquisarMouseExited

    private void btnInformacoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformacoesMouseEntered
        // TODO add your handling code here:
        btnInformacoes.setBackground(Color.decode("#708090"));
        btnInformacoes.setForeground(Color.white);

    }//GEN-LAST:event_btnInformacoesMouseEntered

    private void btnInformacoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformacoesMouseExited
        // TODO add your handling code here:
        btnInformacoes.setBackground(Color.white);
        btnInformacoes.setForeground(Color.black);

    }//GEN-LAST:event_btnInformacoesMouseExited

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        // TODO add your handling code here:
        btnEditar.setBackground(Color.decode("#708090"));
        btnEditar.setForeground(Color.white);

    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        // TODO add your handling code here:
        btnEditar.setBackground(Color.white);
        btnEditar.setForeground(Color.black);

    }//GEN-LAST:event_btnEditarMouseExited

    private void btnExcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseEntered
        // TODO add your handling code here:
        btnExcluir.setBackground(Color.decode("#708090"));
        btnExcluir.setForeground(Color.white);

    }//GEN-LAST:event_btnExcluirMouseEntered

    private void btnExcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseExited
        // TODO add your handling code here:
        btnExcluir.setBackground(Color.white);
        btnExcluir.setForeground(Color.black);

    }//GEN-LAST:event_btnExcluirMouseExited
    public void inserirLinhaTabela(Bibliotecaria bibliotecaria, DefaultTableModel tabela){
        tabela.addRow(new String[] {bibliotecaria.getNome(), bibliotecaria.getCpf(), bibliotecaria.getTelefone(), bibliotecaria.getRg()});
    }
    
    public void limparTabela(){
        DefaultTableModel tabela = (DefaultTableModel) tabelaListaBibliotecaria.getModel();
        while(tabela.getRowCount() > 0){
            tabela.removeRow(0);
        }
    }
    
    private void removerBibliotecaria(int index){
        int decisaodeExcluir = 0;
        Bibliotecaria bibliotecaria = new Bibliotecaria();
           try{
                Object obj = tabelaListaBibliotecaria.getValueAt(index, 1);
                String cpf = String.valueOf(obj);
                bibliotecaria = bibliotecarias.getBibliotecariaCPF(cpf);
                decisaodeExcluir = JOptionPane.showOptionDialog(this, "Deseja Realmente Excluir a Bibliotecária " , "Decisão de Exclusão", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION, null, null, null);
                if(decisaodeExcluir == 0){
                    bibliotecarias.removerBibliotecaria(bibliotecaria);
                    JOptionPane.showMessageDialog(this, "Bibliotecária Exlcuida", "Exclusão Efetuada", JOptionPane.INFORMATION_MESSAGE);
                    
                    if(bibliotecaria.getUsuario().equals(usuarioSessao)){
                        JOptionPane.showMessageDialog(this, "Realizando logout", "Sair do Sistema", JOptionPane.INFORMATION_MESSAGE);
                        destruirSessao();
                        TelaLogin telaLogin = new TelaLogin();
                        telaLogin.setVisible(true);
                        dispose();
                        parent.dispose();
                    }
                
                }
           }catch(NullPointerException ex){
               JOptionPane.showMessageDialog(this, "Erro ao Realizar a Exclusão", "Erro", JOptionPane.ERROR_MESSAGE);
           }

           
    }
    
    private void buscarBibliotecaria(boolean buscar){
        boolean flagEncontrouAluno = false;
        Bibliotecaria bibliotecaria = new Bibliotecaria();
        String txtDeBusca = this.txtBuscaBibliot.getText();
        int cbxIndex = this.comboBoxBuscaBibliot.getSelectedIndex();
        DefaultTableModel tabela = (DefaultTableModel) tabelaListaBibliotecaria.getModel();
        limparTabela();
        for(int i = 0; i < bibliotecarias.quantidadeBibliotecaria(); i++){
            bibliotecaria = bibliotecarias.getBibliotecaria(i);
            if(cbxIndex == 0){
                if(bibliotecaria.getNome().toLowerCase().contains(txtDeBusca))
                    inserirLinhaTabela(bibliotecaria, tabela);
            }else if(cbxIndex == 1){
                if(bibliotecaria.getCpf().contains(txtDeBusca))
                    inserirLinhaTabela(bibliotecaria, tabela);
            }else if(cbxIndex == 2){
                if(bibliotecaria.getTelefone().contains(txtDeBusca))
                    inserirLinhaTabela(bibliotecaria, tabela);
            }
        }
        
        if(tabelaListaBibliotecaria.getRowCount() == 0 && buscar)
            JOptionPane.showMessageDialog(this, "Nenhum resultado encontrado", "Biblioetacária não Encontrado", JOptionPane.WARNING_MESSAGE);
    }
    
    private void destruirSessao(){
        nomeSessao = "";
        usuarioSessao = "";
        contaSessao = "";
    }
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
            java.util.logging.Logger.getLogger(TelaPesquisaBibliotecaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaBibliotecaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaBibliotecaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaBibliotecaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaPesquisaBibliotecaria dialog = new TelaPesquisaBibliotecaria(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInformacoes;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> comboBoxBuscaBibliot;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tabelaListaBibliotecaria;
    private javax.swing.JTextField txtBuscaBibliot;
    // End of variables declaration//GEN-END:variables
}

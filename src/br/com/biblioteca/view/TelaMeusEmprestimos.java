/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.view;

import br.com.biblioteca.main.Main;
import static br.com.biblioteca.main.Main.alunos;
import static br.com.biblioteca.main.Main.livros;
import static br.com.biblioteca.main.Main.emprestimos;
import static br.com.biblioteca.main.Main.matriculaSessao;
import br.com.biblioteca.model.Aluno;
import br.com.biblioteca.model.Emprestimo;
import br.com.biblioteca.model.Livro;
import java.awt.Color;
import java.awt.Frame;
import java.time.LocalDate;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rf
 */
public class TelaMeusEmprestimos extends javax.swing.JDialog {

    /**
     * Creates new form TelaPesquisaEmprestimo
     */
    private Frame parent; 
    public TelaMeusEmprestimos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.parent = parent;
        this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        txtBuscaEmprestimo.requestFocus();
        buscarEmprestimo(false);
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
        txtBuscaEmprestimo = new javax.swing.JTextField();
        btnInformacoes = new javax.swing.JButton();
        comboBoxBusca = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaListaEmprestimo = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        btnRenovarEmprestimo = new javax.swing.JButton();
        btnRealizarDevolucao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        kGradientPanel1.setkEndColor(new java.awt.Color(107, 22, 22));
        kGradientPanel1.setkGradientFocus(250);
        kGradientPanel1.setkStartColor(new java.awt.Color(75, 77, 75));

        jPanel1.setBackground(new java.awt.Color(1, 19, 123));

        jLabel3.setFont(new java.awt.Font("UnPilgi", 1, 48)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Meus Empréstimos");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/biblioteca/images/buscaemprestimo.png"))); // NOI18N

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
                .addGap(46, 46, 46)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(16, 16, 16))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)))))
        );

        txtBuscaEmprestimo.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtBuscaEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaEmprestimoActionPerformed(evt);
            }
        });
        txtBuscaEmprestimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaEmprestimoKeyPressed(evt);
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

        comboBoxBusca.setBackground(new java.awt.Color(255, 255, 255));
        comboBoxBusca.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        comboBoxBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Titulo do Livro", "Data de Empréstimo", "Com Renovação" }));
        comboBoxBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxBuscaActionPerformed(evt);
            }
        });

        tabelaListaEmprestimo.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        tabelaListaEmprestimo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo do Livro", "Data de Empréstimo", "Data de Devolução", "Renovado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaListaEmprestimo.setRowHeight(30);
        jScrollPane1.setViewportView(tabelaListaEmprestimo);

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

        btnRenovarEmprestimo.setBackground(new java.awt.Color(255, 255, 255));
        btnRenovarEmprestimo.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnRenovarEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/biblioteca/images/refresh.png"))); // NOI18N
        btnRenovarEmprestimo.setText("Renovar Empréstimo");
        btnRenovarEmprestimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRenovarEmprestimoMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRenovarEmprestimoMouseEntered(evt);
            }
        });
        btnRenovarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenovarEmprestimoActionPerformed(evt);
            }
        });

        btnRealizarDevolucao.setBackground(new java.awt.Color(255, 255, 255));
        btnRealizarDevolucao.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnRealizarDevolucao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/biblioteca/images/devolver.png"))); // NOI18N
        btnRealizarDevolucao.setText("Realizar Devolução");
        btnRealizarDevolucao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRealizarDevolucaoMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRealizarDevolucaoMouseEntered(evt);
            }
        });
        btnRealizarDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarDevolucaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(txtBuscaEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(comboBoxBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1018, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(btnInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(btnRenovarEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(btnRealizarDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)))
                .addGap(30, 30, 30))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscaEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRealizarDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRenovarEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void btnVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseExited
        // TODO add your handling code here:
        btnVoltar.setBackground(Color.white);
        btnVoltar.setForeground(Color.black);
    }//GEN-LAST:event_btnVoltarMouseExited

    private void btnVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseEntered
        // TODO add your handling code here:
        btnVoltar.setBackground(Color.decode("#708090"));
        btnVoltar.setForeground(Color.white);
    }//GEN-LAST:event_btnVoltarMouseEntered

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        txtBuscaEmprestimo.setText("");
        dispose();
        this.parent.enable();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtBuscaEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaEmprestimoActionPerformed

    private void txtBuscaEmprestimoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaEmprestimoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER)
        buscarEmprestimo(true);
    }//GEN-LAST:event_txtBuscaEmprestimoKeyPressed

    private void btnInformacoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformacoesMouseExited
        // TODO add your handling code here:
        btnInformacoes.setBackground(Color.white);
        btnInformacoes.setForeground(Color.black);
    }//GEN-LAST:event_btnInformacoesMouseExited

    private void btnInformacoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformacoesMouseEntered
        // TODO add your handling code here:
        btnInformacoes.setBackground(Color.decode("#708090"));
        btnInformacoes.setForeground(Color.white);
    }//GEN-LAST:event_btnInformacoesMouseEntered

    private void btnInformacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacoesActionPerformed
        // TODO add your handling code here:
        int linhaSelecionada = tabelaListaEmprestimo.getSelectedRow();
        if(linhaSelecionada == -1){
            JOptionPane.showMessageDialog(this, "Nenhum Empreéstimo Selecionado", "Falha ao Ver as Informações", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Emprestimo emprestimo = new Emprestimo();
        try{
            Object obj = tabelaListaEmprestimo.getValueAt(linhaSelecionada, 0);
            String id = String.valueOf(obj);
            int id_Emprestimo = Integer.parseInt(id);
            emprestimo = emprestimos.getEmprestimoID(id_Emprestimo);
            TelaInfoEmprestimo telaInfoEmprestimo = new TelaInfoEmprestimo(this.parent, false, emprestimo);
            telaInfoEmprestimo.setVisible(true);
            telaInfoEmprestimo.setLocationRelativeTo(null);
            dispose();
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(this, "Erro ao Selecionar o Empréstimo", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnInformacoesActionPerformed

    private void btnPesquisarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseExited
        // TODO add your handling code here:
        btnPesquisar.setBackground(Color.white);
        btnPesquisar.setForeground(Color.black);
    }//GEN-LAST:event_btnPesquisarMouseExited

    private void btnPesquisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseEntered
        // TODO add your handling code here:
        btnPesquisar.setBackground(Color.decode("#708090"));
        btnPesquisar.setForeground(Color.white);
    }//GEN-LAST:event_btnPesquisarMouseEntered

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        buscarEmprestimo(true);

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnRenovarEmprestimoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRenovarEmprestimoMouseExited
        // TODO add your handling code here:
        btnRenovarEmprestimo.setBackground(Color.white);
        btnRenovarEmprestimo.setForeground(Color.black);
    }//GEN-LAST:event_btnRenovarEmprestimoMouseExited

    private void btnRenovarEmprestimoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRenovarEmprestimoMouseEntered
        // TODO add your handling code here:
        btnRenovarEmprestimo.setBackground(Color.decode("#708090"));
        btnRenovarEmprestimo.setForeground(Color.white);
    }//GEN-LAST:event_btnRenovarEmprestimoMouseEntered

    private void btnRenovarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenovarEmprestimoActionPerformed
        // TODO add your handling code here:
           int linhaSelecionada = tabelaListaEmprestimo.getSelectedRow();
        if(linhaSelecionada == -1){
            JOptionPane.showMessageDialog(this, "Nenhum Empréstimo Selecionado", "Falha na Renovação", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Emprestimo emprestimo = new Emprestimo();
        Aluno aluno = new Aluno();
        Livro livro = new Livro();
          try{
              Object obj = tabelaListaEmprestimo.getValueAt(linhaSelecionada, 0);
              String id = String.valueOf(obj);
              int id_Emprestimo = Integer.parseInt(id);
              emprestimo = emprestimos.getEmprestimoID(id_Emprestimo);
              
              if(!emprestimo.getRenovacao()){
                  JOptionPane.showMessageDialog(this, "O livro não pode mais ser renovado", "Limite de Renovação", JOptionPane.ERROR_MESSAGE);
                  return;
              }
              
              LocalDate dataHoje = LocalDate.now();
              LocalDate dataDevolucao = emprestimo.getDataDevolucao();
              if(dataDevolucao.isBefore(dataHoje)){
                  JOptionPane.showMessageDialog(this, "Renovado fora do Prazo", "Livro com Multa", JOptionPane.WARNING_MESSAGE);
              }
              aluno = emprestimo.getAluno();
              livro = emprestimo.getLivro();
              emprestimo.setDataDevolucao(dataDevolucao.plusDays(7));
              emprestimo.setRenovacao(false);
              
              JOptionPane.showMessageDialog(this, "Empréstimo Renovado", "Renovação Concluída", JOptionPane.INFORMATION_MESSAGE);
              buscarEmprestimo(false);
              
          }catch(NullPointerException ex){
                JOptionPane.showMessageDialog(this, "Erro ao Selecionar o Empréstimo", "Erro", JOptionPane.ERROR_MESSAGE);
          }
    }//GEN-LAST:event_btnRenovarEmprestimoActionPerformed

    private void btnRealizarDevolucaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRealizarDevolucaoMouseExited
        // TODO add your handling code here:
        btnRealizarDevolucao.setBackground(Color.white);
        btnRealizarDevolucao.setForeground(Color.black);
    }//GEN-LAST:event_btnRealizarDevolucaoMouseExited

    private void btnRealizarDevolucaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRealizarDevolucaoMouseEntered
        // TODO add your handling code here:
        btnRealizarDevolucao.setBackground(Color.decode("#708090"));
        btnRealizarDevolucao.setForeground(Color.white);
    }//GEN-LAST:event_btnRealizarDevolucaoMouseEntered

    private void btnRealizarDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarDevolucaoActionPerformed
        // TODO add your handling code here:
        int linhaSelecionada = tabelaListaEmprestimo.getSelectedRow();
        if(linhaSelecionada == -1){
            JOptionPane.showMessageDialog(this, "Nenhum Empréstimo Selecionado", "Falha na Devolução", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Emprestimo emprestimo = new Emprestimo();
        Aluno aluno = new Aluno();
        Livro livro = new Livro();
          try{
              Object obj = tabelaListaEmprestimo.getValueAt(linhaSelecionada, 0);
              String id = String.valueOf(obj);
              int id_Emprestimo = Integer.parseInt(id);
              emprestimo = emprestimos.getEmprestimoID(id_Emprestimo);
              
              LocalDate dataHoje = LocalDate.now();
              LocalDate dataDevolucao = emprestimo.getDataDevolucao();
              if(dataDevolucao.isBefore(dataHoje)){
                  JOptionPane.showMessageDialog(this, "Devolvido fora do Prazo", "Livro com Multa", JOptionPane.WARNING_MESSAGE);
              }
              aluno = emprestimo.getAluno();
              livro = emprestimo.getLivro();
              emprestimo.setDataDevolucao(dataHoje);
              emprestimo.setEmprestimoTerminado(true);
              aluno.setQuantidadeLivrosAlugados(aluno.getQuantidadeLivrosAlugados() - 1);
              livro.setDisponivel(livro.getQuantidadeDisponivel() + 1);
      
              JOptionPane.showMessageDialog(this, "Livro Devolvido", "Devolução Efetuada", JOptionPane.INFORMATION_MESSAGE);
              buscarEmprestimo(false);
              
          }catch(NullPointerException ex){
                JOptionPane.showMessageDialog(this, "Erro ao Selecionar o Empréstimo", "Erro", JOptionPane.ERROR_MESSAGE);
          }
        
    }//GEN-LAST:event_btnRealizarDevolucaoActionPerformed

    private void comboBoxBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxBuscaActionPerformed

    public void inserirLinhaTabela(Emprestimo emprestimo, DefaultTableModel tabela){
        String data = String.valueOf(emprestimo.getDataEmprestimo());
        String camposData[] = data.split("-");
        String dataEmprestimo = camposData[2]+"/"+camposData[1]+"/"+camposData[0];
        String data1 = String.valueOf(emprestimo.getDataDevolucao());
        String camposData1[] = data1.split("-");
        String dataDevolucao = camposData1[2]+"/"+camposData1[1]+"/"+camposData1[0];
        String renovado;
        if(!emprestimo.getRenovacao())
            renovado = "Sim";
        else
            renovado = "Não";
                    
        tabela.addRow(new String[] {String.valueOf(emprestimo.getId()) , emprestimo.getLivro().getTitulo(), dataEmprestimo, dataDevolucao, renovado});
    }
    
    public void limparTabela(){
        DefaultTableModel tabela = (DefaultTableModel) tabelaListaEmprestimo.getModel();
        while(tabela.getRowCount() > 0){
            tabela.removeRow(0);
        }
    }
    
    private void buscarEmprestimo(boolean buscar){
        boolean flagEncontrouAluno = false;
        Emprestimo emprestimo = new Emprestimo();
        String txtDeBusca = this.txtBuscaEmprestimo.getText();
        String matricula, dataEmprestimo, nomeAluno, tituloLivro;
        int cbxIndex = this.comboBoxBusca.getSelectedIndex();
        DefaultTableModel tabela = (DefaultTableModel) tabelaListaEmprestimo.getModel();
        limparTabela();
        for(int i = 0; i < emprestimos.quantidadeEmprestimo(); i++){
            emprestimo = emprestimos.getEmprestimo(i);
            if(!emprestimo.isEmprestimoTerminado()){
                if(matriculaSessao == emprestimo.getAluno().getMatricula()){
                    if(cbxIndex == 0){
                        tituloLivro = emprestimo.getLivro().getTitulo();
                        if(tituloLivro.toLowerCase().contains(txtDeBusca))
                            inserirLinhaTabela(emprestimo, tabela);
                    }else if(cbxIndex == 1){
                        String data = String.valueOf(emprestimo.getDataEmprestimo());
                        String camposData[] = data.split("-");
                        dataEmprestimo = camposData[2]+"/"+camposData[1]+"/"+camposData[0];
                            if(dataEmprestimo.contains(txtDeBusca))
                                inserirLinhaTabela(emprestimo, tabela);
                    }else if(cbxIndex == 2){
                        if(!emprestimo.getRenovacao())
                            inserirLinhaTabela(emprestimo, tabela);
                    }
                }
                
            }    
        }
        
        if(tabelaListaEmprestimo.getRowCount() == 0 && buscar)
            JOptionPane.showMessageDialog(this, "Nenhum resultado encontrado", "Empréstimo não Encontrado", JOptionPane.WARNING_MESSAGE);
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
            java.util.logging.Logger.getLogger(TelaMeusEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMeusEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMeusEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMeusEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaMeusEmprestimos dialog = new TelaMeusEmprestimos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnInformacoes;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRealizarDevolucao;
    private javax.swing.JButton btnRenovarEmprestimo;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> comboBoxBusca;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tabelaListaEmprestimo;
    private javax.swing.JTextField txtBuscaEmprestimo;
    // End of variables declaration//GEN-END:variables
}

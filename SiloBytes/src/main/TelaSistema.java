// Autor: Nathan Pedro Nunes
package main;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import util.DataFileTableModel;
import util.Info;
import util.UtilSilo;

public class TelaSistema extends javax.swing.JFrame {

    public TelaSistema() {
        initComponents();
        atualizarInformacoes();
        preencheComboBox(); 
        carregarNaTabela();
        
        // Caso não haja disponibilidade no silo, impedir de cadastrar armazenagem.
        if(UtilSilo.calcularDiponibilidadeSilo()==0) {
            btnCadArmazenagem.setEnabled(false);
            JOptionPane.showMessageDialog(this, "O Silo está cheio, impossível armazenar mais!", "Atenção!", 2);
        } else {
            btnCadArmazenagem.setEnabled(true);
        }
        campoDisponivel.setText(String.valueOf(UtilSilo.calcularDiponibilidadeSilo()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelDisponibilidade = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoDisponivel = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        labelCapacidadeSilo = new javax.swing.JLabel();
        campoQtdArmSilo = new javax.swing.JTextField();
        labelArmazenamentoKg = new javax.swing.JLabel();
        labelUtilizacaoSilo = new javax.swing.JLabel();
        campoUtilizacaoSilo = new javax.swing.JTextField();
        labelUtilizacaoKg = new javax.swing.JLabel();
        campoPorcentagem = new javax.swing.JTextField();
        labelPorcentagem = new javax.swing.JLabel();
        labelUtilizacaoSilo1 = new javax.swing.JLabel();
        campoPreco = new javax.swing.JTextField();
        labelPorcentagem1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoQuantidade = new javax.swing.JTextField();
        cbListaClientes = new javax.swing.JComboBox<>();
        btnCadArmazenagem = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableArmazenagens = new javax.swing.JTable();
        btnRetirada = new javax.swing.JButton();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuUsuarios = new javax.swing.JMenuItem();
        menuClientes = new javax.swing.JMenuItem();
        menuConfiguracoes = new javax.swing.JMenu();
        menuConfiguracoesSistema = new javax.swing.JMenuItem();
        menuOpcoes = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SiloBytes");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo350px.jpg"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Status do Silo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        labelDisponibilidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelDisponibilidade.setForeground(new java.awt.Color(51, 153, 0));
        labelDisponibilidade.setText("Disponível!");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Quantidade Disponível:");

        campoDisponivel.setEditable(false);
        campoDisponivel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelDisponibilidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(campoDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDisponibilidade)
                    .addComponent(jLabel2)
                    .addComponent(campoDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações sobre o Silo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        labelCapacidadeSilo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCapacidadeSilo.setText("Capacidade de Armazenamento do Silo:");

        campoQtdArmSilo.setEditable(false);
        campoQtdArmSilo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        labelArmazenamentoKg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelArmazenamentoKg.setText("kg.");

        labelUtilizacaoSilo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelUtilizacaoSilo.setText("Utilização do Silo:");

        campoUtilizacaoSilo.setEditable(false);
        campoUtilizacaoSilo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        labelUtilizacaoKg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelUtilizacaoKg.setText("kg.");

        campoPorcentagem.setEditable(false);
        campoPorcentagem.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        labelPorcentagem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelPorcentagem.setText("%");

        labelUtilizacaoSilo1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelUtilizacaoSilo1.setText("Preço da Diária do Silo:");

        campoPreco.setEditable(false);
        campoPreco.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        labelPorcentagem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelPorcentagem1.setText("reais.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelCapacidadeSilo)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelUtilizacaoSilo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoUtilizacaoSilo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelUtilizacaoKg))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelUtilizacaoSilo1)
                        .addGap(18, 18, 18)
                        .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoQtdArmSilo)
                            .addComponent(campoPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelArmazenamentoKg)
                            .addComponent(labelPorcentagem)))
                    .addComponent(labelPorcentagem1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCapacidadeSilo)
                    .addComponent(campoQtdArmSilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelArmazenamentoKg))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUtilizacaoSilo)
                    .addComponent(campoUtilizacaoSilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUtilizacaoKg)
                    .addComponent(campoPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPorcentagem))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUtilizacaoSilo1)
                    .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPorcentagem1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Armazenagem", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Quantidade:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Cliente:");

        campoQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        cbListaClientes.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        btnCadArmazenagem.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCadArmazenagem.setText("Cadastrar Armazenagem");
        btnCadArmazenagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadArmazenagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cbListaClientes, 0, 244, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadArmazenagem)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbListaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCadArmazenagem)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Armazenagens no Silo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        tableArmazenagens.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tableArmazenagens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableArmazenagens);

        btnRetirada.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnRetirada.setText("Fazer Retirada");
        btnRetirada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRetirada)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnRetirada)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelLogo)
                        .addGap(18, 18, 18)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelLogo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuCadastro.setText("Cadastro");

        menuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-user-account-16.png"))); // NOI18N
        menuUsuarios.setText("Cadastro de Usuários");
        menuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUsuariosActionPerformed(evt);
            }
        });
        menuCadastro.add(menuUsuarios);

        menuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-budget-16.png"))); // NOI18N
        menuClientes.setText("Cadastro de Clientes");
        menuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClientesActionPerformed(evt);
            }
        });
        menuCadastro.add(menuClientes);

        jMenuBarPrincipal.add(menuCadastro);

        menuConfiguracoes.setText("Configurações");

        menuConfiguracoesSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-settings-16.png"))); // NOI18N
        menuConfiguracoesSistema.setText("Configurações do Sistema");
        menuConfiguracoesSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConfiguracoesSistemaActionPerformed(evt);
            }
        });
        menuConfiguracoes.add(menuConfiguracoesSistema);

        jMenuBarPrincipal.add(menuConfiguracoes);

        menuOpcoes.setText("Opções");

        menuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-exit-16.png"))); // NOI18N
        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuOpcoes.add(menuSair);

        menuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-about-16.png"))); // NOI18N
        menuSobre.setText("Sobre");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        menuOpcoes.add(menuSobre);

        jMenuBarPrincipal.add(menuOpcoes);

        setJMenuBar(jMenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUsuariosActionPerformed
        // Abre a tela para cadastro de usuários.
        JFrame telausuario = new TelaNovoUsuario();
        telausuario.setLocationRelativeTo(null);
        telausuario.setVisible(true);
    }//GEN-LAST:event_menuUsuariosActionPerformed

    private void menuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClientesActionPerformed
        // Abre a tela para cadastro de usuários.
        JFrame telaclientes = new TelaCadastroClientes();
        telaclientes.setLocationRelativeTo(null);
        telaclientes.setVisible(true);
    }//GEN-LAST:event_menuClientesActionPerformed

    private void menuConfiguracoesSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConfiguracoesSistemaActionPerformed
        // Abre a tela de configuração do sistema.
        JFrame telaqtdsilo = new TelaConfiguracao();
        telaqtdsilo.setLocationRelativeTo(null);
        telaqtdsilo.setVisible(true);
    }//GEN-LAST:event_menuConfiguracoesSistemaActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        // Fecha a aplicação.
        System.exit(0);
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        // Abre a tela de Sobre do sistema.
        JFrame telasobre = new TelaSobre();
        telasobre.setLocationRelativeTo(null);
        telasobre.setVisible(true);
    }//GEN-LAST:event_menuSobreActionPerformed

    private void btnCadArmazenagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadArmazenagemActionPerformed
        // Criação de Strings com as informações de cadastro.
        String cliente = (String) cbListaClientes.getSelectedItem();
        String quantidade = campoQuantidade.getText();

        // Cria um int com o valor da String quantidade.
        int qtd = Integer.valueOf(quantidade);

        /* Caso o usuário tente cadastrar uma armazenagem
        com quantidade zero, o sistema o impede.    */
        if(qtd==0) {
            JOptionPane.showMessageDialog(this, "Não é possível cadastrar uma armazenagem com quantidade zero.", "Atenção!", 2);
        } else if(qtd!=0) {
            // Data do início da armazenagem.
            DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
            Date dataAtual = Calendar.getInstance().getTime();
            String dataInicio = df.format(dataAtual);

            // Cria uma String com a nova linha de cadastro da armazenagem, à ser escrita no arquivo.
            String cadastro = cliente+"|"+quantidade+"|"+dataInicio;

            // Escreve a nova linha de cadastro de armazenagem no arquivo.
            try {
                FileWriter fw = new FileWriter(Info.ARQUIVO_ARMAZENAGENS, true);
                BufferedWriter conexao = new BufferedWriter(fw);
                conexao.write(cadastro);
                conexao.newLine();
                conexao.close();

                // Mostra uma mensagem de sucesso ao cadastrar a armazenagem.
                JOptionPane.showMessageDialog(null, "Nova armazenagem cadastrada com sucesso!");

                // Limpa o campo de quantidade, para poder ser realizado novo cadastro.
                campoQuantidade.setText("");
                
                // Carrega o arquivo na tabela e atualiza as informações na tela.
                carregarNaTabela();
                atualizarInformacoes();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_btnCadArmazenagemActionPerformed

    private void btnRetiradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiradaActionPerformed
        // Lê o arquivo com as informações das armazenagens.
        String dados = null;
        try {
            // Escreve todas as informações do arquivo em uma String.
            dados = new String(Files.readAllBytes(Paths.get(Info.ARQUIVO_ARMAZENAGENS)));
        } catch (IOException ex) {
            System.out.println(ex);
        }

        // Guarda a opção escolhida na tabela pelo usuário.
        int opcao = tableArmazenagens.getSelectedRow()+1;

        // Obtém cada linha da String com os dados do arquivo de armazenagens.
        String[] linhas = dados.split("\n");

        // Troca o divisor de elementos da String para melhor reconhecimento.
        String linhaReplace = linhas[opcao].replace("|", ";");

        // Gerando as colunas.
        String[] colunas = linhaReplace.split(";");

        // Variável que armazena a quantidade de dias que se passaram.
        long diferencaDias = 0;
        try {
            // Criação das datas de início e fim da armazenagem, para calcular a diferença.
            DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
            Date dataInicio = df.parse(colunas[2]);
            Date dataAtual = Calendar.getInstance().getTime();

            // Calcula a diferença de dias entre as duas datas.
            diferencaDias = (dataAtual.getTime() - dataInicio.getTime()) / (1000*60*60*24);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }

        // Calcula o total de pagamento pela armazenagem no silo.
        int totalPagamento = (int) (diferencaDias * UtilSilo.verificaPrecoDiariaSilo());

        // Variável que armazena a resposta do usuário.
        int resposta;

        // Mostra uma mensagem de confirmação para fazer a retirada.
        resposta = JOptionPane.showConfirmDialog(this,
            "Deseja retirar a armazenagem do silo?\n\n"
            +"Valor de pagamento: R$ "+totalPagamento,
            "Retirada de Armazenagem do Silo", 0);

        // Usuário responde sim. Sistema apaga a linha da armazenagem do arquivo.
        if(resposta==0){

            // Criação de uma String para salvar os novos dados de armazenagem.
            String salvarArquivo = "Nome do Cliente|Quantidade|Data";

            // Passa pelos dados de armazenagem antigos.
            for(int i = 1; i < linhas.length; i++) {

                /* Caso a linha seja diferente da opção escolhida, escreve na
                nova String para salvar o arquivo, ou seja, o sistema só irá
                salvar no arquivo as armazenagens que não foram retiradas.*/
                if(i!=opcao) {
                    salvarArquivo = salvarArquivo+"\n"+linhas[i];
                }
            }

            // Salva o novo arquivo.
            try {
                FileOutputStream outputStream = new FileOutputStream(Info.ARQUIVO_ARMAZENAGENS);
                byte[] strToBytes = salvarArquivo.getBytes();
                outputStream.write(strToBytes);
                outputStream.close();

                // Carrega o arquivo na tabela e atualiza as informações na tela.
                carregarNaTabela();
                atualizarInformacoes();                
            } catch (IOException ex) {
                // Caso haja um erro no salvamento do arquivo, mostra uma mensagem de erro.
                JOptionPane.showMessageDialog(this, ex, "Erro ao salvar arquivo!", 2);
            }

            // Zera a variável opção.
            opcao = 0;
        }
    }//GEN-LAST:event_btnRetiradaActionPerformed
    
    // Função para atualizar as informações na tela.
    public void atualizarInformacoes() {
        // Verifica a capacidade de armazenamento do silo e mostra na tela.
        campoQtdArmSilo.setText(String.valueOf(UtilSilo.verificarArmazenamentoSilo()));
                
        // Calcula a quantidade utilizada do silo e mostra na tela.
        campoUtilizacaoSilo.setText(String.valueOf(UtilSilo.calcularUso()));
        
        // Calcula a porcentagem de utilização do silo e mostra na tela.
        campoPorcentagem.setText(String.valueOf(UtilSilo.calcularPorcentagemUso()));
        
        // Verifica o preço da diária do silo e mostra na tela.
        campoPreco.setText(String.valueOf(UtilSilo.verificaPrecoDiariaSilo()));
        
        // Verifica a disponibilidade no silo e modifica o Status na tela.
        int disp = UtilSilo.calcularDiponibilidadeSilo();
        
        // Se a disponibilidade for zero, mostra que o silo está indisponível.
        if(disp==0) {
            labelDisponibilidade.setText("Indisponível!");
            labelDisponibilidade.setForeground(Color.RED);
        } 
        
        // Se a disponibilidade não for zero, mostra que o silo está disponível.
        else if(disp!=0) {
            labelDisponibilidade.setText("Disponível!");
            labelDisponibilidade.setForeground(new java.awt.Color(51, 153, 0));
        }
        campoDisponivel.setText(String.valueOf(disp));
    }
        
    // Função para ler arquivo dos clientes e preencher o comboBox com os nomes dos clientes.
    public void preencheComboBox() {
        // Lê o arquivo com as informações dos clientes.
        String dados = null;
        try {   
            // Escreve todas as informações do arquivo em uma String.
            dados = new String(Files.readAllBytes(Paths.get(Info.ARQUIVO_CLIENTES)));
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        // Obtém cada linha da String com os dados do arquivo de clientes.
        String[] linhas = dados.split("\n");

        // Passa por cada linha da String para identificar os clientes.
        for (int i = 1; i < linhas.length; i++) {
                        
            // Troca o divisor de elementos da String para melhor reconhecimento. 
            String linhaReplace = linhas[i].replace("|", ";");
            
            // Divide cada String de cliente em elementos, para identificar o nome do cliente.
            String[] parteString = linhaReplace.split(";");
             
            // Adiciona o nome do cliente em um comboBox para escolha.
            cbListaClientes.addItem(parteString[1]);            
        }
    }
        
    // Carrega o conteúdo do arquivo usuarios.dat na Tabela.
    private void carregarNaTabela(){
        DataFileTableModel model;
        model = new DataFileTableModel(Info.ARQUIVO_ARMAZENAGENS);        
        tableArmazenagens.setModel(model);
    }
    
    public static void main(String args[]) {
        try { 
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadArmazenagem;
    private javax.swing.JButton btnRetirada;
    private javax.swing.JTextField campoDisponivel;
    private javax.swing.JTextField campoPorcentagem;
    private javax.swing.JTextField campoPreco;
    private javax.swing.JTextField campoQtdArmSilo;
    private javax.swing.JTextField campoQuantidade;
    private javax.swing.JTextField campoUtilizacaoSilo;
    private javax.swing.JComboBox<String> cbListaClientes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelArmazenamentoKg;
    private javax.swing.JLabel labelCapacidadeSilo;
    private javax.swing.JLabel labelDisponibilidade;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelPorcentagem;
    private javax.swing.JLabel labelPorcentagem1;
    private javax.swing.JLabel labelUtilizacaoKg;
    private javax.swing.JLabel labelUtilizacaoSilo;
    private javax.swing.JLabel labelUtilizacaoSilo1;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuClientes;
    private javax.swing.JMenu menuConfiguracoes;
    private javax.swing.JMenuItem menuConfiguracoesSistema;
    private javax.swing.JMenu menuOpcoes;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenuItem menuSobre;
    private javax.swing.JMenuItem menuUsuarios;
    private javax.swing.JTable tableArmazenagens;
    // End of variables declaration//GEN-END:variables
}

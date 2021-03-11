// Autor: Nathan Pedro Nunes
package main;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.UIManager;
import util.UtilSilo;

public class TelaSistema extends javax.swing.JFrame {

    public TelaSistema() {
        initComponents();
        atualizarInformacoes();
        disponibilidadeSilo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelCapacidadeSilo = new javax.swing.JLabel();
        campoQtdArmSilo = new javax.swing.JTextField();
        labelArmazenamentoKg = new javax.swing.JLabel();
        labelUtilizacaoSilo = new javax.swing.JLabel();
        campoUtilizacaoSilo = new javax.swing.JTextField();
        labelUtilizacaoKg = new javax.swing.JLabel();
        campoPorcentagem = new javax.swing.JTextField();
        labelPorcentagem = new javax.swing.JLabel();
        labelLogo = new javax.swing.JLabel();
        btnCadArmazenagem = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        labelUtilizacaoSilo1 = new javax.swing.JLabel();
        campoPreco = new javax.swing.JTextField();
        labelPorcentagem1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelDisponibilidade = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoDisponivel = new javax.swing.JTextField();
        btnAtualizarStatus = new javax.swing.JButton();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuCadArmazenagem = new javax.swing.JMenuItem();
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

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo350px.jpg"))); // NOI18N

        btnCadArmazenagem.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCadArmazenagem.setText("Cadastrar Armazenagem");
        btnCadArmazenagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadArmazenagemActionPerformed(evt);
            }
        });

        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnAtualizar.setText("Atualizar Informações");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        labelUtilizacaoSilo1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelUtilizacaoSilo1.setText("Preço da Diária do Silo:");

        campoPreco.setEditable(false);
        campoPreco.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        labelPorcentagem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelPorcentagem1.setText("reais.");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Status do Silo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        labelDisponibilidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelDisponibilidade.setForeground(new java.awt.Color(51, 153, 0));
        labelDisponibilidade.setText("Disponível!");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Quantidade Disponível:");

        campoDisponivel.setEditable(false);
        campoDisponivel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        btnAtualizarStatus.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnAtualizarStatus.setText("Atualizar");
        btnAtualizarStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDisponibilidade)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAtualizarStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoDisponivel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelDisponibilidade)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnAtualizarStatus)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(715, Short.MAX_VALUE)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAtualizar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelCapacidadeSilo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelUtilizacaoSilo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoUtilizacaoSilo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelUtilizacaoKg))
                            .addComponent(btnCadArmazenagem)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelUtilizacaoSilo1)
                                .addGap(18, 18, 18)
                                .addComponent(campoPreco)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoQtdArmSilo, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(campoPorcentagem))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelArmazenamentoKg)
                                    .addComponent(labelPorcentagem)))
                            .addComponent(labelPorcentagem1))))
                .addGap(83, 83, 83)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCapacidadeSilo)
                            .addComponent(campoQtdArmSilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelArmazenamentoKg))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelUtilizacaoSilo)
                            .addComponent(campoUtilizacaoSilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelUtilizacaoKg)
                            .addComponent(campoPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPorcentagem))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelUtilizacaoSilo1)
                            .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPorcentagem1))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCadArmazenagem)
                            .addComponent(btnAtualizar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)))
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menuCadastro.setText("Cadastro");

        menuCadArmazenagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-silo-16.png"))); // NOI18N
        menuCadArmazenagem.setText("Cadastro de Armazenagem");
        menuCadArmazenagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadArmazenagemActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadArmazenagem);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        atualizarInformacoes();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnCadArmazenagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadArmazenagemActionPerformed
        // Abre a tela para cadastro de armazenagens.
        JFrame telaArmazenagem = new TelaArmazenagem();
        telaArmazenagem.setLocationRelativeTo(null);
        telaArmazenagem.setVisible(true);
    }//GEN-LAST:event_btnCadArmazenagemActionPerformed

    private void menuCadArmazenagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadArmazenagemActionPerformed
        // Abre a tela para cadastro de armazenagens.
        JFrame telaArmazenagem = new TelaArmazenagem();
        telaArmazenagem.setLocationRelativeTo(null);
        telaArmazenagem.setVisible(true);
    }//GEN-LAST:event_menuCadArmazenagemActionPerformed

    private void btnAtualizarStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarStatusActionPerformed
        disponibilidadeSilo();
    }//GEN-LAST:event_btnAtualizarStatusActionPerformed
    
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
    }
    
    public void disponibilidadeSilo() {
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
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnAtualizarStatus;
    private javax.swing.JButton btnCadArmazenagem;
    private javax.swing.JTextField campoDisponivel;
    private javax.swing.JTextField campoPorcentagem;
    private javax.swing.JTextField campoPreco;
    private javax.swing.JTextField campoQtdArmSilo;
    private javax.swing.JTextField campoUtilizacaoSilo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelArmazenamentoKg;
    private javax.swing.JLabel labelCapacidadeSilo;
    private javax.swing.JLabel labelDisponibilidade;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelPorcentagem;
    private javax.swing.JLabel labelPorcentagem1;
    private javax.swing.JLabel labelUtilizacaoKg;
    private javax.swing.JLabel labelUtilizacaoSilo;
    private javax.swing.JLabel labelUtilizacaoSilo1;
    private javax.swing.JMenuItem menuCadArmazenagem;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuClientes;
    private javax.swing.JMenu menuConfiguracoes;
    private javax.swing.JMenuItem menuConfiguracoesSistema;
    private javax.swing.JMenu menuOpcoes;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenuItem menuSobre;
    private javax.swing.JMenuItem menuUsuarios;
    // End of variables declaration//GEN-END:variables
}

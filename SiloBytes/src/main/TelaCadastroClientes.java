// Autor: Nathan Pedro Nunes
package main;

import util.ContaLinhasArquivo;
import util.DataFileTableModel;
import util.Info;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class TelaCadastroClientes extends javax.swing.JFrame {

    public TelaCadastroClientes() {
        initComponents();
        carregarNaTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelCadastro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoCPF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoCidade = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        campoEstado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoBairro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        campoCEP = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        panelVisualizacao = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableClientes = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes - SiloBytes");

        panelCadastro.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de Cliente");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        campoNome.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("CPF:");

        campoCPF.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Cidade:");

        campoCidade.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Estado:");

        campoEstado.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Bairro:");

        campoBairro.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Endereço:");

        campoEndereco.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("CEP:");

        campoCEP.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        labelTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelTelefone.setText("Telefone:");

        campoTelefone.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        labelEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelEmail.setText("E-mail:");

        campoEmail.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        javax.swing.GroupLayout panelCadastroLayout = new javax.swing.GroupLayout(panelCadastro);
        panelCadastro.setLayout(panelCadastroLayout);
        panelCadastroLayout.setHorizontalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastrar)
                            .addGroup(panelCadastroLayout.createSequentialGroup()
                                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTelefone)
                                    .addComponent(labelEmail)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCadastroLayout.createSequentialGroup()
                                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(campoNome)
                                                .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(campoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(40, 40, 40)
                                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelCadastroLayout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panelCadastroLayout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(33, 33, 33)
                                                .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panelCadastroLayout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(campoCEP, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campoTelefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))))))
                .addContainerGap(285, Short.MAX_VALUE))
        );
        panelCadastroLayout.setVerticalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(campoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefone)
                    .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Cadastro", panelCadastro);

        panelVisualizacao.setBackground(new java.awt.Color(255, 255, 255));

        tableClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableClientes);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setText("Listagem de Clientes");

        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAtualizar.setText("Atualizar Lista");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelVisualizacaoLayout = new javax.swing.GroupLayout(panelVisualizacao);
        panelVisualizacao.setLayout(panelVisualizacaoLayout);
        panelVisualizacaoLayout.setHorizontalGroup(
            panelVisualizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVisualizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelVisualizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                    .addGroup(panelVisualizacaoLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtualizar)))
                .addContainerGap())
        );
        panelVisualizacaoLayout.setVerticalGroup(
            panelVisualizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVisualizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelVisualizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(btnAtualizar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Visualização", panelVisualizacao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // Criação de Strings com as informações de cadastro.
        String cadastro, id;        
        String nome = campoNome.getText();
        String cpf = campoCPF.getText();
        String cidade = campoCidade.getText();
        String estado = campoEstado.getText();
        String cep = campoCEP.getText();
        String bairro = campoBairro.getText();
        String endereco = campoEndereco.getText();
        String telefone = campoTelefone.getText();
        String email = campoEmail.getText();
              
        // Descobre qual é o Id para cadastro.
        int tamanhoArquivo = 0;
        try {
            tamanhoArquivo = ContaLinhasArquivo.contaLinhasArquivo(Info.ARQUIVO_CLIENTES);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }        
        id = String.valueOf(tamanhoArquivo);
        
        // Cria uma String com a nova linha de cadastro do cliente, à ser escrita no arquivo.
        cadastro = id+"|"+nome+"|"+cpf+"|"+cidade+"|"+estado+"|"+cep+"|"+bairro+"|"+endereco+"|"+telefone+"|"+email;
        
        // Escreve a nova linha de cadastro do cliente no arquivo.
        try {
            FileWriter fw = new FileWriter(Info.ARQUIVO_CLIENTES, true);
            BufferedWriter conexao = new BufferedWriter(fw);
            conexao.write(cadastro);
            conexao.newLine();
            conexao.close();
            JOptionPane.showMessageDialog(null, "Cliente "+nome+" cadastrado com sucesso!");
            carregarNaTabela();
	} catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
	}        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        carregarNaTabela();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    // Carrega o conteúdo do arquivo usuarios.dat na Tabela.
    private void carregarNaTabela(){
        DataFileTableModel model;
        model = new DataFileTableModel(Info.ARQUIVO_CLIENTES);        
        tableClientes.setModel(model);
    }
    
    public static void main(String args[]) {
        try { 
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JTextField campoBairro;
    private javax.swing.JTextField campoCEP;
    private javax.swing.JTextField campoCPF;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoEstado;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JPanel panelCadastro;
    private javax.swing.JPanel panelVisualizacao;
    private javax.swing.JTable tableClientes;
    // End of variables declaration//GEN-END:variables
}
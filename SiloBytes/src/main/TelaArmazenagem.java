// Autor: Nathan Pedro Nunes
package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import util.DataFileTableModel;
import util.Info;
import util.UtilSilo;

public class TelaArmazenagem extends javax.swing.JFrame {

    public TelaArmazenagem() {
        initComponents();
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCadArmazenagem = new javax.swing.JButton();
        campoQuantidade = new javax.swing.JTextField();
        cbListaClientes = new javax.swing.JComboBox<>();
        btnAtualizarClientes = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        campoDisponivel = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableArmazenagens = new javax.swing.JTable();
        btnRetirada = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Armazenagem - SiloBytes");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Quantidade:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Cliente:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de Armazenagem");

        btnCadArmazenagem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCadArmazenagem.setText("Cadastrar");
        btnCadArmazenagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadArmazenagemActionPerformed(evt);
            }
        });

        campoQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        cbListaClientes.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        btnAtualizarClientes.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnAtualizarClientes.setText("Atualizar Clientes");
        btnAtualizarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarClientesActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Disponível no Silo:");

        campoDisponivel.setEditable(false);
        campoDisponivel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCadArmazenagem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbListaClientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                        .addComponent(jLabel4)))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAtualizarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoDisponivel))))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbListaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizarClientes))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addComponent(btnCadArmazenagem)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro de Armazenagens", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setText("Armazenagens no Silo");

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

        btnRetirada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRetirada.setText("Fazer Retirada");
        btnRetirada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRetirada)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btnRetirada)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Armazenagens no Silo", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }             
        }        
    }//GEN-LAST:event_btnCadArmazenagemActionPerformed

    private void btnAtualizarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarClientesActionPerformed
        preencheComboBox();
    }//GEN-LAST:event_btnAtualizarClientesActionPerformed

    private void btnRetiradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiradaActionPerformed
        int totalPagamento = 10;
        
        int opcao = tableArmazenagens.getSelectedRow()+2;
        
        System.out.print("\narm escolhida: "+opcao);
        
        int resposta;
        
        // Mostra uma mensagem de confirmação para fazer a retirada.
        resposta = JOptionPane.showConfirmDialog(this,
                "Deseja retirar a armazenagem do silo?\n\n"
                +"Valor de pagamento: R$ "+totalPagamento,
                "Retirada de Armazenagem do Silo", 0);
        
        // YES = 0  NO = 1
        if(resposta==1){ // não
            System.out.print("\nresposta: "+resposta);
        } else if(resposta==0){ // sim
            System.out.print("\nresposta: "+resposta);
        }
        
    }//GEN-LAST:event_btnRetiradaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaArmazenagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarClientes;
    private javax.swing.JButton btnCadArmazenagem;
    private javax.swing.JButton btnRetirada;
    private javax.swing.JTextField campoDisponivel;
    private javax.swing.JTextField campoQuantidade;
    private javax.swing.JComboBox<String> cbListaClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tableArmazenagens;
    // End of variables declaration//GEN-END:variables
}

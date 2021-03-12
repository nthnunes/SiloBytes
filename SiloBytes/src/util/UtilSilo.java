// Autor: Nathan Pedro Nunes
package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

// Classe criada com funções úteis sobre o silo.
public class UtilSilo {
    
    // Função para verificar o preço da diária do silo.
    public static int verificaPrecoDiariaSilo() {
        int preco = 0;
        
        // Lê o arquivo com o preço da diária do silo.
        try {
            File file = new File(Info.ARQUIVO_PRECO_DIARIA); 
            BufferedReader br = new BufferedReader(new FileReader(file)); 
            String st; 
            while ((st = br.readLine()) != null) 
                preco = Integer.valueOf(st);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler configurações do sistema.");
        }
        return preco;
    }
    
    // Função para verificar a capacidade do silo.
    public static int verificarArmazenamentoSilo() {
        // Variável para salvar o armazenamento do silo.
        int quantidade = 0;
        
        // Lê o arquivo com a quantidade de armazenamento do silo.
        try {
            File file = new File(Info.ARQUIVO_QTD_SILO); 
            BufferedReader br = new BufferedReader(new FileReader(file)); 
            String st; 
            while ((st = br.readLine()) != null) 
                quantidade = Integer.valueOf(st);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler configurações do sistema.");            
        }
        return quantidade;
    }
    
    // Função para calcular a utilização do silo.
    public static int calcularUso() {
        // Variável para salvar o total de uso do silo.
        int total = 0;
        
        // Lê o arquivo com as informações das armazenagens.
        String dados = null;
        try {   
            // Escreve todas as informações do arquivo em uma String.
            dados = new String(Files.readAllBytes(Paths.get(Info.ARQUIVO_ARMAZENAGENS)));
        } catch (IOException ex) {
            System.out.println(ex);
        }
               
        // Obtém cada linha da String com os dados do arquivo de armazenagens.
        String[] linhas = dados.split("\n");

        // Passa por cada linha da String para identificar as armazenagens.
        for (int i = 1; i < linhas.length; i++) {            
            // Troca o divisor de elementos da String para melhor reconhecimento. 
            String linhaReplace = linhas[i].replace("|", ";");
                        
            // Gerando as colunas.
            String[] colunas = linhaReplace.split(";");

            // Realiza a soma de todas as quantidades de armazenagens.
            total = total + Integer.valueOf(colunas[1]);
        }
        return total;
    }
    
    // Função para calcular a porcentagem de utilização do silo.
    public static double calcularPorcentagemUso() {
        // Recebe a quantidade de uso do silo.
        double uso = calcularUso();
        
        // Recebe a capacidade total do silo.
        double total = verificarArmazenamentoSilo();

        // Calcula e retorna a porcentagem.
        double porcentagem = ((uso/total)*100); 
                
        return porcentagem;
    }
    
    // Função para calcular a disponibilidade no silo.
    public static int calcularDiponibilidadeSilo() {
        return verificarArmazenamentoSilo()-calcularUso();
    }
}

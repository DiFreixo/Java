/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Diana Freixo
 * Programa NetBeans IDE 8.0.2
 */
public class OperacoesNoBancoDeDados {
    //Atributo
    private Connection conexao;
  
    //Construtor
    public OperacoesNoBancoDeDados() {
        //O atributo conexão vai receber uma nova conexão com o banco de dados
        this.conexao = new ConectarAoBancoDeDados().getConnection();
    }
    
    
    //Método para registar a informação no banco de dados
    public void Registar(DadosAgenda objeto) {
        
        try {
            // Inserir na tabela_registo do banco de dados os valores correspondentes
            String informacoesSql = "insert into tabela_registo(nome, telefone, email, endereco, nascimento)" +
                    "values(?, ?, ?, ?, ?)";
            
            //trata a execução dos comandos SQL definidos acima
            PreparedStatement gravarInformacao = conexao.prepareStatement(informacoesSql);
        
            gravarInformacao.setString(1, objeto.getNome());
            gravarInformacao.setString(2, objeto.getTelefone());
            gravarInformacao.setString(3, objeto.getEmail());
            gravarInformacao.setString(4, objeto.getEndereco());
            gravarInformacao.setString(5, objeto.getNascimento());
           
            //executa os comandos SQL
            gravarInformacao.execute();
            //fecha no fim da execução
            gravarInformacao.close();
            
            JOptionPane.showMessageDialog(null, "Dados registados com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao guardar os dados!" + ex);
        }
    }
    
    //Método para listar todos os registos da agenda
    public ArrayList<DadosAgenda> listarItens() {

        try {
            ArrayList<DadosAgenda> lista = new ArrayList<>();
       
            String sqlBancoDados = "Select * From tabela_registo";
        
            //trata a execução do comando SQL definido acima
            PreparedStatement lerInformacao = conexao.prepareStatement(sqlBancoDados);
        
            //A variável resultado vai receber o resultado da execução da query
            ResultSet resultado = lerInformacao.executeQuery();
            
            while(resultado.next()) {
                DadosAgenda linha = new DadosAgenda();
                linha.setId(resultado.getInt("id"));
                linha.setNome(resultado.getString("nome"));
                linha.setTelefone(resultado.getString("telefone"));
                linha.setEmail(resultado.getString("email"));
                linha.setEndereco(resultado.getString("endereco"));
                linha.setNascimento(resultado.getString("nascimento"));
                
                lista.add(linha);
            }
            return lista;
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar os dados" + e);
        }
        return null;
    }
    
    public ArrayList<DadosAgenda> FiltarDados(String nome) {
        
        try {
            ArrayList<DadosAgenda> lista = new ArrayList<>();
       
            String sqlBancoDados = "Select * From tabela_registo Where nome like ?";
        
            //trata a execução do comando SQL definido acima
            PreparedStatement lerInformacao = conexao.prepareStatement(sqlBancoDados);
        
            lerInformacao.setString(1, nome);
            
            
            //A variável resultado vai receber o resultado da execução da query
            ResultSet resultado = lerInformacao.executeQuery();
            
            while(resultado.next()) {
                DadosAgenda linha = new DadosAgenda();
                linha.setId(resultado.getInt("id"));
                linha.setNome(resultado.getString("nome"));
                linha.setTelefone(resultado.getString("telefone"));
                linha.setEmail(resultado.getString("email"));
                linha.setEndereco(resultado.getString("endereco"));
                linha.setNascimento(resultado.getString("nascimento"));
                
                lista.add(linha);
            }
            return lista;
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar os dados" + e);
        }
        return null;
    }
    
    public void Alterar(DadosAgenda objeto) {
    
         try {
            // atualiza/altera na tabela_registo do banco de dados os valores correspondentes
            String informacoesSql = "update tabela_registo set nome=?, telefone=?, email=?, endereco=?, nascimento=?" +
                    "where id=?";
            
            //trata a execução dos comandos SQL definidos acima
            PreparedStatement gravarInformacao = conexao.prepareStatement(informacoesSql);
        
            gravarInformacao.setString(1, objeto.getNome());
            gravarInformacao.setString(2, objeto.getTelefone());
            gravarInformacao.setString(3, objeto.getEmail());
            gravarInformacao.setString(4, objeto.getEndereco());
            gravarInformacao.setString(5, objeto.getNascimento());
            gravarInformacao.setInt(6, objeto.getId());
           
            //executa os comandos SQL
            gravarInformacao.execute();
            //fecha no fim da execução
            gravarInformacao.close();
            
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar os dados!" + ex);
        }      
    }
    
    public void Eliminar(DadosAgenda objeto) {
        
        try {
            // elimina da tabela_registo do banco de dados os valores correspondentes
            String informacoesSql = "delete from tabela_registo where id = ?";
            
            //trata a execução dos comandos SQL definidos acima
            PreparedStatement eliminarInformacao = conexao.prepareStatement(informacoesSql);
            eliminarInformacao.setInt(1, objeto.getId());
           
            //executa os comandos SQL
            eliminarInformacao.execute();
            //fecha no fim da execução
            eliminarInformacao.close();
            
            JOptionPane.showMessageDialog(null, "Dados eliminados com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao eliminar os dados!" + ex);
        }      
        
    }
}

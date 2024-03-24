/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author Diana Freixo
 * Programa NetBeans IDE 8.0.2
 */
public class ConectarAoBancoDeDados {
    
    public Connection getConnection() {
        
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/bdagenda", "root", "$diana123BD");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "O driver do Banco de Dados não foi encontrado.\n" + ex);
        }
        return null;
    }
    
    
}

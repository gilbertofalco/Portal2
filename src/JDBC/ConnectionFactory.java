/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author gilbe
 */
//Abre conexão
public class ConnectionFactory {
    
    public Connection getConnection(){
        
        try{
            String nomeUsuario = "postgres";
            String senhaUsuario = "277798";
            String enderecoServer = "localhost";
            String nomeBanco = "portal";

            return DriverManager.getConnection("jdbc:postgresql://"+enderecoServer+
                    "/"+nomeBanco, nomeUsuario, senhaUsuario);
                    
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o Banco de Dados");
            throw new RuntimeException(ex);
        }
    }
    
}

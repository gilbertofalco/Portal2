/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDBC.ConnectionFactory;
import Model.Candidato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gilbe
 */
public class CandidatoDao {
    private Connection con;
    
    public CandidatoDao(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Candidato c){
        String sql = "INSERT INTO pessoa(id, nome, senha, email, telefone, celular,"
                + " endereco, bairro, cidade, estado, site, curso) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, Long.toString(c.getCodigo()));
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getSenha());
            stmt.setString(4, c.getEmail());
            stmt.setString(5, c.getTelefone());
            stmt.setString(6, c.getCelular());
            stmt.setString(7, c.getEndereco());
            stmt.setString(8, c.getBairro());
            stmt.setString(9, c.getCidade());
            stmt.setString(10, c.getEstado());
            stmt.setString(11, c.getSite());
            stmt.setString(12, c.getCurso());
            stmt.execute();
            
            return true;
            
        } catch (SQLException ex){
            Logger.getLogger(CandidatoDao.class.getName()).log(Level.SEVERE, null, sql);
            return false;            
        }
    }
}
    
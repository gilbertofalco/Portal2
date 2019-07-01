/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDBC.ConnectionFactory
import java.sql.Connection;

/**
 *
 * @author gilbe
 */
public class CandidatoDao {
    private Connection con;
    
    public CandidatoDao(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Candidato a){
        String
    }
}

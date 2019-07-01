
import JDBC.ConnectionFactory;
import Model.Candidato;
import DAO.CandidatoDao;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gilbe
 */
public class teste {
   public static void main(String[] args){

       Candidato c = new Candidato();
        c.setNome("Rafael");
        c.setCidade("Cornélio");
    
       
        CandidatoDao dao = new CandidatoDao();
        if(dao.add(c)){
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro! Cadastro não efetuado!");
        }
    
    }
}

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
        c.setSenha("123456");
        c.setCodigo("a98765");
        c.setCidade("gsdgdf");
        c.setEstado("SP");
        c.setTelefone("1515161");
        c.setCelular("123456");
        c.setBairro("santa maria");
        c.setSite("www.vfdvd.com.br");
        
        
    
       
        CandidatoDao dao = new CandidatoDao();
        if(dao.add(c)){
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro! Cadastro não efetuado!");
        }
    
    }
}
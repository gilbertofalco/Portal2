/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import portal2.CadastrarCandidato;
import portal2.Principal;

/**
 * FXML Controller class
 *
 * @author gilbe
 */
public class CadastrarCandidatoController implements Initializable {

    @FXML private Label lblNome;
    @FXML private Label lblEmail;
    @FXML private Label lblEstado;
    @FXML private Label lblCidade;
    @FXML private Label lblCurso;
    @FXML private Label lblCelular;
    @FXML private Label lblBairro;
    @FXML private Label lblCodigo;
    @FXML private Label lblSenha;
    @FXML private Label lblEndereco;
    @FXML private Label lblSite;
    @FXML private Label lblTelefone;
    @FXML private TextField txtCodigo;
    @FXML private TextField txtNome;
    @FXML private TextField txtEmail;
    @FXML private TextField txtCurso;
    @FXML private TextField txtSite;
    @FXML private TextField txtTelefone;
    @FXML private TextField txtCelular;
    @FXML private TextField txtEndereco;
    @FXML private TextField txtBairro;
    @FXML private TextField txtCidade;
    @FXML private TextField txtEstado;
    @FXML private Button btnCancelar;
    @FXML private Button btnCadastrar;
    @FXML private PasswordField pssSenha;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        btnCancelar.setOnMouseClicked((MouseEvent e)-> {
            abrePrincipal();
        });
        btnCancelar.setOnKeyPressed((KeyEvent e)-> {
            if(e.getCode() == KeyCode.ENTER){
                abrePrincipal();
            }
        });
        
        btnCadastrar.setOnMouseClicked((MouseEvent e)-> {
            
        });
        btnCadastrar.setOnKeyPressed((KeyEvent e)-> {
            if(e.getCode() == KeyCode.ENTER){
                
            }
        });
    }    
    public void fecha(){
        CadastrarCandidato.getStage().close();
    }
    
    public void abrePrincipal(){
        Principal p = new Principal();
        fecha();
      try {
          p.start(new Stage());
      } catch (Exception ex) {
          Logger.getLogger(CadastrarVagaController.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    
}

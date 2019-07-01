/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author gilbe
 */
public class Candidato {
    private String senha;
    private String codigo;
    private String nome;
    private String email;
    private String telefone;
    private String celular;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String site;
    private String curso;
     
    
        //INSTANCIACAO
        public Candidato(String senha, String id, String nome, String email, String telefone, 
                String celular, String endereco, String bairro, String cidade, String estado, String site, String curso){
            
            this.codigo = id;
            this.nome = nome;
            this.senha = senha;
            this.email = email;
            this.telefone = telefone;
            this.celular = celular;
            this.endereco = endereco;
            this.bairro = bairro;
            this.cidade = cidade;
            this.estado = estado;        
            this.site = site;
            this.curso = curso;
        }
            public Candidato(){
            this.codigo = "";
            this.senha = "";
            this.nome = "";
            this.email = "";
            this.telefone = "";
            this.celular = "";
            this.endereco = "";
            this.bairro = "";
            this.cidade = "";
            this.estado = "";        
            this.site = "";
            this.curso = "";
        }
    

        //GETTERS E SETTERS    
        
        //senha
        public String getSenha(){
            return this.senha;
        }
        public void setSenha(String senha){
            this.senha = senha;
        }
            //Codigo
        public String getCodigo(){
            return this.codigo;
        }
        public void setCodigo(String codigo){
            this.codigo = codigo;
        }
        
        //Nome
        public String getNome(){
           return this.nome;
       } 
        public void setNome(String nome){
           this.nome = nome;
       }
       
        //Email
        public String getEmail(){
            return this.email;
        }
        public void setEmail(String email){
            this.email = email;
        }
        
        //Telefone
        public String getTelefone(){
            return this.telefone;
        }
        public void setTelefone(String telefone){
            this.telefone = telefone;
        }
        
        //Celular
        public String getCelular(){
            return this.celular;
        }
        public void setCelular(String celular){
            this.celular = celular;
        }
        
        //Endereco
        public String getEndereco(){
            return this.endereco;
        }
        public void setEndereco(String endereco){
            this.endereco = endereco;
        }
        
        //Cidade
        public String getCidade(){
            return this.cidade;
        }
        public void setCidade(String cidade){
            this.cidade = cidade;
        }
       
        //Estado
        public String getEstado(){
            return this.estado;
        }
        public void setEstado(String estado){
            this.estado = estado;
        }
        
        //Site
        public String getSite(){
            return this.site;
        }
        public void setSite(String site){
            this.site = site;
        }
        //Bairro
        public String getBairro(){
            return this.bairro;
        }
        public void setBairro(String bairro){
            this.bairro = bairro;
        }

        public String getCurso() {
            return this.curso;
        }
        
        
}

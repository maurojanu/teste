/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.ltp3;

import java.util.List;

/**
 *
 * @author Mauro Sergio
 */
public class Pessoa {
    private int id ;
    private String nome;
    private List<Email> emails;
    private List<Telefone> telefones;
    private List<Endereco> enderecos;

    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id > 1){
          this.id = id;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if(nome.length()>3 && nome.length()<250){

            this.nome = nome;
        }
        throw new Exception("Não pode haver nomes com menos de 3 letras e mais de 250 letras");
    }

    public List<Email> getEmails() {
        return emails;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public void addEmail(Email obj){
       if(!emails.contains(obj)){
           emails.add(obj);
       }
    }
    public void removeEmail(Email obj){
       if(!emails.contains(obj)){
           emails.remove(obj);
       }
    }
    
    
    
    
}

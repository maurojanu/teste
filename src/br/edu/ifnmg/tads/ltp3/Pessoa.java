/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.ltp3;

/**
 *
 * @author Mauro Sergio
 */
public class Pessoa {
    private int id ;
    private String nome;

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

    
    
    
    
    
}

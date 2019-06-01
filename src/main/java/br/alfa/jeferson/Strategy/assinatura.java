/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.alfa.jeferson.Strategy;

/**
 *
 * @author Aluno
 */
public class assinatura {
    private IPreco preco;
    private IContenTransformes qualidade;
    private transmsacoes numeroLimite;

    assinatura(IPreco preco, IContenTransformes qualidade, transmsacoes numeroLimite) {
        this.preco = preco;
        this.qualidade = qualidade;
        this.numeroLimite = numeroLimite;
    }
    
    //public assinatura(IPreco preco);
    
   public double getPreco(){
       return preco.getPreco();
   }
   public void disponibilizarConteudo(){
      qualidade.converteQualidade();
       
   }
    

    }

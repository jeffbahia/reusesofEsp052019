/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.alfa.jeferson.Observer;

import java.util.Date;

/**
 *
 * @author Aluno
 */
public class ClimaTempo implements IObservador{
      private String nome;
    
    public ClimaTempo(String nome){
        this.nome = nome;
    }
    
    @Override
    public void atualizar(double temperatura, double umidade, double pressaoBarometrica) {
        System.out.println("Notificaçao");
        System.out.println(nome);
        System.out.println("Temperatura: " + String.valueOf(temperatura));
        System.out.println("Umidade: " + String.valueOf(umidade));
    }
    
    
}

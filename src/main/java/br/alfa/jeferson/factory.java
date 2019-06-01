/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.alfa.jeferson;

/**
 *
 * @author Aluno
 */
    public class factory implements IFactory{

    @Override
    public IVeiculo create(int pessoas, String tempo, String combustivel) {
        
            
        if (pessoas <= 2 ) {
            return (IVeiculo) new tesla();
        }
        
        if (pessoas <= 5 && tempo.equals("Sol")) {
         
            return (IVeiculo) new escort ();
        }
        
           if (pessoas <= 5 && tempo.equals("Chuva")) {
         
            return (IVeiculo) new opala ();
        }
            if (pessoas > 5 && pessoas <= 20) {
         
            return (IVeiculo) new besta ();
        }
        
        return null;
        
  
       
    }

 
    }
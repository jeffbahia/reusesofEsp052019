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
    
        public static final int PLANO_BASICO = 1;
			public static final int PLANO_PADRAO = 2;
			public static final int PLANO_PREMIUM = 3;
			protected double PRECO;
			protected double PLANO;
			
        
        public assinatura (int plano, int preco){
        this.PRECO = preco;
        
    		switch (PLANO) {
    		
	    		case PLANO_BASICO:
	    			
	    		case PLANO_PADRAO:
	
	    		case PLANO_PREMIUM:
	    	
    		  		default:
	    			throw new RuntimeException("Plano não encontrado :/")
	            
            
   }
    }
     }

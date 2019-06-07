/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.alfa.jeferson.Observer;

/**
 *
 * @author Aluno
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        ClimaTempo climaTempo = new ClimaTempo ("Clima Tempo");
        CamposUniversitarios  camposUniversitarios = new CamposUniversitarios("Campos Universitários");
        
       EstacaoMetereologicas estacao = new EstacaoMetereologicas();
        estacao.adicionarObservador(climaTempo);
        estacao.adicionarObservador(camposUniversitarios);
        estacao.notificacao();
        
            
        
    }
    
}

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
public interface IFactory {
    
    public IVeiculo create (int pessoas, String tempo, String combustivel );
    
}

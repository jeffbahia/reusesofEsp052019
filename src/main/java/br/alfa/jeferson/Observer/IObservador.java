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
public interface IObservador {
    public void atualizar(double temperatura, double umidade, double pressaoBarometrica);
}

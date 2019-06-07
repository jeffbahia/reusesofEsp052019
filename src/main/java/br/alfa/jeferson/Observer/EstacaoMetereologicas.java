package br.alfa.jeferson.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Jeferson
 */
public class EstacaoMetereologicas {
    
    private double temperatura;
    private double umidade;
    private double pressaoBarometrica;
    
    private List<IObservador> observadores = new ArrayList();
    
    public void adicionarObservador(IObservador observador){
        observadores.add(observador);
    }
    
    public void removerObservador(IObservador observador){
        observadores.remove(observador);
    }
    
    public void atualizarObservadores(){
        for (IObservador observador : observadores){
            observador.atualizar(temperatura,umidade,pressaoBarometrica);
        }
    }
    
    public void notificacao(){
        Random random = new Random();
        this.temperatura = random.nextFloat()*10 + 1;
        this.umidade = random.nextDouble()*20;
        this.pressaoBarometrica = random.nextDouble()*30;
        atualizarObservadores();        
    }
    
}

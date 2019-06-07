package br.alfa.jeferson.Strategy;

/**
 *
 * @author Aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     IPreco preco = new PrecoBasico();
     IContenTransformes qualidade = new simples();
     transmsacoes numeroLimite = new TramissaoUnica();
     assinatura planoBasico = new assinatura(preco, qualidade, numeroLimite);
     
     
     System.out.println(planoBasico.getPreco());
     planoBasico.disponibilizarConteudo();
    

    }
    
}

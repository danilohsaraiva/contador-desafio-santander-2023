package controlefluxo.Modelos;

import controlefluxo.ExceptionsCustomizadas.ParametrosInvalidosException;

/**
 *
 * @author Danilo Saraiva
 */
public class Contador {

    public void primeiroNumeroEhMaior(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        if(primeiroNumero > segundoNumero) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    public void imprimiContagemDiferencaEntrePrimeiroSegundoNumero(int primeiroNumero, int segundoNumero) {

        try {
            int contador;
            primeiroNumeroEhMaior(primeiroNumero, segundoNumero);
            contador = segundoNumero - primeiroNumero;
            
            for(int i = 1; i <= contador; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (ParametrosInvalidosException exp){
            exp.printStackTrace();
        }
    }
}

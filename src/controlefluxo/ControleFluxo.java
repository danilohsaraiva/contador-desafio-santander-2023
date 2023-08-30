package controlefluxo;

import controlefluxo.Modelos.Contador;
import java.util.Scanner;

/**
 *
 * @author Danilo Saraiva
 */
public class ControleFluxo {

    public static void main(String[] args) {
        int primeiroNumero;
        int segundoNumero;
        String option = "S";

        Scanner input = new Scanner(System.in);
        do {
            switch (option) {
                case "S":

                    System.out.println("********************************");
                    System.out.println("Informe dois números para realizar a contagem da diferença dos mesmos");
                    System.out.print("Insira o primeiro número :> ");
                    primeiroNumero = input.nextInt();
                    System.out.print("\nInsira o segundo número :> ");
                    segundoNumero = input.nextInt();
                    
                    Contador contador = new Contador();
                    contador.imprimiContagemDiferencaEntrePrimeiroSegundoNumero(primeiroNumero, segundoNumero);

                    System.out.print("\nDeseja continuar? S/N :> ");
                    option = input.next();
                    break;

                case "N":
                    System.exit(0);
                    break;

                default:
                    System.out.println("\n" + option + " <: não é um comando válido!");
                    System.out.println("Deseja continuar? S/N :> ");
                    option = input.next();
            }
        } while (option != "N");
    }

}


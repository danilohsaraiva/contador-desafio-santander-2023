package controlefluxo.ExceptionsCustomizadas;

/**
 *
 * @author Danilo Henrique
 */
public class ParametrosInvalidosException extends  Exception{

    public ParametrosInvalidosException() {
    }

    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

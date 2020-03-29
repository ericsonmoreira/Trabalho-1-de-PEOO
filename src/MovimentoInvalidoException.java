/* Crie uma exceção chamada MovimentoInvalidoException que informe na mensagem qual movimento foi inválido  */
public class MovimentoInvalidoException extends Exception{
    public MovimentoInvalidoException(String message) {
        super(message);
    }
}

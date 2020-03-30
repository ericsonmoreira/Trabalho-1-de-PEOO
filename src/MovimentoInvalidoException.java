/* Crie uma exceção chamada MovimentoInvalidoException que informe na mensagem qual movimento foi inválido  */
public class MovimentoInvalidoException extends Exception{

    // você poderia colocar aqui alguma coisa para melhorar a classe.

    public MovimentoInvalidoException(String message) {
        super(message);
    }

}

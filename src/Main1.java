import java.util.Scanner;

/**
 * Classe para mover o Robo pelos comandos do usuário.
 */
public class Main1 {

    public static void main(String[] args) throws MovimentoInvalidoException {
        Robo r = new Robo("amarelo");

        System.out.println("Posicões do alimentos: ");
        Scanner teclado = new Scanner(System.in);
        int alimentoX = teclado.nextInt();
        int alimentoY = teclado.nextInt();
        Alimento a = new Alimento(alimentoX, alimentoY, "azul");

        String movimento;
        System.out.println("Hora de mover o robô. Digite o movimento: ");
        while(!r.verificar(a)) {
            movimento = teclado.next();
            r.mover(movimento);
            System.out.println("Proximo ");
        }
        System.out.println("Você chegou!");

    }

}

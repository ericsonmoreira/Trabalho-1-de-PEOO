import java.util.Scanner;

/**
 * Classe com mais para Dispulta de Robos.
 * Um normal e outro inteligente.
 */
public class Main3 {

    public static void main(String[] args) {
        Robo r3 = new Robo("cinza");
        RoboInteligente r4 = new RoboInteligente("preto");

        System.out.println("Posicões do alimentos: ");
        Scanner teclado = new Scanner(System.in);
        int alimentoX = teclado.nextInt();
        int alimentoY = teclado.nextInt();
        Alimento a = new Alimento(alimentoX, alimentoY, "azul");

        int quant3 = 0, quant4 = 0;
        System.out.println("É hora do duelo!");
        while(!r3.verificar(a) && !r4.verificar(a)) {
            System.out.println("Robo 3: ");
            r3.randomicamente();
            quant3++;
            System.out.println("Proximo \n");

            System.out.println("RoboInteligente 4: ");
            r4.randomicamente();
            quant4++;
            System.out.println("Proximo \n");
        }

        System.out.println("Parabéns ao vencedor: ");
        if(r3.verificar(a)){
            System.out.println("Robo 3 venceu!\n");
        }else if(r4.verificar(a)){
            System.out.println("RoboInteligente 4 venceu!\n");
        }

        System.out.println("Robo 3 fez " + quant3 + " movimentos");
        System.out.println("RoboInteligente 4 fez " + quant4 + " movimentos");
    }

}

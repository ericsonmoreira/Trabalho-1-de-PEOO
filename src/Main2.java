import java.util.Scanner;

/**
 * Classe com main para dispulta de Robos.
 */
public class Main2 {

    public static void main(String[] args) {
        Robo r1 = new Robo("azul");
        Robo r2 = new Robo("vermelho");

        System.out.println("Posicões do alimentos: ");
        Scanner teclado = new Scanner(System.in);
        int alimentoX = teclado.nextInt();
        int alimentoY = teclado.nextInt();
        Alimento a = new Alimento(alimentoX, alimentoY, "verde");

        int quant1 = 0, quant2 = 0;
        System.out.println("É hora do duelo!");
        while(!r1.verificar(a) && !r2.verificar(a)) {
            System.out.println("Robo 1: ");
            r1.randomicamente();
            quant1++;
            System.out.println("Proximo \n");

            System.out.println("Robo 2: ");
            r2.randomicamente();
            quant2++;
            System.out.println("Proximo \n");
        }

        //mostre quem achou o alimento e o número de movimentos que cada robô fez.
        System.out.println("Parabéns ao vencedor: ");
        if(r1.verificar(a)){
            System.out.println("Robo 1 venceu!\n");
        }else if(r2.verificar(a)){
            System.out.println("Robo 2 venceu!\n");
        }

        System.out.println("Robo 1 fez " + quant1 + " movimentos");
        System.out.println("Robo 2 fez " + quant2 + " movimentos");
    }

}

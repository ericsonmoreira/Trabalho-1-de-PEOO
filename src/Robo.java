import java.util.Random;

public class Robo{

    // CONSTANTES AQUI
    public final static String UP = "up";
    public final static String DOWN = "DOWN";
    public final static String RIGHT = "right";
    public final static String LEFT = "LEFT";

    protected int eixoX;
    protected int eixoY;
    protected String cor;

    public int getEixoX() {
        return eixoX;
    }
    public void setEixoX(int eixoX) {
        this.eixoX = eixoX;
    }
    public int getEixoY() {
        return eixoY;
    }
    public void setEixoY(int eixoY) {
        this.eixoY = eixoY;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public Robo(String cor) { //construtor que recebe a cor do robô e o inicialize na posição (0,0)
        this.eixoX = 0;
        this.eixoY = 0;
        this.cor = cor;
    }

    public void mover(String movimento) throws MovimentoInvalidoException { //thows para classe RoboInteligente
        try {
            if (movimento.equalsIgnoreCase(UP)) {
                if(eixoY != 5){ //até (0,5)
                    System.out.println("[" + eixoX + "," + (++eixoY) + "]"); //incrementa 1 no eixoY
                }else{
                    throw new MovimentoInvalidoException("Movimento inválido!"); //na exceção printa isso
                }
            }
            if (movimento.equalsIgnoreCase(DOWN)) {
                if(eixoY != 0){ //começa em (0,0)
                    System.out.println("[" + eixoX + "," + (--eixoY) + "]"); //decrementa 1 no eixoY
                }else{
                    throw new MovimentoInvalidoException("Movimento inválido!");
                }
            }
            if (movimento.equalsIgnoreCase(RIGHT)) {
                if(eixoX != 5){ //até (5,0)
                    System.out.println("[" + (++eixoX) + "," + eixoY + "]"); //incrementa 1 no eixoX
                }else{
                    throw new MovimentoInvalidoException("Movimento inválido!");
                }
            }
            if (movimento.equalsIgnoreCase(LEFT)) {
                if(eixoX != 0){ //começa (0,0)
                    System.out.println("[" + (--eixoX) + "," + eixoY + "]"); //decrementa 1 no eixoX
                }else{
                    throw new MovimentoInvalidoException("Movimento inválido!");
                }
            }
        } catch (MovimentoInvalidoException e) { //pegando a exceção
            System.out.println(e.getMessage());
        }
    }

    public void mover(int numPosicao) throws IllegalArgumentException, MovimentoInvalidoException {
        if(numPosicao == 1) { //up
            mover("up");
        }else if(numPosicao == 2) { //down
            mover("down");
        }else if(numPosicao == 3) { //right
            mover("right");
        }else if(numPosicao == 4) { //left
            mover("left");
        }else{
            throw new IllegalArgumentException("Direção inválida: " + numPosicao);
        }
    }

    /**
     * Verifica se as coordenadas do robo são iguais aos do alimento
     * @param alimento
     * @return true se o {@link Robo} achou o alimento.
     */
    public boolean verificar(Alimento alimento) {
        if((getEixoX() == alimento.getAlimentoX()) && (getEixoY() == alimento.getAlimentoY())){
            return true;
        }
        return false;
    }

    // Pderia mudar o nome desse método para melhor entendomento.
    // randomicamente o que?
    public void randomicamente(){ //andar aleatoriamente
        Random random = new Random(); //instanciar classe
        try {
            mover(random.nextInt(4) + 1); //vai do 0 ao 3 + 1 (4) = 5 elementos
        } catch (MovimentoInvalidoException e) { //pegando a exceção
            e.printStackTrace(); //só para me ajudar a dizer qual foi o erro q cometi
        }
    }

}
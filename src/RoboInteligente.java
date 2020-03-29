public class RoboInteligente extends Robo{ //subclasse de Robo

    public RoboInteligente(String cor) { //só recebe a cor
        super(cor);
    }

    @Override
    public void mover(String movimento){ //sobrecarregando o método mover
        try{
            super.mover(movimento);
        }catch (MovimentoInvalidoException e){ //se robô fizer um movimento inválido, garanta que o próximo movimento será válido
            if(eixoY != 5) {
                System.out.println("[" + eixoX + "," + (++eixoY) + "]");
            }else if(eixoY != 0){
                System.out.println("[" + eixoX + "," + (--eixoY) + "]");
            }else if(eixoX != 5){
                System.out.println("[" + (++eixoX) + "," + eixoY + "]");
            }else if(eixoX != 0){
                System.out.println("[" + (--eixoX) + "," + eixoY + "]");
            }
        }
    }
}


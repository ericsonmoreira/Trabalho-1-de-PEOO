public class Alimento { //características do alimento
    protected int alimentoX;
    protected int alimentoY;
    protected String corComida;

    public int getAlimentoX() {
        return alimentoX;
    }
    public void setAlimentoX(int alimentoX) {
        this.alimentoX = alimentoX;
    }
    public int getAlimentoY() {
        return alimentoY;
    }
    public void setAlimentoY(int alimentoY) {
        this.alimentoY = alimentoY;
    }
    public String getCorComida() {
        return corComida;
    }
    public void setCorComida(String corComida) {
        this.corComida = corComida;
    }

    public Alimento(int alimentoX, int alimentoY, String corComida) {
        this.alimentoX = alimentoX;
        this.alimentoY = alimentoY;
        this.corComida = corComida;
    }

}

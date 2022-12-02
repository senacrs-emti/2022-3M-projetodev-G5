
package damat;

public class Posicao {

    private char x;
    private int y;

    //E responsavel para mostrar x - linha e com letra e y - numeros.
    public Posicao() {
        this.x = 'a';
        this.y = 1;
    }

    public Posicao(char x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "" + x + y;
    }

    public char getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(char x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
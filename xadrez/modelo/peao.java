package modelo;

public class peao extends peca{

    private boolean primeiroMovimento = true;

    public peao(EnumCor cor, int linha, int coluna, String imagem){
        super(cor, linha, coluna, imagem);
    }

    @Override
    public boolean validaMovimento(int linhaDestino, int colunaDestino){
        return true;
    }
}
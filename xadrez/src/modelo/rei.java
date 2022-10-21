package modelo;

public class rei extends peca{


    public rei(EnumCor cor, int linha, int coluna, String imagem){
        super(cor, linha, coluna, imagem);
    }

    @Override
    public boolean validaMovimento(int linhaDestino, int colunaDestino){
        return true;
    }
}
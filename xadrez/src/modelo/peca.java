package modelo;

public abstract class peca{

    private EnumCor cor;
    private int linha, coluna;
    private String imagem;
    private boolean eliminada = false;
    private boolean selecionada = false;

    public peca(EnumCor cor, int linha, int coluna, String imagem){
        this.cor = cor;
        this.linha = linha;
        this.coluna = coluna;
        this.imagem = imagem;
    }

    public abstract boolean validaMovimento(int linhaDestino, int colunaDestino);

    //GET
    public EnumCor getCor(){
        return this.cor;
    }

    public String getImagem(){
        return this.imagem;
    }

    //SET
    public void setCor(EnumCor cor){
        this.cor = cor;
    }


    public void setImagem(String Imagem){
        this.imagem = imagem;
    }


}
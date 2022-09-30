package modelo;

public class tabuleiro {
    
    private peao[][] pecas;
    private peca pecaSelecionada = null;
    private EnumCor vez = EnumCor.BRANCO;


    public static final int TEMPO_JOGADA = 10000;


    public tabuleiro(int linhas, int colunas){
    this.pecas = new peca[linhas][colunas];
    }


    public peca getPeca(int linha, int coluna){
        return this.pecas[linha][coluna];
    }


    public void adicionaPeca(peca peca){
        this.pecas[peca.getLinha()][peca.getColuna()] = peca;
        peca.setTabuleiro(this)
    }

    public void selecionaPeca(peca peca){
        if (peca.isSelecionada()){
            

        }else{


        }
    }

}

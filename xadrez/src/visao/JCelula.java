package visao;

import javax.swing.Jpanel;

public class JCelula extends JPanel{

    private JPeca JPeca;
    
    private int linha, coluna;

    public JCelula(int linha, int coluna){
        this.linha = linha;
        this.coluna = coluna;
    }
    
}

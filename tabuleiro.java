public class Tabuleiro {

    // Letras para as colunas
    private static final String ALFABETO = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // Criando o Tabuleiro
    private String[][] matriz;
    
    private int tamanho;

    //Percorrendo sobre a matriz no caso pelo "Tabuleiro", assim o Local vazio e preenchida com " - "
    public Tabuleiro(int tamanho) {
        // Aumenta em um o tamanho do tabuleiro para considerar as linhas e colunas
        tamanho++;
        
        // Salva o tamanho do tabuleiro criado.
        this.tamanho = tamanho;
        
        // cria uma nova matriz de tabuleiro 
        this.matriz = new String[tamanho][tamanho];
        
        // Inserindo dois espaços vazios no primeiro valor
        this.matriz[0][0] = "   ";

        // Preenchendo as colunas
        for(int coluna = 1; coluna < this.tamanho; coluna++) {
            this.matriz[0][coluna] = String.valueOf(ALFABETO.charAt(coluna));
        }
        
        // Preenchendo as linhas
        for(int linha = 1; linha < this.tamanho; linha++) {
            String numeroDaLinha = "";

            // Se o número da linha for menor do que 10, completar com um 0 na frente
            if (linha < 10) {
                numeroDaLinha += "0";     
            }
            
            // Concatenando o valor da linha e mais um espaço em branco para não ficar tudo grudado.
            numeroDaLinha += String.valueOf(linha) + " ";

            this.matriz[linha][0] = numeroDaLinha;
        }
        
        // Preenche todas as posições com -
        for (int linha = 1; linha < this.tamanho; linha++) {
            for (int coluna = 1; coluna < this.tamanho; coluna++) {
               this.matriz[linha][coluna] = "-";
            }
        }
        
        // Se o tabuleiro tiver dimensão 10x10...
        if (this.tamanho == 11) {
            // As peças tomarão 4 linhas na parte de cima e de baixo do tabuleiro.
            int linhasDePecas = 4;
            
            // Inserir peças brancas
            for (int linha = 1; linha <= linhasDePecas; linha++) {
                int coluna = 0;
                // Se a linha for par, a coluna começa da 2 em diante.
                // Se não (ímpar), a coluna começa da 1 em diante.
                if (linha % 2 == 0)
                    coluna = 2;
                else 
                    coluna = 1;
                    
                while (coluna < this.tamanho) {
                    this.matriz[linha][coluna] = "B";
                    coluna = coluna + 2;
                }
            }
            
            // Inserir peças pretas
            for (int linha = this.tamanho - 1; linha >= (this.tamanho - linhasDePecas); linha--) {
                int coluna = 0;
                // Se a linha for par, a coluna começa da 2 em diante.
                // Se não (ímpar), a coluna começa da 1 em diante.
                if (linha % 2 == 0)
                    coluna = 2;
                else 
                    coluna = 1;
                    
                while (coluna < this.tamanho) {
                    this.matriz[linha][coluna] = "P";
                    coluna = coluna + 2;
                }
            }
        }        
    }
        
    //Imprimindo o Tabuleiro com letras informando linha e numero colunas.
    public void imprimirTabuleiro() {
        
        // Imprimindo os outros valores
        for (int linha = 0 ; linha < tamanho; linha++) {
            for (int coluna = 0; coluna < tamanho ; coluna++) {
                System.out.print(this.matriz[linha][coluna]);
            }
            
            System.out.println("");
        } 
        
        System.out.println("==========================================");
    } // fim imprimirTabuleiro
    
    // Move a peça no tabuleiro a partir de coordenadas
    public void moverPeca(String coordenadas) {
    	// Divide as coordenadas pela vírgula. A posição 0 contém as coordenadas anteriores e a posição 1 as novas coordenadas
    	String[] vetorCoordenadas = coordenadas.split(",");
    	
    	// Garante que as coordenadas terão as letras em maiúsculo. Importantes para comparar com o alfabeto.
    	String coordenadaAnterior = vetorCoordenadas[0].toUpperCase();
    	String novaCoordenada = vetorCoordenadas[1].toUpperCase();
    	
    	// Recupera a linha e coluna anterior
    	int linhaAnterior = getLinha(coordenadaAnterior);
    	int colunaAnterior = getColuna(coordenadaAnterior);
    	
    	// Recupera a peça que está na posição
    	String peca = this.matriz[linhaAnterior][colunaAnterior];
    	
    	// Substitui a posição por "-"
    	this.matriz[linhaAnterior][colunaAnterior] = "-";
    	
    	// Recupera a linha e coluna nova
    	int novaLinha = getLinha(novaCoordenada);
    	int novaColuna = getColuna(novaCoordenada);
    	
    	// Coloca a peça na nova linha e coluna
    	this.matriz[novaLinha][novaColuna] = peca;
    	
    	// Imprime novamente o tabuleiro com as novas posições
    	imprimirTabuleiro();
    }  
    
    // Recupera a linha de uma coordenada
    private int getLinha(String coordenada) {
    	return Integer.valueOf(coordenada.substring(0, 1));
    }
    
    // Recupera o índice da coluna em uma coordenada
    private int getColuna(String coordenada) {
    	return ALFABETO.indexOf(coordenada.substring(1, 2));
    }
}
Scanner menu= Scanner (System.in);

System.out.println("|---SELECIONE AS OPÇÕES DO MENU---|");
System.out.println("|---------------------------------|");
System.out.println("|Opção 1:   Quiz                  |");
System.out.println("|Opção 2:   Xadrez                |");
System.out.println("|Opção 3:   Jogo da Velha         |");
System.out.println("|---------------------------------|");

int opcao = menu.nextInt();

switch (opcao) {
        case 1:
        System.out.print("\nOpção Quiz Selecionado");
        break;
        case 2:
        System.out.print("\nOpção Xadrez Selecionado\n");
        break;

        case 3:
        System.out.print("\nJogo da Velha\n");
        break;



public static void main(String[] args) {
    
}
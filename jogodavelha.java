import java.util.Scanner;


public class jogodavelha{

    

public static void desenhajogo(campo[][] velha){
    limpartela();
    System.out.print("          0     1     2");
    System.out.printf("0  %c  |  c%  |  c%  %n",velha [0][0].getsimbolo(),velha[0][1].getsimbolo(),velha[0][2].getsimbolo());
    System.out.println("   ------------------------");
    System.out.printf("1  %c  |  c%  |  c%  %n",velha [1][0].getsimbolo(),velha[1][1].getsimbolo(),velha[1][2].getsimbolo());
    System.out.println("   ------------------------");
    System.out.printf("2  %c  |  c%  |  c%  %n",velha [2][0].getsimbolo(),velha[2][1].getsimbolo(),velha[2][2].getsimbolo());
}

public static void limpartela(){
    for(int cont=0;cont<200;cont++){
        System.out.println("");
    }
}

public static int[] jogar(Scanner scan,char sa){
    int p[]=new int[2];
    System.out.printf("%s  %c%n", "Quem joga: ",sa);
    System.out.print("Informe a linha: ");
    p[0]=scan.nextInt();
    System.out.print("Informe a coluna: ");
    p[1]=scan.nextInt();
    return p;
}


public static Boolean verificarjogada(campo[][]velha,int p[],char simboloAtual){
    if (velha[p[0]][p[1]].getsimbolo()==' ') {
        velha[p[0]][p[1]].setsimbolo(simboloAtual);
        return true;
    }else{
        return false;
    }
}

public static void iniciarjogo(campo[][]velha){
    for(int i=0;i<3;i++){
        for(int c=0;c<3;c++){
            velha[i][c]=new campo();
        }
    }
}

public static String verificavitoria(campo[][]velha){
    return "";
}


public static void main(String[] args){

    campo[][] velha=new campo[3][3];
    char simboloAtual='X';
    Boolean game=true;
    String vitoria="";
    Scanner scan=new Scanner(System.in);

    iniciarjogo(velha);

    while(game){
        desenhajogo(velha);
        vitoria = verificavitoria(velha);
        if(!vitoria.equals("")){
            System.out.printf("Jogador %s venceu%n",vitoria);
            break;
        }
        try{
            if (verificarjogada(velha,jogar(scan,simboloAtual),simboloAtual)) {
                if(simboloAtual=='X'){
                    simboloAtual='O';
                }else{
                    simboloAtual='X';
                }
                
            }

        }catch(Exception e){
            System.out.printf("Erro");

        }
    }
    System.out.printf("Fim de jogo");
}

}
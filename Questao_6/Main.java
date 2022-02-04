package Questao_6;

import java.util.Scanner;

public class Main
{

    public static int Menu(int pontuacao){
        Scanner teclado = new Scanner(System.in);
        int opcao;

        System.out.println("""
                ====================================================
                |           Bem vindo ao Quiz do Paulo!!           |
                ====================================================""");

        System.out.println("Entre com seu nome: ");
        String nome = teclado.next();

        System.out.println("\n\nÓtimo!! Agora nos informe qual quiz deseja participar, " + nome + ":\n");
        while(true){

            System.out.println("""
                1) Quiz valendo 6 reais (2 perguntas)
                2) Quiz valendo 10 reais (3 perguntas)
                3) Quiz valendo 1 milhão (5 perguntas)


                0) Sair""");

            //Coleta a informação do teclado do usuário, caso não seja valida, aciona uma exceção.
            try {
                opcao = Integer.parseInt(teclado.next());
                if(opcao == 0) {
                    System.out.println("""
                        *_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*
                                  Obrigado por participar!! :)
                        *_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*""");
                    System.exit(0);
                }
                else if(opcao > 0 && opcao < 5){
                    Perguntas p = new Perguntas(opcao);
                    p.questionsGenerator();
                    p.Quiz(p);
                    return p.getPontuacao();
                }
                throw new Exception();

            }catch(Exception e) {
                System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n ERRO: Digite uma opção válida!\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
            }

        }
    }
    public static void main(String[] args) {
        int pontuacao = 0;
        pontuacao = Menu(pontuacao);
        System.out.format("""
                        ===================================================
                        |             AEEE vc acertou  %d                 |
                        ===================================================
                        |         Obrigado por participar!! :)            |
                        ===================================================""", pontuacao);



    }
}
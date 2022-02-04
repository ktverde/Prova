package Questao_6;

import java.util.Scanner;

public class Main
{

    public static Perguntas Menu(){
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        int opcao;

        System.out.println("""
                ====================================================
                |           Bem vindo ao Quiz do Paulo!!           |
                ====================================================""");

        //Entrada do usuário
        System.out.println("Entre com seu nome: ");
        String nome = teclado.next();

        //Menu com opções de quiz
        System.out.println("\n\nÓtimo!! Agora nos informe qual quiz deseja participar, " + nome + ":\n");
        while(true){

            System.out.println("""
                1) Quiz valendo 6 reais (2 perguntas)
                2) Quiz valendo 10 reais (3 perguntas)
                3) Quiz valendo 1 milhão (5 perguntas)

                0) Sair""");

            //Coleta a informação do teclado do usuário, caso não seja valida, aciona uma exceção.
            //Caso seja válida, sai do laço de repetição.
            try {
                opcao = teclado.nextInt();
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
                    p.setNome(nome);
                    p.Quiz(p);
                    return p;
                }
                throw new Exception();

            }catch(Exception e) {
                System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n ERRO: Digite uma opção válida!\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
                //"Limpa" o buffer.
                teclado.nextLine();
            }

        }
    }
    public static void main(String[] args) {

        //Função retorna um objeto perguntas, onde vou coletar os acertos e os erros daquele objeto.
        Perguntas p = Menu();
        System.out.format("""
                        =====================================================
                              AEEE %s, você acertou %d e errou %d          
                        =====================================================
                                   Obrigado por participar!! :)           
                        =====================================================""",p.getNome(), p.getPontuacao(), p.getErros());



    }
}
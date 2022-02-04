package Questao_6;

import java.util.Scanner;

public class QuizManager
{
    private int pontuacao, opcao;

    public QuizManager(int opcao) {
        this.opcao = opcao;
    }

    public void Quiz(Perguntas perguntas){
        //Variaveis utilizadas
        Scanner teclado = new Scanner(System.in);
        Perguntas p1 = new Perguntas(opcao);
        p1.questionsGenerator();

        int tam = perguntas.getPerguntas().length;
        for (int i=0; i<tam; i++) {
            System.out.println(perguntas.getPerguntas()[i]);
            System.out.println("------------------------------------------------------");
            System.out.println(perguntas.getRespostas()[i]);


            while (true) {
                System.out.println("\nQual a alternativa correta? (Responda com A,B,C ou D)");
                try {
                    char resposta = teclado.next().charAt(0);
                    String teste = "abcdABCD";
                    int check = teste.indexOf(resposta);

                    if (check != -1) {
                        if (Character.toUpperCase(resposta) == perguntas.getCorreto()[i]) pontuacao++;
                        break;
                    }
                    throw new Exception();

                } catch (Exception e) {
                    System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n ERRO: Digite uma opção válida!\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
                }
            }
        }
    }

    public int getOpcao() { return this.opcao; }
    public int getPontuacao() { return this.pontuacao; }
}

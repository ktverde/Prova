package Questao_6;

import java.util.Scanner;

public class QuizManager
{
    private int pontuacao, erros, opcao;
    private String nome;

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
            System.out.println("\n"+perguntas.getPerguntas()[i]);
            System.out.println("------------------------------------------------------");
            System.out.println(perguntas.getRespostas()[i]);

            //Solicita a entrada ao usuário
            while (true) {
                System.out.println("Qual a alternativa correta? (Responda com A,B,C ou D)");
                try {
                    //Compara se o que foi digitado está presente como alternativa (abcdABCD)
                    char resposta = teclado.next().charAt(0);
                    String teste = "abcdABCD";
                    int check = teste.indexOf(resposta);

                    //Caso tenha sido digitada alguma alternativa, compara com a alternativa correta e sai do laço
                    if (check != -1) {
                        if (Character.toUpperCase(resposta) == perguntas.getCorreto()[i]) pontuacao++;
                        else erros++;
                        break;
                    }
                    //Caso não, lança uma exceção.
                    throw new Exception();

                } catch (Exception e) {
                    System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n ERRO: Digite uma opção válida!\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
                    //"Limpa" o buffer.
                    teclado.nextLine();
                }
            }
        }
    }

//Gets
/////////////////////////////////////////////////////////////////////////
    public int getOpcao() { return this.opcao; }
    public int getPontuacao() { return this.pontuacao; }
    public int getErros() { return this.erros; }
    public String getNome() { return nome; }

    //Sets
/////////////////////////////////////////////////////////////////////////
    public void setNome(String nome) { this.nome = nome; }
}

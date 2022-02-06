package Questao_8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    //Procedimento que imprime um vetor de funcionarios, dado um vetor do tipo Funcionario e o seu tamanho.
    public static void printFunc(ArrayList<Funcionario> f, int qtd){
        for(int i=0; i<qtd; i++){
            System.out.println("------------------------------------------");
            System.out.println("Nome: "+f.get(i).getNome());
            System.out.println("Salario: "+f.get(i).getSalario());
            System.out.println("Salario Liquido: "+f.get(i).getBonificacao());
            System.out.println("------------------------------------------");

        }
    }
    //Procedimento que cadastra os funcionarios em um vetor, dado um vetor do tipo Funcionario e o seu tamanho.
    public static void cadastraFunc(ArrayList<Funcionario> f, int qtd){
        //Teclado buffer
        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i<qtd; i++){
            //Bloco try catch para tratar qualquer erro presente no código, principalmente de input.
            try {
                System.out.format("Digite o nome do %d funcionário: ", i + 1);
                String nome = teclado.next();

                System.out.format("Digite o salário do %d funcionário: ", i + 1);
                double salario = teclado.nextDouble();

                f.add(new Funcionario(salario,nome));

            }catch(Exception e){
                //Caso o input não esteja correto, um erro é exibido na tela, e o for volta 1 vez, para ser digitado
                // o funcionario que teve as informações erradas.
                System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n ERRO: Digite uma opção válida!\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
                i--;
                //"Limpa" o buffer do teclado.
                teclado.nextLine();
            }
        }
    }
    //main
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int qtd;
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

        while(true){
            System.out.println("Digite a quantidade de funcionários que deseja cadastrar: ");
            //Bloco try catch para tratar qualquer erro presente no código, principalmente de input.
            try {

                qtd = teclado.nextInt();
                cadastraFunc(funcionarios,qtd);

                //Caso tudo esteja certo, o vetor de funcionarios é criado e o break sai do laço infinito.
                break;
            }catch(Exception e){
                //Caso o numero digitado não seja numero, um erro é exibido na tela, e o usuario deve digitar o numero de funcionarios novamente.
                System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n ERRO: Digite uma opção válida!\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
                //"Limpa" o buffer do teclado.
                teclado.nextLine();
            }
        }
        //Chama o procedimento de impressao.
        printFunc(funcionarios, qtd);
    }

}

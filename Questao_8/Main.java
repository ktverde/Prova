package Questao_8;

import java.util.Scanner;

public class Main
{
    public static void printFunc(Funcionario []f, int qtd){
        for(int i=0; i<qtd; i++){
            System.out.println("------------------------------------------");
            System.out.println("Nome: "+f[i].getNome());
            System.out.println("Salario: "+f[i].getSalario());
            f[i].getBonificacao();
            System.out.println("Salario Liquido: "+f[i].getSalario());
            System.out.println("------------------------------------------");

        }
    }
    public static void cadastraFunc(Funcionario []f, int qtd){

        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i<qtd; i++){
            try {
                f[i] = new Funcionario();
                System.out.format("Digite o nome do %d funcionário: ", i + 1);
                String nome = teclado.next();

                System.out.format("Digite o salário do %d funcionário: ", i + 1);
                double salario = teclado.nextDouble();

                f[i].setNome(nome);
                f[i].setSalario(salario);
            }catch(Exception e){
                System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n ERRO: Digite uma opção válida!\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
                i--;
            }finally {
                teclado.nextLine();
            }
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int qtd;
        Funcionario []funcionarios;

        while(true){
            System.out.println("Digite a quantidade de funcionários que deseja cadastrar: ");
            try {
                qtd = teclado.nextInt();
                funcionarios = new Funcionario[qtd];

                cadastraFunc(funcionarios,qtd);

                break;
            }catch(Exception e){
                System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n ERRO: Digite uma opção válida!\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
            }finally {
                teclado.nextLine();
            }
        }

        printFunc(funcionarios, qtd);
    }

}

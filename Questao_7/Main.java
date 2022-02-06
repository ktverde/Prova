package Questao_7;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Variaveis
        Sistema sis = new Sistema();
        sis.cadastraUsuarios();
        Scanner teclado = new Scanner(System.in);
        LocalTime hora;
        Login login;

        //Pede a entrada do usuário, até ser lida corretamente
        while (true) {
            System.out.println("Digite seu usuário: ");
            String usuario = teclado.next();
            System.out.println("Digite sua senha: ");
            String senha = teclado.next();

            //Bloco try catch para tratar exceçoes de login.
            try {
                login = new Login(sis,usuario, senha);
                hora = LocalTime.now();

                break;
            } catch (LoginFailedException | DateTimeException | NullPointerException lfe) {
                System.out.println(lfe.getMessage());
            }
        }

        //Imprime as informações necessarias.
        DateTimeFormatter meuFormato = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("+---------------+");
        System.out.println("|   "+hora.format(meuFormato)+"    |");
        System.out.println("+---------------+");

        //Coleta o nome do usuario a partir da posição em que foi encontrado o usuário, dentro da lista cadastrada no sistema.
        String nome = sis.getLogin()[login.getPos()];
        int horaAtual = hora.getHour();

        if (horaAtual >= 0 && hora.getHour() < 6) {
            System.out.println("Boa madrugada, " + nome + "! Você se logou ao nosso sistema.");
        }
        else if (horaAtual >= 6 && hora.getHour() < 12){
            System.out.println("Bom dia, "+ nome + "! Você se logou ao nosso sistema.");
        }
        else if(horaAtual >= 12 && hora.getHour() < 18){
            System.out.println("Boa tarde, "+ nome + "! Você se logou ao nosso sistema.");
        }
        else{
            System.out.println("Boa noite, "+ nome + "! Você se logou ao nosso sistema.");
        }
    }

}
